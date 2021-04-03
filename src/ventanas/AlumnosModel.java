/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class AlumnosModel extends AbstractTableModel {
    
    private ArrayList<Alumno> alumnos;
    
    public AlumnosModel(ArrayList<Alumno> alumnos){
        this.alumnos = alumnos;
    }
    
    @Override
    public int getRowCount() {
        return this.alumnos.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumno alumno = this.alumnos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return alumno.getMatricula();
            case 1:
                return alumno.getNombre();
            case 2:
                return alumno.getPaterno();
            case 3:
                return alumno.getMaterno();
            case 4:
                return alumno.getCalificacion();
            case 5:
                return alumno.getCarrera();
                
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 : 
                return "N. Control";
            case 1:
                return "Nombre";
            case 2:
                return "A. Paterno";
            case 3:
                return "A. Materno";
            case 4:
                return "Calificación";
            case 5:
                return "Carrera";
                
            default:
                throw new AssertionError();
        }
    }
    
    
}
