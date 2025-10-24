package com.bytecode.awt;

import java.awt.*;
import java.awt.event.*;


public class TextAreaExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT TextArea Example");

        // Create a TextArea
        TextArea textArea = new TextArea();
        textArea.setBounds(50, 50, 300, 100);

        // Create a button
        Button button = new Button("Show Text");
        button.setBounds(150, 170, 100, 30);

        // Create output label
        Label outputLabel = new Label();
        outputLabel.setBounds(50, 220, 300, 30);

        // Add components to frame
        frame.add(textArea);
        frame.add(button);
        frame.add(outputLabel);

        // Set frame size and layout
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        
        // Button click event
        button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = textArea.getText();
	             outputLabel.setText("You wrote: " + text);
			}
		});
 
        
    }
}
