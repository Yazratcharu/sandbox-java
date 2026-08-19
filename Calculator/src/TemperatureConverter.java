public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 25.0;
        double kalvins;
        double forenheit;
        char scale = 'C';
        if ( scale == 'F'){
            forenheit = celsius * 9/5 + 32;
            System.out.println(celsius+"°C = "+forenheit+"°F");
        } else if (scale == 'K') {
            kalvins = celsius + 273.15;
            System.out.println(celsius+"°C = "+kalvins+"°K");
        } else {
            System.out.println("Ошибка: Неизвестная шкала");
        }

    }
}
