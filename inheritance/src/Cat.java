public class Cat implements Pet{

    @Override
    public void play() {
        System.out.println("Кошка играет с шнурком");
    }

    @Override
    public void feed() {
        System.out.println("Кошка ест рыбу");

    }
}
