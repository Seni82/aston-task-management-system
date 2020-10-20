package view;
import model.Model;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author ganiyuisola
 * @version 20/10/2020
 */
public class AddTaskPanel extends JPanel {

    public static final int MIN_WIDTH = 390;
    public static final int MIN_HEIGHT = 540;
    private final Model model;
    private final JLabel panelLabel;

    public AddTaskPanel(String taskPanelTitle, Model model, int width, int height, Color color) {
        this.model = model;
        this.setLayout(null);
        this.setSize(width, height);
        this.setBorder(BorderFactory.createLineBorder(color));

        panelLabel = new JLabel(taskPanelTitle, SwingConstants.CENTER);
        panelLabel.setBounds(0, 2, width, 15);
        panelLabel.setForeground(color);
        panelLabel.setFocusable(false);
        this.add(panelLabel);
    }
}
