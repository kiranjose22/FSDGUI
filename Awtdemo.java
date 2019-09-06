import java.awt.*;

class Awtdemo {
	Awtdemo() {
		Frame f;
		MenuBar mb;
		Menu m1,m2,m3,m4,m5;
		
		f=new Frame("AWT DEMO");
		mb= new MenuBar();
		m1 = new Menu("File");
		m2 = new Menu("Edit");
		m3 = new Menu("Format");
		m4 = new Menu("View");
		m5 = new Menu("Help");

		f.setSize(500,500);
		f.setVisible(true);
		f.setMenuBar(mb);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
	}


public static void main(String [] args) {
	Awtdemo demo = new Awtdemo();
}

}	