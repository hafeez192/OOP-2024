//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Book b1 = new Book(1,"sapiens");
        //Book b2 = new Book(2, "Man Chaly ka Souda");
        BookCatalog myCatalog = new BookCatalog();
        myCatalog.addBook(1,"Sapiens",1,1);
        Book b = myCatalog.searchBook("Sapiens");
        if(b != null){
            System.out.println("The book detail is");
            b.getbookDetails();
        }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
            }
}