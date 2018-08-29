package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import controller.JdbUtil;
import controller.PessoasJdbcDAO;
import controller.Rel_tarefa_pessoaJdbcDAO;
import controller.TarefasJdbcDAO;

public class EditarRelTarefaPessoas extends JFrame {
	int i = 0;
	
	JLabel lblDescricao = new JLabel("Digite o E-mail e clique em procurar.");
	JLabel lblEmailPessoa = new JLabel("Procurar pessoa: ");
	
	JTextField txtEmailPessoa = new JTextField();
	
	JButton procurar = new JButton("Procurar");
	
	JLabel lblTarefas = new JLabel("Tarefas: ");
	JLabel lblPessoas = new JLabel("Pessoas: ");
	JLabel lblEmail = new JLabel("E-mail: ");
	JLabel lblNome = new JLabel("Nome: ");
	JLabel lblSexo = new JLabel("Sexo: ");
	
	JRadioButton rbMasculino = new JRadioButton("Masculino");
	JRadioButton rbFeminino = new JRadioButton("Feminino");
	
	JComboBox<String> cbTarefas = new JComboBox<String>();
	JComboBox<String> cbPessoas = new JComboBox<String>();
	
	JLabel txtEmail= new JLabel();
	JLabel txtNome= new JLabel();
	JLabel txtSexo = new JLabel();
	
	ButtonGroup grupoSexo = new ButtonGroup();
	
	// Tarefa
	JLabel lblTitulo = new JLabel("Título: ");
	JLabel lblPrazoEstimado = new JLabel("Prazo Estimado: ");
	JLabel lblDescricaoTarefa = new JLabel("Descrição: ");
	JLabel lblDataInicio = new JLabel("Data Inicio: ");
	JLabel lblDataTermino = new JLabel("Data Termino: ");

	JLabel txtTitulo = new JLabel();
	JLabel txtPrazoEstimado = new JLabel();
	JLabel txtDescricaoTarefa = new JLabel();
	JLabel txtDataInicio = new JLabel();
	JLabel txtDataTermino = new JLabel();

	JButton atualizarPessoas= new JButton("");
	
	// Excluir relação
	JButton deletarRelacao = new JButton("");
	
	// Adicionar relação
	JButton adicionarRelacao = new JButton("");

	public EditarRelTarefaPessoas() {
		super("Cadastro de Clientes");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblTarefas.setBounds(20, 10, 100, 20);
		paine.add(lblTarefas);
		cbTarefas.setBounds(100, 10, 80, 20);
		paine.add(cbTarefas);
		
		lblPessoas.setBounds(310, 10, 100, 20);
		paine.add(lblPessoas);
		cbPessoas.setBounds(390, 10, 150, 20);
		paine.add(cbPessoas);
		
		// AAA
		lblNome.setBounds(310, 50, 100, 20);
		paine.add(lblNome);
		txtNome.setBounds(360, 50, 150, 20);
		paine.add(txtNome);
		
		lblEmail.setBounds(310, 80, 100, 20);
		paine.add(lblEmail);
		txtEmail.setBounds(360, 80, 150, 20);
		paine.add(txtEmail);

		lblSexo.setBounds(310, 110, 100, 20);
		paine.add(lblSexo);
		txtSexo.setBounds(360, 110, 100, 20);
		paine.add(txtSexo);
		
		atualizarPessoas.setBounds(310, 140, 40, 40);
		paine.add(atualizarPessoas);
		
		deletarRelacao.setBounds(360, 140, 40, 40);
		paine.add(deletarRelacao);
		
		adicionarRelacao.setBounds(410, 140, 40, 40);
		paine.add(adicionarRelacao);

		deletarRelacao.setIcon(new ImageIcon(getClass().getResource("/controller/img/lixo.png")));
		adicionarRelacao.setIcon(new ImageIcon(getClass().getResource("/controller/img/add.png")));
		atualizarPessoas.setIcon(new ImageIcon(getClass().getResource("/controller/img/refresh.png")));

		// AAA
		lblTitulo.setBounds(20, 50, 100, 20);
		paine.add(lblTitulo);
		txtTitulo.setBounds(100, 50, 120, 20);
		paine.add(txtTitulo);
		
		lblPrazoEstimado.setBounds(20, 80, 100, 20);
		paine.add(lblPrazoEstimado);
		txtPrazoEstimado.setBounds(153, 80, 67, 20);
		paine.add(txtPrazoEstimado);
		
		lblDescricaoTarefa.setBounds(20, 110, 100, 20);
		paine.add(lblDescricaoTarefa);
		txtDescricaoTarefa.setBounds(100, 110, 120, 20);
		paine.add(txtDescricaoTarefa);
		
		lblDataInicio.setBounds(20, 140, 100, 20);
		paine.add(lblDataInicio);
		txtDataInicio.setBounds(153, 140, 67, 20);
		paine.add(txtDataInicio);
		
		lblDataTermino.setBounds(20, 170, 100, 20);
		paine.add(lblDataTermino);
		txtDataTermino.setBounds(153, 170, 67, 20);
		paine.add(txtDataTermino);
		
		attTarefas();
		attPessoas();
		
		atualizarPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attPessoa();
			}
		});

		cbPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attPessoa();
			}
		});
		
		cbTarefas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attPessoas();
				attTarefa();
			}
		});
		
		deletarRelacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connection = JdbUtil.getConnection();
					Rel_tarefa_pessoaJdbcDAO rel = new Rel_tarefa_pessoaJdbcDAO(connection);
					PessoasJdbcDAO pes = new PessoasJdbcDAO(connection);
					
					String[] infPessoa = pes.retornarInfPessoa((String) cbPessoas.getSelectedItem());
					rel.deletar(Integer.parseInt((String) cbTarefas.getSelectedItem()), Integer.parseInt((String)infPessoa[3]));
					
					JOptionPane.showMessageDialog(null,"Relação excluida com sucesso.","Editar relação - tarefa", JOptionPane.INFORMATION_MESSAGE);
					attPessoas();
				} catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null,"Erro em excluir relação.","Editar relação - tarefa", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	public void attPessoas() {
		try {
			cbPessoas.removeAllItems();			
			Connection connection = JdbUtil.getConnection();
			Rel_tarefa_pessoaJdbcDAO rel = new Rel_tarefa_pessoaJdbcDAO(connection);
			
			i = 0;
			for ( String pessoa: rel.listarPessoas(Integer.parseInt((String) cbTarefas.getSelectedItem())) ) {
				cbPessoas.addItem(rel.listarPessoas(Integer.parseInt((String) cbTarefas.getSelectedItem())).get(i));
				i++;
			}	
			
			attPessoa();
			
		} catch (Exception ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null,"Erro em atualizar CB.PESSOAS.","Editar relação - tarefa", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void attTarefas() {
		try {
			cbTarefas.removeAllItems();
			Connection connection = JdbUtil.getConnection();
			TarefasJdbcDAO tar = new TarefasJdbcDAO(connection);
			
			i = 0;
			for ( String tarefa: tar.listar() ) {
				cbTarefas.addItem(tar.listar().get(i));
				i++;
			}
			
			attTarefa();
			
		} catch (Exception ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null,"Erro em atualizar CB.TAREFAS.","Editar relação - tarefa", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void attPessoa() {
		try {
			Connection connection = JdbUtil.getConnection();
			PessoasJdbcDAO pDAO = new PessoasJdbcDAO(connection);
			
			String[] resultado = pDAO.retornarInfPessoa(cbPessoas.getSelectedItem().toString());			
			
			txtNome.setText(resultado[0]);
			txtEmail.setText(resultado[1]);
			txtSexo.setText(resultado[2]);
			
		} catch (Exception ex) {
			//JOptionPane.showMessageDialog(null,"Erro ao atualizar dados da pessoa.","Editar relação - tarefa", JOptionPane.INFORMATION_MESSAGE);
			ex.printStackTrace();
		}
	}
	
	public void attTarefa() {
		try {
			Connection connection = JdbUtil.getConnection();
			TarefasJdbcDAO tDAO = new TarefasJdbcDAO(connection);

			String[] resultado = tDAO.retornarInfTarefa( Integer.parseInt( cbTarefas.getSelectedItem().toString() ) );

			txtTitulo.setText(resultado[0]);
			txtPrazoEstimado.setText(resultado[1]);
			txtDescricaoTarefa.setText(resultado[2]);
			txtDataInicio.setText(resultado[3]);
			txtDataTermino.setText(resultado[4]);
	
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null,"Erro ao atualizar dados da tarefas.","Editar relação - tarefa", JOptionPane.INFORMATION_MESSAGE);
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		EditarRelTarefaPessoas a = new EditarRelTarefaPessoas();
	}
}
