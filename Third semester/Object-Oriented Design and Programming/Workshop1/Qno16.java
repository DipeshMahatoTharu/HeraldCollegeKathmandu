/* Create a Book class with fields title, author, and year. Override the
 toString() method to return a formatted string representation of a
 Book object.*/ 

 class Book{
    String title;
    String author;
    int year;

    public Book(String title,String author ,int year){
        this.title=title;
        this.author=author;
        this.year=year;

    }

@Override 

        public String toString(){
            return("The title of book is : "+title+"Author name : "+ author+" year published in : "+year +"\n");
            
        }


 }

public class Qno16 {
    public static void main(String[] args) {
        Book book1=new Book("48 law of power", "roshan", 67);
        Book book2=new Book("69 power", "okok", 20);
        Book book3=new Book("4not giv", "assad", 67);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
