import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField display;
    private String input;
    private String operator;
    private double num1, num2, result;

    public Calculadora() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        input = "";
        operator = "";

        display = new JTextField();
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(6, 4));
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "√", "+",
            "sin", "cos", "tan", "^",
            "C", "="
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        switch (action) {
            case "C":
                input = "";
                operator = "";
                display.setText("");
                break;
            case "=":
                num2 = Double.parseDouble(input);
                calculateResult();
                input = Double.toString(result);
                display.setText(input);
                break;
            case "sin":
                num1 = Double.parseDouble(input);
                result = Math.sin(Math.toRadians(num1));
                input = Double.toString(result);
                display.setText(input);
                break;
            case "cos":
                num1 = Double.parseDouble(input);
                result = Math.cos(Math.toRadians(num1));
                input = Double.toString(result);
                display.setText(input);
                break;
            case "tan":
                num1 = Double.parseDouble(input);
                result = Math.tan(Math.toRadians(num1));
                input = Double.toString(result);
                display.setText(input);
                break;
            case "^":
                operator = "^";
                num1 = Double.parseDouble(input);
                input = "";
                break;
            case "√":
                num1 = Double.parseDouble(input);
                result = Math.sqrt(num1);
                input = Double.toString(result);
                display.setText(input);
                break;
            default:
                input += action;
                display.setText(input);
                break;
        }
    }

    private void calculateResult() {
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    input = "Error";
                    display.setText(input);
                }
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculadora calculator = new Calculadora();
            calculator.setVisible(true);
        });
    }
}