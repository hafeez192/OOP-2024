//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Date;
public class Main {
    public static void main(String[] args)
    {
        BookCatalog catalog = new BookCatalog();
        catalog.addBook(1, "Sapiens",5);
        catalog.addBook(2,"The Animal Farm",4);

        Member member = new Member("Ashar",2,7);
        Book bookToIssue = catalog.searchBook("The Animal Farm");
        if(bookToIssue != null)
        {
            member.issueBook(bookToIssue, new Date());
        }

        System.out.println("\n Issued Books: ");
        for(IssuedBook issuedBook: member.issuedBooks)
        {
            System.out.println("Book Title: "+issuedBook.book.getBookTitle());
        }
        System.out.println();
        System.out.println("Returning Book");
//        member.returnBook(catalog.searchBook("The Animal Farm"), member.issuedBooks.get(0).copy);
        int searchCopyId = 1;
        BookCopy foundCopy = member.getIssuedCopyById(searchCopyId);
        if(foundCopy!=null)
        {
            member.returnBook(catalog.searchBook("The Animal Farm"),foundCopy);
        }
        System.out.println();
        System.out.println("All Books in catalog");
        catalog.DisplayAllBooks();

        }

    }
