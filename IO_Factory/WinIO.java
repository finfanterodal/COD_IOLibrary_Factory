package IO_Factory;

import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
public class WinIO extends IO_Dialogo{

    /**
     * Método que recibe un int y lo muestra por ventana.
     *
     * @param dato tipo int
     */
    @Override
    public void devolver(int dato) {

        JOptionPane.showMessageDialog(null, dato);

    }

    /**
     * Método que recibe un String y lo muestra por ventana.
     *
     * @param mensaje tipo String
     */
    @Override
    public void devolver(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje);

    }

    /**
     * Método que recibe un float y lo muestra por ventana.
     *
     * @param dato tipo float
     */
    @Override
    public void devolver(float dato) {

        JOptionPane.showMessageDialog(null, dato);

    }

    /**
     * Método que recibe un double y lo muestra por ventana.
     *
     * @param dato tipo double
     */
    @Override
    public void devolver(double dato) {
        JOptionPane.showMessageDialog(null, dato);
    }
}
