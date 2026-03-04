
import java.util.Scanner;

public class principal{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodo met = new metodo();

        System.out.print("ingrese la dimension de la matriz: ");
        int n = sc.nextInt();

        objProducto[][] productos = new objProducto[n][n];

        productos = met.llenar(productos, sc);

        objProducto[] vA = met.agruparVector(productos, 'A');
        objProducto[] vB = met.agruparVector(productos, 'B');
        objProducto[] vC = met.agruparVector(productos, 'C');

        objProducto[][] estanteria = met.llenarEstanteria(vA, vB, vC);

        System.out.println("\n--------ESTANTERIA ORGANIZADA --------");
        met.mostrar(estanteria);
    }
}