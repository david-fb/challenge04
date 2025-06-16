/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.Random;
import GUI.message.*;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.*;
import challenge04.sound;
/**
 *
 * @author Jhon
 */
public class modojugador extends javax.swing.JFrame {

    private Point mouseClickPoint;
    int idpregunta_actual = 0;
    int[] pregunta_jugador1 = new int[5];
    int puntos = 0;
    int turno = 0;
    boolean multiplayer;
    int puntos_jugador1 = 0;
    int puntos_jugador2 = 0;
    
    ImageIcon hoverBtnIcon, defaultBtnIcon, disabledBtnIcon, hoverBtnCloseIcon, defaultBtnCloseIcon, hoverBtnMiniIcon, defaultBtnMiniIcon;
    
    public modojugador(boolean multiplayer) {
        this.multiplayer = multiplayer;
        System.out.print("Este es el Valor de Multiplayer: "+ multiplayer);
        initComponents();
        btn_avanzar.setVisible(false);
        lbl_btn_avanzar.setVisible(false);
        preguntas_jugador();
        
        if (multiplayer){
            turno_aleatorio();
        }
        
        hoverBtnIcon = new ImageIcon(getClass().getResource("/imagenes/btn-active.png"));
        defaultBtnIcon = new ImageIcon(getClass().getResource("/imagenes/btn.png"));
        disabledBtnIcon = new ImageIcon(getClass().getResource("/imagenes/btn-disabled.png"));
        
        hoverBtnCloseIcon = new ImageIcon(getClass().getResource("/imagenes/message/btn-message-close-active.png"));
        defaultBtnCloseIcon = new ImageIcon(getClass().getResource("/imagenes/message/btn-message-close.png"));
        
        hoverBtnMiniIcon = new ImageIcon(getClass().getResource("/imagenes/bar/btn-icon-mini-active.png"));
        defaultBtnMiniIcon = new ImageIcon(getClass().getResource("/imagenes/bar/btn-icon-mini.png"));
        
        lbl_sound.setIcon(sound.getInstance().getImageIcon());
        
        llenarComponentes(0);
        lbl_turno_jugador.setVisible(multiplayer);
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
            lbl_turno_jugador.setText ("Jugador "+ this.turno);
        }
        
        lbl_retroalimentacion.setText("");
        btn_calificar.setEnabled(true);
        lbl_btn_calificar.setIcon(defaultBtnIcon);
        btn_avanzar.setVisible(false);
        lbl_btn_avanzar.setVisible(false);
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
        lbl_pregunta.setText(preguntas[pregunta]);

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
        jPanel1 = new javax.swing.JPanel();
        pnl_bar = new javax.swing.JPanel();
        lbl_close_window = new javax.swing.JLabel();
        lbl_mini_window = new javax.swing.JLabel();
        lbl_turno_jugador = new javax.swing.JLabel();
        lbl_pregunta = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        btn_calificar = new javax.swing.JButton();
        lbl_btn_calificar = new javax.swing.JLabel();
        btn_avanzar = new javax.swing.JButton();
        lbl_btn_avanzar = new javax.swing.JLabel();
        lbl_retroalimentacion = new javax.swing.JTextArea();
        lbl_sound = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
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

        lbl_turno_jugador.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_turno_jugador.setForeground(new java.awt.Color(255, 255, 255));
        lbl_turno_jugador.setText("jLabel3");
        jPanel1.add(lbl_turno_jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, -1));

        lbl_pregunta.setEditable(false);
        lbl_pregunta.setColumns(20);
        lbl_pregunta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbl_pregunta.setForeground(new java.awt.Color(255, 153, 0));
        lbl_pregunta.setLineWrap(true);
        lbl_pregunta.setRows(5);
        lbl_pregunta.setWrapStyleWord(true);
        lbl_pregunta.setBorder(null);
        lbl_pregunta.setFocusable(false);
        lbl_pregunta.setOpaque(false);
        jPanel1.add(lbl_pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 600, 70));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.setBorder(null);
        jRadioButton1.setContentAreaFilled(false);
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("jRadioButton1");
        jRadioButton2.setBorder(null);
        jRadioButton2.setContentAreaFilled(false);
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("jRadioButton1");
        jRadioButton3.setBorder(null);
        jRadioButton3.setContentAreaFilled(false);
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("jRadioButton1");
        jRadioButton4.setBorder(null);
        jRadioButton4.setContentAreaFilled(false);
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        btn_calificar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_calificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_calificar.setText("Calificar");
        btn_calificar.setBorder(null);
        btn_calificar.setBorderPainted(false);
        btn_calificar.setContentAreaFilled(false);
        btn_calificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_calificar.setFocusPainted(false);
        btn_calificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_calificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_calificarMouseExited(evt);
            }
        });
        btn_calificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_calificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 313, 170, 40));

        lbl_btn_calificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.png"))); // NOI18N
        lbl_btn_calificar.setText("jLabel1");
        jPanel1.add(lbl_btn_calificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 190, 60));

        btn_avanzar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_avanzar.setForeground(new java.awt.Color(255, 255, 255));
        btn_avanzar.setText("Avanzar...");
        btn_avanzar.setBorder(null);
        btn_avanzar.setBorderPainted(false);
        btn_avanzar.setContentAreaFilled(false);
        btn_avanzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_avanzar.setFocusPainted(false);
        btn_avanzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_avanzarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_avanzarMouseExited(evt);
            }
        });
        btn_avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_avanzarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_avanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 180, 40));

        lbl_btn_avanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.png"))); // NOI18N
        jPanel1.add(lbl_btn_avanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 190, 60));

        lbl_retroalimentacion.setColumns(20);
        lbl_retroalimentacion.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbl_retroalimentacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_retroalimentacion.setLineWrap(true);
        lbl_retroalimentacion.setRows(5);
        lbl_retroalimentacion.setWrapStyleWord(true);
        lbl_retroalimentacion.setBorder(null);
        lbl_retroalimentacion.setOpaque(false);
        jPanel1.add(lbl_retroalimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 450, 120));

        lbl_sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sound-icon.png"))); // NOI18N
        lbl_sound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_soundMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_sound, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 60, 60));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background_general.png"))); // NOI18N
        jPanel1.add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calificarActionPerformed
        // TODO add your handling code here:
        sound.getInstance().reproducirSonido(this, 0);
        validar_respuesta();
    }//GEN-LAST:event_btn_calificarActionPerformed

    private void btn_avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_avanzarActionPerformed
        // TODO add your handling code here:
        sound.getInstance().reproducirSonido(this, 0);
        if (this.idpregunta_actual == 4) {
            finalizar_juego();
        } else {
            llenarComponentes(this.idpregunta_actual + 1);
        }

    }//GEN-LAST:event_btn_avanzarActionPerformed

    private void btn_calificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calificarMouseEntered
        // TODO add your handling code here:
        if(btn_calificar.isEnabled()){
            lbl_btn_calificar.setIcon(hoverBtnIcon);
        }
    }//GEN-LAST:event_btn_calificarMouseEntered

    private void btn_calificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calificarMouseExited
        // TODO add your handling code here:
        if(btn_calificar.isEnabled()){
            lbl_btn_calificar.setIcon(defaultBtnIcon);
        }
        
    }//GEN-LAST:event_btn_calificarMouseExited

    private void btn_avanzarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_avanzarMouseEntered
        // TODO add your handling code here:
        lbl_btn_avanzar.setIcon(hoverBtnIcon);
    }//GEN-LAST:event_btn_avanzarMouseEntered

    private void btn_avanzarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_avanzarMouseExited
        // TODO add your handling code here:
        lbl_btn_avanzar.setIcon(defaultBtnIcon);
    }//GEN-LAST:event_btn_avanzarMouseExited

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

    private void lbl_soundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_soundMouseClicked
        // TODO add your handling code here:
        sound.getInstance().reproducirSonido(this, 0);
        sound.getInstance().toogleBackgroundAudio();
        lbl_sound.setIcon(sound.getInstance().getImageIcon());
    }//GEN-LAST:event_lbl_soundMouseClicked

    private void finalizar_juego() {
        String mensaje;
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

        customMessage dialog = new customMessage(this, true, mensaje);
        dialog.setVisible(true);

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
            customMessage dialog = new customMessage(this, true, "Selecciona una Opción");
            dialog.setVisible(true);
            
            return;

        }
        btn_calificar.setEnabled(false);
        lbl_btn_calificar.setIcon(disabledBtnIcon);
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
        btn_avanzar.setVisible(true);
        lbl_btn_avanzar.setVisible(true);
        String mensaje;

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
                customMessage dialog = new customMessage(this, true, mensaje + "\n" + "Cambio de jugador");
                dialog.setVisible(true);
                if (this.turno==1){
                    this.turno=2;
                } else {
                    this.turno=1;
                }
            }
        }
        lbl_retroalimentacion.setText(mensaje + "\n" + retro[pregunta]);
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
    private javax.swing.JButton btn_avanzar;
    private javax.swing.JButton btn_calificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_btn_avanzar;
    private javax.swing.JLabel lbl_btn_calificar;
    private javax.swing.JLabel lbl_close_window;
    private javax.swing.JLabel lbl_mini_window;
    private javax.swing.JTextArea lbl_pregunta;
    private javax.swing.JTextArea lbl_retroalimentacion;
    private javax.swing.JLabel lbl_sound;
    private javax.swing.JLabel lbl_turno_jugador;
    private javax.swing.JPanel pnl_bar;
    // End of variables declaration//GEN-END:variables
}
