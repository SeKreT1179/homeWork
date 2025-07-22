import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Tasks task1 = new Tasks(
                "Закладки",
                "1 закладка 1000 рублей",
                "21.07.2016"
        );

        Tasks task2 = new Tasks(
                "Собакен клац клац ",
                "Не злить собаку укусит ",
                "Никогда"
        );

        Tasks task3 = new Tasks(
                "Что умное",
                "не знаю что можно написать",
                "29.12.2025"
        );

        Scanner scanner = new Scanner(System.in);
        String findWord = scanner.next();
        Tasks[] tasks = new Tasks[]{task1, task2, task3};
        boolean haveWord = false;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].equalseWord(findWord)) {
                tasks[i].printInfo();
            }
        }

        //новое
        Tasks tasksCopy = new Tasks(task1);
        tasksCopy.printInfo();
        Tasks task4 = new Tasks(
                "стать миллионером",
                "01.01.2030"
        );
        task4.printInfo();
        System.out.println("Задач было создано: " + Tasks.count);
    }
}