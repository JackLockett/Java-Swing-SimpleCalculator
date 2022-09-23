import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorAppGUI extends JFrame {
    private JTextArea resultTextField;
    private JPanel MainPanel;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton divideButton;
    private JButton multiplyButton;
    private JButton addButton;
    private JButton subtractButton;
    private JButton clearButton;
    private JButton equalButton;
    private JLabel calculationLabel;
    private JButton a0Button;
    private JButton periodButton;

    double num, ans;
    int calculation;

    public void arithmetic_operation() {
        switch(calculation) {
            case 1:
                ans = num + Double.parseDouble(resultTextField.getText());
                resultTextField.setText(Double.toString(ans));
                break;
            case 2:
                ans = num - Double.parseDouble(resultTextField.getText());
                resultTextField.setText(Double.toString(ans));
                break;
            case 3:
                ans = num * Double.parseDouble(resultTextField.getText());
                resultTextField.setText(Double.toString(ans));
                break;
            case 4:
                ans = num / Double.parseDouble(resultTextField.getText());
                resultTextField.setText(Double.toString(ans));
                break;
        }
    }

    public CalculatorAppGUI() {
        setContentPane(MainPanel);
        setTitle("Calculator Application");
        setSize(400, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText("");
                calculationLabel.setText("");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(resultTextField.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(resultTextField.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(resultTextField.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(resultTextField.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(resultTextField.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(resultTextField.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(resultTextField.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(resultTextField.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(resultTextField.getText() + "9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(resultTextField.getText() + "0");
            }
        });
        periodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(resultTextField.getText() + ".");
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(resultTextField.getText());
                calculation = 1;
                resultTextField.setText("");
                calculationLabel.setText(num + " +");
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(resultTextField.getText());
                calculation = 3;
                resultTextField.setText("");
                calculationLabel.setText(num + " ×");
            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(resultTextField.getText());
                calculation = 2;
                resultTextField.setText("");
                calculationLabel.setText(num + " -");
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(resultTextField.getText());
                calculation = 4;
                resultTextField.setText("");
                calculationLabel.setText(num + " ÷");
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                arithmetic_operation();
                calculationLabel.setText("");

            }
        });
    }

    public static void main(String[] args) {
        CalculatorAppGUI myFirst = new CalculatorAppGUI();
    }

}

