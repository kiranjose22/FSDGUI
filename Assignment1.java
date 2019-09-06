import java.awt.*;
import java.awt.event.*;

class Assignment1 {
    Assignment1() {
        Frame f;

        f = new Frame("Technologies");
        Menu m1 = new Menu("Java");
        Menu m2 = new Menu("dotnet");
        Menu m3 = new Menu("android");
        Menu m4 = new Menu("iOS");

        MenuBar mb = new MenuBar();
        f.setMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);

        MenuItem m1mi1 = new MenuItem("Current courses");
        MenuItem m1mi2 = new MenuItem("Completed courses");
        MenuItem m1mi3 = new MenuItem("Marks");
        MenuItem m1mi4 = new MenuItem("Materials");
        MenuItem m1mi5 = new MenuItem("Trainer details");

        MenuItem m2mi1 = new MenuItem("Current courses");
        MenuItem m2mi2 = new MenuItem("Completed courses");
        MenuItem m2mi3 = new MenuItem("Marks");
        MenuItem m2mi4 = new MenuItem("Materials");
        MenuItem m2mi5 = new MenuItem("Trainer details");

        MenuItem m3mi1 = new MenuItem("Current courses");
        MenuItem m3mi2 = new MenuItem("Completed courses");
        MenuItem m3mi3 = new MenuItem("Marks");
        MenuItem m3mi4 = new MenuItem("Materials");
        MenuItem m3mi5 = new MenuItem("Trainer details");

        MenuItem m4mi1 = new MenuItem("Current courses");
        MenuItem m4mi2 = new MenuItem("Completed courses");
        MenuItem m4mi3 = new MenuItem("Marks");
        MenuItem m4mi4 = new MenuItem("Materials");
        MenuItem m4mi5 = new MenuItem("Trainer details");


        m1.add(m1mi1);
        m1.add(m1mi2);
        m1.addSeparator();
        m1.add(m1mi3);
        m1.add(m1mi4);
        m1.add(m1mi5);

        m2.add(m2mi1);
        m2.add(m2mi2);
        m2.addSeparator();
        m2.add(m2mi3);
        m2.add(m2mi4);
        m2.add(m2mi5);

        m3.add(m3mi1);
        m3.add(m3mi2);
        m3.addSeparator();
        m3.add(m3mi3);
        m3.add(m3mi4);
        m3.add(m3mi5);

        m4.add(m4mi1);
        m4.add(m4mi2);
        m4.addSeparator();
        m4.add(m4mi3);
        m4.add(m4mi4);
        m4.add(m4mi5);

        f.setSize(500, 500);

        f.setVisible(true);

        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        Button b4 = new Button("Button4");
        Button b5 = new Button("Button5");

        // f.setLayout(new GridLayout(2, 1));
        f.add(b1, BorderLayout.CENTER);
        f.add(b2, BorderLayout.EAST);
        f.add(b3, BorderLayout.NORTH);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.SOUTH);
        // b1.setSize(200, 200);
        b4.addActionListener(new ButtonClickMouseListener());
        b3.addMouseListener(new ButtonClickMouseListener());
        b5.addMouseListener(new ButtonClickMouseListener());
        b1.addMouseMotionListener(new ButtonClickMouseListener());
        b2.addMouseMotionListener(new ButtonClickMouseListener());

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
        Assignment1 demo = new Assignment1();
    }

}