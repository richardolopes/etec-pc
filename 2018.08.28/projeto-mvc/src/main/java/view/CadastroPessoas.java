package view;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.JdbUtil;
import controller.PessoasJdbcDAO;
import model.Pessoas;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;

public class CadastroPessoas extends JFrame {
	ButtonGroup grupoSexo = new ButtonGroup();
	
	JRadioButton rbMasculino = new JRadioButton("Masculino");
	JRadioButton rbFeminino = new JRadioButton("Feminino");
	
	JLabel lblDescricao = new JLabel("Preencha os campos e clique em Cadastrar.");
	
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome= new JTextField();
	
	JLabel lblEmail = new JLabel("E-mail: ");
	JTextField txtEmail = new JTextField();
	
	JLabel lblSexo = new JLabel("Sexo: ");
	
	JButton novoCadastro = new JButton("Cadastrar");
	
	public CadastroPessoas() {
		super("Cadastro de Pessoas");
		
		grupoSexo.add(rbFeminino);
		grupoSexo.add(rbMasculino);	
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblDescricao.setBounds(20, 10, 300, 20);
		paine.add(lblDescricao);
		
		lblNome.setBounds(20, 40, 100, 20);
		paine.add(lblNome);
		txtNome.setBounds(65, 40, 180, 20);
		paine.add(txtNome);
		
		lblEmail.setBounds(20, 70, 100, 20);
		paine.add(lblEmail);
		txtEmail.setBounds(65, 70, 180, 20);
		paine.add(txtEmail);
		
		lblSexo.setBounds(20, 100, 100, 20);
		paine.add(lblSexo);
		
		rbMasculino.setBounds(60, 100, 100, 20);
		paine.add(rbMasculino);
		
		rbFeminino.setBounds(60, 120, 100, 20);
		paine.add(rbFeminino);
		
		novoCadastro.setBounds(8, 160, 150, 40);
		paine.add(novoCadastro);
		
		novoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoas pessoa1 = new Pessoas();
				
				try {
					if (!txtNome.getText().isEmpty() && !txtEmail.getText().isEmpty() && grupoSexo.getSelection() != null) {
						Connection connection = JdbUtil.getConnection();
						PessoasJdbcDAO pessoasJdbcDao = new PessoasJdbcDAO(connection);
						
						if (pessoasJdbcDao.verificarEmail(txtEmail.getText()) > 0) {
							JOptionPane.showMessageDialog(null,"E-mail já cadastrado.","OK", JOptionPane.INFORMATION_MESSAGE);
						} else {
							try {
								pessoa1.setNome(txtNome.getText());
								pessoa1.setEmail(txtEmail.getText());
								
								if (rbMasculino.isSelected()) {
									pessoa1.setSexo("masculino");
								} else {
									pessoa1.setSexo("feminino");
								}

								pessoasJdbcDao.salvar(pessoa1);
			
								JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso.","Cadastro", JOptionPane.INFORMATION_MESSAGE);
							} catch(Exception ex) {
								JOptionPane.showMessageDialog(null,"Erro ao cadastrar.","Cadastro", JOptionPane.CLOSED_OPTION);
								ex.printStackTrace();
							}
						}
					} else {
						JOptionPane.showMessageDialog(null,"Preencha todos os campos.","Cadastro", JOptionPane.CLOSED_OPTION);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"Erro de conexão.","Cadastro", JOptionPane.CLOSED_OPTION);
					ex.printStackTrace();
				}
			}
		});
		
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(330, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args) {
		CadastroPessoas janela = new CadastroPessoas();
	}
}
