public class Calculator {

    public static void main(String[] args) {
        double a = 15.5;
        double b = 11;
        char operation = '*';
        double result;

        if (operation == '/' && b == 0) {
            System.out.println("Ошибка деления на ноль");
        } else if (operation == '/' ){
                result = a/b;
                System.out.println(a+" / "+b+" = "+result);
            }else if (operation == '*'){
                result = a*b;
                System.out.println(a+" * "+b+" = "+result);
            }else if (operation == '-'){
                result = a-b;
                System.out.println(a+" - "+b+" = "+result);
            }else if(operation == '+'){
                result = a+b;
                System.out.println(a+" + "+b+" = "+result);
            }else {
                System.out.println("Неизвестная операция");
            }
        }

    }


