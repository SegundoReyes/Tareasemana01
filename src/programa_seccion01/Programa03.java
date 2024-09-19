
package programa_seccion01;
import java.util.Scanner;
public class Programa03 {
 public static void main(String[] args) {
     // Definición de variables  
        String nombreEmpleado;  
        double ingresos, gastos;  
        double ahorroMensual, ahorroBimestral, ahorroSemestral, ahorroAnual;  
        Scanner lectura = new Scanner(System.in);          
        // Ingreso de datos  
        System.out.print("Nombre del empleado: ");  
        nombreEmpleado = lectura.nextLine();  
        System.out.print("Ingresos del empleado: ");  
        ingresos = lectura.nextDouble();  
        System.out.print("Gastos del empleado: ");  
        gastos = lectura.nextDouble();  
        // Cálculos  
        ahorroMensual = ingresos - gastos; 
        ahorroBimestral = ahorroMensual * 2;  
        ahorroSemestral = ahorroMensual * 6;  
        ahorroAnual = ahorroMensual * 12; 
        // Resultados  
        System.out.printf("Ahorro mensual: %.0f%n", ahorroMensual);  
        System.out.printf("Ahorro bimestral: %.0f%n", ahorroBimestral);  
        System.out.printf("Ahorro semestral: %.0f%n", ahorroSemestral);  
        System.out.printf("Ahorro anual: %.0f%n", ahorroAnual);  
  
 }   
}
