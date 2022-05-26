package polimorfismo;

import javax.swing.JOptionPane;

public class Quadrado extends Quadrilatero {
    @Override
    public void desenhar() {
        JOptionPane.showMessageDialog(null, "Quadrado");
    }
}
