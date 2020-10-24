package view;
import model.AddTaskModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilCalendarModel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Calendar;


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
    private JLabel description;
    private JTextField descriptionEntry;
    private static String projectNameValue;
    private static String projectDescriptionValue;
    private JButton addTaskButton;
    private JButton clearTaskButton;
    private JButton taskUpdateButton;
    private JLabel subTask1;
    private JTextField subTask1NameEntry;
    private JLabel subTask2;
    private JTextField subTask2NameEntry;
    private JLabel subTask3;
    private JTextField subTask3NameEntry;
    private JLabel subTask4;
    private JTextField subTask4NameEntry;
    private JTextField subTask5NameEntry;
    private JLabel subTask5;
    private JLabel taskDueDate;
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
    private JDatePanelImpl datePanel;
    JDatePickerImpl datePicker;

    private static String taskNameValue;
    private static String subTask1Value;
    private static String subTask2Value;
    private static String subTask3Value;
    private static String subTask4Value;
    private static String subTask5Value;
    private static Calendar date;
    private static int hourValue;
    private static int minutesValue;
    private static int selectedImportanceNumberValue;
    private static String taskDurationValue;
    private AddTaskModel model;



    //Need AddTaskData model here to use to call the addTask after the event
    public AddTaskPanel(String addTaskPanelTitle, int x, int y, int width, int height, Color color, Boolean createBorder, int boundsHeight, AddTaskModel model) {
        super(addTaskPanelTitle, x, y, width, height, color, createBorder, boundsHeight);
        this.model = model;

        //Project Name and field
        createJLabel(projectName, "Project Name:", 5, 20, FIELD_START - 2, 15, color);
        projectNameEntry = new JTextField();
        projectNameEntry.setBounds(FIELD_START, 18, 3 * (this.getWidth() - 150) / 4, 20);
        this.add(projectNameEntry);


        //Description and field name.
        createJLabel(description, "Description:", 5, 45, FIELD_START - 2, 15, color);
        descriptionEntry = new JTextField();
        descriptionEntry.setBounds(FIELD_START, 43, this.getWidth() - 150, 20);
        this.add(descriptionEntry);

        addTaskButton = new JButton("Add Task");
        addTaskButton.setBounds(this.getWidth()/4-50, height-42, 100, 40);
        addTaskButton.setEnabled(true);
        addTaskButton.setBackground(Color.BLUE);
        addTaskButton.setForeground(Color.BLUE);
        addTaskButton.addActionListener(this::addTaskEvent);
        this.add(addTaskButton);

        taskUpdateButton = new JButton("Update");
        taskUpdateButton.setBounds(this.getWidth()/2-50, height-42, 100, 40);
        taskUpdateButton.setEnabled(false);
        taskUpdateButton.setBackground(Color.BLUE);
        taskUpdateButton.setForeground(Color.BLUE);
        this.add(taskUpdateButton);


        clearTaskButton = new JButton("Clear Field");
        clearTaskButton.setBounds(3*this.getWidth()/4-50, height-42, 100,40);
        clearTaskButton.setEnabled(false);
        clearTaskButton.setBackground(Color.BLUE);
        clearTaskButton.setForeground(Color.BLUE);
        this.add(clearTaskButton);


        //Task Name Label and field name
        createJLabel(taskName, "Task Name",5 , 70, FIELD_START - 2, 15, color);
        taskNameEntry = new JTextField();
        taskNameEntry.setBounds(FIELD_START , 68, 3*(this.getWidth()-150)/4, 20);
        this.add(taskNameEntry);
       
        //sub-task 1 (Needs to be made mandatory)
        createJLabel(subTask1, "Sub Task 1:",5, 95, FIELD_START - 2, 15, color);
        subTask1NameEntry = new JTextField();
        subTask1NameEntry.setBounds(FIELD_START , 93, 3*(this.getWidth()-150)/4, 20);
        this.add(subTask1NameEntry);

        //sub-task 2 (optional)
        createJLabel(subTask2, "Sub Task 2:",5 , 120, FIELD_START - 2, 15, color);
        subTask2NameEntry = new JTextField();
        subTask2NameEntry.setBounds(FIELD_START , 118, 3*(this.getWidth()-150)/4, 20);
        this.add(subTask2NameEntry);


        //sub-task 3 (optional)
        createJLabel(subTask3, "Sub Task 3:",5 , 145, FIELD_START - 2, 15, color);
        subTask3NameEntry = new JTextField();
        subTask3NameEntry.setBounds(FIELD_START , 143, 3*(this.getWidth()-150)/4, 20);
        this.add(subTask3NameEntry);


        //sub-task 4 (optional)
        createJLabel(subTask4, "Sub Task 4:",5 , 170, FIELD_START - 2, 15, color);
        subTask4NameEntry = new JTextField();
        subTask4NameEntry.setBounds(FIELD_START , 168, 3*(this.getWidth()-150)/4, 20);
        this.add(subTask4NameEntry);



        //sub-task 5 (optional)
        createJLabel(subTask5, "Sub Task 5:",5 , 195, FIELD_START - 2, 15, color);
        subTask5NameEntry = new JTextField();
        subTask5NameEntry.setBounds(FIELD_START , 193, 3*(this.getWidth()-150)/4, 20);
        this.add(subTask5NameEntry);

        //Task due date field
        dateModel = new UtilCalendarModel();
        datePanel = new JDatePanelImpl(dateModel);
        datePicker = new JDatePickerImpl(datePanel);
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
        importanceDropDownComponent = new JComboBox<>(AddTaskModel.IMPORTANCE_MODEL);
        importanceDropDownComponent.setBounds(FIELD_START, 255, (this.getWidth()-120)/3, 20);
        this.add(importanceDropDownComponent);

        createJLabel(lowAndMediumPriorityRangeDescription, "[0 - 3 : LOW]        " +
                        "[4 - 6 : MEDIUM]",
                110+(this.getWidth()-120)/3, 253, 2*(this.getWidth()-120)/3, 15, color);

        createJLabel(highAndHighestPriotityRangeDescription, "[7 - 9 : HIGH]       " +
                        "[10 : HIGHEST]",
                110+(this.getWidth()-120)/3, 268, 2*(this.getWidth()-120)/3, 15, color);


        //Estimated Duration and field name.
        createJLabel(estimatedTaskDuration, "Est. Duration:",5, 288, FIELD_START-2, 15, color);
        estimatedTaskDurationField = new JTextField();
        estimatedTaskDurationField.setBounds(FIELD_START, 290, (this.getWidth()-220)/2, 20);
        this.add(estimatedTaskDurationField);
    }


    private void addTaskEvent(ActionEvent actionEvent) {
        projectNameValue = projectNameEntry.getText();
        projectDescriptionValue = descriptionEntry.getText();
        taskNameValue = taskNameEntry.getText();
        subTask1Value = subTask1NameEntry.getText();
        subTask2Value = subTask2NameEntry.getText();
        subTask3Value = subTask3NameEntry.getText();
        subTask4Value = subTask4NameEntry.getText();
        subTask5Value = subTask5NameEntry.getText();


        date = dateModel.getValue();
        hourValue = (Integer)this.hour.getValue();
        minutesValue = (Integer)this.minutes.getValue();
        selectedImportanceNumberValue = (Integer)importanceDropDownComponent.getSelectedItem();
        taskDurationValue = estimatedTaskDurationField.getText();


        model.addTasks(projectNameValue,projectDescriptionValue,taskNameValue,
                subTask1Value, subTask2Value, subTask3Value, subTask4Value,
                subTask5Value, date, hourValue,
                minutesValue, selectedImportanceNumberValue, taskDurationValue);

         clearField();
    }


    private void clearField()
    {
        projectNameEntry.setText(null);
        descriptionEntry.setText(null);
        taskNameEntry.setText(null);
        subTask1NameEntry.setText(null);
        subTask2NameEntry.setText(null);
        subTask3NameEntry.setText(null);
        subTask4NameEntry.setText(null);
        subTask5NameEntry.setText(null);
        datePicker.getJFormattedTextField().setText(null);
        importanceDropDownComponent.setSelectedItem(0);
        estimatedTaskDurationField.setText(null);
    }


 }



