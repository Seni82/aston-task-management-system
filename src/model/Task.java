package model;

import java.time.LocalDateTime;
import java.time.ZoneId;
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
    public final Date date;
    public final int hour;
    public final int minutes;
    public int estimatedDuration;
    private Date dateTime;


    public Task(String projectName, String description, int importance, int hour, int minutes, String taskName, Date date,
                String subTask1, String subTask2,
                String subTask3, String subTask4, String subTask5, int estimatedDuration) {
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


    public Date getLatestStartDate(){

        //convert to local date type because we cannot add or subtract days from current type
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        //remove the estimated duration from due date to get the latest start date for the task
        localDateTime = localDateTime.minusDays(estimatedDuration);

        //convert localdatetime back to a date

        Date latestStartDate = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        return latestStartDate;
    }
    public Date getDate() {
        return date;
    }

    public int getImportance() {
        return -importance;
    }
}



