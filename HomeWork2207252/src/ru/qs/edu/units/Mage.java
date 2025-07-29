package ru.qs.edu.units;

public class Mage extends Unit {
    private int mp;

    public Mage(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mp : " + mp);
    }

    @Override
    public void getDmg(int getDmg) {
        hp -= getDmg;
    }

    @Override
    public void attack(Unit unit) {
        if (mp > 0) {
            unit.getDmg(20);
            mp -= 5;
        } else {
            unit.getDmg(5);
        }
    }
}