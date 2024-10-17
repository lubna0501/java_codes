// Import the necessary packages
import java.applet.Applet;
import java.awt.Graphics;

// Simple applet class that extends Applet
public class SimpleApplet extends Applet {

    // The paint method is used to display output
    public void paint(Graphics g) {
        // Display the message "Hello, this is applet"
        g.drawString("Hello, this is applet", 20, 20);
    }

    /*
     To run this applet, use the following HTML code:
C:\Users\lubna\IdeaProjects\myfirstpractice\src\main\java\A\ClassA.java
     <applet code="SimpleApplet.class" width="300" height="300">
     </applet> echo "

     */
}
