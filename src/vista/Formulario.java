package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Formulario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNom;
	private JTextField tfApe;
	private JTextField tfNId;
	private JTextField tfTel;
	private JTextField tfCorreo;
	private JTextField tfCCorreo;
	private JPasswordField pfPassw;
	private JPasswordField pfCPassw;

	
	public Formulario() {
		setLayout(null);

		JLabel lbTitulo = new JLabel("Formulario de Registro");
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbTitulo.setBounds(32, 10, 435, 32);
		add(lbTitulo);

		tfNom = new JTextField();
		tfNom.setBounds(8, 69, 470, 37);
		add(tfNom);
		tfNom.setColumns(10);

		JLabel lbNom = new JLabel("Nombres");
		lbNom.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		lbNom.setBounds(8, 52, 58, 13);
		add(lbNom);

		JLabel lbApe = new JLabel("Apellidos");
		lbApe.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		lbApe.setBounds(8, 116, 58, 13);
		add(lbApe);

		tfApe = new JTextField();
		tfApe.setColumns(10);
		tfApe.setBounds(8, 133, 470, 37);
		add(tfApe);

		JLabel lbId = new JLabel("Tipo de Indentificacion");
		lbId.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		lbId.setBounds(8, 180, 148, 13);
		add(lbId);

		JComboBox cbId = new JComboBox();
		cbId.setModel(new DefaultComboBoxModel(
				new String[] { "Selecciona", "Cedula de Ciudadania", "Cedula de Extrenjeria", "Pasaporte" }));
		cbId.setMaximumRowCount(5);
		cbId.setBounds(8, 203, 470, 37);
		add(cbId);

		tfNId = new JTextField();
		tfNId.setColumns(10);
		tfNId.setBounds(8, 269, 470, 37);
		add(tfNId);

		JLabel lbNId = new JLabel("Numero de Documento");
		lbNId.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		lbNId.setBounds(8, 252, 148, 13);
		add(lbNId);

		JLabel lbUbi = new JLabel("Lugar donde Vives");
		lbUbi.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		lbUbi.setBounds(8, 316, 148, 13);
		add(lbUbi);

		JComboBox cbUbi = new JComboBox();
		cbUbi.setModel(new DefaultComboBoxModel(new String[] { "Selecciona", "Medellín", "Cali", "Barranquilla",
				"Cartagena", "Bucaramanga", "Pereira", "Manizales", "Santa Marta", "Cúcuta", "Pasto" }));
		cbUbi.setMaximumRowCount(5);
		cbUbi.setBounds(8, 339, 470, 37);
		add(cbUbi);

		JLabel lbTel = new JLabel("Numero de Telefono");
		lbTel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		lbTel.setBounds(8, 386, 148, 13);
		add(lbTel);

		tfTel = new JTextField();
		tfTel.setColumns(10);
		tfTel.setBounds(8, 403, 470, 37);
		add(tfTel);

		JLabel lbNaci = new JLabel("Nacionalidad");
		lbNaci.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		lbNaci.setBounds(8, 450, 148, 13);
		add(lbNaci);

		JComboBox cbNaci = new JComboBox();
		cbNaci.setModel(new DefaultComboBoxModel(new String[] { "Seleccione", "Colombiana", "otro" }));
		cbNaci.setMaximumRowCount(5);
		cbNaci.setBounds(8, 473, 470, 37);
		add(cbNaci);

		JLabel lbCorreo = new JLabel("Correo");
		lbCorreo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		lbCorreo.setBounds(8, 520, 148, 13);
		add(lbCorreo);

		tfCorreo = new JTextField();
		tfCorreo.setColumns(10);
		tfCorreo.setBounds(8, 537, 470, 37);
		add(tfCorreo);

		JLabel lbCCorreo = new JLabel("Confirmar Correo");
		lbCCorreo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		lbCCorreo.setBounds(8, 584, 148, 13);
		add(lbCCorreo);

		tfCCorreo = new JTextField();
		tfCCorreo.setColumns(10);
		tfCCorreo.setBounds(8, 601, 470, 37);
		add(tfCCorreo);

		pfPassw = new JPasswordField();
		pfPassw.setBounds(8, 671, 470, 37);
		add(pfPassw);

		JLabel lbPassw = new JLabel("Contraseña");
		lbPassw.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		lbPassw.setBounds(8, 648, 148, 13);
		add(lbPassw);

		JLabel lbCPassw = new JLabel("Confirmar Contraseña");
		lbCPassw.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		lbCPassw.setBounds(8, 718, 148, 13);
		add(lbCPassw);

		pfCPassw = new JPasswordField();
		pfCPassw.setBounds(8, 741, 470, 37);
		add(pfCPassw);

		JCheckBox cbConfirm = new JCheckBox(
				"Autorizacion de Tratamiento de Datos y Aceptacion de Terminos y Condiciones");
		cbConfirm.setBounds(8, 784, 470, 21);
		add(cbConfirm);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		btnAceptar.setBounds(131, 811, 231, 37);
		add(btnAceptar);

	}
}
