package view;

import model.AddTaskModel;

import java.awt.*;

public class CompletedTasksPanel extends AbstractCommonComponents{

    public static final int MIN_WIDTH = 480;
    public static final int MIN_HEIGHT = 200;


    public CompletedTasksPanel(String completedTaskPanelTitle, int x, int y, int width, int height, Color color, Boolean createBorder, int boundsHeight, AddTaskModel model){
        super(completedTaskPanelTitle,x,y,width, height,color,createBorder,boundsHeight);
    }
}
