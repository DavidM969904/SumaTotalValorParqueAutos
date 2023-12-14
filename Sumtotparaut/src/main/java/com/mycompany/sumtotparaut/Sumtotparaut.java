/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumtotparaut;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author PABLO
 */
public class Sumtotparaut {

    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);
        System.out.println("¡Bienvenido!");
        ArrayList<Auto> autos = new ArrayList<>();
        
        System.out.println("Ingrese el numero de autos del parque automovilísto:");
        int n = pm.nextInt();
        
        for (int i=0; i < n; i++)
        {
            System.out.println("Ingrese la placa del vehículo:");
            String p = pm.next();
            pm.nextLine();
            System.out.println("Ingrese el modelo del vehículo:");
            String m = pm.nextLine();
            System.out.println("Ingrese el valor del vehiculo:");
            double v = pm.nextDouble();
            pm.nextLine();
            
            autos.add(new Auto(p,m,v));
        }
        
        double total = 0;
        
        for (Auto auto: autos)
        {
            total+= auto.getValor();
        }
        
        System.out.println("El valor total de autos es: " + total);
    }
}
