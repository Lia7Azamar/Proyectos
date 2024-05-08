package funciona;
import java.awt.*;
import java.awt.event.ActionEvent; //para que funcionen los botones cuando los toques
import java.awt.event.ActionListener; //para que funcionen los botones cuando los toques
import javax.swing.*;
import javax.swing.JPasswordField;

//Atributos
public class usuario extends JFrame {
    private JLabel U,P;
    private JTextField usuario;
    private JPasswordField contraseña;
    private JButton iniciar;
    private JPanel UP,boton,texto;
    private int intentos;

    public usuario(){


        Eventos botones=new Eventos();
        //primera ventana
        Container contenedor=getContentPane();
        this.setTitle("Autenticador");
        contenedor.setLayout(new BorderLayout());
        UP = new JPanel(new GridLayout(2 ,2));
        boton=new JPanel(new GridLayout(1,1));
        texto=new JPanel(new GridLayout(2 ,2));
        U=new JLabel("Usuario");
        U.setFont(new Font("Usuario",Font.BOLD,20));
        P=new JLabel("Contraseña");
        P.setFont(new Font("Contraseña",Font.BOLD,20));
        iniciar=new JButton("Iniciar Sesion");
        iniciar.setFont(new Font("Usuario",Font.BOLD,20));
        iniciar.addActionListener(botones);
        usuario=new JTextField();
        usuario.setFont(new Font("Usuario",Font.BOLD,20));
        contraseña=new JPasswordField();
        contraseña.setFont(new Font("Usuario",Font.BOLD,20));
        UP.setBackground(Color.GREEN);
        texto.setBackground(Color.GREEN);

        UP.add(usuario);
        texto.add(U);
        UP.add(contraseña);
        texto.add(P);
        boton.add(iniciar);
        contenedor.add(UP, BorderLayout.CENTER);
        contenedor.add(boton,BorderLayout.SOUTH);
        contenedor.add(texto,BorderLayout.WEST);
        setSize(500, 400);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    public void iniciars (){
        String USUARIO = "";
        String CONTRASEÑA = "";
        String usuario_i = usuario.getText();
        String contraseña_i = String.valueOf(contraseña.getPassword());
        try {
            if (usuario_i.equals(USUARIO) && contraseña_i.equals(CONTRASEÑA)) {
                ventana2 ventana = new ventana2();
                ventana.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña o el usuario son incorrectos",
                        "Error", JOptionPane.ERROR_MESSAGE);
                usuario.setText(null);
                contraseña.setText(null);
                intentos++;
                if (intentos == 3) {
                    JOptionPane.showMessageDialog(null, "Se han agotado los intentos");
                    iniciar.setEnabled(false);
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[]args){
        usuario ventana=new usuario();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ///////////////////////////////
        ventana2 VENTANA=new ventana2();
        VENTANA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class Eventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            iniciars();
        }
    }


}
