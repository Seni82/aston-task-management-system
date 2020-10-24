
package model;

import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import java.util.ArrayList;
import java.util.Vector;

public class TaskTreeModel implements TreeModel {

    private AddTaskModel rootProjectName;

    public TaskTreeModel(){}

     private final ArrayList<TreeModelListener> treeModelListeners = new ArrayList<>();

    public TaskTreeModel(AddTaskModel rootProjectName) {
        this.rootProjectName = rootProjectName;
    }

    @Override
    public Object getRoot() {
        return rootProjectName;
    }

    @Override
    public Object getChild(Object parent, int index) {
        return ((TreeNode) parent).getChildAt(index);
    }

    @Override
    public int getChildCount(Object parent) {
        return ((TreeNode) parent).getChildCount();
    }

    @Override
    public boolean isLeaf(Object node) {
        return ((TreeNode) node).isLeaf();
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {

    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return ((TreeNode) parent).getIndex((TreeNode) child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        treeModelListeners.add(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        treeModelListeners.remove(l);
    }


    public void fireTreeNodeAdded(TreeNode addedRegion) {
        ArrayList<TreeNode> path = new ArrayList<>();
        path.add(addedRegion);
        for (TreeNode parent = addedRegion.getParent();
             parent != rootProjectName;
             parent = parent.getParent()) {
            path.add(1,parent);
        }
        final int[] indicies = {addedRegion.getParent().getIndex(addedRegion)};
        TreeModelEvent e = new TreeModelEvent(this, path.toArray(), indicies,
                new Object[] {addedRegion});
        for (TreeModelListener tml : treeModelListeners) {
            tml.treeStructureChanged(e);
        }
    }
}
