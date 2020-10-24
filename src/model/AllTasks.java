package model;

import java.util.ArrayList;

public class AllTasks {
    public static ArrayList<TaskModel> tasks = new ArrayList<TaskModel>();
    private static int idCounter = 0;

    public static int getNextId(){
        return idCounter++;
    }

    public static Boolean deleteTask(int id){
        for (int i = 0; i < AllTasks.tasks.size(); i++){
            if(AllTasks.tasks.get(i).getId() == id){
                AllTasks.tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public static Boolean deleteSubTask(int projectId, int subTaskId){
        for (int i = 0; i < AllTasks.tasks.size(); i++){
            if(AllTasks.tasks.get(i).getId() == projectId){
                AllTasks.tasks.get(i).deleteSubTask(subTaskId);
                return true;
            }
        }
        return false;
    }
}
