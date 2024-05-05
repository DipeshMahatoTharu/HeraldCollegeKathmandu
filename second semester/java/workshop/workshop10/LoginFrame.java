import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 180);
        setLayout(new BorderLayout());

        JPanel welcomePanel = new JPanel();
        welcomePanel.setBackground(new Color(240, 240, 240));
        welcomePanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel welcomeLabel = new JLabel("Welcome to the Login Page");
        welcomePanel.add(welcomeLabel);

        add(welcomePanel, BorderLayout.NORTH);

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3, 2, 5, 5));

        JLabel usernameLabel = new JLabel("Username:");
        loginPanel.add(usernameLabel);
        usernameField = new JTextField(15);
        loginPanel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        loginPanel.add(passwordLabel);
        passwordField = new JPasswordField(15);
        loginPanel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginPanel.add(loginButton);

        add(loginPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("dipesh") && password.equals("pass")) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            System.out.println("Login successful: " + username);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Login failed for user: " + username);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginFrame::new);
    }
}
