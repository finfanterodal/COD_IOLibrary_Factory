package IO_Factory;

/**
 *
 * @author Fran
 */
public class IO_Library_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero = IO.introducirInt(IO.CONSOLA, "Introduce un úmero entero");
        IO.devolver(IO.CONSOLA, numero);

    }

}
