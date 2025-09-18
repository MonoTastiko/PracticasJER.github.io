import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SumaGUI {
    private Frame f;
    private Panel pan1, pan2, pan3;
    private JLabel lblInstruccion1, lblInstruccion2, lblNum1, lblNum2, lblResultado;
    private TextField tfNum1, tfNum2, tfResultado;
    private Button btCalcular, btSalir;

    public SumaGUI() {
        f = new Frame("Suma de dos números");
        pan1 = new Panel();
        pan2 = new Panel();
        pan3 = new Panel();
        lblInstruccion1 = new JLabel("Instrucciones: ");
        lblInstruccion2 = new JLabel(
                "Ingrese los Números a sumar en los cuadros de texto. Posteriormente de click en el boton sumar");
        lblNum1 = new JLabel("<html> Primer Número: </html>");
        lblNum2 = new JLabel("<html> Segundo Número: </html>");
        lblResultado = new JLabel("<html> Resultado: </html>");

        tfNum1 = new TextField(5);
        tfNum2 = new TextField(5);
        tfResultado = new TextField(8);
        tfResultado.setEditable(false);

        btCalcular = new Button("Calcular");
        btSalir = new Button("Salir");
    }

    public void acomodarFrame() {
        pan1.setLayout(new GridLayout(3, 2));
        pan1.add(lblInstruccion1);
        pan1.add(lblInstruccion2);
        pan1.add(lblNum1);
        pan1.add(tfNum1);
        pan1.add(lblNum2);
        pan1.add(tfNum2);

        f.add(pan1, BorderLayout.NORTH);
        
        pan2.add(lblResultado);
        pan2.add(tfResultado);

        f.add(pan2, BorderLayout.CENTER);

        pan3.setLayout(new GridLayout(1,2));
        pan3.add(btCalcular);
        pan3.add(btSalir);

        f.add(pan3, BorderLayout.SOUTH);

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        SumaGUI ventanaSuma = new SumaGUI();
        ventanaSuma.acomodarFrame();
    }

}