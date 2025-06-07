public class Book {
    public Book(
            String title,
            Integer releaseYear,
            Author author,
            Integer pages
    ) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    String title;
    Integer releaseYear;
    Author author;
    Integer pages;


    public Boolean isBig() {
        return (pages > 500);
    }

    public Boolean matches(String word) {
        if (title.contains(word) ||
                author.name.contains(word) ||
                author.surname.contains(word)
        ) return true;
        return false;
    }

    public Integer estimatePrice() {
        int price = (int) Math.floor(3 * pages * Math.sqrt(author.rating));
        return Math.max(price, 250);
    }
}