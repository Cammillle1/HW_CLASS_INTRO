public class Main {
    public static void main(String[] args) {
        Author author = new Author("Harper", "Lee", 4);
        Book book = new Book("To Kill a Mockingbird", 1990, author,
                900);
        System.out.println(book.isBig());
        System.out.println(book.matches("Lee"));
        System.out.println(book.estimatePrice());
    }
}






