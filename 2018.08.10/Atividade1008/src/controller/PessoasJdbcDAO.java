package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		String sql = "delete from Pessoas where id = " + id;
		System.out.println(sql);
        try {
    		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
    		prepareStatement.executeUpdate();
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}                		
	}
	
	public List<Pessoas> listar() {
		String sql = "select * from Pessoas";
        System.out.println(sql);		
        List<Pessoas> Pessoas = new ArrayList<Pessoas>();
		try {
			PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String endereco = rs.getString("endereco");
				String bairro = rs.getString("bairro");
				String cep = rs.getString("cep");
				System.out.println("ID: " + id + "\nNome: " + nome + "\nEndereço: " + endereco + "\n-----\n");
			}
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Pessoas;
	}
}