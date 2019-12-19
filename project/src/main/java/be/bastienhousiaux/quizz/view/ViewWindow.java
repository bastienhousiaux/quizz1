package be.bastienhousiaux.quizz.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ViewWindow extends JFrame {

    private JPanel panel;

    public ViewWindow(int width, int height) throws HeadlessException {
        super();
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.panel=new JPanel();
        this.setContentPane(panel);
    }

    public ViewButton createButton(String buttonText){
        ViewButton button=new ViewButton(buttonText);
        this.panel.add(button);
        return button;
    }

    public void createLabel(String labelText){
        JLabel label=new JLabel(labelText);
        this.panel.add(label);
    }

    public void createInput(){
        JTextField jtf=new JTextField("qsdsd");
        jtf.setFont(new Font("Arial", Font.BOLD, 14));
        jtf.setPreferredSize(new Dimension(150, 30));
        this.panel.add(jtf);
    }


}
