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
        JFrame Borderframe = new JFrame("BorderLayout Demo");
        Borderframe.setSize(600, 400);
        Borderframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Borderframe.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Application Title", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        Borderframe.add(titleLabel, BorderLayout.NORTH);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(3, 1, 5, 5)); // 3 rows, 1 column, spacing

        JButton btn1 = new JButton("Option 1");
        JButton btn2 = new JButton("Option 2");
        JButton btn3 = new JButton("Option 3");

        westPanel.add(btn1);
        westPanel.add(btn2);
        westPanel.add(btn3);

        Borderframe.add(westPanel, BorderLayout.WEST);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        Borderframe.add(scrollPane, BorderLayout.CENTER);

        JButton submitButton = new JButton("Submit");
        Borderframe.add(submitButton, BorderLayout.SOUTH);

        Borderframe.setVisible(true);
        return Borderframe;
    }
}
