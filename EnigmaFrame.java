import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnigmaFrame extends JFrame {
    //all required variables I will need
    //JComboBox for selecting rotor numbers 
    private JComboBox<Integer> inRotor, outRotor, midRotor;
    //JTextField for selecting start of Rotors
    private JTextField startPosition;
    //JTextArea for providing input to and output from Enigma
    private JTextArea input, output;
    //JButton for selecting encrypt or decrypt
    private JButton encrypt, decrypt;
    //JLabel for including other text references, such as “Inner” or “Middle”
    private JLabel inRotorLabel, outRotorLabel, midRotorLabel, positionLabel, inputLabel, outputLabel;

}