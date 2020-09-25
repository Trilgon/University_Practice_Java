package com.company;

public class Main {
    public static void main(String[] args) {
        Army army = new Army();
        Machine Catapult = new Machine(725, 19, "Catapult", "Bolt", "Electric Phasing Annihilation", 10);
        Soldier Rogue = new Soldier(81, 8, 50, "Steel Armor", "Rogue");
        Soldier Paladin = new Soldier(117, 14, 20, "Leather Armor", "Paladin");
        Soldier Paladin1 = new Soldier(151, 12, 40, "Iron Armor", "Paladin1");
        Soldier Paladin2 = new Soldier(168, 12, 10, "Hide Armor", "Paladin2");
        Animal Rhino = new Animal(74, 30, 27, "Rhino");
        Rider Rider1 = new Rider(Rogue, Rhino, "Rider1");
        Rider Rider2 = new Rider(Paladin, Rhino, "Rider2");
        army.AddToArmy(Catapult);
        army.AddToArmy(Rogue);
        army.AddToArmy(Paladin);
        army.AddToArmy(Paladin1);
        army.AddToArmy(Paladin2);
        army.AddToArmy(Rhino);
        army.AddToArmy(Rider1);
        army.AddToArmy(Rider2);

        army.AboutArmy();

        army.GetDamage(310);
        System.out.println("Бой закончен");

        army.AboutArmy();
    }
}
