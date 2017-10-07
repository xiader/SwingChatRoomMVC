package SwingMVC;

import javax.swing.*;
import java.awt.*;

public class Model {

    private Mvc mvc = null;

    public Model(Mvc mvc) {
        this.mvc = mvc;

    }
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                Mvc frame = new Mvc();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Chat Client");
                frame.setSize(400, 200);
                //      frame.setLocationByPlatform(true);
                frame.setVisible(true);
            }
        });

    }
}
