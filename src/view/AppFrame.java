package view;
import model.Model;
import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    private final int minimumWidth = 954;
    private final int minimumHeight = 990;
    private int height=800;
    private int width=800;
    private TaskTreePanel task_tree_panel;
    private AddTaskPanel add_task_panel;


    public AppFrame(Model model) throws HeadlessException{
        super("Task Management System.");
        setDefaultBehaviour();
        initFields(model);
        this.setVisible(true);
    }


    /**
     * This is used to set the jframe size, closing default behaviour and position on screen
     */
    private void setDefaultBehaviour(){
        getContentPane().setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setMinimumSize(new Dimension(minimumWidth, minimumHeight));
        System.out.println(screenSize.width - 838);
        System.out.println(screenSize.height - 50);
        this.setMaximumSize(new Dimension(screenSize.width - 838, screenSize.height - 50));

        if (height > screenSize.height) {
            height = screenSize.height;
        }
        if (width > screenSize.width) {
            width = screenSize.width;
        }
        this.setLocation((screenSize.width ) / 5,
                (screenSize.height) / 30);
        this.setSize(width, height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
    }

    /**
     * This method is to add panels onto the frame.
     */

    private void initFields(Model model){
        Container pane = this.getContentPane();
        final int rightColumnWidth = Math.max(Math.max(AddTaskPanel.MIN_WIDTH,
                TaskTreePanel.MIN_WIDTH), Math.max(CommencedTasksPanel.MIN_WIDTH,
                CompletedTasksPanel.MIN_WIDTH));

        final  int rightColumnStart = this.width - rightColumnWidth - 5;
        task_tree_panel = new TaskTreePanel("TASK MANAGEMENT TREE", model ,rightColumnStart-10, height-250, Color.black);
        task_tree_panel.setLocation(5, 5);
        task_tree_panel.setFocusable(false);
        pane.add(task_tree_panel);

        add_task_panel = new AddTaskPanel("ADD TASK", model, this.width-300, height-250, Color.blue);
        add_task_panel.setLocation(450,5);
        add_task_panel.setFocusable(false);
        pane.add(add_task_panel);
    }

}
