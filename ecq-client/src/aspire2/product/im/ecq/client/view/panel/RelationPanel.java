package aspire2.product.im.ecq.client.view.panel;

import javax.swing.*;
import java.awt.*;

public class RelationPanel extends JFrame {
    private JLabel headLabel = new JLabel();
    private JLabel nicknameLabel = new JLabel();
    private JLabel signatureLabel = new JLabel();

    public RelationPanel(){

        init();
    }

    public void init(){
        setPreferredSize(new Dimension(290,60));
        //设置布局方式为边框布局
        setLayout(new BorderLayout());
        configureHeadLabel();
        installComponents();

    }


    public void configureHeadLabel() {
        //边框布局
        headLabel.setPreferredSize(new Dimension(45,45));
        headLabel.setOpaque(true);
        headLabel.setBackground(Color.DARK_GRAY);

    }
    public void installComponents() {
        add(headLabel,BorderLayout.WEST);
    }

}
