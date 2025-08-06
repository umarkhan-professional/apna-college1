import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Factorial extends JFrame implements ActionListener {
    private JLabel l1, l2;
    private JTextField num, fact;
    private JButton b;

    public Factorial() {
        setTitle("Factorial Calculator");
        setLayout(new GridLayout(3, 2));
        l1 = new JLabel("Number:");
        l2 = new JLabel("Factorial:");
        num = new JTextField(10);
        fact = new JTextField(10);
        fact.setEditable(false);
        b = new JButton("Compute");

        add(l1);
        add(num);
        add(l2);
        add(fact);
        add(new JLabel()); // Empty cell
        add(b);

        b.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int n = Integer.parseInt(num.getText());
            int f = 1;
            for (int i = 1; i <= n; i++)
                f *= i;
            fact.setText(String.valueOf(f));
        } catch (NumberFormatException e) {
            fact.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new Factorial();
    }
}
