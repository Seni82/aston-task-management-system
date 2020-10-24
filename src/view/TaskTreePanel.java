package view;
import model.AddTaskModel;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;


public class TaskTreePanel extends AbstractCommonComponents {

    public static final int MIN_WIDTH = 500;
    public static final int MIN_HEIGHT = 390;
    private JTextField searchField;
    private JScrollPane scrollPane;
    private JButton deleteTaskButton;
    private JButton startTaskButton;
    private JButton searchButton;
    private AddTaskModel model;
    private JTree taskTree;


    public TaskTreePanel(String taskTreePanelTitle, int x, int y, int width, int height, Color color, Boolean createBorder, int boundsHeight, AddTaskModel model) {
        super(taskTreePanelTitle, x, y, width, height, color, createBorder, boundsHeight);
        this.model = model;



        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        //Add a search field on the task lists.
        searchField = new JTextField();
        searchField.setBounds(2, 20, this.getWidth() - 137, 30);
        this.add(searchField);

        taskTree = new JTree(model.getTaskTreeModel());
        taskTree.setShowsRootHandles(true);
        taskTree.setRootVisible(false);
        scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getViewport().setView(taskTree);
        System.out.println("The number we are looking for "+(width - 10) + "height: "+ (height - 93));
        scrollPane.setBounds(5, 50, width - 10, height - 93);
        this.add(scrollPane);

        startTaskButton = new JButton("Start Task");
        startTaskButton.setBounds(this.getWidth() / 3 - 50, height - 42, 100, 40);
        startTaskButton.setEnabled(false);
        startTaskButton.setBackground(Color.BLACK);
        startTaskButton.setForeground(Color.BLACK);
        this.add(startTaskButton);

        deleteTaskButton = new JButton("Delete Task");
        deleteTaskButton.setBounds(2 * this.getWidth() / 3 - 50, height - 42, 100, 40);
        deleteTaskButton.setEnabled(false);
        deleteTaskButton.setBackground(Color.BLACK);
        deleteTaskButton.setForeground(Color.BLACK);
        this.add(deleteTaskButton);

        searchButton = new JButton("Search");
        searchButton.setBounds(this.getWidth() - 130, 18, 125, 33);
        searchButton.setEnabled(true);
        searchButton.setBackground(Color.BLACK);
        searchButton.setBackground(Color.BLACK);
        this.add(searchButton);


    }


}
