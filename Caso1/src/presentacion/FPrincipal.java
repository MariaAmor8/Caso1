package presentacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FPrincipal extends JFrame implements ActionListener {
	JLabel lblResultado;
	private String matriz[][]= {{"7","8","9","/"},
								{"4","5","6","*"},
								{"1","2","3","4"},
								{"C","0","=","+"}};
	private JButton matrizBotones[][]= new JButton[4][4];
	
	public void ejecutar() {
		this.setPreferredSize(new Dimension(300,450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.setLayout(new BorderLayout());
		this.lblResultado = new JLabel("0", SwingConstants.RIGHT);
		this.lblResultado.setFont(new Font(null, Font.BOLD,50));
		this.add(lblResultado, BorderLayout.NORTH);
		
		JPanel pBotones = new JPanel();
		pBotones.setLayout(new GridLayout(4,4));
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				this.matrizBotones[i][j] = new JButton(matriz[i][j]);
				pBotones.add(this.matrizBotones[i][j]);
				this.matrizBotones[i][j].addActionListener(this);
			}
		}
		
		this.add(pBotones,BorderLayout.CENTER);
		this.pack();
	}
	
	public static void main(String[] args) {
		FPrincipal calculator = new FPrincipal();
		calculator.ejecutar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botonOprimido = (JButton) e.getSource();
		String simbolo = botonOprimido.getText();
		this.lblResultado.setText(simbolo);
		//JOptionPane.showMessageDialog(this, "boton oprimido " + simbolo);
	}

}
