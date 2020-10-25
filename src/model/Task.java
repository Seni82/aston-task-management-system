package model;

import java.util.Calendar;
import java.util.Date;

public class Task {

    public final String projectName;
    public final String description;
    public final String taskName;
    public final String subTask1;
    public final String subTask2;
    public final String subTask3;
    public final String subTask4;
    public final String subTask5;
    public final int importance;
    public final Calendar calendar;
    public final int hour;
    public final int minutes;
    public String estimatedDuration;
    private Date dateTime;


    public Task(String projectName, String description, int importance, int hour, int minutes, String taskName, Calendar calendar,
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
        this.calendar = calendar;
        this.hour = hour;
        this.minutes = minutes;
        this.estimatedDuration = estimatedDuration;
    }

//    public <T> Comparable getDateTime() {
//        return null;
//    }
    public Date getDateTime() {
        return dateTime;
    }
}



