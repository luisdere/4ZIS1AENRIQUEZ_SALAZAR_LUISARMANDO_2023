import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazLogin extends JFrame implements ActionListener {
    private JTextField textFieldUser;
    private JPasswordField passwordField;
    private JButton buttonIniciarSesion;

    private static final String USUARIO_CORRECTO = "usuario";
    private static final String CONTRASENA_CORRECTA = "password";

    public InterfazLogin() {
        setTitle("Inicio de Sesión");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel labelUser = new JLabel("Usuario:");
        textFieldUser = new JTextField(10);
        JLabel labelPassword = new JLabel("Contraseña:");
        passwordField = new JPasswordField(10);
        buttonIniciarSesion = new JButton("Iniciar Sesión");

        buttonIniciarSesion.addActionListener(this);

        panel.add(labelUser);
        panel.add(textFieldUser);
        panel.add(labelPassword);
        panel.add(passwordField);
        panel.add(new JLabel("")); // Espacio en blanco
        panel.add(buttonIniciarSesion);

        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonIniciarSesion) {
            String usuario = textFieldUser.getText();
            char[] contrasena = passwordField.getPassword();

            if (validarCredenciales(usuario, new String(contrasena))) {
                JOptionPane.showMessageDialog(this, "Bienvenido");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario inválido");
            }

            textFieldUser.setText("");
            passwordField.setText("");
        }
    }

    private boolean validarCredenciales(String usuario, String contrasena) {
        return usuario.equals(USUARIO_CORRECTO) && contrasena.equals(CONTRASENA_CORRECTA);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazLogin login = new InterfazLogin();
            login.setVisible(true);
        });
    }
}