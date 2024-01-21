package dasar;

public class Player {
    //definisi atribut 
    String name;
    int speed;
    int healthPoin;
    int damage;
    int armor;
    
    //definisi method run 
    void run(){
        System.out.println(name +"is running...");
        System.out.println("Speed : "+ speed);
    }
     
    //method menyerang 
    void attack () {
        System.out.println(name + "is attacking");
        System.out.println("Damage : "+ damage);
    }
    
    //metode defense
    void defense () {
        System.out.println(name + "defensif");
        System.out.println("Armor : "+ armor);
    }
    
    //definisi nethod isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead() {
        if(healthPoin <= 0) return true;
        return false;
    }
        
}


