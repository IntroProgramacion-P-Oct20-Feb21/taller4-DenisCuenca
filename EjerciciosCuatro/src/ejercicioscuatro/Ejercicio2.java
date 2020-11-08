/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio2 {
    // 1.Inicio
    public static void main(String[] args) {
        
        //  Declaro las varibles
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //  2. hijo1, d[0,n]
        double hijo1;
        // 3. hijo2, d[0,n]
        double hijo2;
        // hijo3, d[0,n]
        double hijo3;
        // gastoTotal, d[0,n]
        double gastoTotal;
    
        //pido los datos por teclado- entradas
        //6. <<"Ingrese los gastos del primer hijo"
        System.out.println("Ingrese los gastos del primer hijo");
        // 7. >>hijo1
        hijo1 = entrada.nextDouble();
        //8. <<"Ingrese los gastos del segundo hijo"
        System.out.println("Ingrese los gastos del segundo hijo");
        //9. >>hijo2
        hijo2 = entrada.nextDouble();
        // 10. <<"Ingrese los gastos del tercer hijo"
        System.out.println("Ingrese los gastos del tercer hijo");
        // 11. >>hijo3
        hijo3 = entrada.nextDouble();
        
        //proceso
        //12. gastoTotal <- hijo1 + hijo2 + hijo3
        gastoTotal = hijo1 + hijo2 + hijo3;
        // Salida
        //13. <<"El gasto total es " + gastoTotal
        System.out.printf("El gasto total es %.2f \n", gastoTotal);
       
    } // 14. Fin
}
