package view;

import model.AddTaskModel;

import java.awt.*;

public class CommencedTasksPanel extends AbstractCommonComponents{

    public static final int MIN_WIDTH = 400;
    public static final int MIN_HEIGHT = 200;

    public CommencedTasksPanel(String commencedTaskPanelTitle, int x, int y, int width, int height, Color color, Boolean createBorder, int boundsHeight, AddTaskModel model){
        super(commencedTaskPanelTitle,x,y,width, height,color,createBorder,boundsHeight);
    }

}
