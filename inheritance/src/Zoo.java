public class Zoo {
    Animal[] animals;

    public Zoo(Animal[] animals) {
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