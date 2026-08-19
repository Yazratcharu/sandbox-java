public class LoopsDemo {
    public static void main(String[] args) {

        // Пример цикла for
        for (int i = 2; i <= 20 ; i+=2) {
            System.out.println(i);
        }
        // Пример цикла while
        int number = 12345;
        int sum = 0;
        int lastNumber;
        while (number>0){
            lastNumber = number%10;
            sum = sum + lastNumber;
            number = number/10;

        }
        System.out.println(sum);

        // Пример цикла do-while
        int j = 10;
        do {
            System.out.println(j);
            j-=1;
        } while (j >= 1);
    }
}
