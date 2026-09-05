import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try (Scanner scan = new Scanner(System.in)){
            int[] massiv = {51,3,32,4,5,14};
            System.out.println("Введите индекс и я покажу вам число, которое скрывается под ним в массиве: ");
            int index = scan.nextInt();
            System.out.println("Ваш индекс: "+ index);
            System.out.println("Число, которое скрывается под этим индексом: "+ massiv[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Упс, вышли за пределы массива, ошибка: " + e.getMessage());

        }
        catch (NullPointerException e){
            System.err.println("Вы забыли инициализировать массив, не надо так, ошибка: " + e.getMessage());


        }catch (InputMismatchException e){
            System.err.println("В массиве только числа, так что нужно ввести целочисленное число, ошибка: " + e.getMessage());
            e.printStackTrace();
        }
            finally {
            System.out.println("Программа все еще работает и смогла завершиться! Удивительно! Вы плохо пытались ее сломать, ну или даже не пытались.");
        }

    }
}