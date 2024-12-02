package proyecto01;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MantenimientoInterno extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	
	private MainFrame mainframeLocal;
	private JTextField txtVariable1;
	private JTextField txtVariable2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextArea txtArea;
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoInterno frame = new MantenimientoInterno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 */
	
	/**
	 * Create the frame.
	 */
//	public MantenimientoInterno() {
	public MantenimientoInterno(MainFrame mainframeLocal) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		txtVariable1 = new JTextField();
		txtVariable1.setBounds(47, 63, 86, 20);
		getContentPane().add(txtVariable1);
		txtVariable1.setColumns(10);
		
		txtVariable2 = new JTextField();
		txtVariable2.setBounds(47, 112, 86, 20);
		getContentPane().add(txtVariable2);
		txtVariable2.setColumns(10);
		
		btnNewButton = new JButton("Leer Datos Globales");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(250, 62, 135, 23);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cambiar Datos Globales");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(242, 111, 143, 23);
		getContentPane().add(btnNewButton_1);
		
		txtArea = new JTextArea();
		txtArea.setBounds(45, 156, 300, 84);
		getContentPane().add(txtArea);
		
		this.mainframeLocal=mainframeLocal;

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		txtVariable1.setText(mainframeLocal.variableGlobal);
		txtVariable2.setText(MainFrame.modelo01);
	}
	

	
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		
		//actualizo variables globales
		mainframeLocal.variableGlobal=txtVariable1.getText();
		
		MainFrame.modelo01=txtVariable2.getText();
		
		// imprimo nuevo valor variables global
		txtArea.setText("variable global 2:"+mainframeLocal.variableGlobal+"\n");
		txtArea.append("variable global 1:"+MainFrame.modelo01+"\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
