package view;

import javax.swing.tree.DefaultMutableTreeNode;

public class ProjectTreeNode extends DefaultMutableTreeNode {
    private int projectId;
    private int subTaskIndex;

    public ProjectTreeNode(int projectId, int subTaskIndex, String title) {
        super(title);
        this.projectId = projectId;
        this.subTaskIndex = subTaskIndex;
    }

    public int getProjectId() {
        return this.projectId;
    }
    public int getSubTaskIndex() {
        return this.subTaskIndex;
    }
}
