package clasestring;

/**
 *
 * @author pablonoguera
 */
public class MainString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String original = "Anita lava la tina";
        String inverso ="";
        String palabra = original.replaceAll(" ", "").toLowerCase();
     
        for (int i = 0; i < palabra.length(); i++) {
            inverso =  palabra.charAt(i)+ inverso ;
        }
             
        if (palabra.equals(inverso)) {
            System.out.println("Es Palindromo : "+ original);
        }else{
            System.out.println("No es Palindromo");
        }
        
    }

   
    
}
