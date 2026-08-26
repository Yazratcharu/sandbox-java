import java.util.ArrayList;

public class Zoo {
    private ArrayList <Animal> animals;

    public Zoo(ArrayList <Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void makeAllSounds() {
        for (Animal anima : this.animals) {
            anima.makeSound();
        }
    }

    public void playWithPets() {
        for (Animal anima : this.animals) {
            if (anima instanceof Pet){
                ((Pet) anima).play();
            }
        }
    }
}