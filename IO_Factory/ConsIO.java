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
public class ConsIO extends IO_Dialogo{
        /**
     * Metodo que recibe un int y lo muestra por consola.
     * @param dato tipo int
     */
    @Override
    public void devolver(int dato) {

        System.out.println(dato);

    }

    /**
     * Método que recibe un String y lo muestra por consola.
     * @param mensaje tipo String
     */
    @Override
    public void devolver(String mensaje) {

        System.out.println(mensaje);

    }

    /**
     * Método que recibe un float y lo muestra por consola.
     * @param dato tipo float
     */
    @Override
    public void devolver(float dato) {

        System.out.println(dato);

    }

    /**
     * Método que recibe un double y lo muestra por consola.
     * @param dato tipo double
     */
    @Override
    public void devolver(double dato) {
        System.out.println(dato);
    }
}
