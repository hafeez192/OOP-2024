import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Member {
    String name;
    List<IssuedBook> issuedBooks;
    int maxBooks;
    int maxDays;

    Member(String name, int maxBooks, int maxDays) {
        this.name = name;
        this.issuedBooks = new ArrayList<>();
        this.maxBooks = maxBooks;
        this.maxDays = maxDays;
    }

    public boolean issueBook(Book book, Date issueDate)
    {
        if (issuedBooks.size() < maxBooks) {
            BookCopy issueCopy = book.issueCopy();
            if (issueCopy != null) {
                issuedBooks.add(new IssuedBook(book, issueDate, issueCopy));
                System.out.println(("Boook issued: " + book.getBookTitle() + "to " + name));
                return true;
            } else {
                System.out.println("No copy available for " + book.getBookTitle());
            }
        } else {
            System.out.println("Cannot issu more than " + maxBooks + "books");
        }
        return false;
    }

    public  void returnBook(Book book, BookCopy copy)
    {
        for(IssuedBook issuedBook: issuedBooks)
        {
            if(issuedBook.book.bookId == book.bookId && issuedBook.copy.copyId == copy.copyId)
            {
                long daysOverdue = (new Date().getTime() - issuedBook.issueDate.getTime())/(1000 * 60 * 60 * 24);
                if(daysOverdue > maxDays)
                {
                    long fine = (daysOverdue - maxDays)*100;
                    System.out.println("Book returned late. Fine: Rs "+ fine);
                }
                else
                {
                    System.out.println("Book returned on time");
                }
                issuedBooks.remove(issuedBook);
                book.returnCopy(copy);
                return;
            }
        }
        System.out.println("This copy of book was not returned to member");
    }

    public  void displayIssuedBooks()
    {
        System.out.println("Issued Books for "+name+" :");
        for(IssuedBook issuedBook: issuedBooks)
        {
            issuedBook.book.getBookDetails();
            System.out.println();
        }
    }

    public  BookCopy getIssuedCopyById(int copyId) {
        for (IssuedBook issuedBook : issuedBooks) {
            if (issuedBook.copy.copyId == copyId) {
                return issuedBook.copy;
            }

        }
        return null;
    }
    public String getName()
    {
        return name;
    }
    public int getMaxBooksAllowed()
    {
        return maxBooks;
    }
    public int getCurrentIssuedBooksCount()
    {
        return issuedBooks.size();
    }
}

