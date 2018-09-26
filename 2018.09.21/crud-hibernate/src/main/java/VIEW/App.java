package view;

import org.hibernate.Session;

import controller.HibernateUtil;
import model.Alunos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alunos alunos = new Alunos();
    	alunos.setNome("Richard de Oliveira Lopes");
    	alunos.setEndereco("Av. Àguia de Háia");
		
    	
    	alunos.setId_aluno(1);
    	
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//session.save(alunos);
		
		session.remove(alunos);
		session.getTransaction().commit();
    }
}