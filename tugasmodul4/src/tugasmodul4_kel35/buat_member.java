package tugasmodul4_kel35;
import java.util.Scanner;

public class buat_member {
    
    Scanner scan = new Scanner(System.in);
    String nama, ktp;
    
    public void namae(){
    System.out.print("Silahkan masukkan nama: ");
    nama = scan.nextLine();
    while (!nama.matches("[ a-zA-Z]+")) 
    {
        System.out.println("\ninput salah, silahkan masukkan nama dengan benar");
        System.out.print("Silahkan masukkan nama: ");
        nama = scan.nextLine();
    }
    System.out.print("Silahkan masukkan no KTP: ");
    ktp = scan.nextLine ();
    while (ktp==("") || !ktp.matches("[0-9]*"))  {
        System.out.println("\ninput salah, silahkan masukkan angka yg benar");
        System.out.print("Silahkan masukkan no KTP: ");                    
        ktp = scan.nextLine();
    }
    System.out.println("\nSelamat " +nama +"! Kartu member telah dibuat, silahkan ambil di Pintu wahana");
    System.out.println("Jangan lupa selalu tunjukkan kartu saat menukarkan tiket member");
    }
}
