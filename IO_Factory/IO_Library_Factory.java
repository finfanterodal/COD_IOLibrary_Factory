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

        IO_Dialogo dialogo1 = IO_Dialogo.crearDialogo(IO_Dialogo.Tipo.CONSOLA);
        dialogo1.devolver("Hola");
        dialogo1.devolver(2.0);
        dialogo1.devolver(2f);
        dialogo1.devolver(10);

        IO_Dialogo dialogo2 = IO_Dialogo.crearDialogo(IO_Dialogo.Tipo.VENTANA);
        dialogo2.devolver("Hola");
    }

}
