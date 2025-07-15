package ru.example.edu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Task task1 = new Task(
                "дз по java",
                "ну вроде бы как нормально",
                "15.07.2025"
        );
        Task task2 = new Task(
                "поменять лампочку",
                "главное что бы таком не ударило",
                "17.07.2025"
        );

        Task[] task = new Task[]{task1, task2};

        System.out.println("у вас есть готовые задачи: ");
        System.out.println("Дз по java ");
        System.out.println("Поменять лампочку ");
        System.out.println("Введите искаемое название: ");
        String findName = new Scanner(System.in).next();
        for (int i = 0; i < task.length; i++) {
            if (task[i].equalsName(findName)) {
                task[i].printInfo();
            }
        }
    }
}
