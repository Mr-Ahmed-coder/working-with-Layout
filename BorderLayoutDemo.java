import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    JButton ButtonOne;
    JButton ButtonTwo;
    JButton ButtonThree;
    JButton ButtonFour;
/// /demonstrate gui using borderlayout in java sing
    public BorderLayoutDemo() {
        this.CreateBorderFrame();
    }

    public JFrame CreateBorderFrame(){

        JFrame borderFrame = new JFrame("BorderLayout Demo");
        borderFrame.setSize(600, 400);
        borderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderFrame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Application Title", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        borderFrame.add(titleLabel, BorderLayout.NORTH);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(3, 1, 5, 5)); // 3 rows, 1 column, spacing

        JButton btn1 = new JButton("Option 1");
        JButton btn2 = new JButton("Option 2");
        JButton btn3 = new JButton("Option 3");

        westPanel.add(btn1);
        westPanel.add(btn2);
        westPanel.add(btn3);

        borderFrame.add(westPanel, BorderLayout.WEST);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        borderFrame.add(scrollPane, BorderLayout.CENTER);

        JButton submitButton = new JButton("Submit");
        borderFrame.add(submitButton, BorderLayout.SOUTH);

        borderFrame.setVisible(true);
        return borderFrame;
    }
}
