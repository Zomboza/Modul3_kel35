package tugasmodul5;

public class userService {
    
    private String[][] data = new String[2][3];
    private String[][] histories = new String[2][4];
    private String email, password, roles, mage, mm, tank = "";
    
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"adekelompok35@gmail.com", "12345", "superAdmin"},
            {"nama2kelompok35@gmail.com", "12345", "user"} 
        };
        String[][] histories =
        {
            {"adekelompok35@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemrograman", "24-04-2020"},
            {"nama2kelompok@gmail.com", "Dasar Komputer dan Pemrograman", "Konsep Jaringan Komputer", "24-04-2020"}
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                    mage = histories[i][1];
                    mm = histories[i][2];
                    tank = histories[i][3];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            System.out.println(mage);
            System.out.println(mm);
            System.out.println("Tanggal Pinjaman: " + tank);
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }    
}