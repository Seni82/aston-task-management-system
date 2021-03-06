package view;

import model.Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class CommencedTasksPanel extends AbstractCommonComponents{

    public static final int MIN_WIDTH = 400;
    public static final int MIN_HEIGHT = 200;

    public CommencedTasksPanel(String commencedTaskPanelTitle,int x, int y, Model model, int width, int height, Color color, Boolean createBorder, int boundsHeight){
        super(commencedTaskPanelTitle,model,x,y,width, height,color,createBorder,boundsHeight);
    }

    @Override
    protected void taskTree(DefaultMutableTreeNode node) {

    }
}
