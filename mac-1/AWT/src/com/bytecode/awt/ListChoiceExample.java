package com.bytecode.awt;

import java.awt.*;
import java.awt.event.*;

public class ListChoiceExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT List and Choice Example");

        // List component
        List list = new List(4, true); // 4 visible rows, allow multiple selection
        list.setBounds(50, 50, 100, 80);
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // Choice component
        Choice choice = new Choice();
        choice.setBounds(200, 50, 100, 30);
        choice.add("Male");
        choice.add("Female");
        choice.add("Other");

        // Button to show selections
        Button button = new Button("Submit");
        button.setBounds(150, 150, 80, 30);

        // Output label
        Label output = new Label();
        output.setBounds(50, 200, 300, 30);

        frame.add(list);
        frame.add(choice);
        frame.add(button);
        frame.add(output);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        // Button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedLanguages = String.join(", ", list.getSelectedItems());
                String selectedGender = choice.getSelectedItem();
                output.setText("Languages: " + selectedLanguages + ", Gender: " + selectedGender);
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

