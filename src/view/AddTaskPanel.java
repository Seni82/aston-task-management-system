package view;
import model.Model;
import model.Task;
import model.TaskRepository;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author ganiyuisola
 * @version 20/10/2020
 */
public class AddTaskPanel extends AbstractCommonComponents {

    static final int FIELD_START = 100;
    public static final int MIN_WIDTH = 430;
    public static final int MIN_HEIGHT = 300;

    private List<FormField> formFields;

    public AddTaskPanel(String addTaskPanelTitle, Model model, int x, int y, int width, int height, Color color,
                        Boolean createBorder, int boundsHeight, TaskTreePanel taskTreePanel, TaskRepository repository, DateFormat date, JFrame Frame) {
        super(addTaskPanelTitle, model, x, y, width, height, color, createBorder, boundsHeight);
        this.model = model;

        formFields = Arrays.asList(
                new TextFormField("Project Name:", true, color, (task, value)-> task.setName(value), (task) -> task.getName()),
                new TextFormField("Description", true, color, (task, value)-> task.setDescription(value), (task) -> task.getDescription()),
                new TextFormField("Sub Task 1:", true, color, (task, value)-> task.addSubtask(value), (task) -> task.getSubTaskOrEmpty(0)),
                new TextFormField("Sub Task 2:", false, color, (task, value)-> task.addSubtask(value), (task) -> task.getSubTaskOrEmpty(1)),
                new TextFormField("Sub Task 3:", false, color, (task, value)-> task.addSubtask(value), (task) -> task.getSubTaskOrEmpty(2)),
                new TextFormField("Sub Task 4:", false, color, (task, value)-> task.addSubtask(value), (task) -> task.getSubTaskOrEmpty(3)),
                new TextFormField("Sub Task 5:", false, color, (task, value)-> task.addSubtask(value), (task) -> task.getSubTaskOrEmpty(4)),
                new ImportanceTaskFormField("Importance",true, color, model),
                new DueDateFormField(color, date),
                new TextFormField("Est. Duration", true, color, (task, value)-> task.setEstimatedDuration(value), (task) -> task.getEstimatedDuration())
        );


        //Project Name and field
        //createJLabel(projectName, "Project Name:",5 , 20, FIELD_START - 2, 15, color);
        //createJTextField(projectNameEntry, FIELD_START , 18, 3*(this.getWidth()-120)/4, 20);

        int fieldY = 20;
        for (FormField formField : formFields) {
            fieldY = formField.addControls(this, fieldY);
            fieldY += 5;
        }


        //create buttons

        JButton addTaskButton = createJButton(null, "Add Task", this.getWidth() / 4 - 50, height - 42, 100, 40, true, Color.blue, true);
        JButton addUpdateButton = createJButton(null, "Update Task", this.getWidth() / 2 - 50, height - 42, 100, 40, false, Color.blue, true);
        JButton addClearButton = createJButton(null, "Clear Field", 3 * this.getWidth() / 4 - 50, height - 42, 100, 40, false, Color.blue, true);

        //AddTaskButton



        addTaskButton.addActionListener((ActionEvent event) -> {
            for (FormField formControl : formFields) {
                if (!formControl.doValidation(this)) {
                    return;
                }
            }

            Task task = new Task();
            for (FormField formControl : formFields) {
                formControl.putIntoModel(task);
            }
            repository.add(task);

            taskTreePanel.addTreeNode(task.createTree());
        });

    }

    @Override
    protected void taskTree(DefaultMutableTreeNode node) {

    }

    public void showTask(Task task) {
        for (FormField formField : formFields) {
            formField.loadFromModel(task);
        }
    }
}
