import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame {
    private JLabel petLabel, petImageLabel;
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private ButtonGroup petGroup;
    private ImageIcon birdIcon, catIcon, dogIcon, rabbitIcon, pigIcon;

    public RadioButtonDemo() {
        // Set the title of the frame
        setTitle("RadioButtonDemo");

        // Set the layout manager
        setLayout(new FlowLayout());

        // Load images
        birdIcon = new ImageIcon("images/bird.jpg");
        catIcon = new ImageIcon("images/cat.jpg");
        dogIcon = new ImageIcon("images/dog.jpg");
        rabbitIcon = new ImageIcon("images/rabbit.jpg");
        pigIcon = new ImageIcon("images/pig.jpg");

        // Initialize the label to display the selected pet name
        petLabel = new JLabel("Selected Pet: Bird");

        // Initialize the label to display the selected pet image
        petImageLabel = new JLabel(birdIcon);

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

        // Add action listeners to update the label and image when a radio button is selected
        ActionListener petSelectionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JRadioButton selectedButton = (JRadioButton) e.getSource();
                String selectedPet = selectedButton.getText();
                petLabel.setText("Selected Pet: " + selectedPet);

                // Update the image label based on the selected pet
                switch (selectedPet) {
                    case "Bird":
                        petImageLabel.setIcon(birdIcon);
                        break;
                    case "Cat":
                        petImageLabel.setIcon(catIcon);
                        break;
                    case "Dog":
                        petImageLabel.setIcon(dogIcon);
                        break;
                    case "Rabbit":
                        petImageLabel.setIcon(rabbitIcon);
                        break;
                    case "Pig":
                        petImageLabel.setIcon(pigIcon);
                        break;
                }
            }
        };

        // Add action listeners to each radio button
        birdButton.addActionListener(petSelectionListener);
        catButton.addActionListener(petSelectionListener);
        dogButton.addActionListener(petSelectionListener);
        rabbitButton.addActionListener(petSelectionListener);
        pigButton.addActionListener(petSelectionListener);

        // Add the radio buttons, label, and image label to the frame
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);
        add(petLabel);
        add(petImageLabel);

        // Set the default close operation and size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the application window
        new RadioButtonDemo();
    }
}
