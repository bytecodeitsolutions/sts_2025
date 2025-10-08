package com.bytecode.swing;

import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create Frame
        Frame frame = new Frame("FlowLayout Example");

        // Set FlowLayout for the frame
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); 
        // CENTER alignment, 20px horizontal gap, 20px vertical gap

        // Create Buttons
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");

        // Add buttons to frame
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);

        // Set frame size and make it visible
        frame.setSize(400, 200);
        frame.setVisible(true);

        // Window closing event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });
    }
}

