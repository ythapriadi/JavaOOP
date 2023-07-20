package com.tutorial;

//Player
class Player{
    String name;
    double health;
    int level;
    //object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        
        System.out.println(this.name + " Attacking " + opponent.name + " with power " + attackPower);
        opponent.defense(attackPower);
    }

    void defense(double attackPower){
        //Ketika menerima serangan atau attack
        double damage;
        if (this.armor.defensePower < attackPower){
            damage = attackPower - this.armor.defensePower;
        }else{
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name + " Gets damage " + damage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " HP");
        this.weapon.display();
        this.armor.display();

    }

}

//Senjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , Attack : " + this.attackPower);
    }
}

//Armor
class Armor{
    double defensePower;
    String name;

    Armor(String name, double defensePower){
        this.name = name;
        this.defensePower = defensePower;
    }
     void display(){
        System.out.println("Armor : " + this.name + " , Defense : " + this.defensePower);
    }
}



public class Main {
    public static void main(String[] args) {
        
        //membuat object player
        Player player1 = new Player("Edik", 100);
        Player player2 = new Player("Dika", 80);

        //membuat object weapon
        Weapon pedang = new Weapon("Pedang", 15);
        Weapon tombak = new Weapon("Tombak",10);

        //membuat object armor
        Armor bajuBesi = new Armor("Baju Besi", 80);
        Armor shield = new Armor("Shield",10);
        
        //Equip Senjata dan armor player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        //Equip Senjata dan armor player 2
        player2.equipWeapon(tombak);
        player2.equipArmor(shield);
        player2.display();

        System.out.println("\nBattle Begins !!!");
        System.out.println("\n Episode 1");
        player1.attack(player2);
        player1.display();
        player2.display();

        System.out.println("\n Episode 2");
        player2.attack(player1);
        player1.display();
        player2.display();


    }
    
}
