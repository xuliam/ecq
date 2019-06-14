package aspire2.product.im.ecq.client.view.panel;

import javax.swing.*;
import java.awt.*;

public class RelationPanel extends JPanel {
    private JLabel headLabel = new JLabel();
    private JLabel nicknameLabel = new JLabel();
    private JLabel signatureLabel = new JLabel();
    private JPanel textPanel = new JPanel();

    public RelationPanel(){

        init();
    }

    public void init(){
        setPreferredSize(new Dimension(290,60));
        //设置布局方式为边框布局
        setLayout(new BorderLayout());
        configureHeadLabel();
        configureNicknameLabel();
        configureTextPanel();
        configureSignature();
        installComponents();


    }

    public void configureSignature() {
        signatureLabel.setText("To be or not to be");
        signatureLabel.setFont(new Font("Klee", Font.PLAIN, 11));
        signatureLabel.setForeground(new Color(134,134,134));


    }

    public void configureTextPanel() {
        textPanel.setLayout(new BorderLayout());
        textPanel.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
    }

    public void configureNicknameLabel() {
        nicknameLabel.setPreferredSize(new Dimension(0,17));
        nicknameLabel.setFont(new Font("Klee", Font.PLAIN, 13));
        nicknameLabel.setText("Nick");
    }


    public void configureHeadLabel() {
        //边框布局
        headLabel.setPreferredSize(new Dimension(45,45));
        headLabel.setOpaque(true);
        headLabel.setBackground(Color.DARK_GRAY);


    }
    public void installComponents() {

        add(headLabel,BorderLayout.WEST);
        //添加昵称到文本面板
        textPanel.add(nicknameLabel,BorderLayout.NORTH);
        //添加标签到文本面板
        textPanel.add(signatureLabel,BorderLayout.CENTER);
        add(textPanel,BorderLayout.CENTER);
    }

}
