import java.io.File;
import java.util.Scanner;

// valida el ingreso de los dependientes quue estén en el archivo: members.txt
public class Login {
    private static Scanner x;

    String userName = "admin";
    String password = "112233";
    String filePath = "src\\members.txt";

    String adminName = "admin";
    String adminPassword = "112233";

    


    public static void verifyLogin( String userName, String password, String filePath ){
        boolean found = false;
        String tempUserName = "";
        String tempUserPass = "";
    
        try {
            x = new Scanner( new File( filePath ) );
            x.useDelimiter( "[,\n]" );   // verifica que esta separado por coma y salto de linea
    
            while( x.hasNext() && !found ){  // hasnext: tiene un valor
                tempUserName = x.next();
                tempUserPass =  x.next();
    
                if ( tempUserName.trim().equals( userName.trim() ) 
                    && tempUserPass.trim().equals( password.trim() ) ){
                    
                    found = true;
                }
                
            }
            x.close();
            System.out.println( found );
    
        } catch ( Exception e ){
            System.out.println("Error"+ e );
        }

    }

}
