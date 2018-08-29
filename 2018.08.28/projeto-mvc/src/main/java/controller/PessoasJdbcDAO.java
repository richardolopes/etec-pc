package controller;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Pessoas;

public class PessoasJdbcDAO {
private Connection conn;
	
	public PessoasJdbcDAO(Connection conn) {
		this.conn = conn;
	}
	
	public void salvar(Pessoas c) throws SQLException {
		String sql = "insert into pessoa (nome, email, sexo) values ('"+c.getNome()+"','"+c.getEmail()+"','"+c.getSexo()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	}
	
	public void alterar(Pessoas c) {
		String sql = "update pessoa set nome='"+c.getNome()+"',email='"+c.getEmail()+"',sexo='"+c.getSexo()+"' where id = "+c.getId()+";";
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
		String sql = "select * from rel_tarefa_pessoa where id_pessoa = '" + id + "';";
        System.out.println(sql);
		PreparedStatement prepareStatement;
		try {
			prepareStatement = this.conn.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			rs.next();
			int resultado = rs.getRow();
			rs.close();
	        prepareStatement.close();
	        
	        
	        if (resultado > 0) {
	        	JOptionPane.showMessageDialog(null,"Existe tarefas ativas relacionada com essa pessoa.","Editar Cadastro", JOptionPane.CLOSED_OPTION);
			} else {
				String sql2 = "delete from pessoa where id = " + id;
				System.out.println(sql);
		        try {
		    		PreparedStatement prepareStatement2 = this.conn.prepareStatement(sql);
		    		prepareStatement2.executeUpdate();
					prepareStatement2.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}            
		} catch (SQLException e1) {
			e1.printStackTrace();
		}		  		
	}
	
	public List<String> listar() {
		String sql = "select * from pessoa";
        System.out.println(sql);		
        List<String> Pessoas = new ArrayList<String>();
		try {
			PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			while(rs.next()) {
				String email = rs.getString("email");
				Pessoas.add(email);
			}
			rs.close();
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Pessoas;
	}
	
	public int verificarEmail(String email) throws SQLException {
		String sql = "select * from pessoa where email = '" + email + "';";
        System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		ResultSet rs = prepareStatement.executeQuery();
		rs.next();
		int resultado = rs.getRow();
		rs.close();
        prepareStatement.close();
		return resultado;
	}
	
	public String[] retornarInfPessoa(Object object) throws SQLException {
		String sql = "select * from pessoa where email = '" + object + "';";
        System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		ResultSet rs = prepareStatement.executeQuery();
		rs.next();
		String id = rs.getString("id");
		String nome = rs.getString("nome");
		String sexo = rs.getString("sexo");
		
		
		String[] informacoes = {nome, (String) object, sexo, id};
		
		rs.close();
		prepareStatement.close();
		
		return informacoes;
	}
}