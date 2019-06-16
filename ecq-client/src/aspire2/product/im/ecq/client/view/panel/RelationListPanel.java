package aspire2.product.im.ecq.client.view.panel;

import javax.swing.*;
import java.awt.*;

public class RelationListPanel extends JPanel {
    public RelationListPanel(){
        init();
    }

    public void init(){
//        add(new RelationPanel());
//        add(new RelationPanel());
//        add(new RelationPanel());
//        add(new RelationPanel());
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(290,1500));
        createRelationPanel();
        createRelationPanel();

    }
    public void createRelationPanel(){
        JButton groupTitleButton = new JButton("My Friends");
        add(groupTitleButton);
        for (int i = 0; i < 5; i++) {
            RelationPanel relationPanel = new RelationPanel();
            add(relationPanel);
        } 
    }

}
