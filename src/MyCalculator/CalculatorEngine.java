package MyCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(null,"Something happened...", "Just a test",JOptionPane.PLAIN_MESSAGE);

    }
}
