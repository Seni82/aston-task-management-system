package model;

import java.util.Calendar;
import java.util.Date;

public class Task {

    public String projectName;
    public String description;
    public String taskName;
    public String subTask1;
    public String subTask2;
    public String subTask3;
    public String subTask4;
    public String subTask5;
    public int importance;
    public String date;
    public int hour;
    public int minutes;
    public String estimatedDuration;
    private Date dateTime;

    public boolean completed = false;
    public boolean commenced = false;


    public Task(String projectName, String description, int importance, int hour, int minutes, String taskName, String date,
                String subTask1, String subTask2,
                String subTask3, String subTask4, String subTask5, String estimatedDuration) {
        this.subTask1 = subTask1;
        this.projectName = projectName;
        this.description = description;
        this.taskName = taskName;
        this.importance = importance;
        this.subTask2 = subTask2;
        this.subTask3 = subTask3;
        this.subTask4 = subTask4;
        this.subTask5 = subTask5;
        this.date = date;
        this.hour = hour;
        this.minutes = minutes;
        this.estimatedDuration = estimatedDuration;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public boolean removeSubTask(int subtaskNum) {
        switch (subtaskNum) {
            case 1:
                subTask1 = "";

                if (!subTask2.isEmpty()) {
                    subTask1 = subTask2;
                    subTask2 = "";
                    return false;
                }
                if (!subTask3.isEmpty()) {
                    subTask1 = subTask3;
                    subTask3 = "";
                    return false;
                }
                if (!subTask4.isEmpty()) {
                    subTask1 = subTask4;
                    subTask4 = "";
                    return false;
                }
                if (!subTask5.isEmpty()) {
                    subTask1 = subTask5;
                    subTask5 = "";
                    return false;
                }
                return true;
            case 2:
                subTask2 = "";
                return false;
            case 3:
                subTask3 = "";
                return false;
            case 4:
                subTask4 = "";
                return false;
            case 5:
                subTask5 = "";
                return false;
        }

        return false;
    }
}



