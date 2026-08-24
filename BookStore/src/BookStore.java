import java.util.Scanner;

public class BookStore {

    static Book findBookByTitle(Book[] books, String title){
        Book myBook = new Book();
        for (Book book: books){
            if (title.equals(book.getTitle())){
                myBook = book;

            }
        }
        return myBook;
    }
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги для поиска: ");
        String title = scanner.nextLine();


        Book[] books = {
                new Book("Тайны старого особняка", "Анна Михайловна Воробьёва",2020,799),
                new Book("Путешествие к сердцу Земли","Михаил Иванович Громов",2018,599),
                new Book("Кулинарные секреты бабушки","Елена Сергеевна Тихонова",2022,999),
                new Book("Программирование для начинающих","Дмитрий Алексеевич Соколов",2021,1299),
                new Book("Искусство жить красиво","Виктория Петровна Морозова",2019,899)
        };

        if (findBookByTitle(books,title)!= null){
            findBookByTitle(books,title).displayInfo();

        }else System.out.println("Книга не найдена");






    }
}