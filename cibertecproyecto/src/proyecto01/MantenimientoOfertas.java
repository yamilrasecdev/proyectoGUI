package proyecto01;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class MantenimientoOfertas extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoOfertas frame = new MantenimientoOfertas();
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
	public MantenimientoOfertas() {
		setTitle("Mantenimiento Ofertas");
		setBounds(100, 100, 450, 300);

	}

}
