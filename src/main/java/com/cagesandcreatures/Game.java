package com.cagesandcreatures;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Random;

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

class Elf extends Character {
    public Elf(){
        super(1,4,7,4,10);
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

class Dwarf extends Character {
    public Dwarf(){
        super(7,1,2,6,10);
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

class Knight extends Character {
    public Knight(){
        super(4,4,4,4,10);
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

class Assassin extends Character {
    public Assassin(){
        super(2,2,6,6,10);
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

class Orc extends Character {
    public Orc(){
        super(8,5,2,1,10);
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
interface Move {
    void attack();
    void retreat();
    void sneak();
    void outsmart();
}

abstract class Monster{
    Monster monster;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    int strength;
    int speed;
    int agility;
    int intelligence;
    Character character;
    public Monster(int strength, int speed, int agility, int intelligence) {
        this.strength = strength;
        this.speed = speed;
        this.agility = agility;
        this.intelligence = intelligence;
    }
    public void attack(){
    }
    public void retreat() {
    }
    public void sneak() {

    }
    public void outsmart(){

    }

}
class Demon extends Monster implements Move{
    public Demon() {
        super(8,4,4,1);
    }
    public void attack() {
        if(monster.getStrength() > character.getStrength()){
            character.setHealth((monster.getStrength()-character.getStrength()));
        }
    }
    public void retreat() {
        if(monster.getSpeed() > character.getSpeed()){
            character.setHealth((monster.getSpeed()-character.getSpeed()));
        }
    }
    public void sneak() {
        if(monster.getAgility() > character.getAgility()){
            character.setHealth((monster.getAgility()- character.getAgility()));
        }
    }
    public void outsmart() {
        if(monster.getIntelligence() > character.getIntelligence()){
            character.setHealth((monster.getIntelligence()-character.getIntelligence()));
        }
    }
}
class Goblin extends Monster implements Move {
    public Goblin() {
        super(1,1,4,3);
    }
    public void attack() {
        if(monster.getStrength() > character.getStrength()){
            character.setHealth((monster.getStrength()-character.getStrength()));
        }
    }
    public void retreat() {
        if(monster.getSpeed() > character.getSpeed()){
            character.setHealth((monster.getSpeed()-character.getSpeed()));
        }
    }
    public void sneak() {
        if(monster.getAgility() > character.getAgility()){
            character.setHealth((monster.getAgility()- character.getAgility()));
        }
    }
    public void outsmart() {
        if(monster.getIntelligence() > character.getIntelligence()){
            character.setHealth((monster.getIntelligence()-character.getIntelligence()));
        }
    }
}
class Giant extends Monster implements Move {
    public Giant() {
        super(8,5,2,1);
    }
    public void attack() {
        if(monster.getStrength() > character.getStrength()){
            character.setHealth((monster.getStrength()-character.getStrength()));
        }
    }
    public void retreat() {
        if(monster.getSpeed() > character.getSpeed()){
            character.setHealth((monster.getSpeed()-character.getSpeed()));
        }
    }
    public void sneak() {
        if(monster.getAgility() > character.getAgility()){
            character.setHealth((monster.getAgility()- character.getAgility()));
        }
    }
    public void outsmart() {
        if(monster.getIntelligence() > character.getIntelligence()){
            character.setHealth((monster.getIntelligence()-character.getIntelligence()));
        }
    }
}
class Gnome extends Monster implements Move{
    public Gnome() {
        super(1,1,4,8);
    }
    public void attack() {
        if(monster.getStrength() > character.getStrength()){
            character.setHealth((monster.getStrength()-character.getStrength()));
        }
    }
    public void retreat() {
        if(monster.getSpeed() > character.getSpeed()){
            character.setHealth((monster.getSpeed()-character.getSpeed()));
        }
    }
    public void sneak() {
        if(monster.getAgility() > character.getAgility()){
            character.setHealth((monster.getAgility()- character.getAgility()));
        }
    }
    public void outsmart() {
        if(monster.getIntelligence() > character.getIntelligence()){
            character.setHealth((monster.getIntelligence()-character.getIntelligence()));
        }
    }
}
class Wolf extends Monster implements Move {
    public Wolf() {
        super(3,5,5,3);
    }
    public void attack() {
        if(monster.getStrength() > character.getStrength()){
            character.setHealth((monster.getStrength()-character.getStrength()));
        }
    }
    public void retreat() {
        if(monster.getSpeed() > character.getSpeed()){
            character.setHealth((monster.getSpeed()-character.getSpeed()));
        }
    }
    public void sneak() {
        if(monster.getAgility() > character.getAgility()){
            character.setHealth((monster.getAgility()- character.getAgility()));
        }
    }
    public void outsmart() {
        if(monster.getIntelligence() > character.getIntelligence()){
            character.setHealth((monster.getIntelligence()-character.getIntelligence()));
        }
    }
}
class Dragon extends Monster implements Move {
    public Dragon() {
        super(7,7,6,2);
    }
    public void attack() {
        if(monster.getStrength() > character.getStrength()){
            character.setHealth((monster.getStrength()-character.getStrength()));
        }
    }
    public void retreat() {
        if(monster.getSpeed() > character.getSpeed()){
            character.setHealth((monster.getSpeed()-character.getSpeed()));
        }
    }
    public void sneak() {
        if(monster.getAgility() > character.getAgility()){
            character.setHealth((monster.getAgility()- character.getAgility()));
        }
    }
    public void outsmart() {
        if(monster.getIntelligence() > character.getIntelligence()){
            character.setHealth((monster.getIntelligence()-character.getIntelligence()));
        }
    }
}
class GiantSpider extends Monster implements Move {
    public GiantSpider() {
        super(4,5,7,4);
    }
    public void attack() {
        if(monster.getStrength() > character.getStrength()){
            character.setHealth((monster.getStrength()-character.getStrength()));
        }
    }
    public void retreat() {
        if(monster.getSpeed() > character.getSpeed()){
            character.setHealth((monster.getSpeed()-character.getSpeed()));
        }
    }
    public void sneak() {
        if(monster.getAgility() > character.getAgility()){
            character.setHealth((monster.getAgility()- character.getAgility()));
        }
    }
    public void outsmart() {
        if(monster.getIntelligence() > character.getIntelligence()){
            character.setHealth((monster.getIntelligence()-character.getIntelligence()));
        }
    }
}
class Bandit extends Monster implements Move {
    public Bandit() {
        super(4,4,3,3);
    }
    public void attack() {
        if(monster.getStrength() > character.getStrength()){
            character.setHealth((monster.getStrength()-character.getStrength()));
        }
    }
    public void retreat() {
        if(monster.getSpeed() > character.getSpeed()){
            character.setHealth((monster.getSpeed()-character.getSpeed()));
        }
    }
    public void sneak() {
        if(monster.getAgility() > character.getAgility()){
            character.setHealth((monster.getAgility()- character.getAgility()));
        }
    }
    public void outsmart() {
        if(monster.getIntelligence() > character.getIntelligence()){
            character.setHealth((monster.getIntelligence()-character.getIntelligence()));
        }
    }
}
abstract class Item extends Character{
    public Item(int strength, int speed, int agility, int intelligence, int health) {
        super(strength, speed, agility, intelligence, health);
    }

}
class Armor extends Item{
    public Armor(int strength, int speed, int agility, int intelligence, int health) {
        super(strength, speed, agility, intelligence, health);
    }
}
class Helmet extends Item{
    public Helmet(int strength, int speed, int agility, int intelligence, int health) {
        super(2, 0, -1, 0, 2);
    }

}
class Chestplate extends Item{

    public Chestplate(int strength, int speed, int agility, int intelligence, int health) {
        super(3, -2, -2, 0, 3);
    }
}
class Boots extends Item{

    public Boots(int strength, int speed, int agility, int intelligence, int health) {
        super(0, 1, 1, 0, 1);
    }
}
class Gloves extends Item{

    public Gloves(int strength, int speed, int agility, int intelligence, int health) {
        super(1, 0,1, 0, 0);
    }
}

class Weapon extends Item{
    public Weapon(int strength, int speed, int agility, int intelligence, int health) {
        super(strength, speed, agility, intelligence, health);
    }
}
class Sword extends Weapon{

    public Sword(int strength, int speed, int agility, int intelligence, int health) {
        super(2, 0, 0, 0, 0);
    }
}
class Spear extends Weapon{

    public Spear(int strength, int speed, int agility, int intelligence, int health) {
        super(2, 0, 1, 0, 0);
    }
}
class Shield extends Weapon{

    public Shield(int strength, int speed, int agility, int intelligence, int health) {
        super(0, 0, 0, 0, 2);
    }
}
class Bow extends Weapon{

    public Bow(int strength, int speed, int agility, int intelligence, int health) {
        super(0, 0, 2, 0, 0);
    }
}
class Knife extends Weapon{

    public Knife(int strength, int speed, int agility, int intelligence, int health) {
        super(1, 0, 0, 0, 0);
    }
}
class Axe extends Weapon{

    public Axe(int strength, int speed, int agility, int intelligence, int health) {
        super(4, -1, -1, 0, 0);
    }
}
class Hammer extends Weapon{

    public Hammer(int strength, int speed, int agility, int intelligence, int health) {
        super(5, -2, -2, 0, 0);
    }
}

class Pet extends Item{
    public Pet(int strength, int speed, int agility, int intelligence, int health) {
        super(strength, speed, agility, intelligence, health);
    }
}
class Horse extends Pet{

    public Horse(int strength, int speed, int agility, int intelligence, int health) {
        super(0, 3, 2, 0, 0);
    }
}
class Mule extends Pet{

    public Mule(int strength, int speed, int agility, int intelligence, int health) {
        super(0, 2, 1, 0, 0);
    }
}
class Dog extends Pet{

    public Dog(int strength, int speed, int agility, int intelligence, int health) {
        super(1, 1, 1, 1, 0);
    }
}
class Bird extends Pet{

    public Bird(int strength, int speed, int agility, int intelligence, int health) {
        super(0 ,1, 3, 0, 0);
    }
}
class Monkey extends Pet{
    public Monkey(int strength, int speed, int agility, int intelligence, int health) {
        super(0 ,1, 3, 0, 0);
    }
}

class Potion extends Item{
    public Potion(int strength, int speed, int agility, int intelligence, int health) {
        super(strength, speed, agility, intelligence, health);
    }
}
class StrengthPotion extends Potion{
    public StrengthPotion(int strength, int speed, int agility, int intelligence, int health) {
        super(3, 0, 0, 0, 0);
    }
}
class SpeedPotion extends Potion{

    public SpeedPotion(int strength, int speed, int agility, int intelligence, int health) {
        super(0, 3, 0, 0, 0);
    }
}
class AgilityPotion extends Potion{
    public AgilityPotion(int strength, int speed, int agility, int intelligence, int health) {
        super(0, 0, 3, 0, 0);
    }
}
class IntelligencePotion extends Potion{

    public IntelligencePotion(int strength, int speed, int agility, int intelligence, int health) {
        super(0, 0, 0, 3, 0);
    }
}
class HealingPotion extends Potion{

    public HealingPotion(int strength, int speed, int agility, int intelligence, int health) {
        super(0, 0, 0, 0, 3);
    }
}


class Inventory{
    public List<Item> items;
    public Character character;
    public Inventory() {
        items = new ArrayList<Item>();
    }
    public void addItem(Item item) {
        if (items.size() < 6) {
            items.add(item);
            System.out.println("Item has been added");
        } else {
            System.out.println("Your inventory is full!");
        }
    }
    public void retrieveItem(int index) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Invalid item index.");
        }

        Item item = items.get(index);
        if(character.strength+item.strength<10) {
            character.setStrength(character.strength + item.strength);
        }
        if(character.speed+item.speed<10) {
            character.setSpeed(character.speed + item.speed);
        }
        if(character.agility+item.agility<10) {
            character.setAgility(character.agility + item.agility);
        }
        if(character.intelligence+item.intelligence<10) {
            character.setIntelligence(character.intelligence + item.intelligence);
        }
        if(character.health+item.health<10) {
            character.setHealth(character.health + item.health);
        }

    }
    public void removeItem(int index) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Invalid item index.");
            return;
        }
        Item item = items.get(index);
        character.setStrength(character.strength - item.strength);
        character.setSpeed(character.speed - item.speed);
        character.setAgility(character.agility - item.agility);
        character.setIntelligence(character.intelligence - item.intelligence);
        character.setHealth(character.health - item.health);
        items.remove(index);
        System.out.println("Item has been removed.");
    }
    public List<Item> makeList(){
        items = new ArrayList<>();
        items.add(new Sword(2, 0, 0, 0, 0));
        items.add(new Spear(2, 0, 1, 0, 0));
        items.add(new Shield(0, 0, 0, 0, 2));
        items.add(new Bow(0, 0, 2, 0, 0));
        items.add(new Knife(1, 0, 0, 0, 0));
        items.add(new Axe(4, -1, -1, 0, 0));
        items.add(new Hammer(5, -2, -2, 0, 0));
        items.add(new Helmet(2, 0, -1, 0, 2));
        items.add(new Chestplate(3, -2, -2, 0, 3));
        items.add(new Boots(0, 1, 1, 0, 1));
        items.add(new Gloves(1, 0, 1, 0, 0));
        items.add(new Horse(0, 3, 2, 0, 0));
        items.add(new Mule(0, 2, 1, 0, 0));
        items.add(new Dog(1, 1, 1, 1, 0));
        items.add(new Bird(0, 1, 3, 0, 0));
        items.add(new Monkey(0 ,1, 3, 0, 0));
        items.add(new AgilityPotion(0, 0, 3, 0, 0));
        items.add(new SpeedPotion(3, 0, 0, 0, 0));
        items.add(new SpeedPotion(3, 0, 0, 0, 0));
        items.add(new HealingPotion(3, 0, 0, 0, 0));
        items.add(new IntelligencePotion(3, 0, 0, 0, 0));
        return items;
    }

}
class Location {
    public void setPlayersInside(List<Player> playersInside) {
        this.playersInside = playersInside;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    String type;
    List<Player> playersInside;
    Item item;
    Monster monster;

    public Location(String type) {
        this.type = type;
    }
    public Location(String type, List<Player> playersInside, Item item, Monster monster) {
        this.type = type;
        this.playersInside = playersInside;
        this.item = item;
        this.monster = monster;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public List<Player> getPlayersInside() {
        return playersInside;
    }

    public void addPlayer(Player player) {
        playersInside.add(player);
    }

    public void removePlayer(Player player) {
        playersInside.remove(player);
    }

    public int getNumPlayersInside() {
        return playersInside.size();
    }
}
class Village extends Location {
    String type;
    List<Player> playersInside;
    Item inventory;
    Monster monster;
    public Village(){
        super("village",null,null,null);
    }
}

class Dungeon extends Location {
    String type;
    List<Player> playersInside;
    Item inventory;
    Monster monster;
    public Dungeon(){
        super("dungeon",null,null,null);
    }
}

class Forest extends Location {
    String type;
    List<Player> playersInside;
    Inventory inventory;
    Monster monster;
    public Forest(){
        super("forest",null,null,null);
    }
}

class Obstacle extends Location{
    String type;
    List<Player> playersInside;
    Inventory inventory;
    Monster monster;
    public Obstacle(){
        super("obstacle",null,null,null);
    }
}

class Elseworld extends Location {
    String type;
    List<Player> playersInside;
    Inventory inventory;
    Monster monster;
    public Elseworld(){
        super("#");
    }
}


class Player extends Character{
    int id;
    int row;
    int col;
    Character character;
    Inventory[] inventory;

    public Player(int id, int row, int col,Character character) {
        super(character.getStrength(), character.getSpeed(), character.getAgility(), character.getIntelligence(), character.getHealth());
        this.id = id;
        this.row = row;
        this.col = col;
        this.character = character;
    }

    public int getId(){
        return id;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }



    public Character getCharacter(){
        return character;
    }

    public void setCharacter(Character character){
        this.character = character;
    }
}

class Board{
    private Location[][] board;
    Item item;
    private List<Player> players;
    private Monster monster;
    private Inventory inventory;
    Monster[] bunch = {new Giant(),new GiantSpider(),new Wolf(),new Bandit(),new Demon(),new Dragon(),new Gnome(),new Goblin()};
    List<Item> items = new Inventory().makeList();

    public void setItems(Item[] items) {

    }

    public Board(int size){
        board = new Location[size][size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int type = rand.nextInt(5);
                switch (type) {
                    case 0:
                        board[i][j] = new Village();
                        monster = bunch[rand.nextInt(8)];
                        board[i][j].setMonster(monster);
                        item = items.get(rand.nextInt(items.size()));
                        board[i][j].setItem(item);
                        board[i][j].setPlayersInside(null);
                        break;
                    case 1:
                        board[i][j] = new Dungeon();
                        monster = bunch[rand.nextInt(8)];
                        board[i][j].setMonster(monster);
                        item = items.get(rand.nextInt(items.size()));
                        board[i][j].setItem(item);
                        board[i][j].setPlayersInside(null);
                        break;
                    case 2:
                        board[i][j] = new Forest();
                        monster = bunch[rand.nextInt(8)];
                        board[i][j].setMonster(monster);
                        item = items.get(rand.nextInt(items.size()));
                        board[i][j].setItem(item);
                        board[i][j].setPlayersInside(null);
                        break;
                    case 3:
                        board[i][j] = new Obstacle();
                        monster = bunch[rand.nextInt(8)];
                        board[i][j].setMonster(monster);
                        item = items.get(rand.nextInt(items.size()));
                        board[i][j].setItem(item);
                        board[i][j].setPlayersInside(null);
                        break;
                    case 4:
                        board[i][j] = new Elseworld();
                        monster = bunch[rand.nextInt(8)];
                        board[i][j].setMonster(monster);
                        item = items.get(rand.nextInt(items.size()));
                        board[i][j].setItem(item);
                        board[i][j].setPlayersInside(null);
                        break;
                    default:
                        break;
                }
            }
        }
        players = new ArrayList<Player>();
    }

    public int numPlayers() {
        return players.size();
    }

    public void promptCharacter(Player player) {
        // implementation code here
    }


    public Location[][] getBoard(){
        return board;
    }

    public List<Player> getPlayers(){
        return players;
    }
    public void displayBoardToFile(String fileName) {
        try {
            PrintWriter writer = new PrintWriter(new File(fileName));

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] != null) {
                        writer.print(board[i][j].getType().charAt(0) + " ");
                    } else {
                        writer.print("X");
                    }
                }
                writer.println();
            }

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
    public boolean isPassable(int row, int col) {
        if (board[row][col] instanceof Obstacle) {
            return false; // obstacle is not passable
        }
        return true;
    }
    public void movePlayer(Player player, int newRow, int newCol) {
        int curRow = player.getRow();
        int curCol = player.getCol();

        if (newRow < 0 || newRow >= board.length || newCol < 0 || newCol >= board[0].length) {
            System.out.println("Invalid move: Destination is outside the board.");
            return;
        }

        if (!isPassable(newRow, newCol)) {
            System.out.println("Invalid move: Destination is an obstacle.");
            return;
        }

        board[curRow][curCol].removePlayer(player);
        board[newRow][newCol].addPlayer(player);
        player.row = newRow;
        player.col = newCol;
    }
}

public class Game {
    public static void main(String[] args) {
        Character elf = new Elf();
        Player one = new Player(1,0,0,elf);

        Board board = new Board(9);
        board.movePlayer(one,0,0);

        board.displayBoardToFile("C:\\Users\\Nikolas\\OneDrive\\Desktop\\What.txt");
    }
}
