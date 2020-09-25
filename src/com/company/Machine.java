package com.company;

public class Machine extends Unit {
    private String type_of_ammo;
    private String name_of_weapon;
    private int quantity_of_ammo;

    public Machine(int Health, int Damage, String Type, String type_of_ammo, String name_of_weapon, int quantity_of_ammo) {
        this.Type = Type;
        this.Health = Health;
        this.Damage = Damage;
        this.type_of_ammo = type_of_ammo;
        this.name_of_weapon = name_of_weapon;
        this.quantity_of_ammo = quantity_of_ammo;
    }

    @Override
    public void About() {
        if (Health > 0) {
            System.out.println(Type + '\n' +
                    "ammo = " + type_of_ammo + '(' + name_of_weapon + ',' + Damage + ")\n" +
                    "hp = " + Health + '\n');
        } else {
            System.out.println("Юнит уничтожен\n");
        }
    }

    @Override
    public void Attack(Unit enemy) {
        if (Health > 0) {
            if (quantity_of_ammo > 0) {
                super.Attack(enemy);
            }
            quantity_of_ammo--;
        }
    }
}
