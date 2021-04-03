/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Usuario
 */
public class MaternoException extends Exception {

    /**
     * Creates a new instance of <code>MaternoException</code> without detail
     * message.
     */
    public MaternoException() {
    }

    /**
     * Constructs an instance of <code>MaternoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MaternoException(String msg) {
        super(msg);
    }
}
