package Week3Exercises;

public class Book {


        private String title;
        private String author;
        private int publicationYear;

        private boolean borrowed;

        public int numberOfPages;


        public Book(String title, String author, int publicationYear, int numberOfPages) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
            this.numberOfPages = numberOfPages;
            borrowed=false;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        public boolean isBorrowed() {
            return borrowed;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }

        public void setBorrowed(boolean borrowed) {
            this.borrowed = borrowed;
        }

        @Override
        public String toString() {
           /* return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", publicationYear='" + publicationYear + '\'' +
                    ", borrowed=" + borrowed +
                    ", numberOfPages=" + numberOfPages +
                    '}';*/
            return "The title of the book is: "  + title + "\n"+ "Author: " +author+"\n"+"published year: "+ publicationYear+"\n"+"borrowed: "+borrowed
                    +"\n" + "Number of pages: " + numberOfPages;
        }

        }

 class Main{
     public static void main(String[] args) {
         Book book1=new Book("Harry Potter","JK ROwling",1981,500);

         Book book2=new Book("Animal Farm","George Orwell",1980,700);
         // System.out.println( book1.getAuthor());
         // System.out.println( book.getPublicationYear());
         // System.out.println( book.getAuthor());
         System.out.println(book1.toString());
         System.out.println("\nObject2");
         System.out.println(book2.toString());
     }
 }