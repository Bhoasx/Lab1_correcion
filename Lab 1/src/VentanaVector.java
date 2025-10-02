import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaVector extends JFrame {

    private JButton btnvec1;
    private JButton btnvec2;
    private JButton btnmag;
    private JButton btnsum;
    private JButton btnmul;
    private JTextField txtX;
    private JTextField txtY;
    private JTextField txtmag;
    private JTextField txtsum;
    private JTextField txtmul;

    private Vect vec1;
    private Vect vec2;

    public VentanaVector() {
        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Campos de entrada
        txtX = new JTextField(10);
        txtY = new JTextField(10);
        panel.add(new JLabel("X:"));
        panel.add(txtX);
        panel.add(new JLabel("Y:"));
        panel.add(txtY);

        // Botones
        btnvec1 = new JButton("Vector1");
        btnvec2 = new JButton("Vector2");
        btnmag = new JButton("Magnitud");
        btnsum = new JButton("Suma");
        btnmul = new JButton("Multiplicacion");
        panel.add(btnvec1);
        panel.add(btnvec2);
        panel.add(btnmag);
        panel.add(btnsum);
        panel.add(btnmul);

        // Campos de resultado
        txtmag = new JTextField(15);
        txtsum = new JTextField(15);
        txtmul = new JTextField(15);
        txtmag.setEditable(false);
        txtsum.setEditable(false);
        txtmul.setEditable(false);
        panel.add(new JLabel("Magnitud:"));
        panel.add(txtmag);
        panel.add(new JLabel("Suma:"));
        panel.add(txtsum);
        panel.add(new JLabel("Multiplicacion:"));
        panel.add(txtmul);

        // Acciones de botones
        btnvec1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vec1 = new Vect(Double.parseDouble(txtX.getText()), Double.parseDouble(txtY.getText()));
                txtsum.setText("Vector1: " + vec1);
            }
        });
        btnvec2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vec2 = new Vect(Double.parseDouble(txtX.getText()), Double.parseDouble(txtY.getText()));
                txtmul.setText("Vector2: " + vec2);
            }
        });
        btnmag.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (vec1 != null) {
                    txtmag.setText(String.valueOf(vec1.magnitud()));
                } else {
                    txtmag.setText("Vector1 no definido");
                }
            }
        });
        btnsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (vec1 != null && vec2 != null) {
                    txtsum.setText(vec1.suma(vec2).toString());
                } else {
                    txtsum.setText("Defina ambos vectores");
                }
            }
        });
        btnmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (vec1 != null && vec2 != null) {
                    txtmul.setText(String.valueOf(vec1.productoEscalar(vec2)));
                } else {
                    txtmul.setText("Defina ambos vectores");
                }
            }
        });

        // Configuración de la ventana
        this.setContentPane(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Programa de Vectores");
        this.setVisible(true);
    }
}