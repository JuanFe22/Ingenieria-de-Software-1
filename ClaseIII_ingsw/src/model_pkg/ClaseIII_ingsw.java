/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import views_pkg.FrameHospitals;

/**
 *
 * @author estuam
 */
public class ClaseIII_ingsw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexionDB inst_con= new conexionDB();
        FrameHospitals inst_frame = new FrameHospitals();
        inst_con.getConnection();
        inst_frame.setVisible(true);
    }
    
}
