package view;

import controller.UserController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {
    private UserController controller;

    private JPanel componentPanel = new JPanel();
    private JButton CookModeButton= new JButton("Войти как повар");
    private JButton ChefModeButton= new JButton("Войти как шеф-повар");

    public UserInterface(UserController controller) {
        this.controller = controller;
        setLocation(400,200);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        componentPanel.add(CookModeButton);
        componentPanel.add(ChefModeButton);
        add(componentPanel);

        CookModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        ChefModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}
