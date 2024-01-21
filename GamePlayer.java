package dasar;

public class GamePlayer {
    public static void main(String[] args){

        // membuat objek player
        Player petani  = new Player();

        // mengisi atribut player  
        petani.name = "Petani Kode ";
        petani.speed = 78;
        petani.healthPoin = 100;
        
        petani.name = "Petani kode " ;
        petani.damage = 50 ;
        
        petani.name = "Petani kode " ;
        petani.armor = 85 ;
        
        // menjalankan method
        petani.run();

        petani.attack();
        
        petani.defense();
        
        if(petani.isDead()){
            System.out.println("Game Over!");
        }
        else {
            System.out.println("masih hidup");
        }
    }
}

