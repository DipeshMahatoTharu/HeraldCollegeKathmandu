import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderApp extends JFrame {
    private JTable table;

    public CSVReaderApp() {
        setTitle("CSV Reader");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);

        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);

        loadCSVData("C:\\java\\workshop\\workshop10\\user_info.csv");

        setVisible(true);
    }

    private void loadCSVData(String filename) {
        String line;
        DefaultTableModel model = new DefaultTableModel();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            if ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                model.setColumnIdentifiers(columns);
            }

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }

            table.setModel(model);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CSVReaderApp::new);
    }
}
