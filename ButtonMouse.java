import java.awt.*;
import java.awt.event.*;

class ButtonMouse {
    ButtonMouse() {
        Frame f;

        f = new Frame("action");

        f.setSize(500, 500);

        f.setVisible(true);

        Button b1 = new Button("Click me!\n\n\n");

        f.setLayout(new GridLayout(2, 1));
        f.add(b1);
        b1.setSize(200, 200);
        b1.addActionListener(new ButtonClickMouseListener());
        b1.addMouseListener(new ButtonClickMouseListener());
        b1.addMouseMotionListener(new ButtonClickMouseListener());

    }

    class ButtonClickMouseListener implements ActionListener, MouseListener, MouseMotionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button Clicked");
        }

        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse Clicked");
        }

        public void mouseEntered(MouseEvent e) {
            System.out.println("Mouse Entered");
        }

        public void mouseExited(MouseEvent e) {
            System.out.println("Mouse Exited");
        }

        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse Pressed");
        }

        public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse Released");
        }

        public void mouseDragged(MouseEvent e) {
            System.out.println("Mouse drag");
        }

        public void mouseMoved(MouseEvent e) {

            System.out.println("Mouse moved");
        }

    }

    public static void main(String[] args) {
        ButtonMouse demo = new ButtonMouse();
    }

}