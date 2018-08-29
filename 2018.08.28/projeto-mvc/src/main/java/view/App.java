package view;

import java.sql.Connection;

import controller.JdbUtil;
import controller.TarefasJdbcDAO;

public class App 
{
	@SuppressWarnings("unused")
    public static void main( String[] args ) throws ClassNotFoundException
    {
		try {
		Connection connection = JdbUtil.getConnection();
		//CadastroPessoas janelaPessoas = new CadastroPessoas();
    	//CadastroTarefas janelaTarefas = new CadastroTarefas();
		
		TarefasJdbcDAO tar = new TarefasJdbcDAO(connection);
		System.out.println(tar.listar().size());
		
		} catch (Exception ex) {
			
		}
    }
}
