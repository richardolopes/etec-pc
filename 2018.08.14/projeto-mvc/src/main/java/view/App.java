package view;

import java.sql.Connection;

import controller.TarefasJdbcDAO;
import controller.PessoasJdbcDAO;
import controller.JdbUtil;

import model.Tarefas;
import model.Pessoas;
import model.Rel_tarefa_pessoa;
import model.Metodologia;

public class App 
{
    public static void main( String[] args )
    {
    	Tarefas tarefa1 = new Tarefas();
		Pessoas pessoa1 = new Pessoas();
		Pessoas rel_tarefa_p1 = new Pessoas();
		Pessoas metodologia1 = new Pessoas();
		
		try {
			tarefa1.setTitulo("Tarefa 5");
			tarefa1.setPrazo_estimado("2018-07-09");
			tarefa1.setDescricao("Descricao tarefa 5");
			tarefa1.setData_inicio("2018-07-06");
			tarefa1.setData_termino("2018-07-09");
			
	
			pessoa1.setNome("");
			pessoa1.setEmail("");
			pessoa1.setSexo("");
			
			Connection connection = JdbUtil.getConnection();
			
			TarefasJdbcDAO tarefasJdbcDao = new TarefasJdbcDAO(connection);
			PessoasJdbcDAO pessoasJdbcDao = new PessoasJdbcDAO(connection);
			//TarefasJdbcDAO tarefasJdbcDao = new TarefasJdbcDAO(connection);
			//TarefasJdbcDAO tarefasJdbcDao = new TarefasJdbcDAO(connection);
			
			tarefasJdbcDao.salvar(tarefa1);
			pessoasJdbcDao.salvar(pessoa1);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
}
