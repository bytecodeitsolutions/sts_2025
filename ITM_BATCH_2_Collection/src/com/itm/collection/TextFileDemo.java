package com.itm.collection;
import java.io.*;

// Simple POJO
class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class TextFileDemo {
    public static void main(String[] args) {
        Student s1 = new Student(103, "Raju");

        // ---------- Write data in text format ----------
        try (FileWriter fw = new FileWriter("student2.txt")) {
            fw.write(s1.toString());
            System.out.println("Data written to file: " + s1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ---------- Read data back ----------
        try (BufferedReader br = new BufferedReader(new FileReader("student1.txt"))) {
            String line = br.readLine();
            System.out.println("Data read from file: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
