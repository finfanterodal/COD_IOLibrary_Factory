/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_Factory;

/**
 *
 * @author Fran
 */
public abstract class IO_Dialogo implements IO_MetodosComunes{
  
    /**
     *Método abstracto implementado en otras clases.
     */
    @Override
    public abstract void devolver(int dato);

     /**
     *Método abstracto implementado en otras clases.
     */
    @Override
    public  abstract void devolver(String mensaje);

      /**
     *Método abstracto implementado en otras clases.
     */
    @Override
    public abstract void devolver(float dato);
    
      /**
     *Método abstracto implementado en otras clases.
     */
    @Override
    public abstract void devolver(double dato);

        /**
     *enumerador para saber si crearDialogo instancia ConsIO o WinIO.
     */
    enum Tipo {
        CONSOLA, VENTANA
    }

    /**
     * Método que devuelve un objeto de la clase IO_Dialogo, dependiendo de la salida que se escoja.
     * @param tipo TIPO(CONSOLA,VENTANA)
     * @return instancia de IO_Dialogo
     */
    public static IO_Dialogo crearDialogo(Tipo tipo) {
        switch (tipo) {
            case CONSOLA:
                return new ConsIO();
            case VENTANA:
                return new WinIO();
            default:
                return null;
        }
    }  
}
