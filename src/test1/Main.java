package test1;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {
    int next = 0;
    Font f;
    String msg;

    public Main() {
        f = new Font("Dialog", Font.PLAIN, 12);
        msg = "Dialog";
        setFont(f);

        addMouseListener(new MyMouseAdapter(this));
        addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g) {
        g.drawString(msg, 10, 60);
    }

    public static void main(String[] args) {
        Main appwin = new Main();

        appwin.setSize(new Dimension(200, 100));
        appwin.setTitle("Main");
        appwin.setVisible(true);
    }

}

class MyMouseAdapter extends MouseAdapter {
    Main sampleFonts;

    public MyMouseAdapter(Main sampleFonts) {
        this.sampleFonts = sampleFonts;
    }

    public void mousePressed (MouseEvent me) {
        sampleFonts.next++;

        switch (sampleFonts.next) {
            case 0 -> {
                sampleFonts.f = new Font("Dialog", Font.PLAIN, 12);
                sampleFonts.msg = "Dialog";
            }
            case 1 -> {
                sampleFonts.f = new Font("DialogInput", Font.PLAIN, 12);
                sampleFonts.msg = "Dialog";
            }
            case 2 -> {
                sampleFonts.f = new Font("SansSerif", Font.PLAIN, 12);
                sampleFonts.msg = "SansSerif";
            }
            case 3 -> {
                sampleFonts.f = new Font("Serif", Font.PLAIN, 12);
                sampleFonts.msg = "Serif";
            }
            case 4 -> {
                sampleFonts.f = new Font("Monospaced", Font.PLAIN, 12);
                sampleFonts.msg = "Monospaced";
            }
        }

        if(sampleFonts.next == 4) sampleFonts.next = -1;
        sampleFonts.setFont(sampleFonts.f);
        sampleFonts.repaint();
    }
}


