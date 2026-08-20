public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = {5,12,7,23,19,8,3};
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]+ " ");
            sum = sum + numbers[i];
        }
        System.out.println("");

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]%2==0){
                System.out.println("Четные числа в массиве: " + numbers[i]);
            }
        }

        for (int i = 0; i < numbers.length-1 ; i++) {
            if(max<numbers[i+1]){
                max = numbers[i+1];
            }
            if(min>numbers[i+1]){
                min = numbers[i+1];
            }
        }
        System.out.println("Сумма чисел в массиве: "+ sum);
        System.out.println("Минимальное число в массиве: "+ min);
        System.out.println("Максимальное число в массиве: "+ max);
    }
}
