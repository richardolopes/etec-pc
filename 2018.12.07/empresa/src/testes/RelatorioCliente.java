package testes;

import relatorio.ClienteRel;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import controller.ClienteJDBCDAO;
import controller.JdbcUtil;
import model.Clientes;

public class RelatorioCliente {

	public static void main(String[] args) {
		try {
			Connection connection = JdbcUtil.getConnection();
			
			List<Clientes> clientes = new ArrayList<Clientes>();
			
			ClienteJDBCDAO aa = new ClienteJDBCDAO(connection);
			
			clientes = aa.listar();
			
			ClienteRel relatorio = new ClienteRel();
			relatorio.imprimir(clientes);
		}

		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
