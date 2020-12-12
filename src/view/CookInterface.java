package view;

import controller.CookController;

import javax.swing.*;

public class CookInterface extends JFrame {
    CookController controller;

    public CookInterface(CookController controller) {
        this.controller = controller;
    }
}
