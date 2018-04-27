package view;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings({"serial", "unused", "unchecked", "rawtypes"})
public class Tela extends JFrame{

JLabel lblDescricao = new JLabel("Preencha os campos e clique em Gravar Dados.");
	
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	
	JLabel lblEnd = new JLabel("Endereço: ");
	JTextField txtEnd = new JTextField();
	
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();
	
	JLabel lblEstado = new JLabel("Estado: ");
	JComboBox cbEstado = new JComboBox();
	
	JLabel lblTel = new JLabel("Telefone: ");
	JTextField txtTel = new JTextField();
	
	JLabel lblCel = new JLabel("Celular: ");
	JTextField txtCel = new JTextField();
	
	JLabel lblEmail = new JLabel("Email: ");
	JTextField txtEmail = new JTextField();
	
	public Tela() {
		super("Janela com Novo Layout");
		
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(15, 1));
		
		pane.add(lblNome);
		pane.add(txtNome);
		pane.add(lblEnd);
		pane.add(txtEnd);
		pane.add(lblBairro);
		pane.add(txtBairro);
		pane.add(lblEstado);
		pane.add(cbEstado);
		cbEstado.addItem("SP");
		cbEstado.addItem("RJ");
		cbEstado.addItem("SC");
		pane.add(lblTel);
		pane.add(txtTel);
		pane.add(lblCel);
		pane.add(txtCel);
		pane.add(lblEmail);
		pane.add(txtEmail);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setResizable(false);
	}
	
	
	public static void main(String[] args) {		
		Tela janela = new Tela();
	}

}
