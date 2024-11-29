package proyecto01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dulceria extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox comboBoxTipo;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dulceria frame = new Dulceria();
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
	public Dulceria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Tipo");
		lblNewLabel.setBounds(32, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(42, 68, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		comboBoxTipo = new JComboBox();
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Primor", "Dulzura", "Tentacion", "Explosion"}));
		comboBoxTipo.setBounds(68, 29, 171, 22);
		contentPane.add(comboBoxTipo);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(98, 65, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(307, 48, 89, 23);
		contentPane.add(btnProcesar);
		
		textArea = new JTextArea();
		textArea.setBounds(68, 127, 303, 101);
		contentPane.add(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {		
		//Declaro variables entrada
		int tipo;
		int cantidad;
		//Declaro variales salida
		double importeCompra,importeDescuento,importePagar,caramelos;
		//lectura datos
		tipo=comboBoxTipo.getSelectedIndex();
		cantidad=Integer.parseInt(txtCantidad.getText());
		//calculo		
		//determino importe compra
		switch (tipo) {
		case 0:
			importeCompra=cantidad*8.5;
			break;
		case 1:
			importeCompra=cantidad*10.0;
			break;
		case 2:
			importeCompra=cantidad*7.0;
			break;
		default :
			importeCompra=cantidad*12.5;
			break;			
		} 		
		//determino Descuento
		switch(cantidad) {
		case 1:
		case 2:
		case 3:
		case 4:
			importeDescuento=0.04*importeCompra;
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			importeDescuento=0.065*importeCompra;
			break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
			importeDescuento=0.09*importeCompra;
			break;
		default:
			importeDescuento=0.115*importeCompra;
			break;
			
		}
		//determinar importe pagar
		importePagar=importeCompra-importeDescuento;
		
		//caramelos de regalo
		if (importePagar>250)
			caramelos=3*cantidad;
		else
			caramelos=2*cantidad;
		
		//impresion
		textArea.setText("compra :S/. "+importeCompra+"\n");
		textArea.append("descuento :S/. "+importeDescuento+"\n");
		textArea.append("pagar :S/. "+importePagar+"\n");
		textArea.append("caramelos : "+caramelos+"\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
