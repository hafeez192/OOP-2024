import java.util.Date;
public class IssuedBook
{
    Book book;
    Date issueDate;
    BookCopy copy;

    IssuedBook(Book book, Date issueDate, BookCopy copy)
    {
        this.book = book;
        this.issueDate = issueDate;
        this.copy = copy;
    }


}
