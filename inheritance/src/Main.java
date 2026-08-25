public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Pet[] pets = {cat, dog
        };

        for (Pet ani: pets){
            ani.feed();
            ani.play();
        }





    }
}