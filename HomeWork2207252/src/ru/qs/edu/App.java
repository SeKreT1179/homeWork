package ru.qs.edu;

import ru.qs.edu.units.Amal;
import ru.qs.edu.units.Mage;
import ru.qs.edu.units.Warrior;

public class App {
    public static void main(String[] args) {
        Mage mage = new Mage("Гэндальф", 50, 20);
        Warrior warrior = new Warrior("Боб", 80, 10);
        Amal amal = new Amal("Амаль", 100, 15);

        while (mage.getHp() > 0 && warrior.getHp() > 0) {
            mage.attack(amal);
            amal.attack(mage);
        }

        mage.printInfo();
        amal.printInfo();
        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("Первый бой окончен ");
        System.out.println("Начинается второй бой");

        while (mage.getHp() > 0 && warrior.getHp() > 0) {
            warrior.attack(amal);
            amal.attack(warrior);
        }

        warrior.printInfo();
        amal.printInfo();
    }
}