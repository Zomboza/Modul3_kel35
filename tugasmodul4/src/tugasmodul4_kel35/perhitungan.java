package tugasmodul4_kel35;
import java.util.Scanner;

public class perhitungan {

       Scanner scan = new Scanner(System.in);
       String d, a, member;
       int dd, aa, total;
    
    public void orang(){
        System.out.println("");
        System.out.println("Silahkan masukkan jumlah orang");
        System.out.print("Dewasa: ");
                d = scan.nextLine();
                    while (d.matches("") || !d.matches("[0-9]*")) {
                    System.out.println("\ninput salah, silahkan masukkan angka yg benar");
                    System.out.print("Dewasa: ");                    
                    d = scan.nextLine();
                    }
                System.out.print("Anak-anak: ");
                a = scan.nextLine();
                    while (a.matches("") || !a.matches("[0-9]*"))  {
                    System.out.println("\ninput salah, silahkan masukkan angka yg benar");
                    System.out.print("Anak-anak: ");                    
                    a = scan.nextLine();
                    }
                dd = Integer.parseInt(d);
                aa = Integer.parseInt(a);
                
                System.out.println("\nApakah anda memiliki kartu member? tekan 1 jika punya");
                member = scan.nextLine(); 
    }

        public void input_wahana(){
            orang();
            
                if (member.equals("1")){
                    total=dd*80000+aa*40000;
                    String total2 = Integer.toString(total);
                    System.out.println("\nBiaya anda sebesar Rp"+total2);
                    
                }else{
                    total=dd*100000+aa*50000;
                    String total2 = Integer.toString(total);
                    System.out.println("\nBiaya anda sebesar Rp"+total2 );
                    
                }
        }
        
        public void input_waterboom(){
            orang();
                
                if (member.equals("1")){
                    total=dd*75000+aa*40000;
                    String total2 = Integer.toString(total);
                    System.out.println("\nBiaya anda sebesar Rp"+total2);
                    
                }else{
                    total=dd*90000+aa*50000;
                    String total2 = Integer.toString(total);
                    System.out.println("\nBiaya anda sebesar Rp"+total2 );
                    
                }
        }
}
