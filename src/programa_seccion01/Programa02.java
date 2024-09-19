
package programa_seccion01;
import java.util.Scanner;
public class Programa02 {
public static void main(String[] args) {
    // Definición de variables  
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5;  
        double totalSueldos, promedioSueldo;  
    Scanner lectura = new Scanner(System.in);  
        // Ingreso de sueldos  
        System.out.print("Ingrese el sueldo 1: ");  
        sueldo1 = lectura.nextDouble();  
        System.out.print("Ingrese el sueldo 2: ");  
        sueldo2 = lectura.nextDouble();  
        System.out.print("Ingrese el sueldo 3: ");  
        sueldo3 = lectura.nextDouble();  
        System.out.print("Ingrese el sueldo 4: ");  
        sueldo4 = lectura.nextDouble();  
        System.out.print("Ingrese el sueldo 5: ");  
        sueldo5 = lectura.nextDouble();  
        // Cálculos  
        totalSueldos = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;  
        promedioSueldo = totalSueldos / 5; 
        // Resultados (conversión a enteros)  
        System.out.printf("Total de Sueldos: %d%n", (int)totalSueldos);  
        System.out.printf("Promedio de Sueldo: %d%n", (int)promedioSueldo);    
   
}    
}
