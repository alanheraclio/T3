package dpoo2_u3_a2_morr.reportes;


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

public class ReportesSubModuloRH extends JPanel implements ActionListener{
    //SE CREAN LOS ELEMENTOS QUE SE USARAN
    JLabel altas_label, bajas_label, modificaciones_label;
    JTextField altas_field, bajas_field, modificaciones_field;
    JButton buscar_boton, visualizar_boton;
    public ReportesSubModuloRH(){
        //SE AGREGAN LOS ATRIBUTOS AL CONSTRUCTOR
        setVisible(false);
        setPreferredSize(new Dimension(400, 400));
        setLayout(new FlowLayout());
        
        //SE CREAN LAS ETIQUETAS DEL MODULO      
        altas_label = new JLabel("Altas:");
        altas_label.setPreferredSize(new Dimension(385, 20));
        altas_label.setHorizontalAlignment(SwingConstants.LEFT);
        altas_field = new JTextField(35);
        
        bajas_label = new JLabel("Bajas:");
        bajas_label.setPreferredSize(new Dimension(385, 20));
        bajas_label.setHorizontalAlignment(SwingConstants.LEFT);
        bajas_field = new JTextField(35);

        modificaciones_label = new JLabel("Modificaciones:");
        modificaciones_label.setPreferredSize(new Dimension(385, 20));
        modificaciones_label.setHorizontalAlignment(SwingConstants.LEFT);
        modificaciones_field = new JTextField(35);
            
        //SE CREAN LOS BOTONES DEL MODULO
        buscar_boton = new JButton("Buscar");
        buscar_boton.addActionListener(this);
        buscar_boton.setPreferredSize(new Dimension(126, 30));
        buscar_boton.setIcon(new ImageIcon(Class.class.getResource("/img/buscar2.png")));
        
        visualizar_boton = new JButton("Visualizar");
        visualizar_boton.addActionListener(this);
        visualizar_boton.setPreferredSize(new Dimension(126, 30));
        visualizar_boton.setIcon(new ImageIcon(Class.class.getResource("/img/visualizar2.png")));
        
        //SE AGREGAN LOS ELEMENTOS CREADOS AL MODULO       
        add(altas_label);
        add(altas_field);
        
        add(bajas_label);
        add(bajas_field);

        add(modificaciones_label);
        add(modificaciones_field);
               
        add(buscar_boton);
        add(visualizar_boton);
        
    }

    //SE AGREGAN LAS ACCIONES A LOS BOTONES
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buscar_boton){
            System.out.println("Reportes buscar clicked"); 
            JOptionPane.showMessageDialog(null, "rh Guardado");
        }
        if(e.getSource()==visualizar_boton){
            System.out.println("Reportes visualizar clicked");
        }
    }
    
}
