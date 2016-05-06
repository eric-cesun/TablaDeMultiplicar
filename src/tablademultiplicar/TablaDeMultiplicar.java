/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablademultiplicar;

import java.util.Scanner;

/**
 *
 * @author kirito205
 */
public class TablaDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("dame el numero");
        Scanner leerNumero= new Scanner(System.in);
        int Numero= 0;
        Numero=leerNumero.nextInt();
        int cantidad=0;
        for (int i = 1; i <= 10; i++) {
            cantidad=Numero*i;
            System.out.println(Numero+"*"+i+"="+cantidad);
        }
    }
    
}
