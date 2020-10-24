package model;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {

    private String name;
    private String description;
    private List<String> subTasks = new ArrayList<>();
    private int importance;
    private LocalDateTime dueDateTime;
    private String estimatedDuration;
    private boolean started;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addSubtask(String subTask) {
        if (subTask.trim().isEmpty()) {
            return;
        }

        subTasks.add(subTask);
    }

    public String getSubTaskOrEmpty(int index) {
        if (index >= subTasks.size()) {
            return "";
        }
        return subTasks.get(index);
    }

    public List<String> getSubTasks() {
        return subTasks;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public LocalDateTime getDueDateTime() {
        return dueDateTime;
    }

    public void setDueDateTime(LocalDateTime dueDateTime) {
        this.dueDateTime = dueDateTime;
    }

    public String getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(String estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }


    public MutableTreeNode createTree() {

        DefaultMutableTreeNode root = new DefaultMutableTreeNode(this);
        root.add(new DefaultMutableTreeNode(description));
        root.add(new DefaultMutableTreeNode("Importance: " + importance));
        root.add(new DefaultMutableTreeNode("Est. Duration: " + estimatedDuration));

        DefaultMutableTreeNode subTasksRoot = new DefaultMutableTreeNode("Sub Tasks");
        root.add(subTasksRoot);
        for (String subtask : subTasks) {
            subTasksRoot.add(new DefaultMutableTreeNode(subtask));
        }

        return root;
    }

    @Override
    public String toString() {
        String dueDateTimeStr = dueDateTime.toLocalDate().toString() + " " + dueDateTime.toLocalTime().toString();
        return name + " - " + dueDateTimeStr;
    }
}
