package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {

	public static void main(String[] args) {
		Alunos alunos = new Alunos();
		try {
			alunos.setId(8);
			alunos.setNome("Richard");
			alunos.setEndereco("Av Águia de Haia, 2600");
			alunos.setBairro("Jd São Nicolau");
			alunos.setCep(3811111);
			
	
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			//alunosJdbcDao.salvar(alunos);
			//alunosJdbcDao.deletar(3);
			//alunosJdbcDao.listar();
			alunosJdbcDao.alterar(alunos);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
