package view;
import model.Model;
import net.sourceforge.jdatepicker.JDatePicker;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilCalendarModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


/**
 *
 * @author ganiyuisola
 * @version 20/10/2020
 */
public class AddTaskPanel extends AbstractCommonComponents {

    static final int FIELD_START = 100;
    public static final int MIN_WIDTH = 430;
    public static final int MIN_HEIGHT = 300;

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
    //private JTextField taskDueDateEntry;
    private JLabel taskDueTime;
    private JTextField taskDueTimeEntry;
    private JComboBox importanceDropDownComponent;
    JSpinner hour;
    JSpinner minutes;
    private JLabel lowAndMediumPriorityRangeDescription;
    private JLabel taskImportance;
    private JLabel highAndHighestPriotityRangeDescription;
    private JLabel estimatedTaskDuration;
    private JTextField estimatedTaskDurationField;
    private UtilCalendarModel dateModel;

    private JButton clearTaskButton;
    private JButton taskUpdateButton;
    private Model model;
    private JButton addTaskButton;

    public AddTaskPanel(String addTaskPanelTitle, Model model,int x, int y, int width, int height, Color color, Boolean createBorder, int boundsHeight) {
        super(addTaskPanelTitle, model, x, y, width,height, color, createBorder, boundsHeight);
        this.model = model;

        //Project Name and field
        createJLabel(projectName, "Project Name:",5 , 20, FIELD_START - 2, 15, color);
        createJTextField(projectNameEntry, FIELD_START , 18, 3*(this.getWidth()-150)/4, 20, false);


        //Description and field name.
        createJLabel(description, "Description:",5 , 45, FIELD_START - 2, 15, color);
        createJTextField(descriptionEntry, FIELD_START , 43, this.getWidth()-150, 20, false);
      
        //Task Name Label and field name
        createJLabel(taskName, "Task Name",5 , 70, FIELD_START - 2, 15, color);
        createJTextField(taskNameEntry, FIELD_START , 68, 3*(this.getWidth()-150)/4, 20, false);

       
        //sub-task 1 (Needs to be made mandatory)
        createJLabel(subTask1, "Sub Task 1:",5, 95, FIELD_START - 2, 15, color);
        createJTextField(subTask1NameEntry, FIELD_START , 93, 3*(this.getWidth()-150)/4, 20, false);

        //sub-task 2 (optional)
        createJLabel(subTask2, "Sub Task 2:",5 , 120, FIELD_START - 2, 15, color);
        createJTextField(subTask2NameEntry, FIELD_START , 118, 3*(this.getWidth()-150)/4, 20, false);

        //sub-task 3 (optional)
        createJLabel(subTask3, "Sub Task 3:",5 , 145, FIELD_START - 2, 15, color);
        createJTextField(subTask3NameEntry, FIELD_START , 143, 3*(this.getWidth()-150)/4, 20, false);

        //sub-task 4 (optional)
        createJLabel(subTask4, "Sub Task 4:",5 , 170, FIELD_START - 2, 15, color);
        createJTextField(subTask4NameEntry, FIELD_START , 168, 3*(this.getWidth()-150)/4, 20, false);

        //sub-task 5 (optional)
        createJLabel(subTask5, "Sub Task 5:",5 , 195, FIELD_START - 2, 15, color);
        createJTextField(subTask5NameEntry, FIELD_START , 193, 3*(this.getWidth()-150)/4, 20, false);


        //Task due date field
        dateModel = new UtilCalendarModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(dateModel);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
        datePicker.setBounds(FIELD_START, 218, (this.getWidth()-340)/2, 25);
        this.add(datePicker);
        createJLabel(taskDueDate, "Due Date:",5, 225, FIELD_START - 2, 15, color);

        //Task due time field
        createJLabel(taskDueTime, "Task Due Time:",80+(this.getWidth()-220)/2, 225, FIELD_START , 15, color);
        hour = new JSpinner(new SpinnerNumberModel(0, 0, 23, 1));
        hour.setBounds((this.getWidth()+135)/2,220,(this.getWidth()-590)/2, 25);
        this.add(hour);
        createJLabel(taskDueTime, ":",(this.getWidth()+220)/2, 220, 5, 25, color);
        minutes = new JSpinner(new SpinnerNumberModel(0, 0, 59, 1));
        minutes.setBounds((this.getWidth()+227)/2,220,(this.getWidth()-590)/2, 25);
        this.add(minutes);

        //Importance field and combo box.
        createJLabel(taskImportance, "Importance:",5, 255, FIELD_START - 2, 15, color);
        importanceDropDownComponent = new JComboBox<>(Model.IMPORTANCE_MODEL);
        importanceDropDownComponent.setBounds(FIELD_START, 253, (this.getWidth()-120)/3, 20);
        this.add(importanceDropDownComponent);

        createJLabel(lowAndMediumPriorityRangeDescription, "[0 - 3 : LOW]        " +
                        "[4 - 6 : MEDIUM]",
                110+(this.getWidth()-120)/3, 253, 2*(this.getWidth()-120)/3, 15, color);

        createJLabel(highAndHighestPriotityRangeDescription, "[7 - 9 : HIGH]       " +
                        "[10 : HIGHEST]",
                110+(this.getWidth()-120)/3, 268, 2*(this.getWidth()-120)/3, 15, color);


        //Estimated Duration and field name.
        createJLabel(estimatedTaskDuration, "Est. Duration:",5, 288, FIELD_START-2, 15, color);
        createJTextField(estimatedTaskDurationField, FIELD_START, 290, (this.getWidth()-220)/2, 20, false);

        //create buttons
        createJButton(addTaskButton,"Add Task", this.getWidth()/4-50, height-42, 100, 40, true,Color.blue,true);
        createJButton(taskUpdateButton,"Update Task",this.getWidth()/2-50, height-42, 100,40, false, Color.blue, true);
        createJButton(clearTaskButton,"Clear Field",3*this.getWidth()/4-50, height-42, 100,40, false, Color.blue, true);
    }


    private void addTaskToTaskTreePanel(ActionEvent e){
        String projectName = projectNameEntry.getText();
        String projectDescription = descriptionEntry.getText();
        //Region parent = (Region) regionEntry.getSelectedItem();
        //TemperatureScale defaultScale = (TemperatureScale) temperatureScaleEntry.getSelectedItem();
        //addRegionLocation(name, description, parent, defaultScale);
    }
}


