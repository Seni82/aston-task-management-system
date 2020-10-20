package view;
import model.Model;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public abstract class AbstractCommonComponents extends JPanel {
    private final Model model;

    //common functionality between panel is added here

    public AbstractCommonComponents(Model model, int width, int height, Color color, Boolean createBorderLine)
    {
        this.model = model;
        this.setLayout(null);
        this.setSize(width, height);
        this.setBorder(BorderFactory.createLineBorder(color));
    }

    public void createJButton(JButton buttonName, String title, int x, int y, int width, int height, Boolean buttonEnabled, Color color, Boolean setButtonColor)
    {
        buttonName = new JButton(title);
        buttonName.setBounds(x, y, width, height);
        buttonName.setEnabled(buttonEnabled);
        if(setButtonColor == true){
            buttonName.setBackground(color);
            buttonName.setForeground(color);
        }
        this.add(buttonName);
    }
}
