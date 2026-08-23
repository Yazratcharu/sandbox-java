
public class CoffeeMachine {
    private int waterLavel;
    private int coffeeBeans;

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        if (coffeeBeans>3000){
            this.coffeeBeans = 300;
            System.out.println("Кофе не может быть больше 300 гр.!");
        } else if (coffeeBeans < 0) {
            this.coffeeBeans =0;
            System.out.println("Кофе не может быть меньше 0 гр.!");
        }else this.coffeeBeans = coffeeBeans;

    }

    public int getWaterLavel() {
        return waterLavel;
    }

    public void setWaterLavel(int waterLavel) {

        if (waterLavel>1000){
            this.waterLavel = 1000;
            System.out.println("Воды не может быть больше 1000 мл.!");
        } else if (waterLavel < 0) {
            this.waterLavel =0;
            System.out.println("Воды не может быть меньше 0 мл.!");
        }else this.waterLavel = waterLavel;
    }

    public void makeCoffee(int beansNeeded, int waterNeeded){
        if (this.coffeeBeans > beansNeeded && this.waterLavel > waterNeeded){
            this.coffeeBeans = this.coffeeBeans - beansNeeded;
            this.waterLavel = this.waterLavel - waterNeeded;
            System.out.println("Кофе готов! Осталось воды: "+this.waterLavel+" , зерен: "+this.coffeeBeans);
        } else if (this.coffeeBeans > beansNeeded){
            if (this.waterLavel > waterNeeded){
                System.out.println("Странно, но все в порядке, кофе должен был приготовиться, видимо техническая неполадка");
            } else {
                System.out.println("Не хватает воды для варки кофе!");
            }
        }else {
            System.out.println("Не хватает зерен для варки кофе!");
        }
    }
}