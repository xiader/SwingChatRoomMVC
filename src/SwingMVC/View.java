package SwingMVC;

import javax.swing.*;
import java.awt.*;


public class View extends JPanel {

    public JButton SendButton     = null;
    public JButton QuitButton = null;



    private Mvc mvc = null;

    public View(Mvc mvc) {
        super();
        setLayout(new BorderLayout());
        this.mvc = mvc;

        SendButton    = new JButton("Send");

        QuitButton = new JButton("Quit");

        SendButton.addActionListener(mvc.getController());
        QuitButton.addActionListener(mvc.getController());

        add(SendButton, BorderLayout.WEST);
        add(QuitButton, BorderLayout.EAST);

    }
}
