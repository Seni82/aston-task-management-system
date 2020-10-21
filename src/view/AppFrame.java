package view;
import model.Model;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

public class AppFrame extends JFrame {

    private final int minimumWidth = 954;
    private final int minimumHeight = 1000;
    private int height=800;
    private int width=800;
    private BasicArrowButton eastFacingArrowButtonToMoveSelectedItemForUpdate;
    private TaskTreePanel task_tree_panel;
    private AddTaskPanel add_task_panel;
    private CommencedTasksPanel comenced_task_panel;
    private BasicArrowButton eastFacingArrowForCompletedTasks;


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
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setMinimumSize(new Dimension(minimumWidth, minimumHeight));
        System.out.println(screenSize.width - 838);
        System.out.println(screenSize.height - 120);
        this.setMaximumSize(new Dimension(screenSize.width - 838, screenSize.height - 120));

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
        task_tree_panel  = new TaskTreePanel("TASK MANAGEMENT TREE",0,2,model,rightColumnStart-10,
                height-250,Color.black, false, 15);
        task_tree_panel.setLocation(5, 5);
        task_tree_panel.setFocusable(false);
        pane.add(task_tree_panel);

        add_task_panel = new AddTaskPanel("ADD TASK",model, 0, 2, this.width-300,
                height-250, Color.blue, true, 15);
        add_task_panel.setLocation(450,5);
        add_task_panel.setFocusable(false);
        pane.add(add_task_panel);

        comenced_task_panel = new CommencedTasksPanel("COMMENCED TASKS",0,1,model, rightColumnStart-10,
                height-387,Color.blue, true,17);
        comenced_task_panel.setLocation(5,560);
        comenced_task_panel.setFocusable(false);
        pane.add(comenced_task_panel);

        eastFacingArrowButtonToMoveSelectedItemForUpdate = new BasicArrowButton(BasicArrowButton.EAST);
        eastFacingArrowButtonToMoveSelectedItemForUpdate.setBounds(406,200,30,40);
        eastFacingArrowButtonToMoveSelectedItemForUpdate.setBackground(Color.CYAN);
        this.add(eastFacingArrowButtonToMoveSelectedItemForUpdate, BorderLayout.EAST);


        JLabel labelNameMoveTaskInformationLabel = new JLabel("Move task.");
        labelNameMoveTaskInformationLabel.setBounds(395, 250, 50, 15);
        labelNameMoveTaskInformationLabel.setBackground(Color.RED);
        labelNameMoveTaskInformationLabel.setForeground(Color.RED);
        this.add(labelNameMoveTaskInformationLabel);


        eastFacingArrowForCompletedTasks = new BasicArrowButton(BasicArrowButton.EAST);
        eastFacingArrowForCompletedTasks.setBounds(400,700, 30, 40);
        eastFacingArrowForCompletedTasks.setBackground(Color.CYAN);
        this.add(eastFacingArrowForCompletedTasks, BorderLayout.EAST);


        JLabel moveCompletedTaskLabel = new JLabel("Move task.");
        moveCompletedTaskLabel.setBounds(400, 750, 50, 15);
        moveCompletedTaskLabel.setBackground(Color.GREEN);
        moveCompletedTaskLabel.setForeground(Color.GREEN);
        this.add(moveCompletedTaskLabel);
    }

}
