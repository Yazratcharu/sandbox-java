import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static Map<String, Integer> counterUnique (List<String> list){
        HashMap<String, Integer> map = new HashMap<>();
        Integer counter = 1;
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))){
                map.put(list.get(i), map.get(list.get(i))+1);
                System.out.println("Итерация правды: "+i+", Посмотрим что есть в мапе: "+map+", А что там со счетчиком? "+counter);
            } else {
                map.put(list.get(i),counter );
                System.out.println("Итерация Лжи: "+i+", Посмотрим что есть в мапе: "+map+", А что там со счетчиком? "+counter);
            }
        }
      return map;
    }


    public static Map <String, Integer> forEachmethod (List<String> fruits){
        Map <String, Integer> map = new HashMap<>();
        for (String str : fruits){
            if (map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else {
                map.put(str,1);
            }
        }

        return map;
    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "яблоко", "банан", "яблоко", "апельсин",
                "банан", "яблоко", "груша", "киви",
                "банан", "апельсин", "яблоко"
        );

        System.out.println(counterUnique(words));
        System.out.println(forEachmethod(words));


    }
}