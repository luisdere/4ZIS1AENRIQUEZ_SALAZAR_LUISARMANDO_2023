import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazTitanes extends JFrame {
    private JPanel panelPrincipal;
    private JButton btnTitan1;
    private JButton btnTitan2;
    private JButton btnTitan3;
    private JButton btnRegresar;

    public InterfazTitanes() {
        // Configuración de la ventana principal
        super("Titanes de Attack on Titan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Crear componentes
        panelPrincipal = new JPanel(new GridLayout(2, 2));
        btnTitan1 = new JButton("Titán 1");
        btnTitan2 = new JButton("Titán 2");
        btnTitan3 = new JButton("Titán 3");
        btnRegresar = new JButton("Regresar al Menú Principal");

        // Agregar componentes al panel principal
        panelPrincipal.add(btnTitan1);
        panelPrincipal.add(btnTitan2);
        panelPrincipal.add(btnTitan3);
        panelPrincipal.add(btnRegresar);

        // Configurar acciones de los botones
        btnTitan1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarInformacionTitan("Titán 1", "Detalles del Titán 1", "eren.jpg");
            }
        });

        btnTitan2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarInformacionTitan("Titán 2", "Detalles del Titán 2", "imagen2.jpg");
            }
        });

        btnTitan3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarInformacionTitan("Titán 3", "Detalles del Titán 3", "imagen3.jpg");
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volverAlMenuPrincipal();
            }
        });

        // Configurar acción al cerrar la ventana
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                volverAlMenuPrincipal();
            }
        });

        // Mostrar la ventana principal
        add(panelPrincipal);
        setVisible(true);
    }

    private void mostrarInformacionTitan(String nombreTitan, String detalles, String imagenPath) {
        // Cerrar la ventana principal
        dispose();

        // Crear una nueva ventana para mostrar la información del titán
        JFrame ventanaTitan = new JFrame(nombreTitan);
        ventanaTitan.setSize(600, 400);

        JPanel panelTitan = new JPanel(new BorderLayout());
        JLabel lblDetalles = new JLabel(detalles);

        // Cargar y mostrar la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource(imagenPath));
        JLabel lblImagen = new JLabel(imagen);

        panelTitan.add(lblDetalles, BorderLayout.NORTH);
        panelTitan.add(lblImagen, BorderLayout.CENTER);

        ventanaTitan.add(panelTitan);
        ventanaTitan.setVisible(true);
    }

    private void volverAlMenuPrincipal() {
        // Cerrar la ventana actual y volver a la ventana principal
        dispose();
        new InterfazTitanes();
    }

    public static void main(String[] args) {
        // Iniciar la aplicación
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazTitanes();
            }
        });
    }
}