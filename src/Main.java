import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Добавление книг в библиотеку, включая украинских авторов
        books.add(new Book("Преступление и наказание", "Федор Достоевский", 1866));
        books.add(new Book("Война и мир", "Лев Толстой", 1869));
        books.add(new Book("1984", "Джордж Оруэлл", 1949));
        books.add(new Book("Смерть Дракона", "Андрей Левицкий", 2008));
        books.add(new Book("Кайдашева сім'я", "Іван Нечуй-Левицький", 1888));

        // Вывод списка книг в библиотеке
        System.out.println("Список книг в библиотеке:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Демонстрация поиска книги по названию
        System.out.print("\nВведите название книги для поиска: ");
        String searchTitle = scanner.nextLine();
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("Книга найдена:\n" + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Книга с таким названием не найдена.");
        }
    }
}

