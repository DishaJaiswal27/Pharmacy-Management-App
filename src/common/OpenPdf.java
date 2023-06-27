/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Disha
 */
public class OpenPdf {

    public static void openById(String id) {
        try {
            if (new File(dao.PharmacyUtils.billPath + id + ".pdf").exists()) {
                Process p;
                p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler " + dao.PharmacyUtils.billPath + "" + id + ".pdf");
            }else{
                JOptionPane.showMessageDialog(null,"File does not exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
