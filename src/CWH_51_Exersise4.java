 // you have implement a libery using java class libery
        // method: add book,issue book , return book
        // proprty : array to store the avaiable books
        // array to store the issued books
 class Library{
     String [] books;
     int no_of_books;

     Library(){
         this.books = new String [10];
         this.no_of_books = 0;
     }

     void addBook(String book){
         this.books[this.no_of_books] = book;
         this.no_of_books++;
         System.out.println("Book added to the library");
     }

     void showbook(){
         System.out.println("Available Books");
         for(String book : this.books){
             if (book == null){
                 continue;
             }
             System.out.println("* " + book);
         }
     }
     void issueBook(String book){
         for (int i = 0; i < this.books.length; i++){

             if (this.books[i].equals(book)){
                 System.out.println("Book issued to the library");
                 this.books[i] = null;
                 return;
             }
             System.out.println("* " + book);
         }
         System.out.println("this book is does not exist in the library");

         }
     void returnebook (String book){
         addBook(book);
         }
     }


 public class CWH_51_Exersise4 {
     public static void main(String[] args) {

         Library centralLibraRY = new Library();

         centralLibraRY.addBook("this and grow rich");
         centralLibraRY.addBook("Algorithm");
         centralLibraRY.addBook("c++");
         centralLibraRY.addBook("java");
centralLibraRY.issueBook("java");
//         centralLibraRY.showbook();
         centralLibraRY.returnebook("java");
         centralLibraRY.showbook();
     }
 }