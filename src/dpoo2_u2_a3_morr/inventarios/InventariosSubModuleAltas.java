package dpoo2_u2_a3_morr.inventarios;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InventariosSubModuleAltas extends JPanel implements ActionListener{
    //SE CREAN LOS ELEMENTOS QUE SE USARAN
    JLabel codigo_label, articulo_label, sucursal_label, existencia_label, marca_label;
    JTextField codigo_field, articulo_field, sucursal_field, existencia_field, marca_field;
    JButton guardar_boton, limpiar_boton;
    public InventariosSubModuleAltas(){
        //SE AGREGAN LOS ATRIBUTOS AL CONSTRUCTOR
        setVisible(false);
        setPreferredSize(new Dimension(400, 300));
        setLayout(new FlowLayout());
        
        //SE CREAN LAS ETIQUETAS DEL MODULO
        codigo_label = new JLabel("Codigo:");
        codigo_label.setPreferredSize(new Dimension(385, 20));
        codigo_label.setHorizontalAlignment(SwingConstants.LEFT);
        codigo_field = new JTextField(35);
        
        articulo_label = new JLabel("Articulo:");
        articulo_label.setPreferredSize(new Dimension(385, 20));
        articulo_label.setHorizontalAlignment(SwingConstants.LEFT);
        articulo_field = new JTextField(35);
        
        sucursal_label = new JLabel("Sucursal:");
        sucursal_label.setPreferredSize(new Dimension(385, 20));
        sucursal_label.setHorizontalAlignment(SwingConstants.LEFT);
        sucursal_field = new JTextField(35);
        
        existencia_label = new JLabel("Existencia:");
        existencia_label.setPreferredSize(new Dimension(385, 20));
        existencia_label.setHorizontalAlignment(SwingConstants.LEFT);
        existencia_field = new JTextField(35);
        
        marca_label = new JLabel("Marca:");
        marca_label.setPreferredSize(new Dimension(385, 20));
        marca_label.setHorizontalAlignment(SwingConstants.LEFT);
        marca_field = new JTextField(35);
        
        //SE CREAN LOS BOTONES DEL MODULO
        guardar_boton = new JButton("Guardar");
        guardar_boton.addActionListener(this);
        guardar_boton.setPreferredSize(new Dimension(126, 30));
        guardar_boton.setIcon(new ImageIcon(Class.class.getResource("/img/guardar2.png")));
        
        limpiar_boton = new JButton("Limpiar");
        limpiar_boton.addActionListener(this);
        limpiar_boton.setPreferredSize(new Dimension(126, 30));
        limpiar_boton.setIcon(new ImageIcon(Class.class.getResource("/img/limpiar2.png")));
        
        //SE AGREGAN LOS ELEMENTOS CREADOS AL MODULO
        add(codigo_label);
        add(codigo_field);
        
        add(articulo_label);
        add(articulo_field);
        
        add(sucursal_label);
        add(sucursal_field);
        
        add(existencia_label);
        add(existencia_field);
        
        add(marca_label);
        add(marca_field);
        
        add(guardar_boton);
        add(limpiar_boton);
        
    }

    //SE AGREGAN LAS ACCIONES A LOS BOTONES
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==guardar_boton){
            System.out.println("inventarios guardar clicked"); 
            JOptionPane.showMessageDialog(null, "Inventario Guardado");
        }
        if(e.getSource()==limpiar_boton){
            System.out.println("inventarios modificar clicked");
        }
    }
    
}
