package model;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.ArrayList;
import java.util.Calendar;

public class TaskModel {
    public static final Integer IMPORTANCE_MODEL[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int id;
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

    public TaskModel(int id, String projectName,
                         String projectDescription,
                         String taskName, String subTask1Value,
                         String subTask2Value,String subTask3Value,
                         String subTask4Value,String subTask5Value,
                         Calendar date,int dueHour,int dueMinutes,
                         int taskImportance,String taskDurationValue){
        this.id = id;
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

    public String[] getSubTasks(){
        String[]  subTasks = { this.subTask1Value,  this.subTask2Value,  this.subTask3Value,  this.subTask4Value,  this.subTask5Value};
        return subTasks;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public int getId() {
        return id;
    }

    public void deleteSubTask(int index){
        if(index == 0)
            this.subTask1Value = "";
        else if(index == 1)
            this.subTask2Value = "";
        else if(index == 2)
            this.subTask3Value = "";
        else if(index == 3)
            this.subTask4Value = "";
        else if(index == 4)
            this.subTask5Value = "";

    }

}
