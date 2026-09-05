import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    private static final String FILE_NAME = "phonebook.txt";

    public static void main(String[] args) {

        Map<String,String> phoneNumberBook = new HashMap<>();
        phoneNumberBook.put("Алиса","123456789");
        phoneNumberBook.put("Катя","876543");
        phoneNumberBook.put("Лена","56784365");
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Введите имя пользователя чтобы посмотреть его номер телефона (или 'выход' для завершения): ");
                System.out.println("Если вы хотите добавить новый контакт введите 'добавить'");
                String name = sc.nextLine();

                if (name == null || name.trim().isEmpty()){
                    throw new IllegalArgumentException("Строка не может быть пустой");
                }

                if (name.equalsIgnoreCase("выход")) {
                    System.out.println("До свидания!");
                    break;
                }

                if (name.equalsIgnoreCase("добавить")) {
                    System.out.println("Введите Имя нового пользователя: ");
                    String newName = sc.nextLine();
                    System.out.println("Вы ввели: "+newName);
                    System.out.println("Теперь введите номер телефона нового пользователя: ");
                    String newPhoneNumber = sc.nextLine();
                    System.out.println("Вы ввели: "+newPhoneNumber);
                    phoneNumberBook.put(newName,newPhoneNumber);
                    System.out.println("Пользователь добавлен");
                    break;
                }

                System.out.println("Вы ввели: "+name);

                if (phoneNumberBook.containsKey(name)){
                    System.out.println("Вот номер телефона пользователя с именем "+name+": "+phoneNumberBook.get(name));
                    break;
                } else phoneNumberBook.get(name).length();

            }catch (NumberFormatException e){
                System.out.println("Неверный формат данных, имя должно состоять из букв, ошибка: "+e.getMessage() );

            }
            catch (NullPointerException e){
                System.out.println("Контакт не найден! Ошибка: "+e.getMessage());
                System.out.println("Попробуй еще раз");
            } catch (IllegalArgumentException e){
                System.out.println("Ты ничего не ввел! Ошибка: "+e.getMessage());
                System.out.println("Попробуй еще раз");
            }
        }

        System.out.println(phoneNumberBook);

    }
}