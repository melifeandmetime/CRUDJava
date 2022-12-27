
package com.aldiyoga.crudjava;

import com.aldiyoga.crudmahasiswasederhana.views.MahasiswaFrame;
import javax.swing.SwingUtilities;

public class CRUDJava {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           
            public void run() {
                MahasiswaFrame form = new MahasiswaFrame();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
                
            }
        });
    }
}
