/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge04;

import GUI.start;

/**
 *
 * @author WINDOWS
 */
public class main {

    public static String[] nombres = new String[10];
    public static String[] contrasenas = new String[10];
    public static int alma_etapa;
    static int tUsuario = 0;

    public static void main(String args[]) {
         
        start Start = new start();
        Start.setVisible(true);

    }

    public static boolean crearUsuario(String usuario, String contrasena) {

        if (tUsuario >= 10) {
            return false;
        } else {
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
