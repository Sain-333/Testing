
package testing;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Testing {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1,numero2,operacion,resultado;
        
        operacion = Integer.parseInt(JOptionPane.showInputDialog("Elija una operacion: \n"
                + "1. Sumar \n"
                + "2. Restar \n"
                + "3. Multiplicar\n"
                + "4. Salir: "));
        
        switch (operacion) {
            case 1: System.out.print("Digite la primera canticad: ");
                    numero1 = entrada.nextInt();
                    System.out.print("Digite la segunda cantidad: ");
                    numero2 = entrada.nextInt();
                    
                    resultado = numero1 + numero2;
                    
                    System.out.println("El resultado es: "+resultado);
                    break;
            case 2:  System.out.print("Digite la primera canticad: ");
                    numero1 = entrada.nextInt();
                    System.out.print("Digite la segunda cantidad: ");
                    numero2 = entrada.nextInt();
                    
                    resultado = numero1 - numero2;
                    
                    System.out.println("El resultado es: "+resultado);
                    break;
                
                    
            case 3 : System.out.print("Digite la primera canticad: ");
                    numero1 = entrada.nextInt();
                    System.out.print("Digite la segunda cantidad: ");
                    numero2 = entrada.nextInt();
                    
                    resultado = numero1 * numero2;
                    
                    System.out.println("El resultado es: "+resultado);
                    break;
            case: 4: break;
            
            default : System.out.println("Error, se equivoco de operacion");
    }
        
        
    }
    
}
