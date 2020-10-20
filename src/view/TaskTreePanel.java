package view;
import model.Model;
import javax.swing.*;
import java.awt.*;
import java.util.stream.StreamSupport;


public class TaskTreePanel extends JPanel{

    public static final int MIN_WIDTH = 390;
    public static final int MIN_HEIGHT = 540;
    private final Model model;
    private final JLabel panelLabel;
    private final JTextField searchField;
    private final JButton searchButton;
    private final JScrollPane scrollPane;

    public TaskTreePanel(String taskPanelTitle, Model model, int width, int height, Color color) {
        this.model = model;
        this.setLayout(null);
        this.setSize(width, height);
        this.setBorder(BorderFactory.createLineBorder(color));

        panelLabel = new JLabel(taskPanelTitle, SwingConstants.CENTER);
        panelLabel.setBounds(0, 2, width, 15);
        panelLabel.setForeground(color);
        panelLabel.setFocusable(false);
        this.add(panelLabel);

        //Add a search field on the task lists.
        searchField = new JTextField("search task");
        searchField.setBounds(2, 20, 250, 30);
        this.add(searchField);

        //Add a search button next to search field.
        searchButton = new JButton("Search");
        //searchButton.setBackground();
        searchButton.setBounds(260, 18, 130, 33);
        this.add(searchButton);

        //Adding Tree with JTree.
        JTree taskTree = new JTree();
        taskTree.setRootVisible(false);
        scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getViewport().setView(taskTree);
        scrollPane.setBounds(5, 50, width - 10, height - 52);
        this.add(scrollPane);

    }
}
