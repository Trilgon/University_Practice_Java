package com.company;

public class Rider extends Unit {

    Soldier rider;
    Animal mount;

    public Rider(Soldier rider, Animal mount, String Type) {
        this.rider = rider;
        this.mount = mount;
        this.Type = Type;
        Health = rider.Health + mount.Health;
        Damage = rider.Damage + mount.Damage;
    }

    @Override
    public void About() {
        if (Health > 0) {
            System.out.println("Rider\n" +
                    "hp = " + Health + '\n' +
                    "dmg = " + Damage + '\n' +
                    "Rider = " + rider.Type + '\n' +
                    "Mount = " + mount.Type + '\n');
        } else {
            System.out.println("Юнит уничтожен\n");
        }
    }
}
