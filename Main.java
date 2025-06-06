
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Harper","Lee",4);
        Book book = new Book("To Kill a Mockingbird",1990,author,
                900);
        System.out.println(book.isBig());
        System.out.println(book.matches("Lee"));
        System.out.println(book.estimatePrice());
    }
}

class Book {
    public Book(String title,Integer releaseYear, Author author, Integer pages){
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }
    String title;
    Integer releaseYear;
    Author author;
    Integer pages;


    public String isBig(){
        if (pages>500) return "да";
        return "нет";
    }
    public String matches(String word){
        if (
                title.contains(word)
                || author.name.contains(word)
                || author.surname.contains(word)
        ) return "да";
        return "нет";
    }
    public Integer estimatePrice(){
        int price = (int)Math.floor(3*pages * Math.sqrt(author.rating));
        return Math.max(price, 250);
    }
}

class Author{
    public Author(String name,String surname, Integer rating){
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }
    String name;
    String surname;
    Integer rating;
}


