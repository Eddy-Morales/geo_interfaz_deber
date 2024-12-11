import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton triangulo;
    private JButton triangulo_rectangulo;
    private JButton cuadrado;
    private JButton rectangulo;
    private JButton circulo;
    private JButton resultado;
    private JLabel tituloTxt;
    private JLabel areaTxt;
    private JLabel resultadoAreaTxt;
    private JLabel perimetroTxt;
    private JLabel resultadoPerimetroTxt;
    public JPanel mainPanel;

    public form1() {
        triangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Valores quemados
                double base = 5, altura = 10;
                double area = (base * altura) / 2;
                double perimetro = base * 3;

                // Mostrar resultados
                resultadoAreaTxt.setText("Resultado: " + area);
                resultadoPerimetroTxt.setText("Resultado: " + perimetro);
            }
        });
        triangulo_rectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double base = 6, altura = 8;
                double area = (base * altura) / 2;
                double hipotenusa = Math.sqrt(base * base + altura * altura);
                double perimetro = base + altura + hipotenusa;
                resultadoAreaTxt.setText("Resultado: " + area);
                resultadoPerimetroTxt.setText("Resultado: " + perimetro);
            }
        });
        cuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lado = 4;
                double area = lado * lado;
                double perimetro = lado * 4;
                resultadoAreaTxt.setText("Resultado: " + area);
                resultadoPerimetroTxt.setText("Resultado: " + perimetro);
            }
        });
        rectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double base = 7, altura = 5;
                double area = base * altura;
                double perimetro = 2 * (base + altura);
                resultadoAreaTxt.setText("Resultado: " + area);
                resultadoPerimetroTxt.setText("Resultado: " + perimetro);
            }
        });
        circulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double radio = 3;
                double area = Math.PI * radio * radio;
                double perimetro = 2 * Math.PI * radio;
                resultadoAreaTxt.setText("Resultado: " + area);
                resultadoPerimetroTxt.setText("Resultado: " + perimetro);
            }
        });
    }
}
