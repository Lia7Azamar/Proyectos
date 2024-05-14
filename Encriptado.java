//Paquetes
import java.awt.BorderLayout;// para la interfas grafica, para centrar o poner en un citio fijo
import java.awt.Container; //Para el marco y organizar la interfas
import java.awt.GridLayout; //Divide en columnas y filas
import java.awt.event.ActionEvent; //para que funcionen los botones cuando los toques
import java.awt.event.ActionListener; //para que funcionen los botones cuando los toques
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
//Atributos
public class Encriptado extends JFrame {
    private JLabel entradaLbl,salida,salidaCadena,titulo,a;
    private JTextField entrada;
    private JButton encriptar, desencriptar, limpiar, salir;
    private JPanel central,central2,cTitulo;

    public Encriptado() {
        Eventos manejador = new Eventos();
        this.setTitle("Ejercicio encriptado");
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        central = new JPanel(new GridLayout(9, 1));
        central2 = new JPanel(new GridLayout(1, 2));
        cTitulo=new JPanel(new GridLayout(1,1));
        entrada = new JTextField(10);
        entradaLbl = new JLabel("Texto a encriptar");//el texto predefinido de la derecha
        salida = new JLabel("ENCRIPTAR");//el texto predefinido de la derecha
        salidaCadena = new JLabel("DESENCRIPTAR");//el texto predefinido de la derecha
        encriptar = new JButton("ENCRIPTAR");//los botones de la izquierda
        encriptar.addActionListener(manejador);
        desencriptar = new JButton("DESENCRIPTAR");//los botones de la izquierda
        desencriptar.addActionListener(manejador);
        titulo = new JLabel("Ejercicio encriptado");
        limpiar = new JButton("limpiar");
        limpiar.addActionListener(manejador);
        salir = new JButton("salir");
        salir.addActionListener(manejador);

        central.setBackground(Color.ORANGE);
        cTitulo.add(titulo);
        central.add(entradaLbl);
        central.add(entrada);
        central.add(encriptar);
        central.add(salida);
        central.add(desencriptar);
        central.add(salidaCadena);
        central2.add(limpiar);
        central2.add(salir);
        contenedor.add(central, BorderLayout.CENTER);
        contenedor.add(central2,BorderLayout.SOUTH);
        contenedor.add(cTitulo, BorderLayout.NORTH);
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[]args){
        Encriptado ventana = new Encriptado();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void Activar_Desactivar(boolean bolillo){
        int l, i;
        String texto;
        char array[];
        if(bolillo==true){

            texto = entrada.getText();
        } else {
            texto = salida.getText();
        }
        array = texto.toCharArray();
        l = array.length;
        for(i = 0; i < array.length; i++){
            if(bolillo==true){
                array[i] = (char)(array[i] + (char)l);
            } else {
                array[i] = (char)(array[i] - (char)l);
            }
        }
        texto = String.valueOf(array);
        if(bolillo==true){
            salida.setText(texto);
        } else {
            salidaCadena.setText(texto);
        }

    }
    class Eventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev) {
            if(ev.getSource()==encriptar){
                Activar_Desactivar(true);
            }
            if(ev.getSource()==desencriptar){
                Activar_Desactivar(false);
            }
            if(ev.getSource()==limpiar){
                salida.setText(null);
                salidaCadena.setText(null);
            }
            if(ev.getSource()==salir){
                System.exit(0);

            }



        }
    }
}
