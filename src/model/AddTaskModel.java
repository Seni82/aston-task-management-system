package model;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.ArrayList;
import java.util.Calendar;


public class AddTaskModel {

    public static final Integer IMPORTANCE_MODEL[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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


    /*
    public AddTaskModel()
    {
        projName = new DefaultMutableTreeNode("Project Name: " );//+this.projectName);

        DefaultMutableTreeNode projDescription = new DefaultMutableTreeNode("Project Description: " +this.projectDescription);
        DefaultMutableTreeNode myTaskName = new DefaultMutableTreeNode("Task Name: " +this.taskName);
        DefaultMutableTreeNode subTask1 = new DefaultMutableTreeNode("Sub Task 1: " +this.subTask1Value);
        DefaultMutableTreeNode subTask2 = new DefaultMutableTreeNode("Sub Task 2: " +this.subTask2Value);
        DefaultMutableTreeNode subTask3 = new DefaultMutableTreeNode("Sub Task 3: " +this.subTask3Value);
        DefaultMutableTreeNode subTask4 = new DefaultMutableTreeNode("Sub Task 4: " +this.subTask4Value);
        DefaultMutableTreeNode subTask5 = new DefaultMutableTreeNode("Sub Task 5: " + this.subTask5Value);
        DefaultMutableTreeNode taskDueDate = new DefaultMutableTreeNode("Task Due Date: "+this.date);
        DefaultMutableTreeNode taskDueTime = new DefaultMutableTreeNode("Task Due Time: "+ this.dueHour+":"+this.dueMinutes);
        DefaultMutableTreeNode myTaskImportance = new DefaultMutableTreeNode("Task Importance: "+ this.taskImportance);
        DefaultMutableTreeNode estDuration = new DefaultMutableTreeNode("Est Duration: "+this.taskDurationValue);
        projName.add(projDescription);
        projName.add(myTaskName);
        myTaskName.add(subTask1);
        myTaskName.add(subTask2);
        myTaskName.add(subTask3);
        myTaskName.add(subTask4);
        myTaskName.add(subTask5);
        myTaskName.add(taskDueDate);
        myTaskName.add(taskDueTime);
        myTaskName.add(myTaskImportance);
        myTaskName.add(estDuration);

        treeModel = new DefaultTreeModel(projName);

    }
     */
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

    public DefaultTreeModel getTaskTreeModel() {
        return treeModel;
    }

}
