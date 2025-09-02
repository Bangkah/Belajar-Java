import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Calculator {
    int boardwidth =360;
    int boardHeight = 540;

    JFrame frame = new JFrame("Calculator");

    public Calculator() {
        frame.setVisible(true);
        frame.setSize(boardwidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }

    
}