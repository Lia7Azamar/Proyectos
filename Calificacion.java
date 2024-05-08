package funciona;
import java.awt.*;
import java.awt.event.ActionEvent; //para que funcionen los botones cuando los toques
import java.awt.event.ActionListener; //para que funcionen los botones cuando los toques
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.io.*;


public class Calificacion extends JFrame  {


    private JLabel U, C;
    private JTextField calificacion;
    private JButton guardar, Imprimir_txt;
    private JComboBox unidad;
    private JPanel UP, boton, texto;
    private int [] matriz;
    public int[] calificacion1 = new int[3];

    public Calificacion() {
        Calificacion.Eventos botones=new Calificacion.Eventos();
        Container contenedor = getContentPane();
        this.setTitle("Seleccion del semestre");
        contenedor.setLayout(new BorderLayout());
        UP = new JPanel(new GridLayout(2, 2));
        boton = new JPanel(new GridLayout(2, 2));
        texto = new JPanel(new GridLayout(2, 2));
        U = new JLabel("Unidad");
        U.setFont(new Font("Usuario",Font.BOLD,20));
        C = new JLabel("Calificacion");
        C.setFont(new Font("Usuario",Font.BOLD,20));
        guardar = new JButton("Guardar");
        guardar.setFont(new Font("Usuario",Font.BOLD,20));
        guardar.addActionListener(botones);
        Imprimir_txt = new JButton("Imprimir_txt");
        Imprimir_txt.setFont(new Font("Usuario",Font.BOLD,20));
        Imprimir_txt.addActionListener(botones);
        unidad= new JComboBox<>();
        unidad.setFont(new Font("Usuario",Font.BOLD,20));
        calificacion=new JTextField();
        calificacion.setFont(new Font("Usuario",Font.BOLD,20));
        try{
            matriz=new int [3];
        }catch(NegativeArraySizeException ex){
            JOptionPane.showMessageDialog(null, "No puedes crear una matriz negativa, cambie el valor a uno positivo",
                    "Aviso",JOptionPane.ERROR_MESSAGE);
        }


        UP.setBackground(Color.GREEN);
        boton.setBackground(Color.GREEN);
        texto.setBackground(Color.GREEN);
        unidad.addItem("");
        unidad.addItem(1);
        unidad.addItem(2);
        unidad.addItem(3);

        UP.add(unidad);
        texto.add(U);
        UP.add(calificacion);
        texto.add(C);
        boton.add(guardar);
        boton.add(Imprimir_txt);
        contenedor.add(UP, BorderLayout.CENTER);
        contenedor.add(boton, BorderLayout.SOUTH);
        contenedor.add(texto, BorderLayout.WEST);
        setSize(500, 400);
        setLocationRelativeTo(null);

        calificacion.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent ev) {
                try{
                    //presione fn F1,F2,F3 o solamente F1,F2,F3 para guardar la calificacion en su respectiva posicion
                    if(ev.getKeyCode()==KeyEvent.VK_F1) {
                        if (unidad.getSelectedItem().equals(1)) {
                            calificacion1[0] = Integer.parseInt(calificacion.getText());
                            calificacion.setText(null);
                            JOptionPane.showMessageDialog(null, "Su calificacion ha sido guardada", "Aviso", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "Seleccione la unidad 1 para guardar la calificacion", "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                    if(ev.getKeyCode()==KeyEvent.VK_F2){
                        if (unidad.getSelectedItem().equals(2)) {
                            calificacion1[1] = Integer.parseInt(calificacion.getText());
                            calificacion.setText(null);
                            JOptionPane.showMessageDialog(null, "Su calificacion ha sido guardada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Seleccione la unidad 2 para guardar la calificacion", "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                    if(ev.getKeyCode()==KeyEvent.VK_F3){
                        if (unidad.getSelectedItem().equals(3)) {
                            calificacion1[2] = Integer.parseInt(calificacion.getText());
                            calificacion.setText(null);
                            JOptionPane.showMessageDialog(null, "Su calificacion ha sido guardada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Seleccione la unidad 3 para guardar la calificacion", "Aviso", JOptionPane.WARNING_MESSAGE);
                        }                    }

                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "no puedes ingresar letras ni dejar el campo vacio",
                            "Aviso",JOptionPane.ERROR_MESSAGE);
                    calificacion.setText(null);
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

    }
    public void alertas(){

        try{
            for(int i=0;i<3; i++) {
                matriz[i] = calificacion1[i];
            }
            for(int i=0;i<3; i++) {
                System.out.println(matriz[i]);
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "La matriz es demasiado grande compruebe el codigo",
                    "Aviso",JOptionPane.ERROR_MESSAGE);
        }catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, "Hay un error al dividir la calificacion",
                    "Aviso",JOptionPane.ERROR_MESSAGE);
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "La matriz no fue creada revise el codigo",
                    "Aviso",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void texto(){
        try {
            String [] Unidad={"Unidad 1","Unidad 2","Unidad 3"};
            FileWriter escribir = new FileWriter("texto.txt");
            escribir.write("Leonardo Ibrahim Azamar Hernandez"+"\n");
            for (int i = 0; i < calificacion1.length; i++) {
                if(calificacion1[i]>69){
                    escribir.write("Tu calificación en la " +Unidad[i]+" es "+ calificacion1[i] + "\n");
                }else{
                    escribir.write("Tu calificación en la " +Unidad[i]+" es "+ "NA" + "\n");
                }

            }
            escribir.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader lector = new FileReader("texto.txt");
            BufferedReader contenido = new BufferedReader(lector);
            String imprimirTex;
            while ((imprimirTex = contenido.readLine()) != null) {
                System.out.println(imprimirTex);
            }
            contenido.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    class Eventos implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ev) {
            if (ev.getSource() == Imprimir_txt) {
               texto();
            }
            if (ev.getSource() == guardar) {
                alertas();
            }
        }
    }
}


