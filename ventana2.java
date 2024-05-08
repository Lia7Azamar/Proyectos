
package funciona;
import java.awt.*;
import java.awt.event.ActionEvent; //para que funcionen los botones cuando los toques
import java.awt.event.ActionListener; //para que funcionen los botones cuando los toques
import javax.swing.*;

//Atributos
public class ventana2 extends JFrame implements ahs{
    private JLabel S, P, M;
    private JButton ok;
    private JComboBox semestre, periodo, materia;
    private JPanel UP, boton, texto;

    public ventana2() {
        ventana2.Eventos botones=new ventana2.Eventos();
        Container contenedor = getContentPane();
        this.setTitle("Seleccion del semestre");
        contenedor.setLayout(new BorderLayout());
        UP = new JPanel(new GridLayout(3, 3));
        boton = new JPanel(new GridLayout(1, 1));
        texto = new JPanel(new GridLayout(3, 3));
        S = new JLabel("Semestre");
        S.setFont(new Font("Usuario",Font.BOLD,20));
        P = new JLabel("Periodo");
        P.setFont(new Font("Usuario",Font.BOLD,20));
        M = new JLabel("Materia");
        M.setFont(new Font("Usuario",Font.BOLD,20));
        ok = new JButton("Siguiente");
        ok.setFont(new Font("Usuario",Font.BOLD,20));
        ok.addActionListener(botones);
        semestre= new JComboBox<>();
        semestre.setFont(new Font("Usuario",Font.BOLD,20));
        periodo = new JComboBox();
        periodo.setFont(new Font("Usuario",Font.BOLD,20));
        materia =new JComboBox();
        materia.setFont(new Font("Usuario",Font.BOLD,20));
        UP.setBackground(Color.GREEN);
        boton.setBackground(Color.GREEN);
        texto.setBackground(Color.GREEN);
        semestre.addItem("");
        semestre.addItem(1);
        semestre.addItem(2);
        semestre.addItem(3);
        semestre.addItem(4);
        semestre.addItem(5);
        semestre.addItem(6);
        semestre.addItem(7);
        semestre.addItem(8);
        periodo.addItem("");
        periodo.addItem(1);
        periodo.addItem(2);
        periodo.addItem(3);
        materia.addItem("dfghhjghoij");
        materia.addItem("Calculo integral");
        materia.addItem("POO");
        materia.addItem("Ingles");
        materia.addItem("Fisica");

        UP.add(semestre);
        texto.add(S);
        UP.add(periodo);
        texto.add(P);
        UP.add(materia);
        texto.add(M);
        boton.add(ok);
        contenedor.add(UP, BorderLayout.CENTER);
        contenedor.add(boton, BorderLayout.SOUTH);
        contenedor.add(texto, BorderLayout.WEST);
        setSize(500, 400);
        setLocationRelativeTo(null);
    }
    public void alertas() {
        if (periodo.getSelectedIndex()>0&& semestre.getSelectedIndex()>0 &&materia.getSelectedIndex()>0) {
            Calificacion ventana = new Calificacion();
            ventana.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "Para guardar la calificaion presione F1 para " +
                            "la unidad 1,F2 para la u2 y F3 para la u3",
                    "Aviso",JOptionPane.ERROR_MESSAGE);
        }else{
            periodo.setSelectedItem(1);
            semestre.setSelectedItem(1);
            materia.setSelectedItem("POO");
            JOptionPane.showMessageDialog(null, "Asegurece de llenar todos los campos",
                    "Aviso",JOptionPane.ERROR_MESSAGE);
        }
    }
        class Eventos implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent ev) {
                if (ev.getSource() == ok) {
                    alertas();
                }
            }
        }
    }

