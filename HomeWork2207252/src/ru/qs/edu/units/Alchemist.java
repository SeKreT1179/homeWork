package ru.qs.edu.units;

public class Alchemist extends Unit {
    private double count;


    public Alchemist(String name, int hp) {
        super(name, hp);
        count = 1;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("множитель урона равен: " + count);
    }

    @Override
    public void getDmg(int getDmg) {
        hp -= getDmg;
    }

    @Override
    public void attack(Unit unit) {
        unit.getDmg((int)( 10 * count));
        count++;
    }
}