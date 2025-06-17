/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.historia;

import GUI.message.customMessage;
import GUI.message.feedbackAlerts;
import static challenge04.main.*;
import javax.sound.sampled.*;
import java.io.InputStream;
import javax.swing.JOptionPane;
import challenge04.sound;
import java.awt.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Jimmi
 */
public class eduPreguntas extends javax.swing.JFrame {

    String[] preguntas = {
        "¿Cuál fue la inspiración inicial de Edu para dedicarse a la educación?",
        "Qué acción impulsa Edu como parte de la educación de calidad",
        "¿Qué solución propone Edu desde la visión de educación inclusiva? ",
        "¿Cómo mejora Edu esta situación?",
        "¿Qué enfoque propone Edu como Embajador de la educación de calidad?",
        "¿Qué principio resume el legado de Edu y educación de calidad? "
    };

    String[][] opciones = {
        {"Impone más tareas y castigos.", "Su abuela, una maestra jubilada que le contaba historias sobre la falta de acceso a la educación", "Un profesor extranjero que lo visitó en la infancia", "Un documental que vio sobre países desarrollados."},
        {"Exigir que se evalúe a los estudiantes con pruebas nacionales", "Reunir a la comunidad para crear un aula abierta y traer libros físicos y digitales", "Enseñar solo a los niños con buenas notas", "Pedir que los niños viajen a la ciudad más cercana"},
        {"Eliminar los contenidos indígenas del currículo", "Traer profesores extranjeros con doctorado", "Incluir saberes ancestrales en el currículo escolar, respetando la lengua y cosmovisión ", "Imponer libros en español técnico"},
        {"Organiza un programa de emprendimiento juvenil con proyectos reales del barrio", "Impone más tareas y castigos ", "Quita las clases de arte y deporte", "Solo premia a los estudiantes con promedio alto"},
        {"Ignorar el contexto emocional y seguir el plan de estudios ", "Promover espacios seguros y escuelas como zonas de paz con apoyo psicosocial ", "Cerrar la escuela temporalmente ", "Castigar a los que faltan mucho"},
        {"Aprender es un privilegio", "Solo los que terminan la universidad tienen valor ", "Todos tienen derecho a una educación de calidad, sin importar su origen", "Solo los niños urbanos deben ir al colegio"}
    };
    String[] retroalimentacion = {
        "La historia de Edu nos recuerda que las vocaciones más poderosas nacen de pequeños gestos llenos de significado, Su compromiso con la educación surge no de una obligación, sino del ejemplo y las historias transmitidas con amor Reflexionemos sobre el poder que tiene las acciones trasmitidas por el amor de nuestro familiares",
        "Edu organiza una biblioteca comunitaria y lleva tabletas con energía solar. Con eso asegura acceso igualitario a la educación básica, sin importar la zona geográfica ",
        "Edu propone materiales bilingües y proyectos en la lengua indígena. Esto respeta la diversidad cultural y lingüística, clave en una educación inclusiva y equitativa",
        "Edu crea con ellos una emisora escolar y talleres de cocina, carpintería y diseño, Con eso asegura acceso igualitario a la educación básica, sin importar la zona geográfica",
        "Edu apoya programas de escuelas resilientes, con talleres de arteterapia, mediación y cuidado emocional. Educar también es sanar",
        "5.	Edu cierra el evento recordando que la educación es la llave del cambio. Como decía su abuela, solo un pueblo educado puede construir un país justo, creativo y en paz",
        ""
    };
    
    private Point mouseClickPoint;
    ImageIcon hoverBtnIcon, defaultBtnIcon, hoverBtnCloseIcon, defaultBtnCloseIcon, hoverBtnMiniIcon, defaultBtnMiniIcon;

    public eduPreguntas() {
        initComponents();
        
        hoverBtnIcon = new ImageIcon(getClass().getResource("/imagenes/btn-active.png"));
        defaultBtnIcon = new ImageIcon(getClass().getResource("/imagenes/btn.png"));

        hoverBtnCloseIcon = new ImageIcon(getClass().getResource("/imagenes/message/btn-message-close-active.png"));
        defaultBtnCloseIcon = new ImageIcon(getClass().getResource("/imagenes/message/btn-message-close.png"));
        
        hoverBtnMiniIcon = new ImageIcon(getClass().getResource("/imagenes/bar/btn-icon-mini-active.png"));
        defaultBtnMiniIcon = new ImageIcon(getClass().getResource("/imagenes/bar/btn-icon-mini.png"));
        
        int i = edu_etapa;
        switch (vidas_historia) {
            case 1 -> {
                lbvida1.setVisible(true);
                lbvida2.setVisible(false);
                lbvida3.setVisible(false);
            }
            case 2 -> {
                lbvida1.setVisible(true);
                lbvida2.setVisible(true);
                lbvida3.setVisible(false);
            }
            case 3 -> {
                lbvida1.setVisible(true);
                lbvida2.setVisible(true);
                lbvida3.setVisible(true);
            }
            default -> {
                lbvida1.setVisible(false);
                lbvida2.setVisible(false);
                lbvida3.setVisible(false);
            }
        }
        LbPregunta.setText(preguntas[i]);
        RB1.setText(opciones[i][0]);
        RB2.setText(opciones[i][1]);
        RB3.setText(opciones[i][2]);
        RB4.setText(opciones[i][3]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnl_bar = new javax.swing.JPanel();
        lbl_close_window = new javax.swing.JLabel();
        lbl_mini_window = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LbPregunta = new javax.swing.JTextArea();
        RB1 = new javax.swing.JRadioButton();
        RB2 = new javax.swing.JRadioButton();
        RB3 = new javax.swing.JRadioButton();
        RB4 = new javax.swing.JRadioButton();
        BtnRespuesta = new javax.swing.JButton();
        lbl_btn_respuesta = new javax.swing.JLabel();
        lbvida1 = new javax.swing.JLabel();
        lbvida2 = new javax.swing.JLabel();
        lbvida3 = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alma_Niña .png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CHALLENGE 04");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_bar.setOpaque(false);
        pnl_bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_barMouseDragged(evt);
            }
        });
        pnl_bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_barMousePressed(evt);
            }
        });
        pnl_bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_close_window.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/message/btn-message-close.png"))); // NOI18N
        lbl_close_window.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_close_window.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_close_windowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_close_windowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_close_windowMouseExited(evt);
            }
        });
        pnl_bar.add(lbl_close_window, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, 50));

        lbl_mini_window.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bar/btn-icon-mini.png"))); // NOI18N
        lbl_mini_window.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_mini_windowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_mini_windowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_mini_windowMouseExited(evt);
            }
        });
        pnl_bar.add(lbl_mini_window, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 50, 50));

        jPanel1.add(pnl_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Edu.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 110, 190));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        LbPregunta.setEditable(false);
        LbPregunta.setColumns(20);
        LbPregunta.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LbPregunta.setForeground(new java.awt.Color(255, 153, 0));
        LbPregunta.setLineWrap(true);
        LbPregunta.setRows(5);
        LbPregunta.setWrapStyleWord(true);
        LbPregunta.setBorder(null);
        LbPregunta.setFocusable(false);
        LbPregunta.setOpaque(false);
        jPanel1.add(LbPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 630, 70));

        buttonGroup1.add(RB1);
        RB1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RB1.setForeground(new java.awt.Color(255, 255, 255));
        RB1.setContentAreaFilled(false);
        jPanel1.add(RB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        buttonGroup1.add(RB2);
        RB2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RB2.setForeground(new java.awt.Color(255, 255, 255));
        RB2.setContentAreaFilled(false);
        jPanel1.add(RB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        buttonGroup1.add(RB3);
        RB3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RB3.setForeground(new java.awt.Color(255, 255, 255));
        RB3.setContentAreaFilled(false);
        jPanel1.add(RB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        buttonGroup1.add(RB4);
        RB4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RB4.setForeground(new java.awt.Color(255, 255, 255));
        RB4.setContentAreaFilled(false);
        jPanel1.add(RB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        BtnRespuesta.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
        BtnRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        BtnRespuesta.setText("Enviar  Respuesta");
        BtnRespuesta.setBorder(null);
        BtnRespuesta.setBorderPainted(false);
        BtnRespuesta.setContentAreaFilled(false);
        BtnRespuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRespuesta.setFocusPainted(false);
        BtnRespuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnRespuestaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnRespuestaMouseExited(evt);
            }
        });
        BtnRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRespuestaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 160, 40));

        lbl_btn_respuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.png"))); // NOI18N
        jPanel1.add(lbl_btn_respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 200, 60));

        lbvida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vida.gif"))); // NOI18N
        jPanel1.add(lbvida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        lbvida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vida.gif"))); // NOI18N
        jPanel1.add(lbvida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        lbvida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vida.gif"))); // NOI18N
        jPanel1.add(lbvida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background_general.png"))); // NOI18N
        jPanel1.add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRespuestaActionPerformed
        sound.getInstance().reproducirSonido(this, 0);
        int alma_respuesta = 0;
        if (buttonGroup1.getSelection() != null) {

            if (RB1.isSelected()) {
                alma_respuesta = 1;
            } else if (RB2.isSelected()) {
                alma_respuesta = 2;
            } else if (RB3.isSelected()) {
                alma_respuesta = 3;
            } else if (RB4.isSelected()) {
                alma_respuesta = 4;
            }

            if (edu_correcta[edu_etapa] == alma_respuesta) {
                feedbackAlerts dialog = new feedbackAlerts(this, true, retroalimentacion[edu_etapa]);
                dialog.setVisible(true);
                edu_etapa++;
                LbPregunta.setText("");
                dispose();
                if (edu_etapa < 6 && vidas_historia > 0) {
                    edu Edu = new edu();
                    dispose();
                    Edu.setVisible(true);
                } else {
                    edu_etapa_bloqueada = false;
                    modo_historia_completa = true;
                    if (usuarioActual != -1) {
                        modos_historia_completa[usuarioActual] = true;
                    }
                    menuHistoria menuH = new menuHistoria();
                    dispose();

                    menuH.setVisible(true);
                }

            } else {
                //JOptionPane.showMessageDialog(this, "Error, intente nuevamente");
                customMessage dialog = new customMessage(this, true, "Incorrecto, vamos de nuevo");
                dialog.setVisible(true);
                vidas_historia--;
                dispose();
                if (edu_etapa < 6 && vidas_historia > 0) {
                    edu Edu = new edu();
                    dispose();
                    Edu.setVisible(true);
                } else {
                    menuHistoria menuH = new menuHistoria();
                    dispose();
                    vidas_historia = 3;
                    edu_etapa = 0;
                    menuH.setVisible(true);
                }
            }

        } else {
            //JOptionPane.showMessageDialog(null, "Ninguna opción seleccionada");
            customMessage dialog = new customMessage(this, true, "Ninguna opción seleccionada");
            dialog.setVisible(true);
        }


    }//GEN-LAST:event_BtnRespuestaActionPerformed

    private void lbl_close_windowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_close_windowMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_close_windowMouseClicked

    private void lbl_close_windowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_close_windowMouseEntered
        // TODO add your handling code here:
        lbl_close_window.setIcon(hoverBtnCloseIcon);
    }//GEN-LAST:event_lbl_close_windowMouseEntered

    private void lbl_close_windowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_close_windowMouseExited
        // TODO add your handling code here:
        lbl_close_window.setIcon(defaultBtnCloseIcon);
    }//GEN-LAST:event_lbl_close_windowMouseExited

    private void lbl_mini_windowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_mini_windowMouseClicked
        // TODO add your handling code here:
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lbl_mini_windowMouseClicked

    private void lbl_mini_windowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_mini_windowMouseEntered
        // TODO add your handling code here:
        lbl_mini_window.setIcon(hoverBtnMiniIcon);
    }//GEN-LAST:event_lbl_mini_windowMouseEntered

    private void lbl_mini_windowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_mini_windowMouseExited
        // TODO add your handling code here:
        lbl_mini_window.setIcon(defaultBtnMiniIcon);
    }//GEN-LAST:event_lbl_mini_windowMouseExited

    private void pnl_barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barMouseDragged
        // TODO add your handling code here:
        Point frameLocation = getLocation();
        int x = frameLocation.x + evt.getX() - mouseClickPoint.x;
        int y = frameLocation.y + evt.getY() - mouseClickPoint.y;
        setLocation(x, y);
    }//GEN-LAST:event_pnl_barMouseDragged

    private void pnl_barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barMousePressed
        // TODO add your handling code here:
        mouseClickPoint = evt.getPoint();
    }//GEN-LAST:event_pnl_barMousePressed

    private void BtnRespuestaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRespuestaMouseEntered
        // TODO add your handling code here:
        lbl_btn_respuesta.setIcon(hoverBtnIcon);
    }//GEN-LAST:event_BtnRespuestaMouseEntered

    private void BtnRespuestaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRespuestaMouseExited
        // TODO add your handling code here:
        lbl_btn_respuesta.setIcon(defaultBtnIcon);
    }//GEN-LAST:event_BtnRespuestaMouseExited
    private void reproducirSonido() {
        try {
            // Esta línea busca el archivo desde la carpeta src/sonidos/
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("sonidos/bosquesNaturales.wav");

            if (inputStream == null) {
                JOptionPane.showMessageDialog(this, "Archivo no encontrado. Verifica la ruta y el nombre.");
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(inputStream);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al reproducir sonido: " + e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(eduPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eduPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eduPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eduPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eduPreguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRespuesta;
    private javax.swing.JTextArea LbPregunta;
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JRadioButton RB4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_btn_respuesta;
    private javax.swing.JLabel lbl_close_window;
    private javax.swing.JLabel lbl_mini_window;
    private javax.swing.JLabel lbvida1;
    private javax.swing.JLabel lbvida2;
    private javax.swing.JLabel lbvida3;
    private javax.swing.JPanel pnl_bar;
    // End of variables declaration//GEN-END:variables
}
