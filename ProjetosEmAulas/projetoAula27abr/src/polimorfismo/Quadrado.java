package polimorfismo;

import javax.swing.JOptionPane;

public class Quadrado extends Forma {
    @Override
    public void desenhar() {
        JOptionPane.showMessageDialog(null, "Quadrado");
    }
}
