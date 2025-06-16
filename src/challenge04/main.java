/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge04;

import GUI.start;
import javax.swing.ImageIcon;

/**
 *
 * @author Jimmi
 */
public class main {

    public static String[] nombres = new String[10];
    public static String[] contrasenas = new String[10];
    static int tUsuario = 0;
    //
    public static int alma_etapa;
    public static int[] alma_correcta = {3, 2, 2, 2, 2, 2};
    public static int vidas_historia = 3;
    public static boolean alma_etapa_bloqueada = true;
    //
    public static int edu_etapa;
    public static int[] edu_correcta = {2, 2, 3, 1, 2, 3};
    public static boolean edu_etapa_bloqueada = true;
    
    public static boolean modo_historia_completa = false;

    static {
        crearUsuario("admin", "1234");
    }

    public static void main(String args[]) {

        start Start = new start();
        Start.setVisible(true);
        sound.getInstance().playBackgroundLoop();
    }

    public static boolean crearUsuario(String usuario, String contrasena) {

        if (tUsuario >= 10) {
            return false;
        } else {
            for (int i = 0; i < tUsuario; i++) {
                if (nombres[i].equals(usuario)) {
                    return false; 
                }
            }

            nombres[tUsuario] = usuario;
            contrasenas[tUsuario] = contrasena;
            tUsuario++;
            return true;

        }
    }

    public static boolean iniciarSesion(String usuario, String contrasena) {

        for (int i = 0; i < tUsuario; i++) {
            if (nombres[i].equals(usuario) && contrasenas[i].equals(contrasena)) {
                return true;
            }
        }

        return false;
    }
}
