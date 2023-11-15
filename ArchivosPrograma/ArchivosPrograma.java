import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.BorderLayout;

public class ArchivosPrograma {

    private JFrame frame;
    private JTextArea textArea;

    public ArchivosPrograma() {
        // Crear la interfaz de usuario
        frame = new JFrame("Visor de Archivos");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);

        JButton btnAbrirArchivo = new JButton("Abrir Archivo");
        btnAbrirArchivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirArchivo();
            }
        });

        // Agregar componentes al marco
        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        frame.getContentPane().add(BorderLayout.SOUTH, btnAbrirArchivo);

        // Hacer visible el marco
        frame.setVisible(true);
    }

    private void abrirArchivo() {
        // ... (mismo código que antes)
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ArchivosPrograma();
            }
        });
    }
}