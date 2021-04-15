import javax.swing.*;

public class HelloWorld extends JFrame{
    private JLabel lblMensages;
    private JPanel panel1;

    public HelloWorld(){
        super("Hello World");

        setContentPane(panel1);
        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        new HelloWorld().setVisible(true);
    }

}
