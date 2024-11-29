package proyecto01;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class FormularioCocina extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioCocina frame = new FormularioCocina();
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
	public FormularioCocina() {
		setBounds(100, 100, 648, 495);

	}

}
