package proyecto01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Centrocomercial extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtCompra;
	private JTextField txtBolo;
	private JButton btnProcesar;
	private JTextPane txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Centrocomercial frame = new Centrocomercial();
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
	public Centrocomercial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Compra");
		lblNewLabel.setBounds(51, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("# bolo");
		lblNewLabel_1.setBounds(51, 83, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCompra = new JTextField();
		txtCompra.setBounds(126, 37, 86, 20);
		contentPane.add(txtCompra);
		txtCompra.setColumns(10);
		
		txtBolo = new JTextField();
		txtBolo.setBounds(126, 80, 86, 20);
		contentPane.add(txtBolo);
		txtBolo.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(253, 36, 89, 23);
		contentPane.add(btnProcesar);
		
		txtArea = new JTextPane();
		txtArea.setBounds(77, 148, 254, 64);
		contentPane.add(txtArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		//DECLARO VARIABLES ENTRADA
		double importePago;
		int numeroBolo;

		// DECLARO VARIABLES SALID
		String obsequio;
		//ENTRADA DATOS
		//leer importePago,numeroBolo;
		importePago=Double.parseDouble(txtCompra.getText());
		numeroBolo=Integer.parseInt(txtBolo.getText());
		
		// CALCULO
		//Determinar obsequio
		if(importePago>500){
			
			switch (numeroBolo){
				case 10:					
					obsequio="agenda";
					break;
				case 20:
					obsequio="reloj";
					break;
				case 30:
					obsequio="usb";
					break;
				case 40:
					obsequio="perfume";
					break;
				case 50:
					obsequio="radio";
					break;
				default:
					obsequio="pelota";
					break;
				}			
			//IMPRESION
				//imprimir obsequio;
				txtArea.setText("Tu obsequio es:"+ obsequio);
			} 
			else
			{
				//imprimir "no hay obsequio por su monto compra";
				txtArea.setText("no hay obsequio por su monto compra");
			}
		
	}
}
