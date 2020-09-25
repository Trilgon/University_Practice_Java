package com.company;

abstract class Unit {
    public int getHealth() {
        return Health;
    }

    protected void setHealth(int health) {
        Health = health;
    }

    public int Health;

    public int getArmor() {
        return Armor;
    }

    protected void setArmor(int armor) {
        Armor = armor;
    }

    public int Armor;
    public int Damage;
    public String Type;

    public int GetDamage() {
        return Damage;
    };

    protected void setDamage(int damage) {
        Damage = damage;
    }

    public String getType() {
        return Type;
    }

    protected void setType(String type) {
        Type = type;
    }

    public void Attack(Unit enemy) {
        if (Health > 0)
            enemy.GetDamage();
    }

    public abstract void About();

    public void GetDamage(int damage) {
        damage -= Armor;
        if (damage > 0)
            Health -= damage;
        if (Health < 0)
            Health = 0;
    }

}
