public class BookCatalog {
    Book[] myBooks;
    int catalogmaxLimit;
    int roomNo;
    int shelfNo;

    BookCatalog(){
        myBooks = new Book[500];
        catalogmaxLimit = 0;
    }
    public  void addBook(int bookId, String bookTitle,
                         int roomNo, int ShelfNo){
        if (catalogmaxLimit < 500){
          myBooks[catalogmaxLimit]=new Book(bookId,bookTitle);
            this.shelfNo = shelfNo;
            this.roomNo = roomNo;
            catalogmaxLimit++;
        }
        else
        {
            System.out.println("Catalog is full");
        }
    }
    public Book searchBook(String bookTitle) {
        for (int i = 0; i < catalogmaxLimit; i++) {
            if (myBooks[i].getbookTitle().equalsIgnoreCase(bookTitle)) {
                return myBooks[i];
            }
        }
                return null;

        }
    }



