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
public class PaternoException extends Exception {

    /**
     * Creates a new instance of <code>PaternoException</code> without detail
     * message.
     */
    public PaternoException() {
    }

    /**
     * Constructs an instance of <code>PaternoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PaternoException(String msg) {
        super(msg);
    }
}
