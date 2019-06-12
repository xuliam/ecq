package aspire2.product.im.ecq.client.view;

import javax.swing.*;

public class RegisteFrame extends JFrame {

    private LoginFrame loginFrame;

    public RegisteFrame(LoginFrame frame){
        this.loginFrame = frame;
        init();
        setVisible(true);
    }

    public void init(){
        setSize(430,330);
        setTitle("Registe");
        setLocationRelativeTo(null);

    }
}
