package proyecto01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Empresa extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtMinutos;
	private JTextField txtObservaciones;
	private JButton btnProcesar;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empresa frame = new Empresa();
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
	public Empresa() {
		setTitle("Empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Minutos tardanza");
		lblNewLabel.setBounds(46, 37, 102, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Numero Observaciones");
		lblNewLabel_1.setBounds(41, 75, 120, 14);
		contentPane.add(lblNewLabel_1);
		
		txtMinutos = new JTextField();
		txtMinutos.setBounds(170, 34, 86, 20);
		contentPane.add(txtMinutos);
		txtMinutos.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(180, 72, 86, 20);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(360, 146, 89, 23);
		contentPane.add(btnProcesar);
		
		txtArea = new JTextArea();
		txtArea.setBounds(42, 124, 297, 205);
		contentPane.add(txtArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
	//Declarar variables entrada
	int  minutosTardanza;
	int numeroObservaciones;
	//Declarar variables salida
	int PuntosPuntualidad;
	int PuntosRendimiento;
	int PuntosTotal;
	double bonificacion;
	
	//Lectura datos
	minutosTardanza=Integer.parseInt(txtMinutos.getText());
	numeroObservaciones=Integer.parseInt(txtObservaciones.getText());
	
	// Calculo puntos tardanza
	 if(minutosTardanza==0)
		PuntosPuntualidad=10;
	 else if (minutosTardanza <=2)
		PuntosPuntualidad=8;
	 else if (minutosTardanza <=5)
		PuntosPuntualidad=6;
	 else if(minutosTardanza<=9)
		PuntosPuntualidad=4;
	 else
		PuntosPuntualidad=0;
		
	// Calculo puntos observaciones
	if(numeroObservaciones==0)
		PuntosRendimiento=10;
	else if(numeroObservaciones==1)
		PuntosRendimiento=8;
	else if(numeroObservaciones==2)	
		PuntosRendimiento=5;
	else if(numeroObservaciones==3)
		PuntosRendimiento=1;
	else 
		PuntosRendimiento=0 ;

	// Calculo puntos total 
	PuntosTotal=PuntosRendimiento+PuntosPuntualidad;
	
	//Calculo bonificacion
		if (PuntosTotal<11)
			bonificacion=2.5;
		else if(PuntosTotal<=13)	
			bonificacion=5.0;
		else if(PuntosTotal<=16)	
			bonificacion=7.5;
		else if(PuntosTotal<=19)		
			bonificacion=10;
		else
			bonificacion=12.5;
		
	//Imprimir
	txtArea.setText(" PuntosPuntualidad: "  + PuntosPuntualidad+"\n");
	txtArea.append(" PuntosRendimiento: "  + PuntosRendimiento+"\n");
	txtArea.append(" PuntosTotal: "  + PuntosTotal+"\n");
	txtArea.append(" bonificacion: "  + bonificacion*PuntosTotal+"\n");
	
		
/*
//Declarar variables entrada
entero minutosTardanza
entero numeroObservaciones
//Declarar variables salida
entero PuntosPuntualidad
entero PuntosRendimiento
entero PuntosTotal
Real bonificacion

//Lectura datos
Leer minutosTardanza,numeroObservaciones

//Calculos
// Calculo puntos tardanza
 si(minutosTardanza==0 )
	PuntosPuntualidad=10
 sino si (minutosTardanza <=2)
	PuntosPuntualidad=8
 sino si (minutosTardanza <=5)
	PuntosPuntualidad=6
sino si(minutosTardanza<=9)
	PuntosPuntualidad=4
	sino 
	PuntosPuntualidad=0

// Calculo puntos observaciones
si(numeroObservaciones==0)
	PuntosRendimiento=10
sino si(numeroObservaciones==1)
	PuntosRendimiento=8
sino si(numeroObservaciones==2)	
	PuntosRendimiento=5
sino si(numeroObservaciones==3)
	PuntosRendimiento=1
	sino 
	PuntosRendimiento=0
		
// Calculo puntos total 
PuntosTotal=PuntosRendimiento+PuntosPuntualidad

//Calculo bonificacion
	si (PuntosTotal<11)
		bonificacion=2.5
	sino si(PuntosTotal<=13)	
		bonificacion=5.0
	sino si(PuntosTotal<=16)	
		bonificacion=7.5
	sino si(PuntosTotal<=19)		
		bonificacion=10
	sino
		bonificacion=12.5
		 */
	}
}
