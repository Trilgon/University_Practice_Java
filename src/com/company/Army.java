package com.company;

import java.util.ArrayList;

public class Army {
    public int Common_Health;
    public int Common_Damage;
    public int Common_Armor;
    public int Common_Strength;

    public int getCommon_Health() {
        return Common_Health;
    }

    public void setCommon_Health(int common_Health) {
        Common_Health = common_Health;
    }

    public int getCommon_Damage() {
        return Common_Damage;
    }

    public void setCommon_Damage(int common_Damage) {
        Common_Damage = common_Damage;
    }

    public int getCommon_Armor() {
        return Common_Armor;
    }

    public void setCommon_Armor(int common_Armor) {
        Common_Armor = common_Armor;
    }

    public int getCommon_Strength() {
        return Common_Strength;
    }

    public void setCommon_Strength(int common_Strength) {
        Common_Strength = common_Strength;
    }

    private int count = 0;
    private ArrayList<Unit> army;

    public Army() {
        army = new ArrayList<Unit>();
    }

    public void AddToArmy(Unit unit) {
        army.add(unit);
        Common_Health += unit.Health;
        Common_Armor += unit.Armor;
        Common_Damage += unit.Damage;
        Common_Strength++;
    }

    public void GetDamage(int damage) {
        if (damage > 0) {
            while (Common_Strength > 0) {
                count++;
                damage -= Common_Armor;
                for (Unit unit : army) {
                    unit.GetDamage(damage);
                }
                for (int i = 0; i < Common_Strength; i++) {
                    if (army.get(i).Health < 1){
                        army.remove(army.get(i));
                        Common_Strength--;
                        i--;
                    }
                }
                Common_Health = 0;
                Common_Armor = 0;
                Common_Damage = 0;
                for (Unit unit : army){
                    Common_Health += unit.Health;
                    Common_Armor += unit.Armor;
                    Common_Damage += unit.Damage;
                }
                System.out.println("После " + count + " атаки:\n" +
                        "Информация об армии:\n" +
                        "Кол-во жизней: " + Common_Health + '\n' +
                        "Кол-во брони: " + Common_Armor + '\n' +
                        "Суммарный урон: " + Common_Damage + '\n' +
                        "Численность: " + Common_Strength + '\n');
            }
        }
    }

    public void AboutArmy(){
        if (Common_Strength > 0){
            System.out.println("Инфрмация об армии: \n" +
                    "Кол-во жизней: " + Common_Health + '\n' +
                    "Кол-во брони: " + Common_Armor + '\n' +
                    "Суммарный урон: " + Common_Damage + '\n' +
                    "Численность: " + Common_Strength + '\n');
        } else {
            System.out.println("В армии нет юнитов\n");
        }
    }
}
