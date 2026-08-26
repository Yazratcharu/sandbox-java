import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat(12, "Kiska");
        Dog dog = new Dog(17,"Alabuga", "bull dog");
        Bird bird = new Bird(1,"vorobey");
        ArrayList<Animal> pets = new ArrayList<>();
        pets.add(cat);
        pets.add(dog);
        pets.add(bird);
        Zoo zoo = new Zoo(pets);
        zoo.playWithPets();
        zoo.makeAllSounds();







    }
}