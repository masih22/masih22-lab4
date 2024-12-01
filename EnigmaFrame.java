import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnigmaFrame extends JFrame {
    //all required variables I will need
    //JComboBox for selecting rotor numbers 
    private JComboBox<Integer> inRotor, outRotor, midRotor;
    //JTextField for selecting start of Rotors
    private JTextField initialPosition;
    //JTextArea for providing input to and output from Enigma
    private JTextArea input, output;
    //JButton for selecting encrypt or decrypt
    private JButton encrypt, decrypt;
    //JLabel for including other text references, such as “Inner” or “Middle”
    private JLabel inRotorLabel, outRotorLabel, midRotorLabel, positionLabel, inputLabel, outputLabel;

    public EnigmaFrame() {
        //set border layout 
        this.setLayout(new BorderLayout());
        //JPanel for our controls 
        JPanel settings = new JPanel(new FlowLayout());
        //Initializing rotors and their choices 1-5
        Integer[] choices = {1,2,3,4,5};
        inRotor = new JComboBox<>(choices);
        midRotor = new JComboBox<>(choices);
        outRotor = new JComboBox<>(choices);
        //initialize JTextfield
        initialPosition = new JTextField("EST", 3);
        //initialize JButtons
        encrypt = new JButton("Encrypt");
        decrypt = new JButton("Decrypt");
        //initialize JLabels
        inRotorLabel = new JLabel("Inner");
        midRotorLabel = new JLabel("Middle");
        outRotorLabel = new JLabel("Outer");
        positionLabel = new JLabel("Initial Positions");
        inputLabel = new JLabel("Input");
        outputLabel = new JLabel("Output");
        
    }
}