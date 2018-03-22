package Formularios;

import javax.swing.*;
import java.awt.*;

public class frmCalculo extends JFrame {
    //objetos del formulario

     JPanel Panel;
     JPanel Panel2;

    JLabel lblVelocidad;
    JLabel lblDistancia;
    JLabel lblTiempo;
    JLabel lblResultado;


    JTextField TxtVelocidad;
    JTextField TxtTiempo;
    JTextField TxtDistancia;
    JTextField TxtResultado;

    JButton btnVelocidad;
    JButton btnDistancia;
    JButton btnTiempo;



    // Creamos contructor
    public frmCalculo(){

        this.setLayout(new BorderLayout());

        Panel =new JPanel();
        Panel2=new JPanel();

        Panel.setLayout(new BoxLayout(Panel,BoxLayout.Y_AXIS));
        Panel.setLayout(new BoxLayout(Panel,BoxLayout.Y_AXIS));
        Panel2.setLayout(new BoxLayout(Panel2,BoxLayout.PAGE_AXIS));

        // Propiedades de formulario
        setTitle("Programa de calculo de Velocidad");
        setResizable(true);
        setSize(360,300);
        //setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creamos Objetos del formulario



        lblVelocidad = new JLabel("Velocidad");
        TxtVelocidad = new JTextField(10);
        lblDistancia = new JLabel("Distancia");
        TxtDistancia = new JTextField(10);
        lblTiempo = new JLabel("Tiempo");
        TxtTiempo = new JTextField(10);

        lblResultado= new JLabel("Resultado");
        TxtResultado= new JTextField(10);
        btnVelocidad = new JButton("Calcular Velocidad");
        btnDistancia = new JButton("Calcular D");
        btnTiempo = new JButton("Calcular T");

        //Se añaden los paneles al JFrame
        this.add(Panel,BorderLayout.WEST);
        this.add(Panel2,BorderLayout.EAST);


        //Propiedades de los onbjetos
        Panel.setBackground(Color.ORANGE);
        Panel2.setBackground(Color.ORANGE);


        // Adicionar objetos al formulario


       Panel. add(lblVelocidad);
       Panel.add(TxtVelocidad);
       Panel.add(lblDistancia);
       Panel.add(TxtDistancia);
       Panel.add(lblTiempo);
       Panel.add(TxtTiempo);

        Panel2.add(Box.createRigidArea(new Dimension(100,5))).setBackground(Color.ORANGE);

       Panel2.add(lblResultado);
       Panel2.add(TxtResultado);
       Panel2.add(btnVelocidad);
        Panel2.add(Box.createRigidArea(new Dimension(100,5))).setBackground(Color.ORANGE);
       Panel2.add(btnDistancia);
        Panel2.add(Box.createRigidArea(new Dimension(100,5))).setBackground(Color.ORANGE);
       Panel2.add(btnTiempo);





        // Ubicar componentes en el formulario

/*
        lblVelocidad.reshape(20,20,100,20);
        TxtVelocidad.reshape(120,20,100,20);


        lblDistancia.reshape(20,45,100,20);
        TxtDistancia.reshape(120,45,100,20);

        lblTiempo.reshape(20,70,100,20);
        TxtTiempo.reshape(120,70,100,20);

        btnCalcular.reshape (20,110,90,30);
        btnCancelar.reshape(140,110,90,30);

*/

















    }
}
