import Vista.View;

import javax.swing.*;

/**
 * @author alfre
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new View().setVisible(true));
    }
}
