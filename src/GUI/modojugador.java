/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class modojugador extends javax.swing.JFrame {

    /**
     * Creates new form Prueba
     */
    int idpregunta_actual = 0;
    int[] pregunta_jugador1 = new int[5];
    int puntos = 0;
    int turno = 0;
    boolean multiplayer;
    int puntos_jugador1 = 0;
    int puntos_jugador2 = 0;
    
    public modojugador(boolean multiplayer) {
        this.multiplayer = multiplayer;
        System.out.print("Este es el Valor de Multiplayer: "+ multiplayer);
        initComponents();
        jButton2.setVisible(false);
        preguntas_jugador();
        
        if (multiplayer){
            turno_aleatorio();
        }
        
        llenarComponentes(0);
        jLabel3.setVisible(multiplayer);
        

    }
    
    private void turno_aleatorio (){
        int numero = (int)(Math.random() * 2) + 1;
        this.turno = numero;
    }

    private void preguntas_jugador() {

        Random rand = new Random();

        this.pregunta_jugador1[0] = rand.nextInt(7);

        do {
            this.pregunta_jugador1[1] = rand.nextInt(7);
        } while (this.pregunta_jugador1[0] == this.pregunta_jugador1[1]);

        this.pregunta_jugador1[2] = rand.nextInt(9);

        do {
            this.pregunta_jugador1[3] = rand.nextInt(9);
        } while (this.pregunta_jugador1[2] == this.pregunta_jugador1[3]);

        this.pregunta_jugador1[4] = rand.nextInt(3);

    }

    private Object[] preguntas_faciles() {
        String[] preguntasFacil = new String[7];
        String[][] respuestasFacil = new String[7][4];
        String[] retroFacil = new String[7];
        String[] correctaFacil = new String[7];

        Object[] respuesta = new Object[4];

        preguntasFacil[0] = "¿En qué año fueron adoptados los Objetivos de Desarrollo Sostenible (ODS) por las Naciones Unidas?";
        respuestasFacil[0][0] = "2000";
        respuestasFacil[0][1] = "2010";
        respuestasFacil[0][2] = "2015";
        respuestasFacil[0][3] = "2025";
        retroFacil[0] = "Los ODS fueron adoptados por la ONU en 2015 como parte de la Agenda 2030.";
        correctaFacil[0] = "2015";

        preguntasFacil[1] = "Los ODS son un plan global con el objetivo principal de erradicar la pobreza y proteger el planeta antes del año 2050.";
        respuestasFacil[1][0] = "Verdadero";
        respuestasFacil[1][1] = "Falso";
        respuestasFacil[1][2] = "";
        respuestasFacil[1][3] = "";
        retroFacil[1] = "La meta específica es 2030, aunque la visión es de largo plazo.";
        correctaFacil[1] = "Verdadero";

        preguntasFacil[2] = "Según la información, solo los gobiernos de los países deben trabajar para lograr los ODS.";
        respuestasFacil[2][0] = "Verdadero";
        respuestasFacil[2][1] = "Falso";
        respuestasFacil[2][2] = "";
        respuestasFacil[2][3] = "";
        retroFacil[2] = "La participación para lograr los ODS es amplia y no solo gubernamental.";
        correctaFacil[2] = "Falso";

        preguntasFacil[3] = "¿Cuál es el número del Objetivo de Desarrollo Sostenible que se enfoca en Hambre Cero?";
        respuestasFacil[3][0] = "ODS 1";
        respuestasFacil[3][1] = "ODS 2";
        respuestasFacil[3][2] = "ODS 3";
        respuestasFacil[3][3] = "ODS 4";
        retroFacil[3] = "El ODS número 2 es el de Hambre Cero.";
        correctaFacil[3] = "ODS 2";

        preguntasFacil[4] = "El ODS 2 busca únicamente aumentar la producción de alimentos a nivel mundial.";
        respuestasFacil[4][0] = "Verdadero";
        respuestasFacil[4][1] = "Falso";
        respuestasFacil[4][2] = "";
        respuestasFacil[4][3] = "";
        retroFacil[4] = "El ODS 2 también abarca seguridad alimentaria y agricultura sostenible.";
        correctaFacil[4] = "Falso";

        preguntasFacil[5] = "¿Cuál es el número del Objetivo de Desarrollo Sostenible que se enfoca en Educación de Calidad?";
        respuestasFacil[5][0] = "ODS 3";
        respuestasFacil[5][1] = "ODS 4";
        respuestasFacil[5][2] = "ODS 5";
        respuestasFacil[5][3] = "ODS 6";
        retroFacil[5] = "El ODS número 4 se refiere a Educación de Calidad.";
        correctaFacil[5] = "ODS 4";

        preguntasFacil[6] = "El ODS 4 se centra exclusivamente en garantizar que todos los niños tengan acceso a la educación primaria.";
        respuestasFacil[6][0] = "Verdadero";
        respuestasFacil[6][1] = "Falso";
        respuestasFacil[6][2] = "";
        respuestasFacil[6][3] = "";
        retroFacil[6] = "El ODS 4 busca educación inclusiva y de calidad en todos los niveles.";
        correctaFacil[6] = "Falso";

        respuesta[0] = preguntasFacil;     // OK: arreglo de Strings
        respuesta[1] = respuestasFacil;    // OK: matriz de Strings
        respuesta[2] = correctaFacil;      // OK
        respuesta[3] = retroFacil;

        return respuesta;
    }

    private Object[] preguntas_medio() {
        String[] preguntasMedio = new String[9];
        String[][] respuestasMedio = new String[9][4];
        String[] retroMedio = new String[9];
        String[] correctaMedio = new String[9];

        Object[] respuesta = new Object[4];

        preguntasMedio[0] = "¿Cuántos Objetivos de Desarrollo Sostenible (ODS) componen la Agenda 2030?";
        respuestasMedio[0][0] = "10";
        respuestasMedio[0][1] = "15";
        respuestasMedio[0][2] = "17";
        respuestasMedio[0][3] = "20";
        retroMedio[0] = "La Agenda 2030 contiene 17 ODS.";
        correctaMedio[0] = "17";

        preguntasMedio[1] = "¿Cuál de los siguientes informes se menciona como precursor conceptual de los ODS al definir el desarrollo sostenible?";
        respuestasMedio[1][0] = "Informe de la Cumbre de Río";
        respuestasMedio[1][1] = "Informe Brundtland";
        respuestasMedio[1][2] = "Informe del Milenio";
        respuestasMedio[1][3] = "Informe de Kioto";
        retroMedio[1] = "El Informe Brundtland de 1987 definió el desarrollo sostenible.";
        correctaMedio[1] = "Informe Brundtland";

        preguntasMedio[2] = "Los Objetivos de Desarrollo del Milenio (ODM) y los ODS tienen exactamente el mismo enfoque y alcance.";
        respuestasMedio[2][0] = "Verdadero";
        respuestasMedio[2][1] = "Falso";
        respuestasMedio[2][2] = "";
        respuestasMedio[2][3] = "";
        retroMedio[2] = "Los ODS amplían el enfoque de los ODM.";
        correctaMedio[2] = "Falso";

        preguntasMedio[3] = "¿Cuál es una de las razones principales por las que se crearon los ODS?";
        respuestasMedio[3][0] = "Para aumentar la competencia económica entre países";
        respuestasMedio[3][1] = "Para promover la desigualdad social y económica";
        respuestasMedio[3][2] = "Para combatir la desigualdad, pobreza y cambio climático";
        respuestasMedio[3][3] = "Para enfocarse solo en el primer mundo";
        retroMedio[3] = "Los ODS buscan atacar la pobreza, la desigualdad y el cambio climático.";
        correctaMedio[3] = "Para combatir la desigualdad, pobreza y cambio climático";

        preguntasMedio[4] = "Algunos críticos argumentan que los ODS abordan las causas profundas de la desigualdad global, como el comercio injusto.";
        respuestasMedio[4][0] = "Verdadero";
        respuestasMedio[4][1] = "Falso";
        respuestasMedio[4][2] = "";
        respuestasMedio[4][3] = "";
        retroMedio[4] = "Los ODS han sido criticados por no cuestionar suficientemente estructuras como el comercio injusto.";
        correctaMedio[4] = "Falso";

        preguntasMedio[5] = "En Colombia, ¿se ha cumplido un porcentaje significativo de las metas de los ODS?";
        respuestasMedio[5][0] = "Verdadero";
        respuestasMedio[5][1] = "Falso";
        respuestasMedio[5][2] = "";
        respuestasMedio[5][3] = "";
        retroMedio[5] = "Colombia ha avanzado, pero enfrenta retos en hambre y desigualdad.";
        correctaMedio[5] = "Falso";

        preguntasMedio[6] = "Según los datos de 2022, ¿qué porcentaje de hogares colombianos padeció inseguridad alimentaria moderada o severa?";
        respuestasMedio[6][0] = "34.0%";
        respuestasMedio[6][1] = "42.0%";
        respuestasMedio[6][2] = "54.2%";
        respuestasMedio[6][3] = "60.56%";
        retroMedio[6] = "El 54.2% de los hogares colombianos padeció inseguridad alimentaria moderada o severa.";
        correctaMedio[6] = "54.2%";

        preguntasMedio[7] = "El programa Colombia Mayor se enfoca en brindar apoyo alimentario a niños en edad escolar.";
        respuestasMedio[7][0] = "Verdadero";
        respuestasMedio[7][1] = "Falso";
        respuestasMedio[7][2] = "";
        respuestasMedio[7][3] = "";
        retroMedio[7] = "Colombia Mayor apoya a adultos mayores pobres mediante transferencias monetarias.";
        correctaMedio[7] = "Falso";

        preguntasMedio[8] = "¿Cuál fue la tasa de educación media en Colombia en 2022?";
        respuestasMedio[8][0] = "80.3%";
        respuestasMedio[8][1] = "86.1%";
        respuestasMedio[8][2] = "10.1%";
        respuestasMedio[8][3] = "12%";
        retroMedio[8] = "En 2022, Colombia tuvo una tasa de educación media del 86.1%.";
        correctaMedio[8] = "86.1%";

        respuesta[0] = preguntasMedio;     // OK: arreglo de Strings
        respuesta[1] = respuestasMedio;    // OK: matriz de Strings
        respuesta[2] = correctaMedio;      // OK
        respuesta[3] = retroMedio;

        return respuesta;
    }

    private Object[] preguntas_dificil() {
        String[] preguntasDificil = new String[3];
        String[][] respuestasDificil = new String[3][4];
        String[] retroDificil = new String[3];
        String[] correctaDificil = new String[3];

        Object[] respuesta = new Object[4];

        preguntasDificil[0] = "¿Qué característica de los ODS señala FUHEM (2019) como una limitación en su implementación?";
        respuestasDificil[0][0] = "Falta de relevancia para el sector privado";
        respuestasDificil[0][1] = "Ausencia de mecanismos coercitivos";
        respuestasDificil[0][2] = "Enfoque exclusivo en temas ambientales";
        respuestasDificil[0][3] = "Excesiva burocracia en la gestión";
        retroDificil[0] = "FUHEM destaca la falta de mecanismos obligatorios como limitación.";
        correctaDificil[0] = "Ausencia de mecanismos coercitivos";

        preguntasDificil[1] = "¿Qué factor se señala como debilidad de los programas colombianos para abordar el ODS 2?";
        respuestasDificil[1][0] = "Enfoque en inversión agrícola";
        respuestasDificil[1][1] = "Ataque de causas estructurales de pobreza";
        respuestasDificil[1][2] = "Enfoque asistencialista";
        respuestasDificil[1][3] = "Falta de coordinación internacional";
        retroDificil[1] = "Se critica el enfoque asistencialista.";
        correctaDificil[1] = "Enfoque asistencialista";

        preguntasDificil[2] = "¿Las disparidades en educación son un desafío exclusivo de Colombia?";
        respuestasDificil[2][0] = "Verdadero";
        respuestasDificil[2][1] = "Falso";
        respuestasDificil[2][2] = "";
        respuestasDificil[2][3] = "";
        retroDificil[2] = "Las disparidades regionales son un problema compartido en la región.";
        correctaDificil[2] = "Falso";

        respuesta[0] = preguntasDificil;     // OK: arreglo de Strings
        respuesta[1] = respuestasDificil;    // OK: matriz de Strings
        respuesta[2] = correctaDificil;      // OK
        respuesta[3] = retroDificil;

        return respuesta;

    }

    private void llenarComponentes(int idpregunta) {
        // Arreglo de textos
        if (this.multiplayer){
            jLabel3.setText ("Jugador: "+ this.turno);
        }
        
        jLabel2.setText("");
        jButton1.setEnabled(true);
        jButton2.setVisible(false);
        this.idpregunta_actual = idpregunta;
        int pregunta = this.pregunta_jugador1[idpregunta];
        Object[] datos_preguntas = new Object[4];

        if (idpregunta == 0 || idpregunta == 1) {
            datos_preguntas = preguntas_faciles();
        }
        if (idpregunta == 2 || idpregunta == 3) {
            datos_preguntas = preguntas_medio();
        }
        if (idpregunta == 4) {
            datos_preguntas = preguntas_dificil();
        }

        String[] preguntas = (String[]) datos_preguntas[0];
        String[][] opciones = (String[][]) datos_preguntas[1];
        String[] correctas = (String[]) datos_preguntas[2];
        String[] retro = (String[]) datos_preguntas[3];

        // Mostrar pregunta
        jLabel1.setText("<html>" + preguntas[pregunta] + "</html>");

        // Arreglo de JRadioButton
        JRadioButton[] radioButtons = {jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4};

        buttonGroup1.clearSelection();
        for (int i = 0; i < radioButtons.length; i++) {
           
            if (opciones[pregunta][i].isEmpty()) {
                radioButtons[i].setVisible(false);
            } else {
                radioButtons[i].setVisible(true);
            }
            radioButtons[i].setText(opciones[pregunta][i]);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton1");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton1");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton1");

        jButton1.setText("calificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jButton2.setText("Avanzar...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(100, 100, 100))
                    .addComponent(jRadioButton1)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
                        .addGap(87, 87, 87)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        validar_respuesta();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (this.idpregunta_actual == 4) {
            finalizar_juego();
        } else {
            llenarComponentes(this.idpregunta_actual + 1);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void finalizar_juego() {
        String mensaje = "";
        if (this.multiplayer){
            if (this.puntos_jugador1 > this.puntos_jugador2){
                mensaje = "Ganador Jugador 1";
            } else if (this.puntos_jugador1 == this.puntos_jugador2){
                mensaje = "Empate!!";
            } else {
                mensaje = "Ganador Jugador 2";
            }
            mensaje += "\n Puntos Jugador 1: "+ this.puntos_jugador1;
            mensaje += "\n Puntos Jugador 2: "+ this.puntos_jugador2;
        } else {
            mensaje = "Tu Puntuación fue: " + this.puntos;
        }
        JOptionPane.showMessageDialog(
                this,
                mensaje,
                "Resultado Final",
                JOptionPane.INFORMATION_MESSAGE
        );

        // Cuando el usuario presiona "Aceptar", continúa aquí:
        new menu().setVisible(true);
        dispose(); // Cierra la ventana actual
    }

    private void validar_respuesta() {
        String opcion_seleccionar = "";
        JRadioButton[] radioButtons = {jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4};

        for (int i = 0; i < radioButtons.length; i++) {

            if (radioButtons[i].isSelected()) {
                opcion_seleccionar = radioButtons[i].getText();
            }
        }
        if (opcion_seleccionar.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecciona una Opción",
                    "Error!",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;

        }
        jButton1.setEnabled(false);
        //this.idpregunta_actual = idpregunta;
        int pregunta = this.pregunta_jugador1[this.idpregunta_actual];
        Object[] datos_preguntas = new Object[4];
        int puntos_posibles = 0;

        if (this.idpregunta_actual == 0 || this.idpregunta_actual == 1) {
            puntos_posibles = 5;
            datos_preguntas = preguntas_faciles();
        }
        if (this.idpregunta_actual == 2 || this.idpregunta_actual == 3) {
            puntos_posibles = 10;
            datos_preguntas = preguntas_medio();
        }
        if (this.idpregunta_actual == 4) {
            puntos_posibles = 15;
            datos_preguntas = preguntas_dificil();
        }
        String[] correctas = (String[]) datos_preguntas[2];
        String[] retro = (String[]) datos_preguntas[3];
        jButton2.setVisible(true);
        String mensaje = "";

        if (opcion_seleccionar.equals(correctas[pregunta])) {
            this.puntos += puntos_posibles;
            mensaje = "Correcto!";
            if (this.multiplayer){
                if (this.turno==1){
                    this.puntos_jugador1 += puntos_posibles;
                } else {
                    this.puntos_jugador2 += puntos_posibles;
                }
            }
        } else {
            mensaje = "Incorrecto!";
            if (this.multiplayer){
                if (this.turno==1){
                    this.turno=2;
                } else {
                    this.turno=1;
                }
            }
        }
        jLabel2.setText("<html>" + mensaje + "<br><br>" + retro[pregunta] + "</html>");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modojugador(false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
