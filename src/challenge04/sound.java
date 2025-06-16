/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge04;

import java.awt.Component;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class sound {
    private static sound instance;
    
    private Clip background_sound;
    String[] sonidos = {
        "sonidos/click-sound.wav",
        "/sonidos/background-sound.wav"
    };
    ImageIcon soundIcon = new ImageIcon(getClass().getResource("/imagenes/sound-icon.png"));
    ImageIcon noSoundIcon = new ImageIcon(getClass().getResource("/imagenes/no-sound-icon.png"));
    private boolean reproduciendoBackground = false;
    
    public static sound getInstance() {
        if (instance == null) {
            instance = new sound();
        }
        return instance;
    }
    
    public static void sound(String[] args){
        
    }
    
    public void reproducirSonido(Component _page, int sound) {
                
        try {
            // Esta línea busca el archivo desde la carpeta src/sonidos/
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(sonidos[sound]);

            if (inputStream == null) {
                JOptionPane.showMessageDialog(_page, "Archivo no encontrado. Verifica la ruta y el nombre.");
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(inputStream);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            volumeControl.setValue(-20.0f); // (-80 a +6)
            
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(_page, "Error al reproducir sonido: " + e.getMessage());
        }
    }
    
    public void playBackgroundLoop() {
        try {
            if (reproduciendoBackground) {
                return;
            }
            
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(getClass().getResource(sonidos[1]));
            
            background_sound = AudioSystem.getClip();
            background_sound.open(audioInput);
            background_sound.loop(Clip.LOOP_CONTINUOUSLY);
            
            FloatControl volumeControl = (FloatControl) background_sound.getControl(FloatControl.Type.MASTER_GAIN);
            volumeControl.setValue(-35.0f); // (-80 a +6)
            
            background_sound.start();
            reproduciendoBackground = true;
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    
    public void stopBackgroundAudio() {
        if (background_sound != null && background_sound.isRunning()) {
            background_sound.stop();
            background_sound.close();
            reproduciendoBackground = false;
        }
    }
    
    public void toogleBackgroundAudio() {
        if (reproduciendoBackground) {
            stopBackgroundAudio();
        } else {
            playBackgroundLoop();
        }
        
    }
    
    public ImageIcon getImageIcon(){
        if(reproduciendoBackground){
            return soundIcon;
        }
        return noSoundIcon;
    }
    
    public boolean getReproduciendoBackground(){
        return reproduciendoBackground;
    }
    
}
