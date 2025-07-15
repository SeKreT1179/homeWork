package ru.example.edu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        task task1 = new task(
                "дз по java",
                "ну вроде бы как нормально",
                "15.07.2025"
        );task task2 = new task(
                "поменять лампочку",
                "главное что бы таком не ударило",
                "17.07.2025"
        );


        task[] task = new task[]{task1, task2};


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
