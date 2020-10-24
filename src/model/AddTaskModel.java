package model;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.ArrayList;
import java.util.Calendar;


public class AddTaskModel {

    private String projectName;
    private String projectDescription;
    private String taskName;
    private String subTask1Value;
    private String subTask2Value;
    private String subTask3Value;
    private String subTask4Value;
    private String subTask5Value;
    private Calendar date;
    private int dueHour;
    private int dueMinutes;
    private int taskImportance;
    private String taskDurationValue;
    DefaultMutableTreeNode projName;
    DefaultTreeModel treeModel;
    ArrayList newTasks;
    DefaultTreeModel dfModel;
    DefaultMutableTreeNode root;

   private TaskTreeModel taskTreeModel;

    public static final Integer IMPORTANCE_MODEL[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    public AddTaskModel()
    {
        newTasks = new ArrayList<>();
        taskTreeModel = new TaskTreeModel();
    }

    public void addTask(Task t)
    {
        newTasks.add(t);
        DefaultMutableTreeNode projectName = new DefaultMutableTreeNode("Project Name: "+t.projectName);
        DefaultMutableTreeNode parentDescription = new DefaultMutableTreeNode("Project Description: "+t.description);
        DefaultMutableTreeNode parentTaskName = new DefaultMutableTreeNode("Task Name: "+t.taskName
                +" Task Due & Date: "+t.calendar+" -"+ +t.hour+" : "+ t.minutes +
                " Task Importance : "+t.importance+" / 10");
        DefaultMutableTreeNode taskEstimatedDuration = new DefaultMutableTreeNode("Task Est. Duration: "+ t.estimatedDuration);
        DefaultMutableTreeNode subTask1 = new DefaultMutableTreeNode("Sub Task 1: "+t.subTask1);
        DefaultMutableTreeNode subTask2 = new DefaultMutableTreeNode("Sub Task 2: "+t.subTask2);
        DefaultMutableTreeNode subTask3 = new DefaultMutableTreeNode("Sub Task 3: "+t.subTask3);
        DefaultMutableTreeNode subTask4 = new DefaultMutableTreeNode("Sub Task 4: "+t.subTask4);
        DefaultMutableTreeNode subTask5 = new DefaultMutableTreeNode("Sub Task 5: "+t.subTask5);
        DefaultMutableTreeNode importance = new DefaultMutableTreeNode("Task Importance : "+t.importance+" / 10");


        DefaultMutableTreeNode root = (DefaultMutableTreeNode) taskTreeModel.getRoot();
        root.add(projectName);
        projectName.add(parentDescription);
        projectName.add(parentTaskName);
        parentTaskName.add(taskEstimatedDuration);
        parentTaskName.add(subTask1);

        if(!t.subTask2.isEmpty()){parentTaskName.add(subTask2);}
        if(!t.subTask3.isEmpty()){parentTaskName.add(subTask3);}
        if(!t.subTask4.isEmpty()){parentTaskName.add(subTask4);}
        if(!t.subTask5.isEmpty()){parentTaskName.add(subTask5);}
        taskTreeModel.fireTreeNodeAdded(projectName);
    }




    /*
    public void addTasks(String projectName,
                         String projectDescription,
                         String taskName, String subTask1Value,
                         String subTask2Value,String subTask3Value,
                         String subTask4Value,String subTask5Value,
                         Calendar date,int dueHour,int dueMinutes,
                         int taskImportance,String taskDurationValue){

        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.taskName = taskName;
        this.subTask1Value = subTask1Value;
        this.subTask2Value = subTask2Value;
        this.subTask3Value = subTask3Value;
        this.subTask4Value = subTask4Value;
        this.subTask5Value = subTask5Value;
        this.date = date;
        this.dueHour = dueHour;
        this.dueMinutes = dueMinutes;
        this.taskImportance = taskImportance;
        this.taskDurationValue = taskDurationValue;
        this.taskDurationValue = taskDurationValue;

    }
     */


    public TaskTreeModel getTaskTreeModel() {
        return taskTreeModel;}



}
