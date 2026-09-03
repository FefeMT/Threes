package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {
	
	
	public static void main(String[] args) {

		VentanaPrincipal ventana = new VentanaPrincipal();

		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	
		panelTablero.mostrarFicha(0, 0, 1);
		panelTablero.mostrarFicha(0, 1, 2);
		panelTablero.mostrarFicha(1, 1, 3);
		panelTablero.mostrarFicha(2, 2, 12);
		panelTablero.mostrarFicha(3, 3, 48);
	
	}
	
	

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel lblPuntaje;
	private static PanelTablero panelTablero;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Threes!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 700);
		setMinimumSize(new Dimension(500, 600));

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);

		// =========================
		// PANEL SUPERIOR
		// =========================

		JPanel panelSuperior = new JPanel();
		panelSuperior.setLayout(new GridBagLayout());

		contentPane.add(panelSuperior, BorderLayout.NORTH);

		JLabel lblTitulo = new JLabel("THREES!");
		lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 32));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

		GridBagConstraints gbcTitulo = new GridBagConstraints();
		gbcTitulo.gridx = 0;
		gbcTitulo.gridy = 0;
		gbcTitulo.weightx = 1.0;
		gbcTitulo.anchor = GridBagConstraints.WEST;
		gbcTitulo.insets = new Insets(0, 0, 5, 0);

		panelSuperior.add(lblTitulo, gbcTitulo);

		// Puntaje
		lblPuntaje = new JLabel("Puntaje: 0");
		lblPuntaje.setFont(new Font("SansSerif", Font.BOLD, 18));

		GridBagConstraints gbcPuntaje = new GridBagConstraints();
		gbcPuntaje.gridx = 1;
		gbcPuntaje.gridy = 0;
		gbcPuntaje.anchor = GridBagConstraints.EAST;
		gbcPuntaje.insets = new Insets(0, 10, 5, 0);

		panelSuperior.add(lblPuntaje, gbcPuntaje);

		// Botón nueva partida
		JButton btnNuevaPartida = new JButton("Nueva partida");
		btnNuevaPartida.setFont(new Font("SansSerif", Font.PLAIN, 14));

		GridBagConstraints gbcNuevaPartida = new GridBagConstraints();
		gbcNuevaPartida.gridx = 1;
		gbcNuevaPartida.gridy = 1;
		gbcNuevaPartida.anchor = GridBagConstraints.EAST;
		gbcNuevaPartida.insets = new Insets(5, 10, 0, 0);

		panelSuperior.add(btnNuevaPartida, gbcNuevaPartida);

		// =========================
		// TABLERO
		// =========================

		panelTablero = new PanelTablero();

		contentPane.add(panelTablero, BorderLayout.CENTER);

		// =========================
		// PANEL INFERIOR
		// =========================

		JLabel lblInstrucciones = new JLabel(
				"Usá las flechas del teclado para mover las fichas"
		);

		lblInstrucciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstrucciones.setFont(new Font("SansSerif", Font.PLAIN, 14));

		contentPane.add(lblInstrucciones, BorderLayout.SOUTH);
	}
}