public class Animal {
    String name;
    int age;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Страшно орёт");
    }

    public void displayInfo(){
        System.out.println("Имя: "+this.name+"\nВозраст: "+this.age);
    }
}
