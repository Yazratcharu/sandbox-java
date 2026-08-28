import java.util.*;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> movieList = new ArrayList<>();
        HashMap<String, String> movieDatabase = new HashMap<>();
        movieList.add("Форрест Гамп");
        movieList.add("Король говорит");
        movieList.add("Интерстеллар");
        movieList.add("Побег из Шоушенка");
        movieList.add("Начало");
        movieList.add("[Удалить фильм из списка.]");
        movieList.add("[Добавить фильм в список.]");

        System.out.println("В нашем списке есть следующие фильмы:");
        for (int i = 1; i < movieList.size()+1; i++) {
            System.out.println(i+". "+movieList.get(i-1));
        }


        movieDatabase.put(movieList.get(0),"Роберт Земекис");
        movieDatabase.put(movieList.get(1),"Том Хупер");
        movieDatabase.put(movieList.get(2),"Кристофер Нолан");
        movieDatabase.put(movieList.get(3),"Фрэнк Дарабонт");
        movieDatabase.put(movieList.get(4),"Кристофер Нолан");

        System.out.println("Введите цифру с номером фильма, чтобы узнать его режисера или совершить действие: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Вы выбрали фильм: "+movieList.get(choice-1) );
                System.out.println("У этого замечательного во всех смыслах фильма не менее прекрасный режисер - "+movieDatabase.get(movieList.get(choice-1)));
                break;
            case 2:
                System.out.println("Вы выбрали фильм: "+movieList.get(choice-1) );
                System.out.println("У этого замечательного во всех смыслах фильма не менее прекрасный режисер - "+movieDatabase.get(movieList.get(choice-1)));
                break;
            case 3:
                System.out.println("Вы выбрали фильм: "+movieList.get(choice-1) );
                System.out.println("У этого замечательного во всех смыслах фильма не менее прекрасный режисер - "+movieDatabase.get(movieList.get(choice-1)));
                break;
            case 4:
                System.out.println("Вы выбрали фильм: "+movieList.get(choice-1) );
                System.out.println("У этого замечательного во всех смыслах фильма не менее прекрасный режисер - "+movieDatabase.get(movieList.get(choice-1)));
                break;
            case 5:
                System.out.println("Вы выбрали фильм: "+movieList.get(choice-1) );
                System.out.println("У этого замечательного во всех смыслах фильма не менее прекрасный режисер - "+movieDatabase.get(movieList.get(choice-1)));
                break;
            case 6:
                System.out.println("Выберите номер фильма который хотите удалить");
                for (int i = 1; i < movieList.size()-1; i++) {
                    System.out.println(i+". "+movieList.get(i-1));
                }
                Scanner scanner1 = new Scanner(System.in);
                int choise1 = scanner1.nextInt();
                switch (choise1){
                    case 1:
                        movieDatabase.remove(movieList.get(choise1-1));
                        movieList.remove(choise1-1);
                        break;
                    case 2:
                        movieDatabase.remove(movieList.get(choise1-1));
                        movieList.remove(choise1-1);
                        break;
                    case 3:
                        movieDatabase.remove(movieList.get(choise1-1));
                        movieList.remove(choise1-1);
                        break;
                    case 4:
                        movieDatabase.remove(movieList.get(choise1-1));
                        movieList.remove(choise1-1);
                        break;
                    case 5:
                        movieDatabase.remove(movieList.get(choise1-1));
                        movieList.remove(choise1-1);

                        break;
                    default:
                        System.out.println(" УПС! Кажется вы выбрали что-то не то");
                }

                break;
            case 7:
                System.out.println("Логику добавления фильма делать не стал пока");
                break;

            default:
                System.out.println("Упс, кажется вы выбрали что-то другое");
                break;
            }

        for (int i = 0; i < movieList.size()-2; i++) {
            System.out.println("В листе массивов остались фильмы: "+movieList.get(i));
        }
        for (Map.Entry<String,String> entry: movieDatabase.entrySet()){
            System.out.println("Ключ таблицы: "+entry.getKey()+"\nЗначение по ключу: "+entry.getValue());
        }


    }
}