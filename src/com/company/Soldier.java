package com.company;

public class Soldier extends Unit {
    private String type_of_Armor;

    public Soldier(int Health, int Damage, int Armor, String type_of_Armor, String Type) {
        this.Type = Type;
        this.Health = Health;
        this.Damage = Damage;
        this.Armor = Armor;
        this.type_of_Armor = type_of_Armor;
    }

    @Override
    public void About() {
        if (Health > 0){
            System.out.println(Type + "\n" +
                    "hp = " + Health + "\n" +
                    "dmg = " + Damage + "\n" +
                    "Armor = " + type_of_Armor + "(доп.защита = " + Armor + '\n');
        }
        else {
            System.out.println("Юнит уничтожен\n");
        }
    }
}
