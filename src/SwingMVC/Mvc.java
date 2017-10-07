package SwingMVC;

import javax.swing.*;


public class Mvc extends JFrame {

    private Model model = null;
    private View view = null;
    private Controller controller = null;

    public Mvc() {
            controller = new Controller(this);
            model = new Model(this);
            view = new View(this);
            getContentPane().add(view);
    }



    public View getView() {
        return view;
    }

    public Controller getController() {
        return controller;
    }



    }
