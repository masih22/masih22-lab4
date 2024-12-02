import javax.swing.*;
import java.awt.*;

public class EnigmaGUI {
    public static void main(String args[]) {
        //create and show new EnigmaFrame
        EnigmaFrame frame = new EnigmaFrame();
        //set close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set title and setVisibile to true
        frame.setTitle("Enigma GUI");
        frame.setVisible(true);
    }
}