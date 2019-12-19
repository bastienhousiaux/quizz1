package be.bastienhousiaux.quizz.view;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class ViewButton extends JButton implements MouseListener {

    private List<ClickHandler> clickHandlers=new ArrayList<>();

    @FunctionalInterface
    public interface ClickHandler{
        void call();
    }

    public ViewButton(String text) {
        super(text);
        this.addMouseListener(this);
    }

    public void onMouseClick(ClickHandler clickHandler){
        this.clickHandlers.add(clickHandler);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.clickHandlers.forEach(ClickHandler::call);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
