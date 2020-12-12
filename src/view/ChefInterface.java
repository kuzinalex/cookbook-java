package view;

import controller.ChefController;

import javax.swing.*;

public class ChefInterface extends JFrame {
    ChefController controller;

    public ChefInterface(ChefController controller) {
        this.controller = controller;
    }
}
