public class Dog extends Animal{

    String breed;


    public Dog(int age, String name, String breed) {
        super(age, name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
         System.out.println("гаф гаф нах");
    }

    public void fetch(){
        System.out.println("Собака приносит мятч");
    }
}
