public class FriendsSorter {
    public static void main(String[] args) {

        String[] friends = {"Анна","Борис", "Виктор", "Алексей", "Алла","Дмитрий"};
        for (int i = 0; i < friends.length; i++) {
            System.out.print(friends[i]+ " ");
        }
        System.out.println();
        int result;
        String name;

        for (int i = 0; i < friends.length-1; i++) {
            for (int j = i+1; j < friends.length; j++) {
                result = friends[i].compareTo(friends[j]);
                if (result>0){
                    name = friends[i];
                    friends[i] = friends[j];
                    friends[j] = name;
                }


            }

        }
        for (int k = 0; k < friends.length; k++) {
            System.out.println(friends[k]);
        }

        int lenghtWord;
        String highestName = "";

        for (int i = 0; i < friends.length - 1; i++) {
                if (friends[i].length()>friends[i+1].length()){
                    lenghtWord = friends[i].length();
                    highestName = friends[i];
                }

        }
        System.out.println("Самое длинное Имя: "+ highestName);

    }
}
