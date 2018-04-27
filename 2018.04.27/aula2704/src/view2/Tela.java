package view2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings({"serial", "unused"})
public class Tela extends JFrame{

	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField(45);
	JLabel lblEndereco = new JLabel("Endereco: ");
	JTextField txtEndereco = new JTextField(45);
	
	public Tela() {
		super("Janela com Novo Layout");
		
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		pane.add(lblNome);
		pane.add(txtNome);
		pane.add(lblEndereco);
		pane.add(txtEndereco);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550, 500);
	}
	
	
	public static void main(String[] args) {
		Tela janela = new Tela();
	}

}
