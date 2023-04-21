package com.cagesandcreatures.Characters;

abstract class Character {
    int strength;
    int speed;
    int agility;
    int intelligence;
    int health;

    public Character(int strength, int speed, int agility, int intelligence,int health) {
        this.strength = strength;
        this.speed = speed;
        this.agility = agility;
        this.intelligence = intelligence;
        this.health = health;
    }
    public int getStrength(){
        return strength;
    };

    public int getSpeed(){
        return speed;
    };

    public int getAgility(){
        return agility;
    };

    public int getIntelligence(){
        return intelligence;
    };
    public int getHealth(){
        return health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void setHealth(int health){
        this.health = health;
    }

}
