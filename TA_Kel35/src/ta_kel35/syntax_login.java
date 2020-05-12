package ta_kel35;

public class syntax_login {
    private String[][] data = new String[2][2];
    private String namao, passwordo;
    
    // Constructor
    public syntax_login()
    {
        String[][] data = 
        { 
        {"joko", "12345"},
        {"kentir", "67890"} 
        };
        this.data = data;
    }
    
    // Method verifikasi
    public boolean verif(String namae, String passworde)
    {      
        namao = namae;
        passwordo = passworde;            
            
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(namao))
            {
                if(data[i][1].equals(passwordo))
                {
                    return true;
                }
            }
        }
        return false;
    }

}
