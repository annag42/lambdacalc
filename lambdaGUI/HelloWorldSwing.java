package lambdaGUI;

import javax.swing.*;        

public class HelloWorldSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
				frame.getContentPane().add(panel);

				//Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        panel.add(label);

        //Add the less-ubiquitous "compile" button.
        JButton compile = new JButton("compile!");
        panel.add(compile);

        //Add the somewhat un-ubiquitous "step" button.
        JButton step = new JButton("step!");
        panel.add(step);
        
        //Add the totally un-ubiquitous "compute" button.
        JButton compute = new JButton("compute!");
        panel.add(compute);       

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
