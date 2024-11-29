package proyecto01;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Papel extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JTextField txtMargenSuperior;
	private JComboBox comboBoxTamaño;
	private JTextField txtMargenInferior;
	private JTextField txtMargenIzquierdo;
	private JTextField txtMargenDerecho;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Papel frame = new Papel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Papel() {
		setBounds(100, 100, 613, 545);
		
		lblNewLabel = new JLabel("Tamaño");
		
		txtMargenSuperior = new JTextField();
		txtMargenSuperior.setColumns(10);
		
		comboBoxTamaño = new JComboBox();
		comboBoxTamaño.setModel(new DefaultComboBoxModel(new String[] {"A4", "B5", "A5", "Carta", "Legal", "Ejecutivo", "Media carta"}));
		
		txtMargenInferior = new JTextField();
		txtMargenInferior.setColumns(10);
		
		txtMargenIzquierdo = new JTextField();
		txtMargenIzquierdo.setColumns(10);
		
		txtMargenDerecho = new JTextField();
		txtMargenDerecho.setColumns(10);
		
		btnNewButton = new JButton("Procesar");
		btnNewButton.addActionListener(this);
		
		lblNewLabel_1 = new JLabel("Margen Superior(cm)");
		
		lblNewLabel_2 = new JLabel("Margen inferior(cm)");
		
		lblNewLabel_3 = new JLabel("Margen Izquierdo(cm)");
		
		lblNewLabel_4 = new JLabel("Margen derecho(cm)");
		
		txtArea = new JTextArea();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(65)
							.addComponent(txtArea))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(29)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxTamaño, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGap(131)
							.addComponent(btnNewButton))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(19)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4))
							.addGap(41)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtMargenInferior, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMargenSuperior, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMargenIzquierdo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMargenDerecho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(158, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(comboBoxTamaño, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtMargenSuperior, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtMargenInferior, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtMargenIzquierdo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtMargenDerecho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addGap(61)
					.addComponent(txtArea, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		int tamaño;
		double margenSuperior,margenInferior,margenIzquierdo, margenDerecho,ancho,alto, area;
		
		tamaño=comboBoxTamaño.getSelectedIndex();
		margenSuperior=Double.parseDouble(txtMargenSuperior.getText());						
		margenInferior=Double.parseDouble(txtMargenInferior.getText());			
		margenDerecho=Double.parseDouble(txtMargenDerecho.getText());			
		margenIzquierdo=Double.parseDouble(txtMargenIzquierdo.getText());
		
		switch(tamaño) {
		case 0:
			ancho=29.7;
			alto=21.0;
			break;
		case 1:
			ancho=18.2;
			alto=25.7;
			break;
		case 2:
			ancho=14.8;
			alto=21.0;
			break;
		case 3:
			ancho=8.5*2.54;
			alto=11*2.54;
			break;
		case 4:
			ancho=8.5*2.54;
			alto=14*2.54;
			break;
		case 5:
			ancho=7.25*2.54;
			alto=10.5*2.54;
			break;
		default:
			ancho=5.5*2.54;
			alto=8.5*2.54;			
		}
		
		area=(ancho-margenIzquierdo-margenDerecho)*(alto-margenSuperior-margenInferior);
		
		txtArea.setText("Area Imprimible: " +area+"cm2" );
				
		
	}
	
}
