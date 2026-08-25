public class Dog implements Pet{






    public void fetch(){
        System.out.println("Собака приносит мятч");
    }

    @Override
    public void play() {
        System.out.println("Собака играет с палкой");
    }

    @Override
    public void feed() {
        System.out.println("Собака грызет кость");
    }
}
