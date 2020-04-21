package tugasmodul4_kel35;
import java.util.Scanner;

public class Tugasmodul4 {
    public static void main(String[] args) {
        keterangan tulisan = new keterangan();
        perhitungan rumus = new perhitungan();
        Scanner scan = new Scanner(System.in);
        String pilihan, ulang;

        do{
        tulisan.judul();
        
        pilihan = scan.nextLine();
        switch(pilihan){
            case "1":
                tulisan.wahana();
                rumus.input_wahana();
                break;
                
            case "2":
                tulisan.waterboom();
                rumus.input_waterboom();
                break;
                
            case "3":                
                System.exit(0); 
                
            default:
                System.out.println("\nInput salah! Silahkan coba lagi");                      
        }
        
        System.out.println("\napakah anda ingin mengulang? tekan 1 untuk iya");
        ulang = scan.nextLine();
        
        }while(ulang.equals("1"));
    }
}