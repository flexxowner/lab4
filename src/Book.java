public class Book {
    private String title;
    private String author;
    private int year;

    // Конструктор класса Book
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Метод для получения названия книги
    public String getTitle() {
        return title;
    }

    // Метод для получения автора книги
    public String getAuthor() {
        return author;
    }

    // Метод для получения года издания книги
    public int getYear() {
        return year;
    }

    // Переопределение метода toString для удобного вывода информации о книге
    @Override
    public String toString() {
        return "Книга: " + title + ", Автор: " + author + ", Год издания: " + year;
    }
}
