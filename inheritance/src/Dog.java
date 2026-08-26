public class Dog extends Animal implements Pet{

    private String breed;


    public Dog(int age, String name, String breed) {
        super(age, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
         System.out.println("гаф гаф нах");
    }

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
