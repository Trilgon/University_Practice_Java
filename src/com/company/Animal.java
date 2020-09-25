package com.company;

public class Animal extends Unit {
    private int speed;

    public Animal(int Health, int Damage, int speed, String Type) {
        this.Type = Type;
        this.Health = Health;
        this.Damage = Damage;
        this.speed = speed;
    }

    @Override
    public void About() {
        if (Health > 0) {
            System.out.println(Type + '\n' +
                    "hp = " + Health + '\n' +
                    "dmg = " + Damage + '\n' +
                    "spd = " + speed + '\n');
        } else {
            System.out.println("Юнит уничтожен\n");
        }
    }
}
