package view;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controller.JdbUtil;
import controller.MetodologiaJdbcDAO;
import controller.TarefasJdbcDAO;
import model.Metodologia;
import model.Tarefas;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionEvent;

public class CadastroTarefas extends JFrame {
	JLabel lblDescricao = new JLabel("Preencha os campos e clique em Cadastrar.");
	
	JLabel lblNomeTarefa = new JLabel("Nome da tarefa: ");
	JTextField txtNomeTarefa = new JTextField();
	
	JLabel lblPrazoEstimado = new JLabel("Prazo estimado (AAAA-MM-DD): ");
	JFormattedTextField txtPrazoEstimado = new JFormattedTextField();
	
	JLabel lblDescricaoTarefa = new JLabel("Descrição: ");
	JTextField txtDescricaoTarefa = new JTextField();
	
	JLabel lblDataInicio = new JLabel("Data de início (AAAA-MM-DD): ");
	JFormattedTextField txtDataInicio = new JFormattedTextField();
	
	JLabel lblDataTermino = new JLabel("Data de término (AAAA-MM-DD): ");
	JFormattedTextField txtDataTermino = new JFormattedTextField();
	
	JLabel lblMetodologia = new JLabel("Metodologia: ");
	JTextField txtMetodologia = new JTextField();
	
	JButton novoCadastro = new JButton("Cadastrar");
	
	public CadastroTarefas() {
		super("Cadastro de Tarefas");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblDescricao.setBounds(20, 10, 300, 20);
		paine.add(lblDescricao);
		
		lblNomeTarefa.setBounds(20, 40, 100, 20);
		paine.add(lblNomeTarefa);
		txtNomeTarefa.setBounds(120, 40, 180, 20);
		paine.add(txtNomeTarefa);
		
		lblPrazoEstimado.setBounds(20, 70, 190, 20);
		paine.add(lblPrazoEstimado);
		txtPrazoEstimado.setBounds(205, 70, 67, 20);
		paine.add(txtPrazoEstimado);
		
		lblDescricaoTarefa.setBounds(20, 100, 100, 20);
		paine.add(lblDescricaoTarefa);
		txtDescricaoTarefa.setBounds(100, 100, 200, 20);
		paine.add(txtDescricaoTarefa);
		
		lblMetodologia.setBounds(20, 130, 100, 20);
		paine.add(lblMetodologia);
		txtMetodologia.setBounds(100, 130, 200, 20);
		paine.add(txtMetodologia);
		
		lblDataInicio.setBounds(20, 180, 190, 20);
		paine.add(lblDataInicio);
		txtDataInicio.setBounds(205, 180, 67, 20);
		paine.add(txtDataInicio);
		
		lblDataTermino.setBounds(20, 210, 190, 20);
		paine.add(lblDataTermino);
		txtDataTermino.setBounds(205, 210, 67, 20);
		paine.add(txtDataTermino);
		
		novoCadastro.setBounds(8, 270, 150, 40);
		paine.add(novoCadastro);
		
		
		try {
			MaskFormatter mskPrazo = new MaskFormatter("####/##/##");
			mskPrazo.setPlaceholderCharacter('_');
			mskPrazo.install(txtPrazoEstimado);
			
			MaskFormatter mskDtInicio = new MaskFormatter("####/##/##");
			mskDtInicio.setPlaceholderCharacter('_');
			mskDtInicio.install(txtDataInicio);
			
			MaskFormatter mskDtTermino = new MaskFormatter("####/##/##");
			mskDtTermino.setPlaceholderCharacter('_');
			mskDtTermino.install(txtDataTermino);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		
		novoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tarefas tarefa1 = new Tarefas();
				Metodologia metodologia1 = new Metodologia();
				
				if (!txtNomeTarefa.getText().isEmpty() && !txtPrazoEstimado.getText().isEmpty() && !txtDataInicio.getText().isEmpty()) {
					try {
						Connection connection = JdbUtil.getConnection();
						TarefasJdbcDAO tarefasJdbcDAO = new TarefasJdbcDAO(connection);
						MetodologiaJdbcDAO metodologiaJdbcDAO = new MetodologiaJdbcDAO(connection);

						tarefa1.setTitulo(txtNomeTarefa.getText());
						tarefa1.setPrazo_estimado(txtPrazoEstimado.getText());
						tarefa1.setDescricao(txtDescricaoTarefa.getText());
						tarefa1.setData_inicio(txtDataInicio.getText());
						tarefa1.setData_termino(txtDataTermino.getText());
						metodologia1.setTitulo(txtMetodologia.getText());
						
						tarefasJdbcDAO.salvar(tarefa1);
						metodologiaJdbcDAO.salvar(metodologia1);
						
						JOptionPane.showMessageDialog(null,"Cadastro da tarefa " + tarefasJdbcDAO.ultimaTarefa() + " realizado com sucesso.","Cadastro de Tarefa", JOptionPane.INFORMATION_MESSAGE);
						CadastroRelTarefaPessoa reltarefapessoa = new CadastroRelTarefaPessoa();
					} catch(Exception ex) {
						JOptionPane.showMessageDialog(null,"Erro","Cadastro de Tarefa", JOptionPane.CLOSED_OPTION);
						ex.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null,"Preencha todos os campos","Cadastro de Tarefa", JOptionPane.CLOSED_OPTION);
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
		CadastroTarefas janela = new CadastroTarefas();
	}
}
