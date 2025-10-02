import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel Ventana;
    private JTextField txtX;
    private JTextField txtY;
    private JButton btnvec1;
    private JButton btnvec2;
    private JLabel lblMag;
    private JLabel lblsum;
    private JLabel lblmul;
    private JButton btnmag;
    private JButton btnsum;
    private JButton btnmul;

    public vector vector1;
    public vector vector2;

    //crear un constructor por defecto
    public Ventana (){

        btnvec1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vector1 = new vector(Double.parseDouble(txtX.getText()), Double.parseDouble(txtY.getText()));
            }
        });
        btnvec2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vector2 = new vector(Double.parseDouble(txtX.getText()), Double.parseDouble(txtY.getText()));
            }
        });
        btnmag.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMag.setText(String.valueOf(vector1.magnitud()));
            }
        });

        btnsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblsum.setText(vector1.suma(vector2).toString());
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
