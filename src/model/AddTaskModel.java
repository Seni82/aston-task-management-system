package model;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.*;


public class AddTaskModel {

//    private Comparator taskComparator;
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
    DefaultTreeModel dfModel;
    DefaultMutableTreeNode root;

    public ArrayList<Task> newTasks;

    private TaskTreeModel taskTreeModel;

    public static final Integer IMPORTANCE_MODEL[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private Date dateTime;


    public AddTaskModel() {
        newTasks = new ArrayList<>();
        taskTreeModel = new TaskTreeModel();
 //       taskComparator = new TaskComparator();
    }

    public void addTask(Task t)
    {
        newTasks.add(t);

        SortTree();
    }





//    public void setDateTime(Date datetime) {
//        this.dateTime = datetime;
//    }
//
    public void SortTree(){

//        sort array list by due date
        newTasks.sort((o1,o2) -> o1.calendar.compareTo(o2.calendar));

       // Clear JTree of current Tasks
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)taskTreeModel.getRoot();
        root.removeAllChildren();
//        Pass new tasks into JTree
        for (Task task:newTasks){
            DefaultMutableTreeNode projectName = new DefaultMutableTreeNode("Project Name: "+task.projectName);
            DefaultMutableTreeNode parentDescription = new DefaultMutableTreeNode("Project Description: "+task.description);
            DefaultMutableTreeNode parentTaskName = new DefaultMutableTreeNode("Task Name: "+task.taskName
                    +" Task Due & Date: "+task.calendar+" -"+ +task.hour+" : "+ task.minutes +
                    " Task Importance : "+task.importance+" / 10");
            DefaultMutableTreeNode taskEstimatedDuration = new DefaultMutableTreeNode("Task Est. Duration: "+ task.estimatedDuration);
            DefaultMutableTreeNode subTask1 = new DefaultMutableTreeNode("Sub Task 1: "+task.subTask1);
            DefaultMutableTreeNode subTask2 = new DefaultMutableTreeNode("Sub Task 2: "+task.subTask2);
            DefaultMutableTreeNode subTask3 = new DefaultMutableTreeNode("Sub Task 3: "+task.subTask3);
            DefaultMutableTreeNode subTask4 = new DefaultMutableTreeNode("Sub Task 4: "+task.subTask4);
            DefaultMutableTreeNode subTask5 = new DefaultMutableTreeNode("Sub Task 5: "+task.subTask5);
            DefaultMutableTreeNode importance = new DefaultMutableTreeNode("Task Importance : "+task.importance+" / 10");



            root.add(projectName);
            projectName.add(parentDescription);
            projectName.add(parentTaskName);
            parentTaskName.add(taskEstimatedDuration);
            parentTaskName.add(subTask1);

            if(!task.subTask2.isEmpty()){parentTaskName.add(subTask2);}
            if(!task.subTask3.isEmpty()){parentTaskName.add(subTask3);}
            if(!task.subTask4.isEmpty()){parentTaskName.add(subTask4);}
            if(!task.subTask5.isEmpty()){parentTaskName.add(subTask5);}
            //        fire node to take up new Jtree tasks in order
            taskTreeModel.fireTreeNodeAdded(projectName);
        }


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
