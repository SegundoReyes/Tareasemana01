
package programa_seccion01;
import java.util.Scanner;
public class Programa01 {
 public static void main(String[] args) {
     // Definición de variables  
        String nombreCliente;  
        String producto;  
        double precio;  
        int cantidad;  
        double subtotal;  
        double igv;  
        double totalPagar; 
    Scanner lectura = new Scanner(System.in);  
        // Datos de entrada  
        System.out.print("Ingrese el nombre del cliente: ");  
        nombreCliente = lectura.nextLine();  
        System.out.print("Ingrese el producto: ");  
        producto = lectura.nextLine();  
        System.out.print("Ingrese el precio del producto: ");  
        precio = lectura.nextDouble();  
        System.out.print("Ingrese la cantidad: ");  
        cantidad = lectura.nextInt();  
        // Cálculos  
        subtotal = precio * cantidad;            
        igv = subtotal * 0.18;                  
        totalPagar = subtotal - igv;             
        // Resultados  
        System.out.println("\n--- Factura ---");  
        System.out.println("Nombre del cliente: " + nombreCliente);  
        System.out.println("Producto: " + producto);  
        System.out.println("Precio: " + precio);  
        System.out.println("Cantidad: " + cantidad);  
        System.out.printf("Subtotal: %.2f%n", subtotal);  
        System.out.printf("IGV (18%%): %.2f%n", igv);  
        System.out.printf("Total a pagar: %.2f%n", totalPagar);  
         
    }
    
}
