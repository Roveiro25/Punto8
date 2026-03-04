
import java.util.Scanner;

public class metodo{
 public objProducto[][] llenar(objProducto[][] m, Scanner sc) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                objProducto o = new objProducto();

                System.out.print("Nombre: ");
                o.setNombre(sc.next());

                System.out.print("Peso: ");
                o.setPeso(sc.nextDouble());

                char tipo;
                do {
                    System.out.print("Categoria (A,B,C): ");
                    tipo = sc.next().toUpperCase().charAt(0);

                } while (tipo != 'A' && tipo != 'B' && tipo != 'C');

                o.setTipo(tipo);

                m[i][j] = o;
            }
        }
        return m;
    }
    public void mostrar(objProducto[][] m) {

        for (int i = 0; i < m.length; i++) {

            if (i == 0) System.out.println("CATEGORIA A");
            if (i == 1) System.out.println("CATEGORIA B");
            if (i == 2) System.out.println("CATEGORIA C");

            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] != null) {

                    System.out.println("Nombre: " + m[i][j].getNombre());
                    System.out.println("Peso: " + m[i][j].getPeso());
                    System.out.println("----------------------");
                }
            }
        }
    }
    public objProducto[] agruparVector(objProducto[][] m, char letra) {

        int contador = 0;

        // contar
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j].getTipo() == letra)
                    contador++;

        if (contador == 0)
            return null;

        objProducto[] vector = new objProducto[contador];

        int k = 0;

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j].getTipo() == letra) {
                    vector[k] = m[i][j];
                    k++;
                }

        return vector;
    }
    public objProducto[][] llenarEstanteria(objProducto[] A, objProducto[] B,objProducto[] C) {

        int max = 0;

        if (A != null && A.length > max) max = A.length;
        if (B != null && B.length > max) max = B.length;
        if (C != null && C.length > max) max = C.length;

        objProducto[][] estanteria = new objProducto[3][max];

        // llenar fila A
        if (A != null)
            for (int i = 0; i < A.length; i++)
                estanteria[0][i] = A[i];

        // llenar fila B
        if (B != null)
            for (int i = 0; i < B.length; i++)
                estanteria[1][i] = B[i];

        // llenar fila C
        if (C != null)
            for (int i = 0; i < C.length; i++)
                estanteria[2][i] = C[i];

        return estanteria;
    }
}