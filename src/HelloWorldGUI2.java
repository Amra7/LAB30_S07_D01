import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *  Create and show a window that displays the message "Hello World",
 *  with an "OK" button.  The program ends when the user clicks the button.
 *  The GUI is constructed in the main() routine, which is not the best
 *  way to do things.  This program is a first example of using GUI components.
 */
public class HelloWorldGUI2 {

    private static class HelloWorldDisplay extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString( "Hello World!", 20, 30 );
        }
    }

    private static class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);  // bezuslovno zavrsava program
        }
    }

    public static void main(String[] args) {

        HelloWorldDisplay displayPanel = new HelloWorldDisplay();
        JButton okButton = new JButton("OK");          // kreiramo dugme
        ButtonHandler listener = new ButtonHandler();  // ako ovo iskuljucimo kikanje na dugme nece nam zaustaviti program, ButinHanadler privatna klasa
        okButton.addActionListener(listener);          // actionListener nam govori da se desila  neka akcja

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(displayPanel, BorderLayout.CENTER);
        content.add(okButton, BorderLayout.SOUTH);

        JFrame window = new JFrame("GUI Test");
        window.setContentPane(content);
        window.setSize(500,300);
        window.setLocation(100,100);
        window.setVisible(true);                       // kada postavimo setVidsible na 'true' sve ovo sto smo uradili se pokaze na ekranu
        window.setTitle("Amrin program");
        window.setContentPane(content);

    }

}