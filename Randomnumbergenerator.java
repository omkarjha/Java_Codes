import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Randomnumbergenerator extends Frame {
    private Label titleLabel;
    private Button clickButton;
    private Button resetButton;
    private TextArea resultArea;

    public Randomnumbergenerator() {
        setTitle("Random Number Generator");
        setLayout(new BorderLayout());

        // Title Label
        titleLabel = new Label("Title");
        titleLabel.setAlignment(Label.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        // Result Area
        resultArea = new TextArea();
        resultArea.setEditable(false);
        resultArea.setBackground(Color.BLUE);
        add(resultArea, BorderLayout.CENTER);

        // Button Panel
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());

        // Click Button
        clickButton = new Button("Click here");
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateRandomNumber();
            }
        });
        buttonPanel.add(clickButton);

        // Reset Button
        resetButton = new Button("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetResultArea();
            }
        });
        buttonPanel.add(resetButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
    }

    private void generateRandomNumber() {
        int randomNumber = (int) (Math.random() * 100);
        resultArea.setText(String.valueOf(randomNumber));
    }

    private void resetResultArea() {
        resultArea.setText("");
    }

    public static void main(String[] args) {
        new Randomnumbergenerator();
    }
}
