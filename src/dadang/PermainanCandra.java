package dadang;

import java.util.zip.DataFormatException;

class Player{
    String nama;
    Player(String nama){
        this.nama = nama;
        Hero hero;
    }
    void serang(Hero mush){

    }
}
class Hero{
    String nama;
    double health;
    double exp;
    int level;
    Weapon senjata1;
    Defense armor;
    Hero(String nama, double health, double exp, int level){
        this.nama = nama;
        this.health = health;
        this.exp = exp;
        this.level = level;

    }
    void serang(Hero musuh) {
        double exp;
        double attack = this.senjata1.attack;
        System.out.println(this.nama + "menyerang " + musuh.nama + " dengan power : " + attack);
        musuh.defense(attack);
        if (armor.defense < attack){
            exp = this.exp+=10;
            if (exp == 100){
                this.level+=1;
            }
        }else {
             exp = this.exp+=10;
             this.level = 1;
        }
        System.out.println(this.nama + " menerima exp sebesar " + exp );
    }
    void defense (double attack){
        double damage;
        if  (armor.defense < attack){
            damage = attack - this.armor.defense;
        }else {
            damage = this.senjata1.attack;
        }
        this.health -= damage;
        System.out.println(this.nama + " menerima demage sebesar " + damage + " dan darah si " + this.nama + " " + this.health + " hp ");
    }
    void EquipWeapon(Weapon senjata1){
        this.senjata1= senjata1;
    }
    void EquipArmor(Defense armor){
        this.armor = armor;
    }
    void tampilkanHero(){
        System.out.println(" Nama Hero : " + this.nama + " health : " + this.health + " exp : " + this.exp + " level : " + this.level);
        this.senjata1.tampilakanWeapon();
        this.armor.tampilakanDefense();
    }
    void setExp(double exp){
        if (armor.defense < this.senjata1.attack){
            exp = this.exp + 10;
            if  (exp == 100){
               this.level++;
            }else {
                exp = 0;
                this.level = 1;
            }
            System.out.println(this.nama + " menerima exp sebesar " + exp );
        }

    }
}
class Weapon{
    String nama;
    double attack;
    Weapon(String nama, double attack){
        this.nama = nama;
        this.attack = attack;
    }
    void tampilakanWeapon(){
        System.out.println("Nama Senjata : " + this.nama + " , Power : " + this.attack);
    }
}
class Defense{
    double defense;
    Defense (double defense){
        this.defense = defense;
    }
    void tampilakanDefense(){
        System.out.println( " Defense : " + this.defense);
    }
}
public class PermainanCandra {
    public static void main(String[] args) {
        System.out.println("Hanya Konsep Permainan Game Dota 2 \n");
        Player player1 = new Player("Candra Julius Sinaga ");
        // Hero
        Hero hero1 = new Hero("Sniper ",100,10,1);
        Hero hero2 = new Hero("Axe ",100,10,1);
        // weapon
        Weapon senjata = new Weapon("Gun",10);
        Weapon senjata1 = new Weapon("kampak",10);
        // defense
        Defense armor = new Defense(50);
        Defense armor1 = new Defense(100);
        hero1.EquipWeapon(senjata);
        hero1.EquipArmor(armor);
        hero1.tampilkanHero();
        System.out.println("\n");
        hero2.EquipWeapon(senjata1);
        hero2.EquipArmor(armor1);
        hero2.tampilkanHero();
        System.out.println("\n pertempuran pertama ");
        System.out.println("Episode - 1 ");
        hero1.serang(hero2);
        System.out.println("\n");
        hero2.tampilkanHero();
        System.out.println("\n");
        hero1.tampilkanHero();
        System.out.println("\n");
        hero2.EquipWeapon(senjata1);
        hero2.EquipArmor(armor1);
        hero2.tampilkanHero();
        System.out.println("\n");
        hero1.EquipWeapon(senjata);
        hero1.EquipArmor(armor);
        hero1.tampilkanHero();
        System.out.println("\n");
        System.out.println("Pertempuran kedua ");
        System.out.println("Episode - 2");
        hero2.serang(hero1);
        System.out.println("\n");
        hero1.tampilkanHero();
        System.out.println("\n");
        hero2.tampilkanHero();
    }
}
