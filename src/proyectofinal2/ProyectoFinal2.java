package proyectofinal2;
import java.util.Scanner;
public class ProyectoFinal2 {
Scanner sc= new Scanner (System.in);
int [][] mesas = new int[3][4];
int [][] cedulas = new int[3][4];
    public static void main(String[] args) {
       ProyectoFinal2 obj= new ProyectoFinal2();
    }
    public void imprimirMenu(){
        System.out.println("Bienvenido a Urban");
        System.out.println("1. Asignar mesa");
        System.out.println("2. Solicitar producto");
        System.out.println("3. Pagar");
        System.out.println("4. Ver disponibilidad");
        System.out.println("5. Salir");
                       
    }
    public void imprimirCatalogo(){
        System.out.println("1. (Aguila, poker, budwaiser) 5K");
        System.out.println("2. botella 70K");
        System.out.println("3. combo 1");
    }
    public void imprimirMesas(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
            }
        }
    }
    
}
