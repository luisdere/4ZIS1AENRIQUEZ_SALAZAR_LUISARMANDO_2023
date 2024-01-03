import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OxxoLuisyCharly {

    private static List<Cuenta> cuentas = new ArrayList<>();

    public static void main(String[] args) {
        // Inicializar cuentas
        inicializarCuentas();

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Oxxo de Luis y Charly");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            JPanel panel = new JPanel(new GridLayout(5, 2));

            JButton compraBtn = new JButton("1. Compra de productos");
            JButton retiroBtn = new JButton("2. Retiro de dinero");
            JButton transferenciaBtn = new JButton("3. Transferencia de dinero");
            JButton recargaBtn = new JButton("4. Recargas de saldo");
            JButton depositoBtn = new JButton("5. Depósitos de dinero");
            JButton pagarAmazonBtn = new JButton("6. Pagar artículos de Amazon");
            JButton pagarInternetBtn = new JButton("7. Pagar servicios de internet");
            JButton solicitudTarjetaBtn = new JButton("8. Solicitud de Tarjeta SPI");
            JButton segurosOxxoBtn = new JButton("9. Seguros Oxxo");

            panel.add(compraBtn);
            panel.add(retiroBtn);
            panel.add(transferenciaBtn);
            panel.add(recargaBtn);
            panel.add(depositoBtn);
            panel.add(pagarAmazonBtn);
            panel.add(pagarInternetBtn);
            panel.add(solicitudTarjetaBtn);
            panel.add(segurosOxxoBtn);

            frame.add(panel, BorderLayout.CENTER);

            frame.setVisible(true);

            // Agregar ActionListener para cada botón
            compraBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    realizarCompra();
                }
            });
            
            retiroBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    realizarRetiro();
                }
            });

            depositoBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    realizarDeposito();
                }
            });

            recargaBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    realizarRecarga();
                }
            });

            transferenciaBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    realizarTransferencia();
                }
            });

            pagarAmazonBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pagarAmazon();
                }
            });

            pagarInternetBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pagarInternet();
                }
            });

            solicitudTarjetaBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    solicitarTarjetaSPI();
                }
            });

            segurosOxxoBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    contratarSeguroOxxo();
                }
            });

            // Agregar ActionListeners para otros botones...
        });
    }
    private static void inicializarCuentas() {
                cuentas.add(new Cuenta("1234", 5000));
                cuentas.add(new Cuenta("5678", 7000));
                cuentas.add(new Cuenta("9012", 3000));
                cuentas.add(new Cuenta("3456", 10000));
                cuentas.add(new Cuenta("7890", 4500));
                // Cuentas adicionales proporcionadas
                cuentas.add(new Cuenta("1111", 2000));
                cuentas.add(new Cuenta("2222", 8000));
                cuentas.add(new Cuenta("3333", 6000));
                cuentas.add(new Cuenta("4444", 12000));
            }


    private static void contratarSeguroOxxo() {
        try {
            String numeroSeguro = JOptionPane.showInputDialog("Ingrese el número de seguro:");
            String tipoSeguro = JOptionPane.showInputDialog("Ingrese el tipo de seguro (Vida/Carro):");
            String requisitos = obtenerRequisitosSeguro(tipoSeguro);

            JOptionPane.showMessageDialog(null, "Número de Seguro: " + numeroSeguro +
                    "\nTipo de Seguro: " + tipoSeguro +
                    "\nRequisitos: " + requisitos +
                    "\n¡Seguro contratado con éxito!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al contratar el seguro. Inténtalo nuevamente.");
        }
    }

    private static String obtenerRequisitosSeguro(String tipoSeguro) {
        // Aquí puedes definir los requisitos según el tipo de seguro (Vida/Carro)
        if ("Vida".equalsIgnoreCase(tipoSeguro)) {
            return "Requisitos para Seguro de Vida: ...";
        } else if ("Carro".equalsIgnoreCase(tipoSeguro)) {
            return "Requisitos para Seguro de Carro: ...";
        } else {
            return "Tipo de seguro no reconocido.";
        }
    }

    private static void solicitarTarjetaSPI() {
        try {
            String numeroTarjetaSPI = JOptionPane.showInputDialog("¡Felicitaciones! Has obtenido una nueva Tarjeta SPI.\nIngrese el número de tarjeta:");
            int opcionDeposito = JOptionPane.showConfirmDialog(null, "¿Desea realizar un depósito inicial a esta tarjeta?", "Depósito Inicial", JOptionPane.YES_NO_OPTION);

            if (opcionDeposito == JOptionPane.YES_OPTION) {
                double montoDeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
                JOptionPane.showMessageDialog(null, "¡Depósito realizado con éxito! Tarjeta SPI lista para usar.");
            } else {
                JOptionPane.showMessageDialog(null, "¡Tarjeta SPI lista para usar!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al procesar la solicitud de la tarjeta SPI. Inténtalo nuevamente.");
        }
    }

    private static void realizarCompra() {
        int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos a comprar:"));
        double totalCompra = 0;

        for (int i = 0; i < cantidadProductos; i++) {
            String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":");
            double precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto " + (i + 1) + ":"));
            totalCompra += precioProducto;
        }

        JOptionPane.showMessageDialog(null, "Compra realizada. Total: $" + totalCompra);
    }

    private static void realizarRetiro() {
        String numeroTarjeta = JOptionPane.showInputDialog("Ingrese el número de tarjeta:");
        Cuenta cuenta = buscarCuenta(numeroTarjeta);

        if (cuenta != null) {
            double saldoInicial = cuenta.getSaldo();
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));

            if (cantidad > 0 && cantidad <= saldoInicial) {
                cuenta.retirar(cantidad);
                JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo restante: $" + cuenta.getSaldo());
            } else {
                JOptionPane.showMessageDialog(null, "Cantidad inválida o insuficiente saldo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tarjeta no encontrada.");
        }
    }

    private static void realizarDeposito() {
        String numeroTarjeta = JOptionPane.showInputDialog("Ingrese el número de tarjeta:");
        Cuenta cuenta = buscarCuenta(numeroTarjeta);

        if (cuenta != null) {
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
            cuenta.depositar(cantidad);
            JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: $" + cuenta.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Tarjeta no encontrada.");
        }
    }

    private static void realizarRecarga() {
        String compania = JOptionPane.showInputDialog("Ingrese la compañía de celular:");
        String numeroCelular = JOptionPane.showInputDialog("Ingrese el número de celular:");
        double montoRecarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a recargar:"));

        JOptionPane.showMessageDialog(null, "Recarga realizada para el número " + numeroCelular +
                " de la compañía " + compania + ". Monto recargado: $" + montoRecarga);
    }

    private static void realizarTransferencia() {
        try {
            String numeroCuentaDestino = JOptionPane.showInputDialog("Ingrese el número de cuenta de 10 dígitos:");
            double montoTransferencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a transferir:"));
            String mensaje = JOptionPane.showInputDialog("Ingrese el mensaje de la transferencia:");

            if (numeroCuentaDestino.length() == 10) {
                // Puedes agregar lógica adicional aquí según sea necesario
                JOptionPane.showMessageDialog(null, "Transferencia realizada por SPI. Monto transferido: $" + montoTransferencia +
                        "\nMensaje: " + mensaje);
            } else {
                JOptionPane.showMessageDialog(null, "Número de cuenta inválido. La transferencia no pudo realizarse.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores válidos para la transferencia.");
        }
    }

    private static void pagarAmazon() {
        try {
            int codigoAmazon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de 4 dígitos de Amazon:"));
            double cantidadPagar = new Random().nextDouble() * 1000; // Monto aleatorio

            int opcion = JOptionPane.showConfirmDialog(null, "Total a pagar: $" + cantidadPagar +
                    "\n¿Desea pagar la cantidad total?", "Pagar Amazon", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Pago realizado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Pago cancelado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un código de 4 dígitos válido.");
        }
    }

    private static void pagarInternet() {
        try {
            String numeroCuentaInternet = JOptionPane.showInputDialog("Ingrese el número de cuenta de 6 dígitos:");
            String companiaInternet = JOptionPane.showInputDialog("Ingrese la compañía de internet:");
            double montoPagar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a pagar:"));

            if (numeroCuentaInternet.length() == 6) {
                JOptionPane.showMessageDialog(null, "Pago de servicios de internet realizado para la cuenta " +
                        numeroCuentaInternet + " de la compañía " + companiaInternet +
                        ". Monto pagado: $" + montoPagar);
            } else {
                JOptionPane.showMessageDialog(null, "Número de cuenta inválido. El pago no pudo realizarse.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores válidos para el pago de internet.");
        }
    }

    private static Cuenta buscarCuenta(String numeroTarjeta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroTarjeta().equals(numeroTarjeta)) {
                return cuenta;
            }
        }
        return null;
    }

    private static class Cuenta {
        private String numeroTarjeta;
        private double saldo;

        public Cuenta(String numeroTarjeta, double saldo) {
            this.numeroTarjeta = numeroTarjeta;
            this.saldo = saldo;
        }

        public String getNumeroTarjeta() {
            return numeroTarjeta;
        }

        public double getSaldo() {
            return saldo;
        }

        public void retirar(double cantidad) {
            saldo -= cantidad;
        }

        public void depositar(double cantidad) {
            saldo += cantidad;
        }
    }
}