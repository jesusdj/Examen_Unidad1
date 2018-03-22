package Formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmCalculo extends JFrame implements ActionListener {
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
        GridBagConstraints Restricciones = new GridBagConstraints();



        Panel =new JPanel();
        Panel2=new JPanel();

        Panel.setLayout(new GridBagLayout());

        Panel2.setLayout(new BoxLayout(Panel2,BoxLayout.X_AXIS));

        // Propiedades de formulario
        setTitle("Programa de calculo de Velocidad");
        setResizable(false);
        setSize(565,120);
        //setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creamos Objetos del formulario



        lblVelocidad = new JLabel("Velocidad");
        TxtVelocidad = new JTextField(12);
        lblDistancia = new JLabel("Distancia");
        TxtDistancia = new JTextField(12);
        lblTiempo = new JLabel("Tiempo");
        TxtTiempo = new JTextField(14);

       /* lblResultado= new JLabel("Resultado");
        TxtResultado= new JTextField(10);*/
        btnVelocidad = new JButton("Calcular Velocidad");
        btnDistancia = new JButton("Calcular Distancia");
        btnTiempo = new JButton("Calcular Tiempo");

        //Se añaden los paneles al JFrame
        this.add(Panel,BorderLayout.WEST);
        this.add(Panel2,BorderLayout.SOUTH);


        //Propiedades de los onbjetos


        Panel.setBackground(Color.DARK_GRAY);
        Panel2.setBackground(Color.DARK_GRAY);


        // Adicionar objetos al formulario


       Panel. add(lblVelocidad).setForeground(Color.ORANGE);
       Panel.add(TxtVelocidad);
       Panel.add(lblDistancia).setForeground(Color.ORANGE);
       Panel.add(TxtDistancia);
       Panel.add(lblTiempo).setForeground(Color.ORANGE);
       Panel.add(TxtTiempo);





       Panel2.add(btnVelocidad);
       Panel2.add(btnDistancia);
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













        this.btnVelocidad.addActionListener(this);
        this.btnDistancia.addActionListener(this);
        this.btnTiempo.addActionListener(this);




    }

    @Override
    public void actionPerformed(ActionEvent e) {

    if(e.getSource().equals(btnVelocidad)){

        double n1 = Double.parseDouble(TxtDistancia.getText());
        double n2= Double.parseDouble(TxtTiempo.getText());
        double Vel = n1/n2;


        String valorTotal = Double.toString(Vel);
        TxtVelocidad.setText(valorTotal);

            }


    if(e.getSource().equals(btnDistancia)){
        double n1 = Double.parseDouble(TxtVelocidad.getText());
        double n2= Double.parseDouble(TxtTiempo.getText());
        double Dist = n1*n2;

       String valorTotal = Double.toString(Dist);
        TxtDistancia.setText(valorTotal);



    }


    if(e.getSource().equals(btnTiempo)){

        double n1 = Double.parseDouble(TxtVelocidad.getText());
        double n2= Double.parseDouble(TxtDistancia.getText());
        double Tiemp = n2/n1;


        String valorTotal = Double.toString(Tiemp);
        TxtTiempo.setText(valorTotal);

    }


    }
}
