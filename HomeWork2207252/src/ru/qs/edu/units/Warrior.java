package ru.qs.edu.units;

public class Warrior extends Unit {
    private int armor;

    public Warrior(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Armor : " + armor);
    }

    @Override
    public void getDmg(int getDmg) {
        if (armor > 0) {
            hp -= getDmg / 2;
            armor--;
        } else {
            hp -= getDmg;
        }
    }

    @Override
    public void attack(Unit unit) {
        unit.getDmg(10);
    }
}