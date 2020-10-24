package view;
import model.Model;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public abstract class AbstractCommonComponents extends JPanel {


    //common functionality between panel is added here
    public AbstractCommonComponents(String panelTitle ,int x, int y, int width, int height, Color color, Boolean createTitleBoder, int boundsHeight)
    {

        this.setLayout(null);
        this.setSize(width, height);
        this.setBorder(BorderFactory.createLineBorder(color));
        JLabel panelLabel = new JLabel(panelTitle, SwingConstants.CENTER);
        if(createTitleBoder == true){Border blackLine = BorderFactory.createTitledBorder(""); panelLabel.setBorder(blackLine);}
        panelLabel.setBounds(x, y, width, boundsHeight);
        panelLabel.setForeground(color);
        panelLabel.setFocusable(false);
        this.add(panelLabel);
    }

    protected JButton createJButton(String title, int x, int y, int width, int height, Boolean buttonEnabled, Color color, Boolean setButtonColor)
    {
        JButton buttonName = new JButton(title);
        buttonName.setBounds(x, y, width, height);
        buttonName.setEnabled(buttonEnabled);
        if(setButtonColor == true){buttonName.setBackground(color);buttonName.setForeground(color);}
        this.add(buttonName);
        return buttonName;
    }

    protected void createJLabel(JLabel labelName, String title,int x , int y, int width, int height, Color color){
        labelName = new JLabel(title);
        labelName.setBounds(x, y, width, height);
        labelName.setBackground(color);
        labelName.setForeground(color);
        labelName.setFocusable(false);
        this.add(labelName);
    }

    protected JTextField createJTextField(int FIELD_START, int y, int width, int height){
        JTextField textFieldName = new JTextField();
        textFieldName.setBounds(FIELD_START, y, width, height);
        this.add(textFieldName);
        return textFieldName;
    }
}
