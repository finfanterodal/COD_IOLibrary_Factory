package IO_Factory;

/**
 * Interfaz que es implementado por distintas clases que requieran estos
 * métodos.
 *
 * @author Fran
 */
public interface IO_MetodosComunes {

    /**
     * Metodo que recibe un Int.
     *
     * @param dato tipo Int
     */
    public void devolver(int dato);

    /**
     * Metodo que recibe un String.
     *
     * @param mensaje tipo String
     */
    public void devolver(String mensaje);

    /**
     * Metodo que recibe un float.
     *
     * @param dato tipo float
     */
    public void devolver(float dato);

    /**
     * Metodo que recibe un double.
     *
     * @param dato
     */
    public void devolver(double dato);
}
