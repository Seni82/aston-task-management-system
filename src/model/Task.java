package model;

import javax.swing.tree.TreeNode;
import java.util.Enumeration;

public class Task {
    public final String projectName;
    public final int importance;

    public Task(String projectName, int importance) {
        this.projectName = projectName;
        this.importance = importance;
    }

//    @Override
//    public String toString() {
//        return "Task{" +
//                "projectName='" + projectName + '\'' +
//                ", importance=" + importance +
//                '}';
//    }


}
