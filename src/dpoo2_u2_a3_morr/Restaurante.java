package dpoo2_u2_a3_morr;

import dpoo2_u2_a3_morr.inventarios.InventariosModulo;
import dpoo2_u2_a3_morr.rh.RHModulo;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Restaurante extends JFrame implements ActionListener{
    InventariosModulo inventarios = new InventariosModulo();
    RHModulo rh = new RHModulo();
    JButton boton_inventarios, boton_rh;
    JLabel titulo_panel;
    Restaurante(){
        setVisible(true);
        setBounds(700, 100, 500, 800);
        setTitle("Restaurante");
        setDefaultCloseOperation(Restaurante.DISPOSE_ON_CLOSE);
             
        Container contentpane = getContentPane();
        
        contentpane.setLayout(new FlowLayout());
        
        boton_inventarios = new JButton("Inventarios");
        boton_inventarios.setPreferredSize(new Dimension(230, 30));
        boton_rh = new JButton("Recursos Humanos");
        boton_rh.setPreferredSize(new Dimension(230, 30));

        
        boton_inventarios.addActionListener(this);
        boton_rh.addActionListener(this);

        
        titulo_panel = new JLabel("Seleccione una Opcion");
        titulo_panel.setPreferredSize(new Dimension(460, 50));
        titulo_panel.setHorizontalAlignment(SwingConstants.CENTER);
        
        contentpane.add(boton_inventarios);
        contentpane.add(boton_rh);  
        
        contentpane.add(titulo_panel);
        
        contentpane.add(inventarios);
        contentpane.add(rh);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton_inventarios){
            System.out.println("inventarios clicked");
            titulo_panel.setText("Inventarios");;
            rh.setVisible(false);
            inventarios.setVisible(true);
        }
        if(e.getSource()==boton_rh){
            System.out.println("rh clicked");
            titulo_panel.setText("Recursos Humanos");
            inventarios.setVisible(false);
            rh.setVisible(true);

        }
        
    }
    
    public static void main(String[] args) {
        System.out.println("restaurante corriendo");
        Restaurante restaurante = new Restaurante();
    }
    
}
