package proyecto01;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Mantenimiento extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mantenimiento frame = new Mantenimiento();
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
	public Mantenimiento() {
		setTitle("Mantenimiento Productos");
		setBounds(100, 100, 450, 300);

	}

}
