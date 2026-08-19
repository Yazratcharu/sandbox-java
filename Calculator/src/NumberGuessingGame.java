import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int secret = 42;
        Scanner sc = new Scanner(System.in);
        int guess;
        System.out.println("Добро пожаловать в игру! Вам предстоит " +
                "угадать загаданное мной число от 1 до 100! У вас есть 5 попыток! Начинаем!");

        for (int i = 0; i < 5; i++) {
            guess = sc.nextInt();
            if (guess > secret){
                System.out.println("Загаданное число меньше");
            } else if (guess < secret) {
                System.out.println("Загаданное число больше");
            } else if (guess == secret) {
                System.out.println("Поздравляю! Вы угадали!");
                break;
            } if (i == 4){
                System.out.println("Вы проиграли. Было загадано число " + secret);
            }
        }
    }
}
