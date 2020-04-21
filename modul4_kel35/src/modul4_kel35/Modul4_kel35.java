
package modul4_kel35;

public class Modul4_kel35 {

    public static void main(String[] args) {
        //Pemanggilan Method melalui objek       
        pendefinisi objek = new pendefinisi();
        //Non Return Type tanpa parameter
        objek.greeting();
        //Non Return Type Berparameter
        objek.kelompok("Kelompok 35");
        //Return Type Berparameter
        String print = objek.kenalan("Ade", "Baca Manga");
        //Return Type tanpa parameter
        System.out.println(print);
    }  
}





