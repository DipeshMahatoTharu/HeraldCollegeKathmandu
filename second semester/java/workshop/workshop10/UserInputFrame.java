import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class UserInputFrame extends JFrame implements ActionListener {
    private JTextField firstNameField, lastNameField, addressField, contactNumberField, semesterField;

    public UserInputFrame() {
        setTitle("User Information Input");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.setBackground(new Color(128, 0, 128));

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setForeground(Color.BLUE);
        firstNameField = new JTextField();
        panel.add(firstNameLabel);
        panel.add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setForeground(Color.BLUE);
        lastNameField = new JTextField();
        panel.add(lastNameLabel);
        panel.add(lastNameField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setForeground(Color.BLUE);
        addressField = new JTextField();
        panel.add(addressLabel);
        panel.add(addressField);

        JLabel contactNumberLabel = new JLabel("Contact Number:");
        contactNumberLabel.setForeground(Color.BLUE);
        contactNumberField = new JTextField();
        panel.add(contactNumberLabel);
        panel.add(contactNumberField);

        JLabel semesterLabel = new JLabel("Semester:");
        semesterLabel.setForeground(Color.BLUE);
        semesterField = new JTextField();
        panel.add(semesterLabel);
        panel.add(semesterField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Panel for the submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(Color.BLUE);
        submitButton.setForeground(Color.WHITE);
        submitButton.addActionListener(this);
        buttonPanel.add(submitButton);

        getContentPane().setBackground(new Color(128, 0, 128));
        add(panel, BorderLayout.CENTER); // Adding input panel to the center
        add(buttonPanel, BorderLayout.SOUTH); // Adding button panel to the bottom
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String address = addressField.getText();
        String contactNumber = contactNumberField.getText();
        String semester = semesterField.getText();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("user_info.csv", true));
            writer.write(firstName + "," + lastName + "," + address + "," + contactNumber + "," + semester);
            writer.newLine();
            writer.close();
            JOptionPane.showMessageDialog(this, "Save!");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while saving information!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UserInputFrame();
            }
        });
    }
}
