package proyecto01;

import javax.swing.*;
import java.awt.*;

public class FormularioResultados extends JInternalFrame {
    private JTextArea areaResultados;
    private JTextField campoTexto;
    private JButton botonEnviar;

    public FormularioResultados() {
        setTitle("Formulario con Entrada y Resultados");
        setBounds(50, 50, 600, 400);
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setLayout(new BorderLayout());

        // Panel superior (entrada)
        JPanel panelEntrada = new JPanel();
        panelEntrada.setLayout(new FlowLayout()); // También puedes usar GridLayout o BoxLayout

        JLabel etiqueta = new JLabel("Ingrese texto:");
        campoTexto = new JTextField(20);
        botonEnviar = new JButton("Enviar");

        // Agregar componentes al panel de entrada
        panelEntrada.add(etiqueta);
        panelEntrada.add(campoTexto);
        panelEntrada.add(botonEnviar);

        // Panel central (resultados)
        areaResultados = new JTextArea();
        areaResultados.setEditable(false); // Deshabilitar edición
        JScrollPane scrollResultados = new JScrollPane(areaResultados);

        // Agregar los paneles al formulario
        add(panelEntrada, BorderLayout.NORTH);
        add(scrollResultados, BorderLayout.CENTER);

        // Acción del botón
        botonEnviar.addActionListener(e -> agregarResultado());
    }

    // Método para agregar texto al área de resultados
    private void agregarResultado() {
    	//MainFrame.modelo01="Indurama";
		//System.out.println("modelo01 Formulario Interno: " + MainFrame.modelo01);

        String texto = campoTexto.getText();
        if (!texto.isEmpty()) {
            areaResultados.append(texto + "\n"); // Añade el texto con un salto de línea
            campoTexto.setText(""); // Limpiar campo de entrada
            MainFrame.modelo01=texto;
            System.out.println("modelo01 Formulario Interno: " + MainFrame.modelo01);
            
        } else {
            JOptionPane.showMessageDialog(this, "El campo está vacío.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
