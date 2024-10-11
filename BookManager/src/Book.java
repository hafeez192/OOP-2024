public class Book {
    int bookid;
    String bookTitle;

    Book(int bookid, String bookTitle){
        this.bookid = bookid;
        this.bookTitle=bookTitle;
    }
    public  void getbookDetails(){
        System.out.println("Book id: "+this.bookid);
        System.out.println("Book Title: "+this.bookTitle);
    }
    public  String getbookTitle()
    {
        return this.bookTitle;
    }

}
