package view;
import model.AddTaskModel;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;

import model.AllTasks;

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
    private DefaultMutableTreeNode rootNode;

    public TaskTreePanel(String taskTreePanelTitle, int x, int y, int width, int height, Color color, Boolean createBorder, int boundsHeight, AddTaskModel model) {
        super(taskTreePanelTitle, x, y, width, height, color, createBorder, boundsHeight);
        this.model = model;

        //Add a search field on the task lists.
        searchField = new JTextField();
        searchField.setBounds(2, 20, this.getWidth() - 137, 30);
        this.add(searchField);

        rootNode = new DefaultMutableTreeNode("Projects");
        for (int i = 0; i < AllTasks.tasks.size(); i++) {
            DefaultMutableTreeNode projectNode = new DefaultMutableTreeNode(AllTasks.tasks.get(i).getProjectName());
            rootNode.add(projectNode);
        }
        taskTree = new JTree(rootNode);
        taskTree.setShowsRootHandles(true);
        scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getViewport().setView(taskTree);
        System.out.println("The number we are looking for "+(width - 10) + "height: "+ (height - 93));
        scrollPane.setBounds(5, 50, width - 10, height - 93);
        this.add(scrollPane);

        startTaskButton = new JButton("Start Task");
        startTaskButton.setBounds(this.getWidth() / 3 - 50, height - 42, 100, 40);
        startTaskButton.setEnabled(false);
        startTaskButton.setBackground(Color.BLACK);
        startTaskButton.setForeground(Color.WHITE);
        this.add(startTaskButton);

        deleteTaskButton = new JButton("Delete Selected");
        deleteTaskButton.setBounds(2 * this.getWidth() / 3 - 50, height - 42, 130, 40);
        deleteTaskButton.setEnabled(true);
        deleteTaskButton.setBackground(Color.BLACK);
        deleteTaskButton.setForeground(Color.WHITE);
        deleteTaskButton.addActionListener(this::deleteNode);
        this.add(deleteTaskButton);

        searchButton = new JButton("Search");
        searchButton.setBounds(this.getWidth() - 130, 18, 125, 33);
        searchButton.setEnabled(true);
        searchButton.setBackground(Color.BLUE);
        searchButton.setBackground(Color.WHITE);
        this.add(searchButton);
    }

    private void deleteNode(ActionEvent actionEvent) {

        //get selected node
        ProjectTreeNode selectedNode = (ProjectTreeNode)taskTree.getLastSelectedPathComponent();

        //check if node is a project node or a subtask node

        if(selectedNode.getSubTaskIndex() == -1){
            //if project node. get project id and delete from alltasks array
            AllTasks.deleteTask(selectedNode.getProjectId());
        }
        else {
            //if subtask node, get project id then get subtask id then find the object in the task array and
            // set the subtask index to empty string
            AllTasks.deleteSubTask(selectedNode.getProjectId(),selectedNode.getSubTaskIndex());
        }




        this.updateTree();

    }

    public void updateTree(){

        rootNode.removeAllChildren();
        for (int i = 0; i < AllTasks.tasks.size(); i++) {
            ProjectTreeNode projectNode = new ProjectTreeNode(AllTasks.tasks.get(i).getId(), -1, AllTasks.tasks.get(i).getProjectName());
            String[] subTasks = AllTasks.tasks.get(i).getSubTasks();
            for(int j = 0; j < 5; j++){
                if(subTasks[j].length() > 0 ) {
                    ProjectTreeNode subTaskNode = new ProjectTreeNode(AllTasks.tasks.get(i).getId(), j, subTasks[j]);
                    projectNode.add(subTaskNode);
                }
            }
            rootNode.add(projectNode);
        }

        DefaultTreeModel model = (DefaultTreeModel)taskTree.getModel();
        model.reload(rootNode);

    }


}
