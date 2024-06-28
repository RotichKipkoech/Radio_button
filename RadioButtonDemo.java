import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame {
    private JLabel petLabel;
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private ButtonGroup petGroup;

    public RadioButtonDemo() {
        // Set the title of the frame
        setTitle("RadioButtonDemo");

        // Set the layout manager
        setLayout(new FlowLayout());

        // Initialize the label to display the selected pet
        petLabel = new JLabel("Selected Pet: Bird");

        // Initialize radio buttons for each pet
        birdButton = new JRadioButton("Bird", true);
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Group the radio buttons so only one can be selected at a time
        petGroup = new ButtonGroup();
        petGroup.add(birdButton);
        petGroup.add(catButton);
        petGroup.add(dogButton);
        petGroup.add(rabbitButton);
        petGroup.add(pigButton);

        // Add action listeners to update the label when a radio button is selected
        ActionListener petSelectionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JRadioButton selectedButton = (JRadioButton) e.getSource();
                petLabel.setText("Selected Pet: " + selectedButton.getText());
            }
        };

        birdButton.addActionListener(petSelectionListener);
        catButton.addActionListener(petSelectionListener);
        dogButton.addActionListener(petSelectionListener);
        rabbitButton.addActionListener(petSelectionListener);
        pigButton.addActionListener(petSelectionListener);

        // Add the radio buttons and label to the frame
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);
        add(petLabel);

        // Set the default close operation and size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the application window
        new RadioButtonDemo();
    }
}
