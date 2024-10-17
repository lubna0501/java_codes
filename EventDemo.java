import javax.swing.*;
import java.awt.event.*;

public class EventDemo extends JFrame implements MouseMotionListener, KeyListener {

    private JLabel label;

    public EventDemo() {
        // Create the frame
        setTitle("Mouse and Keyboard Events Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Label to show event messages
        label = new JLabel();
        label.setBounds(50, 100, 300, 20);
        add(label);

        // Add listeners for mouse and keyboard
        addMouseMotionListener(this);
        addKeyListener(this);

        // Make the frame visible and focusable
        setFocusable(true);
        setVisible(true);
    }

    // MouseMotionListener methods
    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse moved to X: " + e.getX() + " Y: " + e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse dragged to X: " + e.getX() + " Y: " + e.getY());
    }

    // KeyListener methods
    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new EventDemo();
    }
}
