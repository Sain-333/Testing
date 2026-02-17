
package testing;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Testing {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1,numero2,operacion,resultado;
        double base,exponente,resultado2;
        
        operacion = Integer.parseInt(JOptionPane.showInputDialog("Elija una operacion: \n"
                + "1. Sumar \n"
                + "2. Restar \n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Potencia\n"
                + "6. Salir: "));
        
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
                    
            case 4: System.out.print("Digite la primera canticad: ");
                    numero1 = entrada.nextInt();
                    System.out.print("Digite la segunda cantidad: ");
                    numero2 = entrada.nextInt();
                    
                    resultado = numero1 / numero2;
                    
                    System.out.println("El resultado es: "+resultado);
                    break;
                
            case 5:  System.out.print("Digite la base: ");
                     base = entrada.nextDouble();
                     System.out.print("Digite el exponente: ");
                     exponente = entrada.nextDouble();
                     
                     resultado2 = Math.pow(base, exponente);
                    System.out.println("El resultado es : "+resultado2);
                    break;
                    
            case 6: break;
            
            default : System.out.println("Error, se equivoco de operacion");
    }
        
        
    }
    
}
