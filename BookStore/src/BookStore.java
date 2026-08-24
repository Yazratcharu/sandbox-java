import java.util.Scanner;

public class BookStore {
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        boolean foundBook = false;

        String[] titles = {
                        "Тайны старого особняка",
                        "Путешествие к сердцу Земли",
                        "Кулинарные секреты бабушки",
                        "Программирование для начинающих",
                        "Искусство жить красиво"
                };


        String[] authors = {
                        "Анна Михайловна Воробьёва",
                        "Михаил Иванович Громов",
                        "Елена Сергеевна Тихонова",
                        "Дмитрий Алексеевич Соколов",
                        "Виктория Петровна Морозова"
                };

        int[] years = {
                        2020, 2018, 2022, 2021, 2019
                };


        int[] prices = {
                        799, 599, 999, 1299, 899
                };

        Book[] books = new Book[5];

            for (int i = 0; i < books.length ; i++) {
                books[i] = new Book(titles[i],authors[i],years[i],prices[i]);
            }

        for (Book book: books){
            if (title.equals(book.getTitle())){
                book.displayInfo();
                foundBook = true;
            }
        }
        if(foundBook == false) {
            System.out.println("Книга не найдена");
        }


    }
}