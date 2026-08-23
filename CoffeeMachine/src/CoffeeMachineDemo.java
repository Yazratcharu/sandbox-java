public class CoffeeMachineDemo {
    public static void main(String[] args) {
    CoffeeMachine glassOfCoffee = new CoffeeMachine();
    glassOfCoffee.setWaterLavel(800);
    glassOfCoffee.setCoffeeBeans(150);
    glassOfCoffee.makeCoffee(20,200);
    glassOfCoffee.makeCoffee(50,700);
    System.out.println(glassOfCoffee.getCoffeeBeans());
    System.out.println(glassOfCoffee.getWaterLavel());
    }
}
