package model;

import com.sun.source.tree.Tree;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class Model {

    public TaskTreeModel taskTreeModel;


    private Integer importanceModel[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

   // private TaskTreeModel taskTree= new TaskTreeModel(rootNode);

    public Model() {
        newTasks = new ArrayList<>();

        taskTreeModel = new TaskTreeModel();
    }

    public void addTask(Task t) {
        newTasks.add(t);
        DefaultMutableTreeNode projectName = new DefaultMutableTreeNode(t.projectName);
        DefaultMutableTreeNode subTasks = new DefaultMutableTreeNode(t.importance);
        projectName.add(subTasks);
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) taskTreeModel.getRoot();

        root.add(projectName);

        taskTreeModel.fireTreeNodeAdded(projectName);


    }
  //  public TaskTreeModel getTaskTreeModel() {
  //      return taskTree;
  //  }

    public Integer[] getImportanceModel() {
        return importanceModel;
    }

    public ArrayList<Task> newTasks;



}
