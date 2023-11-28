package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainPrincipal extends JFrame{
	private JLabel lblnombre;
	private JTextField txtNombre;
	private JLabel lblApellido;
	JTextField txtApellido;
	
	public void ejecutar() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("Caso 1");
		
		this.setLayout(new GridLayout(3,2));
		
		this.lblnombre = new JLabel("nombre: ");
		this.txtNombre = new JTextField();
		this.add(lblnombre);
		this.add(txtNombre);
		
		this.lblApellido  = new JLabel("Apellido: ");
		this.txtApellido = new JTextField();
		this.add(lblApellido);
		this.add(txtApellido);
		
		JButton bEnviar = new JButton("Enviar");
		this.add(bEnviar);
		
		bEnviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarResultado();
			}
			
		});
	}

	protected void mostrarResultado() {
		String nombre = this.lblnombre.getText();
		String apellido = this.lblApellido.getText();
		JOptionPane.showMessageDialog(this, "Su nombre es: "+nombre+"\n y su apellido: "+apellido);
	}

	public static void main(String[] args) {
		MainPrincipal principal = new MainPrincipal();
		principal.ejecutar();
	}

}
