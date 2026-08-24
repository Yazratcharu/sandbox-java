public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat(12,"Molly");
        animals[1] = new Dog(17,"Greg", "alabuga");
        animals[2] =new Animal(13,"Oggr");



        for (Animal anim : animals){
            anim.makeSound();
        }
    }
}