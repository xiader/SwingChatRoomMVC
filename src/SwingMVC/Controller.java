package SwingMVC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener {

    private Mvc mvc = null;

    // Конструктор
    public Controller(Mvc mvc) {
        this.mvc = mvc;
    }



    // обрабатываем действия
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source==mvc.getView().SendButton) {
            JOptionPane.showMessageDialog(mvc, "Ссылка удалась");
        }
        else if(source==mvc.getView().QuitButton) {
            JOptionPane.showMessageDialog(mvc, "Выходим");
        }
        else System.out.println("ActionPerformed");
    }




}
