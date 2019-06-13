package aspire2.product.im.ecq.client.view;

import javax.swing.*;

/**
 * This is the ECQ chart mainFrame;
 */
public class MainFrame extends JFrame {

    public MainFrame(){
        init();
        setVisible(true);
    }

    public void init(){
        setTitle("Main");
        setSize(300,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MainFrame();

    }
}
