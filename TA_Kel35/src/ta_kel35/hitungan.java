package ta_kel35;
import static ta_kel35.Frame2.infoBox;

public class hitungan {
    private int anak1, dewasa1, total1;
    private String tempat1;
    private int anak2, dewasa2, total2;
    private String tempat2;

// method perhitungan member
public void hitungan1(int dew1, int an1,int pilihan1){
        if(pilihan1==1)
        {
            dewasa1 = dew1*50000;
            anak1 = an1*40000;
            tempat1="Taman Wahana";
        }
        else if(pilihan1==2)
        {
            dewasa1 = dew1*60000;
            anak1 = an1*55000;
            tempat1="Waterboom";
        }
        else if(pilihan1==3)
        {
            dewasa1 = dew1*80000;
            anak1 = an1*70000;
            tempat1="kedua wahana";
        }
        else
        {
            infoBox("Silahkan pilih wahana terlebih dahulu");
        }
    total1=dewasa1+anak1;
    }

// method non member
public void hitungan2(int dew2, int an2,int pilihan2){
        if(pilihan2==1)
        {
            dewasa2 = dew2*65000;
            anak2 = an2*55000;
            tempat2="Taman Wahana";
        }
        else if(pilihan2==2)
        {
            dewasa2 = dew2*70000;
            anak2 = an2*65000;
            tempat2="Waterboom";
        }
        else if(pilihan2==3)
        {
            dewasa2 = dew2*100000;
            anak2 = an2*90000;
            tempat2="kedua wahana";
        }
        else
        {
            infoBox("Silahkan pilih wahana terlebih dahulu");
        }
    total2=dewasa2+anak2; 
}

    //Getter
    public int get_dewasa1(){return dewasa1;}
    public int get_anak1(){return anak1;}
    public int get_total1(){return total1;}
    public String get_tempat1(){return tempat1;}
    
    public int get_dewasa2(){return dewasa2;}
    public int get_anak2(){return anak2;}
    public int get_total2(){return total2;}
    public String get_tempat2(){return tempat2;}
}