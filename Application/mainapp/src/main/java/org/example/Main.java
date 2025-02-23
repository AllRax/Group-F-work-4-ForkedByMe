package org.example;

import Registration.Registration;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new Registration());
    }
}