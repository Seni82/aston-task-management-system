package view;

import javax.swing.tree.DefaultMutableTreeNode;

public class SubTaskTreeNode extends DefaultMutableTreeNode {
    private int projectId;
    private int id;

    public SubTaskTreeNode(int id, int projectId, String title) {
        super(title);
        this.id = id;
        this.projectId = projectId;
    }

    public int getProjectId() {
        return projectId;
    }
    public int getId() {
        return id;
    }

}
