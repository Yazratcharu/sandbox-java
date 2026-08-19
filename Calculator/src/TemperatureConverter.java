public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 25.0;
        double kalvins = celsius + 273.15;
        double forenheit = celsius * 9/5 + 32;
        char scale = 'K';

        switch (scale){
            case 'F', 'f' -> System.out.println(celsius+"°C = "+forenheit+"°F");
            case 'K','k' -> System.out.println(celsius+"°C = "+kalvins+"°K");
            default -> System.out.println("Ошибка: Неизвестная шкала");
        }

    }
}
