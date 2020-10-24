package view;

import model.Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class CompletedTasksPanel extends AbstractCommonComponents{

    public static final int MIN_WIDTH = 480;
    public static final int MIN_HEIGHT = 200;


    public CompletedTasksPanel(String completedTaskPanelTitle, int x, int y, Model model, int width, int height, Color color, Boolean createBorder, int boundsHeight){
        super(completedTaskPanelTitle,model,x,y,width, height,color,createBorder,boundsHeight);
    }

    @Override
    protected void taskTree(DefaultMutableTreeNode node) {

    }
}
