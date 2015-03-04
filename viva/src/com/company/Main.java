package com.company;

import java.awt.*;
import java.applet.Applet;
import java.awt.datatransfer.StringSelection;
/*
<applet code="Viva" width=300 height=50>
</applet>
*/

public class Viva extends Applet{
    String msg;



    @Override
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "inside init() ---"
    }



}
