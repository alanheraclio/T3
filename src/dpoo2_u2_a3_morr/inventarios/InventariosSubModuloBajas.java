package dpoo2_u2_a3_morr.inventarios;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InventariosSubModuloBajas extends JPanel implements ActionListener{
    
    //SE CREAN LOS ELEMENTOS QUE SE USARAN
    JLabel codigo_label, sucursal_label, existencia_label, marca_label;
    JTextField codigo_field, sucursal_field, existencia_field, marca_field;
    JButton buscar_boton, borrar_boton;
    public InventariosSubModuloBajas(){
        //SE AGREGAN LOS ATRIBUTOS AL CONSTRUCTOR
        setVisible(false);
        setPreferredSize(new Dimension(400, 300));
        setLayout(new FlowLayout());
        
        //SE CREAN LAS ETIQUETAS DEL MODULO
        codigo_label = new JLabel("Codigo:");
        codigo_label.setPreferredSize(new Dimension(385, 20));
        codigo_label.setHorizontalAlignment(SwingConstants.LEFT);
        codigo_field = new JTextField(35);
              
        sucursal_label = new JLabel("Sucursal:");
        sucursal_label.setPreferredSize(new Dimension(385, 20));
        sucursal_label.setHorizontalAlignment(SwingConstants.LEFT);
        sucursal_field = new JTextField(35);
        
        existencia_label = new JLabel("Existencia:");
        existencia_label.setPreferredSize(new Dimension(385, 20));
        existencia_label.setHorizontalAlignment(SwingConstants.LEFT);
        existencia_field = new JTextField(35);
        existencia_field.setEditable(false);
        
        marca_label = new JLabel("Marca:");
        marca_label.setPreferredSize(new Dimension(385, 20));
        marca_label.setHorizontalAlignment(SwingConstants.LEFT);
        marca_field = new JTextField(35);
        marca_field.setEditable(false);
        
        //SE CREAN LOS BOTONES DEL MODULO
        buscar_boton = new JButton("Buscar");
        buscar_boton.addActionListener(this);
        buscar_boton.setPreferredSize(new Dimension(126, 30));
        buscar_boton.setIcon(new ImageIcon(Class.class.getResource("/img/buscar2.png")));
        
        borrar_boton = new JButton("Borrar");
        borrar_boton.addActionListener(this);
        borrar_boton.setPreferredSize(new Dimension(126, 30));
        borrar_boton.setIcon(new ImageIcon(Class.class.getResource("/img/borrar2.png")));
        
        //SE AGREGAN LOS ELEMENTOS CREADOS AL MODULO
        add(codigo_label);
        add(codigo_field);
               
        add(sucursal_label);
        add(sucursal_field);
        
        add(existencia_label);
        add(existencia_field);
        
        add(marca_label);
        add(marca_field);
        
        add(buscar_boton);
        add(borrar_boton);
        
    }

    //SE AGREGAN LAS ACCIONES A LOS BOTONES
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buscar_boton){
            System.out.println("inventarios buscar clicked"); 
            JOptionPane.showMessageDialog(null, "No encontrado");
        }
        if(e.getSource()==borrar_boton){
            System.out.println("inventarios borrar clicked"); 
            JOptionPane.showMessageDialog(null, "Borrado");
        }
    }
    
}
