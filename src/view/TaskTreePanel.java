package view;
import model.Model;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;


public class TaskTreePanel extends AbstractCommonComponents {

    public static final int MIN_WIDTH = 500;
    public static final int MIN_HEIGHT = 390;
    private JTextField searchField;
    private final JScrollPane scrollPane;
    private JButton deleteTaskButton;
    private JButton startTaskButton;
    private JButton searchButton;
    private Model modelTask;
    private final JTree taskTree;

    public TaskTreePanel(String taskTreePanelTitle, int x, int y, Model model, int width, int height, Color color, Boolean createBorder, int boundsHeight) {
        super(taskTreePanelTitle, x, y, width, height, color, createBorder, boundsHeight);
        modelTask = model;


        //Add a search field on the task lists.
 //       createJTextField(searchField, 2 , 20, this.getWidth()-137, 30);




        //create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        //create the child nodes
     //   DefaultMutableTreeNode taskNode = new DefaultMutableTreeNode(modelTask.newTasks.get(0).projectName);
     //   DefaultMutableTreeNode importanceNode = new DefaultMutableTreeNode(modelTask.newTasks.get(0).importance);
        //add the child nodes to the root node
     //   root.add(taskNode);
     //   taskNode.add(importanceNode);

     //   fruitNode.add(new DefaultMutableTreeNode("Banana"));
       // vegetableNode.add(new DefaultMutableTreeNode("Cauliflower"));

            //Adding Tree with JTree.
            taskTree = new JTree(modelTask.taskTreeModel);
            taskTree.setRootVisible(false);
            scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scrollPane.getViewport().setView(taskTree);
            scrollPane.setBounds(5, 50, width - 10, height - 93);
            this.add(scrollPane);

        }
        //create the tree by passing in the root node
    //    taskTree = new JTree(root);
    //    this.add(taskTree);

    //    this.setDefaultCloseOperation(JPanel.EXIT_ON_CLOSE);
    //    this.setTitle("JTree Example");
     //   this.pack();
    //    this.setVisible(true);



        //createJButton(startTaskButton, "Start Task", this.getWidth()/3-50, height-42, 100, 40, false, Color.BLACK, true);
        //createJButton(deleteTaskButton, "Delete Task", 2*this.getWidth()/3-50, height-42, 100, 40, false, Color.BLACK, true);
        //createJButton(searchButton, "Search", this.getWidth()-130, 18, 125, 33, true, Color.black, true);
 //       searchField.getWidth()+10
    }


