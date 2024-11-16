public class Main {
    public static void main(String[] args) {
        //Задача 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.print("Ф. И. О. сотрудника — " + fullName);

        //Задча 2
        System.out.print("\n\nДанные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Задача 3
        fullName = "Иванов Семён Семёнович";

        System.out.println("\n\nДанные Ф. И. О. сотрудника — " + fullName.replace("ё", "е").replace("Ё", "Е"));
    }
}