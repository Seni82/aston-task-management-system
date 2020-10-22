package view;
import model.Model;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

public class AppFrame extends JFrame {

    private final int minimumWidth = AddTaskPanel.MIN_WIDTH+TaskTreePanel.MIN_WIDTH+5;
    private final int minimumHeight = Math.max(AddTaskPanel.MIN_HEIGHT,TaskTreePanel.MIN_HEIGHT);
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int height = 3*screenSize.height/4;
    private int width=3*screenSize.width/4;
    private BasicArrowButton eastFacingArrowButtonToMoveSelectedItemForUpdate;
    private TaskTreePanel task_tree_panel;
    private AddTaskPanel add_task_panel;
    private CommencedTasksPanel comenced_task_panel;
    private BasicArrowButton eastFacingArrowForCompletedTasks;
    private CompletedTasksPanel completed_task_panel;
    private JLabel completeTaskLabel;


    public AppFrame(Model model) throws HeadlessException{
        super("TASK MANAGEMENT SYSTEM.");
        setDefaultBehaviour();
        initFields(model);
        this.setVisible(true);
    }


    /**
     * This is used to set the jframe size, closing default behaviour and position on screen
     */
    private void setDefaultBehaviour(){
        getContentPane().setLayout(null);
        //     this.setMinimumSize(new Dimension(minimumWidth, minimumHeight));

        //     this.setMaximumSize(new Dimension(screenSize.width - 1, screenSize.height - 1));

        //     if (height > screenSize.height) {
        //         height = screenSize.height;
        //     }
        //     if (width > screenSize.width) {
        //         width = screenSize.width;
        //     }
        this.setLocation((screenSize.width ) / 8,
                (screenSize.height) / 8);
        this.setSize(width, height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
    }

    /**
     * This method is to add panels onto the frame.
     */
    private void initFields(Model model){
        Container pane = this.getContentPane();
        final int rightColumnWidth = this.getWidth()/2;

        final  int rightColumnStart = this.width - rightColumnWidth - 5;
        task_tree_panel  = new TaskTreePanel("TASK MANAGEMENT TREE",0,2,model,rightColumnStart-100,
                ((2*height)/3)-30,Color.black, false, 15);
        task_tree_panel.setLocation(5, 5);
        task_tree_panel.setFocusable(false);
        pane.add(task_tree_panel);

        add_task_panel = new AddTaskPanel("ADD TASK",model, 0, 2, rightColumnWidth,
                ((2*height)/3)-30, Color.blue, false, 15);
        add_task_panel.setLocation(rightColumnStart,5);
        add_task_panel.setFocusable(false);
        pane.add(add_task_panel);

        comenced_task_panel = new CommencedTasksPanel("COMMENCED TASKS",0,1,model, rightColumnStart-100,
                (height/3)-10,Color.blue, false,17);
        comenced_task_panel.setLocation(5,height-(height/3)-20);
        comenced_task_panel.setFocusable(false);
        pane.add(comenced_task_panel);


        completed_task_panel = new CompletedTasksPanel("COMPLETED TASKS",0,1,model, rightColumnWidth,
                (height/3)-10,Color.black, false,17);
        completed_task_panel.setLocation(rightColumnStart,2*height/3-20);
        completed_task_panel.setFocusable(false);
        pane.add(completed_task_panel);



        eastFacingArrowButtonToMoveSelectedItemForUpdate = new BasicArrowButton(BasicArrowButton.EAST);
        eastFacingArrowButtonToMoveSelectedItemForUpdate.setBounds(task_tree_panel.getWidth()+(rightColumnStart-task_tree_panel.getWidth())/2-15
                ,height/3-30,30,40);
        eastFacingArrowButtonToMoveSelectedItemForUpdate.setBackground(Color.CYAN);
        eastFacingArrowButtonToMoveSelectedItemForUpdate.setEnabled(false);
        this.add(eastFacingArrowButtonToMoveSelectedItemForUpdate, BorderLayout.EAST);


        JLabel labelNameMoveTaskInformationLabel = new JLabel("Move task");
        labelNameMoveTaskInformationLabel.setBounds(task_tree_panel.getWidth()+(rightColumnStart-task_tree_panel.getWidth())/2-35,
                height/3+15, 100, 15);
        labelNameMoveTaskInformationLabel.setBackground(Color.RED);
        labelNameMoveTaskInformationLabel.setForeground(Color.RED);
        this.add(labelNameMoveTaskInformationLabel);


        completeTaskLabel = new JLabel("Complete");
        completeTaskLabel.setBounds(task_tree_panel.getWidth()+(rightColumnStart-task_tree_panel.getWidth())/2-30,
                (5*height/6)+15, 100, 15);
        completeTaskLabel.setBackground(Color.RED);
        completeTaskLabel.setForeground(Color.RED);
        this.add(completeTaskLabel);


        eastFacingArrowForCompletedTasks = new BasicArrowButton(BasicArrowButton.EAST);
        eastFacingArrowForCompletedTasks.setBounds(task_tree_panel.getWidth()+(rightColumnStart-task_tree_panel.getWidth())/2-15,
                (5*height/6)-30, 30, 40);
        eastFacingArrowForCompletedTasks.setBackground(Color.CYAN);
        eastFacingArrowForCompletedTasks.setEnabled(false);
        this.add(eastFacingArrowForCompletedTasks, BorderLayout.EAST);



    }
}
