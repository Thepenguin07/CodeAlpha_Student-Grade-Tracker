import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Student_Grade_Tracker {
    public static void main(String args[]) {
        ArrayList<Double> sgrades = new ArrayList<>();
        ArrayList<String> snames = new ArrayList<>();
        JFrame frame = new JFrame("Student Grade Tracker");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField(15);
        JLabel gradeLabel = new JLabel("Student's Grade:");
        JTextField gradeField = new JTextField(15);
        
        inputPanel.add(nameLabel);   inputPanel.add(nameField);
        inputPanel.add(gradeLabel);  inputPanel.add(gradeField);
        
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        JButton addButton = new JButton("Add Student");
        JButton statsButton = new JButton("Calculate Stats");
        buttonPanel.add(addButton);
        buttonPanel.add(statsButton);
        JLabel statusLabel = new JLabel("Status: Ready to add students.");
        statusLabel.setForeground(Color.BLUE);
        statusLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel statsLabel = new JLabel("Stats: No data calculated yet.");
        statsLabel.setFont(new Font("Arial", Font.BOLD, 12));
        statsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        addButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String gradeText = gradeField.getText().trim();
            
            if (!name.isEmpty() && !gradeText.isEmpty()) {
                try {
                    double grade = Double.parseDouble(gradeText);
                    sgrades.add(grade);
                    snames.add(name);
                    statusLabel.setText("✓ Student '" + name + "' added successfully!");
                    statusLabel.setForeground(new Color(0, 128, 0)); 
                    nameField.setText("");
                    gradeField.setText("");
                } catch (NumberFormatException ex) {
                    statusLabel.setText("⚠ Error: Please enter a valid numeric grade.");
                    statusLabel.setForeground(Color.RED);
                }
            } else {
                statusLabel.setText("⚠ Error: Fields cannot be left blank.");
                statusLabel.setForeground(Color.RED);
            }
        });
        statsButton.addActionListener(e -> {
            if (sgrades.isEmpty()) {
                statsLabel.setText("Stats: No grades available to calculate.");
                return;
            }
            double avg = 0;
            for (double n : sgrades) {
                avg += n;
            }
            avg = avg / sgrades.size();
            double highest = Integer.MIN_VALUE;
            double lowest = Integer.MAX_VALUE;
            for (double n : sgrades) {
                highest = Math.max(highest, n);
                lowest = Math.min(lowest, n); 
            }
            statsLabel.setText(String.format("Average: %.2f  |  Highest: %.2f  |  Lowest: %.2f", avg, highest, lowest));
        });
        mainPanel.add(inputPanel);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(buttonPanel);
        mainPanel.add(Box.createVerticalStrut(15));
        mainPanel.add(statusLabel);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(statsLabel);
        frame.add(mainPanel);
        frame.pack(); 
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
