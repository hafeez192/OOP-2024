import java.util.ArrayList;
import java.util.List;

public class Book
{
    int bookId;
    String bookTitle;
    List<BookCopy> copies;

    Book(int bookId, String bookTitle, int totalCopies)
    {
        this.bookId = bookId;
        this.bookTitle = bookTitle;

        copies = new ArrayList<>();
        for(int i = 1; i <= totalCopies ; i++)
        {
            copies.add(new BookCopy(i));
        }
    }
    public String getBookTitle()
    {
        return this.bookTitle;
    }
    public  int getIssuedCopiesCount()
    {
        int count = 0;
        for(BookCopy copy: copies)
        {
            if(copy.isIssued)
            {
                count++;
            }
        }
        return count;
    }

    public int getAvailableCopiesCount()
    {
        int count = 0;
        for(BookCopy copy: copies)
        {
            if(!copy.isIssued)
            {
                count++;
            }
        }
        return count;
    }
    public BookCopy issueCopy()
    {
        for(BookCopy copy: copies)
        {
            if(!copy.isIssued)
            {
                copy.isIssued =true;
                return copy;
            }
        }
        return null;
    }
    public void returnCopy(BookCopy copy)
    {
        copy.isIssued=false;
    }
    public void getBookDetails()
    {
        System.out.println("Book ID: "+this.bookId);
        System.out.println("Book Title: "+this.bookTitle);
        System.out.println("Total Copies: "+this.copies.size());
        System.out.println("Issued Copies: "+getIssuedCopiesCount());
        System.out.println("Available Copies: "+getAvailableCopiesCount());
//        System.out.println("Book Title: "+this.bookTitle);

    }
}
