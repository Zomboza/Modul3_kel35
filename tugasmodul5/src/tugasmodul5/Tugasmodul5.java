package tugasmodul5;
import java.util.Scanner;
public class Tugasmodul5 {

    public static void main(String[] args) {

        String email, password;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        
        userService satu = new userService( email, password );
        satu.login();
    }   
}
