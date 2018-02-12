package com.company;

import javax.swing.*;

public class Objects {
    public static void main(String[] args) {
        //create our window
        JFrame window = new JFrame(); // window variable that holds JFrame objects, and we're creating a new JFrame to assign to our variable
        window.setTitle("A piece of shit"); // we're calling methods on our JFrame object to configure it
        window.setSize(800, 600);
        window.setVisible(true);

        JLabel label = new JLabel(); // label variable holds JLabel objects, and we're creating a new JLabel to assign to our variable
        label.setText("My label text"); // we're calling the setText method on our JLabel objects to set its text property

        window.add(label); // we're calling the add m() of our JFrame object to add our label to the window variable

        String s = "hi";

    }
}
