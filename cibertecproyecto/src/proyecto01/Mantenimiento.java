package proyecto01;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Mantenimiento extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JComboBox comboBox;
	private JButton Grabar;
	private JPasswordField passwordField;
	private JRadioButton rdbtnNewRadioButton;
	private JSpinner spinner;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1;
	private JLabel lblContrasea;
	private Panel panel;
	
	private MainFrame mainframeLocal;//agrego el atributo MainFrame para crear un formulario mantenimiento

	
	
	/**
	 * Create the frame.
	 */
	//public Mantenimiento() {
	//Agrego un MainFrame en el constructor del Mantenimiento
	public Mantenimiento(MainFrame MymainframeLocal) {
		setTitle("Mantenimiento Productos");
		setBounds(100, 100, 682, 470);
		setClosable(true);		
		setMaximizable (true);
		setIconifiable(true);
		setResizable(true);
		getContentPane().setLayout(null);
		
		separator = new JSeparator();
		separator.setBounds(84, 126, 1, 2);
		getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(41, 150, 445, 0);
		getContentPane().add(separator_1);
		
		panel = new Panel();
		panel.setBackground(SystemColor.info);
		panel.setBounds(33, 10, 570, 209);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(21, 11, 86, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		textField = new JTextField();
		textField.setBounds(117, 9, 150, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("Sexo");
		lblNewLabel.setBounds(21, 36, 86, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		comboBox = new JComboBox();
		comboBox.setBounds(110, 40, 157, 22);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Femenino", "Masculino"}));
		
		lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(21, 73, 86, 14);
		panel.add(lblContrasea);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(117, 71, 193, 20);
		panel.add(passwordField);
		
		spinner = new JSpinner();
		spinner.setBounds(140, 101, 30, 20);
		panel.add(spinner);
		
		Grabar = new JButton("");
		Grabar.addActionListener(this);
		Grabar.setBounds(407, 22, 86, 49);
		panel.add(Grabar);
		Grabar.setIcon(new ImageIcon(Mantenimiento.class.getResource("/iconos/icons8-disquete-48.png")));
		
		rdbtnNewRadioButton = new JRadioButton("Nuevo");
		rdbtnNewRadioButton.setBounds(117, 143, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		
		//Asigno al atributo mainframeLocal del formulario
		this.mainframeLocal=MymainframeLocal;
		System.out.println("variableGlobal en constructor de Mantenimiento :" + mainframeLocal.variableGlobal);


	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Grabar) {
			actionPerformedGrabar(e);
		}
	}
	protected void actionPerformedGrabar(ActionEvent e) {
		///System.out.println("valor de modelo 01:" + MainFrame.modelo01);
		mainframeLocal.variableGlobal="Cocina LG";
		System.out.println("variableGlobal en boton del form mantenimiento :" + mainframeLocal.variableGlobal);

	}
}
