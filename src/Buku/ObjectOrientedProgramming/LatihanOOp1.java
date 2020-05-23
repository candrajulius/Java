package Buku.ObjectOrientedProgramming;
class Player{
    String nama;
    double darah;
    int level;
    Senjata senjata;
    Pertahanan armor;
    Player(String Inputnama, double Inputdarah, int InputLevel){
        this.nama = Inputnama;
        this.darah = Inputdarah;
        this.level = InputLevel;
    }
    void serang(Player musuh){
        double attack = this.senjata.attack;
        System.out.println(this.nama + " menyerang " + musuh.nama + " dengan kekuatan " + attack);
        musuh.defense(attack);
    }
    void defense (double attack){
            double damge;
        if (this.armor.defense < attack){
            damge = attack - this.armor.defense;
        }else {
            damge = 0;
        }
        this.darah -=damge;
        System.out.println(this.nama + " mendapatkan kerusakan " +  damge + " dan darah si " + this.nama + " adalah " + darah + " hp ");
    }
    void candra (){
        System.out.println("nama : " + this.nama + " , darah : " + this.darah + " hp " + " ,level : " + this.level);
        this.senjata.manusia();
        this.armor.tahan();
    }
    void equipSenjata(Senjata senjata){
        this.senjata = senjata;
    }
    void  equipArmor(Pertahanan armor){
        this.armor =  armor;
    }

}
class Senjata{
    String senjata;
    double attack;
    Senjata(String Inputsenjata, double Inputattack){
        this.senjata = Inputsenjata;
        this.attack = Inputattack;
    }
    void manusia (){
        System.out.println("nama Senjata : " + this.senjata + " ,  power senjata : " + this.attack);
    }
}

class Pertahanan{
    String armor;
    double defense;
    Pertahanan(String Inputarmor, double Inputdefense){
        this.armor = Inputarmor;
        this.defense = Inputdefense;
    }
    void tahan(){
        System.out.println("Armornya : " + this.armor + " , defense : " + this.defense);
    }
}

public class LatihanOOp1 {
    public static void main(String[] args) {
        System.out.println(" pembuat program Candra Julius Sinaga \n ");
        // membuat object player
        Player candra = new Player("Candra Julius Sinaga", 100, 1);
        Player julius = new Player("Julius Sinaga", 100, 1);
        // membuat object senjata
        Senjata pedang = new Senjata("pedang", 10);
        Senjata bambu = new Senjata("Bambu Runcing", 5);
        // membuat object armor
        Pertahanan baju = new Pertahanan("baju", 10);
        Pertahanan singlet = new Pertahanan("Singlet", 5);
        // menampilkan object senjata
        candra.equipSenjata(pedang);
        candra.equipArmor(baju);
        candra.candra();
        System.out.println("\n");
        julius.equipSenjata(bambu);
        julius.equipArmor(singlet);
        julius.candra();
        System.out.println("\nPertempuran");
        candra.serang(julius);
        julius.candra();
        System.out.println("\n");
        julius.serang(candra);
        candra.candra();
    }
}
