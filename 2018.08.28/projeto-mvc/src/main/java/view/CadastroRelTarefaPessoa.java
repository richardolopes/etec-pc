package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.JdbUtil;
import controller.PessoasJdbcDAO;
import controller.Rel_tarefa_pessoaJdbcDAO;
import controller.TarefasJdbcDAO;
import model.Rel_tarefa_pessoa;
import model.Tarefas;

public class CadastroRelTarefaPessoa extends JFrame {
	JLabel lblDescricao = new JLabel("Preencha os campos e clique em Cadastrar.");
	
	JLabel lblPessoa = new JLabel("E-mail:");
	JTextField txtPessoa = new JTextField();
	
	JButton novoCadastro = new JButton("Cadastrar");
	
	public CadastroRelTarefaPessoa() {
		super("Relação Tarefa - Pessoa");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblDescricao.setBounds(20, 10, 300, 20);
		paine.add(lblDescricao);
		
		lblPessoa.setBounds(20, 70, 100, 20);
		paine.add(lblPessoa);
		txtPessoa.setBounds(120, 70, 180, 20);
		paine.add(txtPessoa);
		
		novoCadastro.setBounds(8, 270, 150, 40);
		paine.add(novoCadastro);
		
		novoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!txtPessoa.getText().isEmpty()) {
						Connection connection = JdbUtil.getConnection();
						Rel_tarefa_pessoaJdbcDAO rel_tarefa_pessoa = new Rel_tarefa_pessoaJdbcDAO(connection);
						TarefasJdbcDAO tarefa = new TarefasJdbcDAO(connection);
						PessoasJdbcDAO pessoas = new PessoasJdbcDAO(connection);
						Rel_tarefa_pessoa relTarefaPessoa1 = new Rel_tarefa_pessoa();
						
						if (pessoas.verificarEmail(txtPessoa.getText()) > 0) {
							//if (rel_tarefa_pessoa.verificarTarefaPessoa(tarefa.ultimaTarefa(), pessoas.retornarIdPessoa(txtPessoa.getText()) ) > 0) {
							
							String[] id = pessoas.retornarInfPessoa(txtPessoa.getText());
							
							if (rel_tarefa_pessoa.verificarTarefaPessoa(tarefa.ultimaTarefa(), Integer.parseInt(id[3]) ) > 0) {
								JOptionPane.showMessageDialog(null,"Relação já feita","Relação Tarefa - Pessoa", JOptionPane.INFORMATION_MESSAGE);
							} else {
								try {
									relTarefaPessoa1.setId_pessoa( Integer.parseInt(id[3]) );
									relTarefaPessoa1.setId_tarefa( tarefa.ultimaTarefa() );
	
									rel_tarefa_pessoa.salvar(relTarefaPessoa1);
									
									JOptionPane.showMessageDialog(null,"Relação realizada com sucesso.","Relação Tarefa - Pessoa", JOptionPane.INFORMATION_MESSAGE);
								} catch (Exception ex) {
									JOptionPane.showMessageDialog(null,"Erro ao cadastrar.","Relação Tarefa - Pessoa", JOptionPane.CLOSED_OPTION);
									ex.printStackTrace();
								}
							}
						} else {
							JOptionPane.showMessageDialog(null,"E-mail não encontrado","Tarefa - Pessoa", JOptionPane.CLOSED_OPTION);
						}
					}
					
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"Erro de conexão","Tarefa - Pessoa", JOptionPane.CLOSED_OPTION);
					ex.printStackTrace();
				}
			}
		});
		
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(330, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		CadastroRelTarefaPessoa janela = new CadastroRelTarefaPessoa();
	}
}
