public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat(12,"Molly");
        animals[1] = new Dog(17,"Greg", "alabuga");




        for (Animal anim : animals){
            anim.makeSound();
        }
    }
}