package view;
import model.Model;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;


public class TaskTreePanel extends AbstractCommonComponents {

    public static final int MIN_WIDTH = 500;
    public static final int MIN_HEIGHT = 390;
    private final JTextField searchField;
    private final JButton searchButton;
    private final JScrollPane scrollPane;
    private JButton DeleteTaskButton;
    private JButton startTaskButton;
    private Model model;

    public TaskTreePanel(String taskTreePanelTitle, int x, int y, Model model, int width, int height, Color color, Boolean createBorder, int boundsHeight) {
        super(taskTreePanelTitle, model, x, y, width, height, color, createBorder, boundsHeight);



        //Add a search field on the task lists.
        searchField = new JTextField("search task");
        searchField.setBounds(2, 20, this.getWidth()-150, 30);
        this.add(searchField);

        //Add a search button next to search field.
        searchButton = new JButton("Search");
        searchButton.setBounds(searchField.getWidth()+10, 18, 125, 33);
        this.add(searchButton);

        //Adding Tree with JTree.
        JTree taskTree = new JTree();
        taskTree.setRootVisible(false);
        scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getViewport().setView(taskTree);
        scrollPane.setBounds(5, 50, width - 10, height - 93);
        this.add(scrollPane);

        //Create button through inheritance by calling the method in my abstract class.
        createJButton(startTaskButton, "Start Task", this.getWidth()/3-50, height-42, 100, 40, false, Color.BLACK, true);
        createJButton(DeleteTaskButton, "Delete Task", 2*this.getWidth()/3-50, height-42, 100, 40, false, Color.BLACK, true);

    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        final int width = this.getWidth();
//        final int height = this.getHeight();
    //  panelLabel.setSize(this.getWidth(), 15);
    //      scrollPane.setSize(this.getWidth() - 10, this.getHeight() - 43);
    //      startTaskButton.setBounds(this.getWidth() / 3 - 65, this.getHeight() - 42,130,40);
    //      DeleteTaskButton.setBounds(this.getWidth() - (this.getWidth() / 3) - 65, this.getHeight() - 42, 130, 40);
    //      searchButton.setBounds(searchField.getWidth()+10, 18, 125, 33);
    //      searchField.setBounds(2, 20, this.getWidth()-150, 30);

    // }



}
