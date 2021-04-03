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
public class NombreException extends Exception {

    /**
     * Creates a new instance of <code>NombreException</code> without detail
     * message.
     */
    public NombreException() {
    }

    /**
     * Constructs an instance of <code>NombreException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NombreException(String msg) {
        super(msg);
    }
}
