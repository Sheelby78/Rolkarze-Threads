package pakiecik;

import javax.swing.*;

public class Glowna {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) { }
        JFrame frame = new JFrame("MyFrame");
        frame.setContentPane(new MyFrame().getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}