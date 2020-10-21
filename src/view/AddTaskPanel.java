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
    private JButton clearTaskButton;
    private JButton taskUpdateButton;
    private Model model;
    private JButton addTaskButton;

    public AddTaskPanel(String addTaskPanelTitle, Model model,int x, int y, int width, int height, Color color, Boolean createBorder, int boundsHeight) {
        super(addTaskPanelTitle, model, x, y, width,height, color, createBorder, boundsHeight);
        this.model = model;

        //Project Name and field
        createJLabel(projectName, "Project Name:",5 , 30, FIELD_START - 2, 15, color);
        createJTextField(projectNameEntry, FIELD_START , 25, 300, 25);

        //Description and field name.
        createJLabel(description, "Description:",5 , 60, FIELD_START - 2, 15, color);
        createJTextField(descriptionEntry, FIELD_START , 55, 380, 25);

        //Task Name Label and field name
        createJLabel(taskName, "Task Name",5 , 90, FIELD_START - 2, 15, color);
        createJTextField(taskNameEntry, FIELD_START , 85, 300, 25);

        //sub-task 1 (Needs to be made mandatory)
        createJLabel(subTask1, "Sub Task 1:",5 , 120, FIELD_START - 2, 15, color);
        createJTextField(subTask1NameEntry, FIELD_START , 115, 300, 25);

        //sub-task 2 (optional)
        createJLabel(subTask2, "Sub Task 2:",5 , 150, FIELD_START - 2, 15, color);
        createJTextField(subTask2NameEntry, FIELD_START , 145, 300, 25);

        //sub-task 3 (optional)
        createJLabel(subTask3, "Sub Task 3:",5 , 180, FIELD_START - 2, 15, color);
        createJTextField(subTask3NameEntry, FIELD_START , 175, 300, 25);

        //sub-task 4 (optional)
        createJLabel(subTask4, "Sub Task 4:",5 , 210, FIELD_START - 2, 15, color);
        createJTextField(subTask4NameEntry, FIELD_START , 205, 300, 25);

        //sub-task 5 (optional)
        createJLabel(subTask5, "Sub Task 5:",5 , 240, FIELD_START - 2, 15, color);
        createJTextField(subTask5NameEntry, FIELD_START , 235, 300, 25);

        //Task due date field
        createJLabel(taskDueDate, "Task Due Date:",5 , 270, FIELD_START - 2, 15, color);
        createJTextField(taskDueDateEntry, FIELD_START , 265, 150, 25);

        //Task due time field
        createJLabel(taskDueTime, "Task Due Time:",260 , 270, FIELD_START - 2, 15, color);
        createJTextField(taskDueTimeEntry, 360 , 265, 100, 25);

        //Importance field and combo box.
        createJLabel(taskImportance, "Importance:",5 , 300, FIELD_START - 2, 15, color);
        importanceDropDownComponent = new JComboBox(new Model().importanceIndex);
        importanceDropDownComponent.setBounds(FIELD_START, 295, 100, 25);
        this.add(importanceDropDownComponent);

        createJLabel(lowAndMediumPriorityRangeDescription, "[0 - 3 : LOW]        " +
                        "[4 - 6 : MEDIUM]",
                220 , 300, FIELD_START + 200, 15, color);

        createJLabel(highAndHighestPriotityRangeDescription, "[7 - 9 : HIGH]        " +
                        "[10 : HIGHEST]",
                220 , 320, FIELD_START + 200, 15, color);


        //Estimated Duration and field name.
        createJLabel(estimatedTaskDuration, "Est. Duration:",5 , 370, FIELD_START - 2, 15, color);
        createJTextField(estimatedTaskDurationField, FIELD_START , 365, 150, 25);

        //create buttons
        createJButton(addTaskButton,"Add Task", 40, 505, 130, 40, true,Color.blue,true);
        createJButton(taskUpdateButton,"Update Task",190, 505, 130,40, false, Color.blue, true);
        createJButton(clearTaskButton,"Clear Field",340, 505, 130,40, false, Color.blue, true);
    }
}


