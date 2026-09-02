public class Main {
    public static void main(String[] args) {


        try {
            int[] massiv = {3,4,5};
            System.out.println(massiv[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Упс, вышли за пределы массива");
        } finally {
            System.out.println("А этот finally выполнен ");
        }

    }
}