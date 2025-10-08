package com.bytecode.awt;

import java.awt.*;
import java.awt.event.*;

public class TextFieldExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT TextField Example");

        // Create a label
        Label label = new Label("Enter your name:");

        // Set label position
        label.setBounds(50, 50, 120, 30);

        // Create a text field
        TextField textField = new TextField();

        // Set text field position and size
        textField.setBounds(180, 50, 150, 30);

        // Create a button
        Button button = new Button("Submit");
        button.setBounds(150, 100, 80, 30);

        // Create an output label
        Label outputLabel = new Label();
        outputLabel.setBounds(50, 150, 300, 30);

        // Add components to frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(outputLabel);

        // Set frame size and layout
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        // Button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                outputLabel.setText("Hello, " + name + "!");
            }
        });

        // Window closing event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });
    }
}

