import java.util.ArrayList;
import java.util.List;
public class BookCatalog
{
    List<Book> myBooks;
    BookCatalog()
    {
        myBooks = new ArrayList<>();
    }
    public  void addBook(int bookId, String bookTitle, int totalCopies)
    {
        myBooks.add(new Book(bookId, bookTitle, totalCopies));
    }

    public Book searchBook(String bookTitle)
    {
        for(Book book: myBooks)
        {
            if(book.getBookTitle().equalsIgnoreCase(bookTitle))
            {
                return book;
            }
        }
        return null;
    }
    public void DisplayAllBooks()
    {
        for(Book book: myBooks)
        {
            book.getBookDetails();
            System.out.println();
        }

    }

}
