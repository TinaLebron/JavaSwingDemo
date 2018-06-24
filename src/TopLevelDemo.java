import javax.swing.*;
import java.awt.*;

public class TopLevelDemo {

    /* TopLevelDemo.java requires no other files. */

        /**
         * Create the GUI and show it.  For thread safety,
         * this method should be invoked from the
         * event-dispatching thread.
         */
        private static void createAndShowGUI() {
            //Create and set up the window.
            JFrame frame = new JFrame("TopLevelDemo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Create the menu bar.  Make it have a green background.
            JMenuBar greenMenuBar = new JMenuBar();
            greenMenuBar.setOpaque(true);
            greenMenuBar.setBackground(new Color(154, 165, 127));
            greenMenuBar.setPreferredSize(new Dimension(200, 20));

            //Create a yellow label to put in the content pane.
            JLabel yellowLabel = new JLabel();
            yellowLabel.setOpaque(true);
            yellowLabel.setBackground(new Color(248, 213, 131));
            yellowLabel.setPreferredSize(new Dimension(200, 180));

            //Set the menu bar and add the label to the content pane.
            frame.setJMenuBar(greenMenuBar);
            frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);

            //Display the window.
            frame.pack();
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            //Schedule a job for the event-dispatching thread:
            //creating and showing this application's GUI.
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
        }
    }

