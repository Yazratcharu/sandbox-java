public class StudentManager {
    public static void main(String[] args) {
        String[] students = {"Елена", "Алексей", "Мария", "Иван", "Анна", "Сергей", "Татьяна", "Дмитрий" };
        for (int i = 0; i < students.length; i++) {
            int j = i + 1;
            System.out.println(j + ". " + students[i]);
        }
        int result = 0;d
        String name = "";

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                result = students[i].compareTo(students[j]);
                if (result > 0) {
                    name = students[i];
                    students[i] = students[j];
                    students[j] = name;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < students.length; i++) {
            int j = i + 1;
            System.out.println(j + ". " + students[i]);
        }

        String longestName = "";
        for (String nameStudents : students) {
            if (nameStudents.length() > longestName.length()) {
                longestName = nameStudents;
            }
            if(nameStudents.equals("Анна")){
                System.out.println("Студент Анна найден!");
            }
        }
        System.out.println(longestName);
    }
}
