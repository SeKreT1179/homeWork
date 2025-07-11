package ru.example.edu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Film film1 = new Film(
                "1+1",
                "есть негр и инвалид",
                120,
                "драма-комедия"
        );Film film2 = new Film(
                "форсаж",
                "машинки врум-врум",
                100,
                "боевик"
        );


        Film[] films = new Film[]{film1, film2};

        System.out.println("Введите искаемое название: ");
        String findName = new Scanner(System.in).next();
        for (int i = 0; i < films.length; i++) {
            if (films[i].equalsName(findName)) {
                films[i].printInfo();
            }
        }

//        film1.printInfo();
//        film2.printInfo();
    }
}
