package view;
import model.Model;
import javax.swing.*;
import java.awt.*;


public class TaskTreePanel extends AbstractCommonComponents {

    public static final int MIN_WIDTH = 500;
    public static final int MIN_HEIGHT = 390;
    private JTextField searchField;
    private final JScrollPane scrollPane;
    private JButton deleteTaskButton;
    private JButton startTaskButton;
    private JButton searchButton;
    private Model model;

    public TaskTreePanel(String taskTreePanelTitle, int x, int y, Model model, int width, int height, Color color, Boolean createBorder, int boundsHeight) {
        super(taskTreePanelTitle, model, x, y, width, height, color, createBorder, boundsHeight);



        //Add a search field on the task lists.
        createJTextField(searchField, 2 , 20, this.getWidth()-137, 30);


        //Adding Tree with JTree.
        JTree taskTree = new JTree();
        taskTree.setRootVisible(false);
        scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getViewport().setView(taskTree);
        scrollPane.setBounds(5, 50, width - 10, height - 93);
        this.add(scrollPane);


        createJButton(startTaskButton, "Start Task", this.getWidth()/3-50, height-42, 100, 40, false, Color.BLACK, true);
        createJButton(deleteTaskButton, "Delete Task", 2*this.getWidth()/3-50, height-42, 100, 40, false, Color.BLACK, true);
        createJButton(searchButton, "Search", this.getWidth()-130, 18, 125, 33, true, Color.black, true);
 //       searchField.getWidth()+10
    }

}
