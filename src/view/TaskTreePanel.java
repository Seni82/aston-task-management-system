package view;
import model.Model;
import javax.swing.*;
import java.awt.*;


public class TaskTreePanel extends AbstractCommonComponents{

    public static final int MIN_WIDTH = 390;
    public static final int MIN_HEIGHT = 540;
    private final JLabel panelLabel;
    private final JTextField searchField;
    private final JButton searchButton;
    private final JScrollPane scrollPane;
    private JButton DeleteTaskButton;
    private JButton startTaskButton;
    private Model model;

    public TaskTreePanel(String taskPanelTitle, Model model, int width, int height, Color color, Boolean createBorder) {
        super(model, width, height, color, createBorder);
        this.model = model;
        panelLabel = new JLabel(taskPanelTitle, SwingConstants.CENTER);
        panelLabel.setBounds(0, 2, width, 15);
        panelLabel.setForeground(color);
        panelLabel.setFocusable(false);
        this.add(panelLabel);

        //Add a search field on the task lists.
        searchField = new JTextField("search task");
        searchField.setBounds(2, 20, 250, 30);
        this.add(searchField);

        //Add a search button next to search field.
        searchButton = new JButton("Search");
        searchButton.setBounds(260, 18, 130, 33);
        this.add(searchButton);

        //Adding Tree with JTree.
        JTree taskTree = new JTree();
        taskTree.setRootVisible(false);
        scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getViewport().setView(taskTree);
        scrollPane.setBounds(5, 50, width - 10, height - 93);
        this.add(scrollPane);

        //Create button through inheritance by calling the method in my abstract class.
        createJButton(startTaskButton, "Start Task",40, 507,130,40,false, Color.BLACK,true);
        createJButton(DeleteTaskButton, "Delete Task",220, 507,130,40,false, Color.BLACK,true);
    }
}
