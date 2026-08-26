public abstract class Animal {
    private String name;
    private int age;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void makeSound();

    public void displayInfo(){
        System.out.println("Имя: "+this.name+"\nВозраст: "+this.age);
    }
}
