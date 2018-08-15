package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Rel_tarefa_pessoa;

public class Rel_tarefa_pessoaJdbcDAO {
	private Connection conn;
	
	public Rel_tarefa_pessoaJdbcDAO(Connection conn) {
		this.conn = conn;
	}
	
	public void salvar(Rel_tarefa_pessoa c) throws SQLException {
		String sql = "insert into rel_tarefa_pessoa (id_tarefa, id_pessoa) values ('"+c.getId_tarefa()+"','"+c.getId_pessoa()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	}
	
	public void alterar(Rel_tarefa_pessoa c) {
		String sql = "update rel_tarefa_pessoa set id_tarefa='"+c.getId_tarefa()+",id_pessoa='"+c.getId_pessoa()+"' where id = "+c.getId()+";";
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
		String sql = "delete from rel_tarefa_pessoa where id = " + id;
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