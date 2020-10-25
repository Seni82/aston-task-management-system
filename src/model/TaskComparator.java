package model;

import java.util.Comparator;

public class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        int importance1 = o1.importance;
        int importance2 = o2.importance;
        if (importance1-importance2 < 0) {
            return 1;
        }
        else if (importance1-importance2 == 0 ){
            return 0;
        }
        else{
            return -1;
        }
    }
}