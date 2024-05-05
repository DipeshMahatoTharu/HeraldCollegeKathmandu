import javax.swing.*;
import java.awt.*;

public class Task2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.RED);
        JLabel northLabel = new JLabel("North");
        northPanel.add(northLabel);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.GREEN);
        JLabel southLabel = new JLabel("South");
        southPanel.add(southLabel);

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.BLUE);
        JLabel eastLabel = new JLabel("East");
        eastPanel.add(eastLabel);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.YELLOW);
        JLabel westLabel = new JLabel("West");
        westPanel.add(westLabel);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.ORANGE);
        JLabel centerLabel = new JLabel("Center");
        centerPanel.add(centerLabel);

        frame.setLayout(new BorderLayout());

        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
