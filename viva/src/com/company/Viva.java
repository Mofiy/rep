package com.company;

import java.awt.*;
import java.applet.Applet;

/*
<applet code="Viva" width=300 height=50>
</applet>
*/

public class Viva extends Applet implements Runnable {

    String msg = "A simple moving banner!";
    Thread t = null;
    Boolean stopFlag;



    public void init() {
        setSize(300, 50);
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    public void start(){
        t = new Thread();
        stopFlag = false;
        t.start();
    }


    public void run(){
        while (true){
            try {
                repaint();
                Thread.sleep(250);
                if (stopFlag)
                    break;
            }catch (InterruptedException e){}
        }
    }

    public void stop(){
        stopFlag=true;
        t = null;
    }

    public void paint(Graphics g){
        char ch;

        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;

        g.drawString(msg, 10, 30);
        showStatus(msg);

    }

}
