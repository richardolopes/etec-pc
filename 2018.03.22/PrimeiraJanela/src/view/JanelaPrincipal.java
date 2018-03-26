package view;

import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JanelaPrincipal extends JFrame {
	
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
	
	JButton gravarCadastro = new JButton("Gravar Cadastro");
	JButton novoCadastro = new JButton("Novo Cadastro");
	JButton verCadastro = new JButton("Ver Cadastros");
	
	public JanelaPrincipal() {
		super("Cadastro de Clientes");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblDescricao.setBounds(20, 10, 300, 20);
		paine.add(lblDescricao);
		
		lblNome.setBounds(20, 40, 100, 20);
		paine.add(lblNome);
		txtNome.setBounds(100, 40, 200, 20);
		paine.add(txtNome);
		
		lblEnd.setBounds(20, 70, 100, 20);
		paine.add(lblEnd);
		txtEnd.setBounds(100, 70, 200, 20);
		paine.add(txtEnd);
		
		lblBairro.setBounds(20, 100, 100, 20);
		paine.add(lblBairro);
		txtBairro.setBounds(100, 100, 200, 20);
		paine.add(txtBairro);
		
		lblEstado.setBounds(20, 130, 100, 20);
		paine.add(lblEstado);
		cbEstado.setBounds(100, 130, 150, 20);
		paine.add(cbEstado);
		cbEstado.addItem("SP");
		cbEstado.addItem("RJ");
		cbEstado.addItem("SC");
		
		lblTel.setBounds(20, 160, 100, 20);
		paine.add(lblTel);
		txtTel.setBounds(100, 160, 100, 20);
		paine.add(txtTel);
		
		lblCel.setBounds(20, 190, 100, 20);
		paine.add(lblCel);
		txtCel.setBounds(100, 190, 100, 20);
		paine.add(txtCel);
		
		lblEmail.setBounds(20, 220, 100, 20);
		paine.add(lblEmail);
		txtEmail.setBounds(100, 220, 200, 20);
		paine.add(txtEmail);
		
		gravarCadastro.setBounds(8, 250, 150, 40);
		paine.add(gravarCadastro);
		
		novoCadastro.setBounds(165, 250, 150, 40);
		paine.add(novoCadastro);
		
		verCadastro.setBounds(8, 300, 150, 40);
		paine.add(verCadastro);
		
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(330, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		JanelaPrincipal janela = new JanelaPrincipal();

	}
}