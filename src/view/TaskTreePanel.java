package view;
import model.Model;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;


public class TaskTreePanel extends AbstractCommonComponents{

    public static final int MIN_WIDTH = 390;
    public static final int MIN_HEIGHT = 540;
    private final JTextField searchField;
    private final JButton searchButton;
    private final JScrollPane scrollPane;
    private JButton DeleteTaskButton;
    private JButton startTaskButton;
    private Model model;

    public TaskTreePanel(String taskTreePanelTitle,int x, int y, Model model, int width, int height, Color color, Boolean createBorder, int boundsHeight) {
        super(taskTreePanelTitle,model, x, y, width, height, color, createBorder, boundsHeight);

        //Add a search field on the task lists.
        searchField = new JTextField("search task");
        searchField.setBounds(2, 20, 250, 30);
        this.add(searchField);

        //Add a search button next to search field.
        searchButton = new JButton("Search");
        searchButton.setBounds(260, 18, 125, 33);
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
