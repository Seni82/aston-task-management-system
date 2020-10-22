package view;
import model.Model;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author ganiyuisola
 * @version 20/10/2020
 */
public class AddTaskPanel extends AbstractCommonComponents {

    static final int FIELD_START = 100;
    public static final int MIN_WIDTH = 430;
    public static final int MIN_HEIGHT = 300;
    private final JLabel projectName;
    private final JTextField projectNameEntry;
    private final JLabel taskName;
    private final JTextField taskNameEntry;
    private final JLabel subTask1;
    private final JTextField subTask1NameEntry;
    private final JLabel subTask2;
    private final JTextField subTask2NameEntry;
    private final JLabel subTask3;
    private final JTextField subTask3NameEntry;
    private final JLabel description;
    private final JTextField descriptionEntry;
    private final JLabel subTask4;
    private final JTextField subTask4NameEntry;
    private final JTextField subTask5NameEntry;
    private final JLabel subTask5;
    private final JLabel taskDueDate;
    private final JTextField taskDueDateEntry;
    private final JLabel taskDueTime;
    private final JTextField taskDueTimeEntry;
    private final JComboBox importanceDropDownComponent;
    private final JLabel lowAndMediumPriorityRangeDescription;
    private final JLabel taskImportance;
    private final JLabel highAndHighestPriotityRangeDescription;
    private final JLabel estimatedTaskDuration;
    private final JTextField estimatedTaskDurationField;
    /*=======
    public static final int MIN_WIDTH = 390;
    public static final int MIN_HEIGHT = 540;
    private JLabel projectName;
    private JTextField projectNameEntry;
    private JLabel taskName;
    private JTextField taskNameEntry;
    private JLabel subTask1;
    private JTextField subTask1NameEntry;
    private JLabel subTask2;
    private JTextField subTask2NameEntry;
    private JLabel subTask3;
    private JTextField subTask3NameEntry;
    private JLabel description;
    private JTextField descriptionEntry;
    private JLabel subTask4;
    private JTextField subTask4NameEntry;
    private JTextField subTask5NameEntry;
    private JLabel subTask5;
    private JLabel taskDueDate;
    private JTextField taskDueDateEntry;
    private JLabel taskDueTime;
    private JTextField taskDueTimeEntry;
    private JComboBox importanceDropDownComponent;
    private JLabel lowAndMediumPriorityRangeDescription;
    private JLabel taskImportance;
    private JLabel highAndHighestPriotityRangeDescription;
    private JLabel estimatedTaskDuration;
    private JTextField estimatedTaskDurationField;
>>>>>>> src/view/AddTaskPanel.java
   */
    private JButton clearTaskButton;
    private JButton taskUpdateButton;
    private Model model;
    private JButton addTaskButton;

    public AddTaskPanel(String addTaskPanelTitle, Model model,int x, int y, int width, int height, Color color, Boolean createBorder, int boundsHeight) {
        super(addTaskPanelTitle, model, x, y, width,height, color, createBorder, boundsHeight);
        this.model = model;

//<<<<<<< src/view/AddTaskPanel.java
        /*
        projectName = new JLabel("Project Name:");
        projectName.setBounds(5, 20, FIELD_START - 2, 15);
        projectName.setFocusable(false);
        projectName.setForeground(Color.blue);
        this.add(projectName);
        projectNameEntry = new JTextField();
        projectNameEntry.setBounds(FIELD_START, 18, this.getWidth()-120, 20);
        this.add(projectNameEntry);
        */

        /*
        description = new JLabel("Description:");
        description.setBounds(5, 40, FIELD_START - 2, 15);
        description.setFocusable(false);
        description.setForeground(Color.blue);
        this.add(description);
        descriptionEntry = new JTextField();
        descriptionEntry.setBounds(FIELD_START, 38, this.getWidth()-120, 20);
        this.add(descriptionEntry);
        */

        /*
        taskName = new JLabel("Task Name:");
        taskName.setBounds(5, 60, FIELD_START - 2, 15);
        taskName.setFocusable(false);
        taskName.setForeground(Color.blue);
        this.add(taskName);
        taskNameEntry = new JTextField();
        taskNameEntry.setBounds(FIELD_START, 58, this.getWidth()-120, 20);
        this.add(taskNameEntry);
        */
         
         /*

        //sub-task 1 (Needs to be made mandatory)
        subTask1 = new JLabel("Sub Task 1:");
        subTask1.setBounds(5, 80, FIELD_START - 2, 15);
        subTask1.setFocusable(false);
        subTask1.setForeground(Color.blue);
        this.add(subTask1);
        subTask1NameEntry = new JTextField();
        subTask1NameEntry.setBounds(FIELD_START, 78, this.getWidth()-120, 20);
        this.add(subTask1NameEntry);

        //sub-task 2 (optional)
        subTask2 = new JLabel("Sub Task 2:");
        subTask2.setBounds(5, 100, FIELD_START - 2, 15);
        subTask2.setFocusable(false);
        subTask2.setForeground(Color.blue);
        this.add(subTask2);
        subTask2NameEntry = new JTextField();
        subTask2NameEntry.setBounds(FIELD_START, 98, this.getWidth()-120, 20);
        this.add(subTask2NameEntry);

        //sub-task 3 (optional)
        subTask3 = new JLabel("Sub Task 3:");
        subTask3.setBounds(5, 120, FIELD_START - 2, 15);
        subTask3.setFocusable(false);
        subTask3.setForeground(Color.blue);
        this.add(subTask3);
        subTask3NameEntry = new JTextField();
        subTask3NameEntry.setBounds(FIELD_START, 118, this.getWidth()-120, 20);
        this.add(subTask3NameEntry);

        //sub-task 4 (optional)
        subTask4 = new JLabel("Sub Task 4:");
        subTask4.setBounds(5, 140, FIELD_START - 2, 15);
        subTask4.setFocusable(false);
        subTask4.setForeground(Color.blue);
        this.add(subTask4);
        subTask4NameEntry = new JTextField();
        subTask4NameEntry.setBounds(FIELD_START, 138, this.getWidth()-120, 20);
        this.add(subTask4NameEntry);

        //sub-task 5 (optional)
        subTask5 = new JLabel("Sub Task 5:");
        subTask5.setBounds(5, 160, FIELD_START - 2, 15);
        subTask5.setFocusable(false);
        subTask5.setForeground(Color.blue);
        this.add(subTask5);
        subTask5NameEntry = new JTextField();
        subTask5NameEntry.setBounds(FIELD_START, 158, this.getWidth()-120, 20);
        this.add(subTask5NameEntry);


        taskDueDate = new JLabel("Task Due Date:");
        taskDueDate.setBounds(5, 180, FIELD_START - 2, 15);
        taskDueDate.setFocusable(false);
        taskDueDate.setForeground(Color.blue);
        this.add(taskDueDate);
        taskDueDateEntry = new JTextField();
        taskDueDateEntry.setBounds(FIELD_START, 178, (this.getWidth()-220)/2, 20);
        this.add(taskDueDateEntry);


        taskDueTime = new JLabel("Task Due Time:");
        taskDueTime.setBounds(100+(this.getWidth()-220)/2, 180, FIELD_START - 2, 15);
        taskDueTime.setFocusable(false);
        taskDueTime.setForeground(Color.blue);
        this.add(taskDueTime);

        taskDueTimeEntry = new JTextField();
        taskDueTimeEntry.setBounds(200+(this.getWidth()-220)/2, 178, (this.getWidth()-220)/2, 20);
        this.add(taskDueTimeEntry);
        

        taskImportance = new JLabel("Importance:");
        taskImportance.setBounds(5, 210, FIELD_START - 2, 15);
        taskImportance.setFocusable(false);
        taskImportance.setForeground(Color.blue);
        this.add(taskImportance);
        importanceDropDownComponent = new JComboBox(new Model().improtanceIndex);
        importanceDropDownComponent.setBounds(FIELD_START, 208, (this.getWidth()-120)/3, 20);
        this.add(importanceDropDownComponent);
        
        lowAndMediumPriorityRangeDescription =
                new JLabel("[0 - 3 : LOW]   [4 - 6 : MEDIUM]");
        lowAndMediumPriorityRangeDescription.setBounds(100+(this.getWidth()-120)/3, 200, 2*(this.getWidth()-120)/3, 15);
        lowAndMediumPriorityRangeDescription.setFocusable(false);
        lowAndMediumPriorityRangeDescription.setForeground(Color.blue);
        this.add(lowAndMediumPriorityRangeDescription);
        

        highAndHighestPriotityRangeDescription =
                new JLabel("[7 - 9 : HIGH]     [10 : HIGHEST]");
        highAndHighestPriotityRangeDescription.setBounds(100+(this.getWidth()-120)/3, 220, 2*(this.getWidth()-120)/3, 15);
        highAndHighestPriotityRangeDescription.setFocusable(false);
        highAndHighestPriotityRangeDescription.setForeground(Color.blue);
        this.add(highAndHighestPriotityRangeDescription);
       
        
        estimatedTaskDuration = new JLabel("Est. Duration:");
        estimatedTaskDuration.setBounds(5, 240, FIELD_START-2, 15);
        estimatedTaskDuration.setFocusable(false);
        estimatedTaskDuration.setForeground(Color.blue);
        this.add(estimatedTaskDuration);


        
        
        
        estimatedTaskDurationField = new JTextField();
        estimatedTaskDurationField.setBounds(FIELD_START, 238, this.getWidth()-120, 20);
        this.add(estimatedTaskDurationField);


        */
        //create buttons
        //createJButton(addTaskButton,"Add Task", this.getWidth()/4-50, height-42, 100, 40, true,Color.blue,true);
        //createJButton(taskUpdateButton,"Update Task",this.getWidth()/2-50, height-42, 100,40, false, Color.blue, true);
        //createJButton(clearTaskButton,"Clear Field",3*this.getWidth()/4-50, height-42, 100,40, false, Color.blue, true);




//============
        //Project Name and field
        createJLabel(projectName, "Project Name:",5 , 20, FIELD_START - 2, 15, color);
        createJTextField(projectNameEntry, FIELD_START , 18, this.getWidth()-120, 20);


        //Description and field name.
        createJLabel(description, "Description:",5 , 40, FIELD_START - 2, 15, color);
        createJTextField(descriptionEntry, FIELD_START , 38, this.getWidth()-120, 20);
      
        //Task Name Label and field name
        createJLabel(taskName, "Task Name",5 , 60, FIELD_START - 2, 15, color);
        createJTextField(taskNameEntry, FIELD_START , 58, this.getWidth()-120, 20);

       
        //sub-task 1 (Needs to be made mandatory)
        createJLabel(subTask1, "Sub Task 1:",5, 80, FIELD_START - 2, 15, color);
        createJTextField(subTask1NameEntry, FIELD_START , 78, this.getWidth()-120, 20);

        //sub-task 2 (optional)
        createJLabel(subTask2, "Sub Task 2:",5 , 100, FIELD_START - 2, 15, color);
        createJTextField(subTask2NameEntry, FIELD_START , 98, this.getWidth()-120, 20);

        //sub-task 3 (optional)
        createJLabel(subTask3, "Sub Task 3:",5 , 120, FIELD_START - 2, 15, color);
        createJTextField(subTask3NameEntry, FIELD_START , 118, this.getWidth()-120, 20);

        //sub-task 4 (optional)
        createJLabel(subTask4, "Sub Task 4:",5 , 140, FIELD_START - 2, 15, color);
        createJTextField(subTask4NameEntry, FIELD_START , 138, this.getWidth()-120, 20);

        //sub-task 5 (optional)
        createJLabel(subTask5, "Sub Task 5:",5 , 160, FIELD_START - 2, 15, color);
        createJTextField(subTask5NameEntry, FIELD_START , 158, this.getWidth()-120, 20);


        //Task due date field
        createJLabel(taskDueDate, "Task Due Date:",5, 180, FIELD_START - 2, 15, color);
        createJTextField(taskDueDateEntry, FIELD_START, 178, (this.getWidth()-220)/2, 20);

        //Task due time field
        createJLabel(taskDueTime, "Task Due Time:",100+(this.getWidth()-220)/2, 180, FIELD_START - 2, 15, color);
        createJTextField(taskDueTimeEntry, 200+(this.getWidth()-220)/2, 178, (this.getWidth()-220)/2, 20);

        //Importance field and combo box.
        createJLabel(taskImportance, "Importance:",5, 210, FIELD_START - 2, 15, color);
        importanceDropDownComponent = new JComboBox(model.getImportanceModel());
        importanceDropDownComponent.setBounds(FIELD_START, 208, (this.getWidth()-120)/3, 20);
        this.add(importanceDropDownComponent);

        createJLabel(lowAndMediumPriorityRangeDescription, "[0 - 3 : LOW]        " +
                        "[4 - 6 : MEDIUM]",
                100+(this.getWidth()-120)/3, 200, 2*(this.getWidth()-120)/3, 15, color);

        createJLabel(highAndHighestPriotityRangeDescription, "[7 - 9 : HIGH]        " +
                        "[10 : HIGHEST]",
                100+(this.getWidth()-120)/3, 220, 2*(this.getWidth()-120)/3, 15, color);


        //Estimated Duration and field name.
        createJLabel(estimatedTaskDuration, "Est. Duration:",5, 240, FIELD_START-2, 15, color);
        createJTextField(estimatedTaskDurationField, FIELD_START, 238, this.getWidth()-120, 20);

        //create buttons
        createJButton(addTaskButton,"Add Task", this.getWidth()/4-50, height-42, 100, 40, true,Color.blue,true);
        createJButton(taskUpdateButton,"Update Task",this.getWidth()/2-50, height-42, 100,40, false, Color.blue, true);
        createJButton(clearTaskButton,"Clear Field",3*this.getWidth()/4-50, height-42, 100,40, false, Color.blue, true);
        
        //createJButton(addTaskButton,"Add Task", 40, 505, 130, 40, true,Color.blue,true);
        //createJButton(taskUpdateButton,"Update Task",190, 505, 130,40, false, Color.blue, true);
        //createJButton(clearTaskButton,"Clear Field",340, 505, 130,40, false, Color.blue, true);
        //>>>>>>> src/view/AddTaskPanel.java
    }
}


