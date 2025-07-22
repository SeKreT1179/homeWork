package ru.qs.edu.units;

public class Amal extends Unit {
    private int punishments;

    public Amal(String name, int hp, int punishments) {
        super(name, hp);
        this.punishments = punishments;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Punishments : " + punishments);
    }

    public void getDmg(int dmg) {
        if (punishments > 0) {
            hp -= dmg * 2;
            punishments--;
        } else {
            hp -= dmg;
        }
    }

    public void attack(Mage mage) {
        mage.getDmg(15);
    }

    public void attack(Warrior warrior) {
        warrior.getDmg(15);
    }
}