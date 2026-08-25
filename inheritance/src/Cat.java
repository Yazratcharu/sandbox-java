public class Cat extends Animal implements Pet{
    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("мяу мяу епта");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет с шнурком");
    }

    @Override
    public void feed() {
        System.out.println("Кошка ест рыбу");

    }
}
