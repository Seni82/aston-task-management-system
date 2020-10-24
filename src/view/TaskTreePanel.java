package view;
import model.Model;
import model.Task;
import model.TaskRepository;
import javax.swing.*;
import javax.swing.tree.*;
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
    private AddTaskPanel addTaskPanel;

    public DefaultMutableTreeNode rootNode;
    public DefaultTreeModel treeModel;

    public TaskTreePanel(String taskTreePanelTitle, int x, int y, Model model, int width, int height, Color color,
                         Boolean createBorder, int boundsHeight,
                         TaskRepository taskRepository) {
        super(taskTreePanelTitle, model, x, y, width, height, color, createBorder, boundsHeight);



        //Add a search field on the task lists.
        createJTextField(searchField, 2 , 20, this.getWidth()-137, 30);


        //Adding Tree with JTree.

        rootNode = new DefaultMutableTreeNode();
        treeModel = new DefaultTreeModel(rootNode);
        JTree taskTree = new JTree(treeModel);
        taskTree.setRootVisible(false);
        scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getViewport().setView(taskTree);
        scrollPane.setBounds(5, 50, width - 10, height - 93);
        this.add(scrollPane);




        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Outstanding Task Lists");
        JTree tree;
        tree = new JTree(treeModel);
        tree.setRootVisible(false);


        taskTree.getSelectionModel().addTreeSelectionListener((event)-> {
            System.out.println(event.getPath());
            DefaultMutableTreeNode value = (DefaultMutableTreeNode) event.getPath().getPath()[1];
            addTaskPanel.showTask((Task) value.getUserObject());
        });



        startTaskButton = createJButton(null, "Start Task", this.getWidth()/3-50, height-42, 100, 40, false, Color.BLACK, true);
        createJButton(deleteTaskButton, "Delete Task", 2*this.getWidth()/3-50, height-42, 100, 40, false, Color.BLACK, true);
        createJButton(searchButton, "Search", this.getWidth()-130, 18, 125, 33, true, Color.black, true);

        startTaskButton.addActionListener((e)-> {
            String taskName = (String) taskTree.getSelectionPath().getPath()[1];
            Task task = taskRepository.getByName(taskName);

            task.setStarted(true);
        });
        //       searchField.getWidth()+10
    }

    public void setAddTaskPanel(AddTaskPanel addTaskPanel) {
        this.addTaskPanel = addTaskPanel;
    }

    public static void add(MutableTreeNode taskRoot) {
    }

    public void addTreeNode(MutableTreeNode treeNode)
    {
        rootNode.add(treeNode);
        treeModel.reload();
    }

    @Override
    protected void taskTree(DefaultMutableTreeNode node) {


    }
}
