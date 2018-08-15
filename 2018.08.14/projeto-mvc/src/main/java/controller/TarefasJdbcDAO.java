package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Tarefas;

public class TarefasJdbcDAO {
	private Connection conn;
	
	public TarefasJdbcDAO(Connection conn) {
		this.conn = conn;
	}
	
	public void salvar(Tarefas c) throws SQLException {
		String sql = "insert into tarefa (titulo, prazo_estimado, descricao, data_inicio, data_termino) values ('"+c.getTitulo()+"','"+c.getPrazo_estimado()+"','"+c.getDescricao()+"','"+c.getData_inicio()+"','"+c.getData_termino()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	}
	
	public void alterar(Tarefas c) {
		String sql = "update tarefa set titulo='"+c.getTitulo()+"',prazo_estimado='"+c.getPrazo_estimado()+"',descricao='"+c.getDescricao()+"',data_inicio='"+c.getData_inicio()+"',data_termino='"+c.getData_termino()+" where id = "+c.getId()+";";
		System.out.println(sql);
		PreparedStatement prepareStatement;
		try {
			prepareStatement = this.conn.prepareStatement(sql);
			prepareStatement.executeUpdate();
            prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void deletar(int id) {
		String sql = "delete from tarefa where id = " + id;
		System.out.println(sql);
        try {
    		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
    		prepareStatement.executeUpdate();
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}                		
	}
}
