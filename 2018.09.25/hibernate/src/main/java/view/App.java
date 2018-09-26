package view;

import controller.ClienteJpaDAO;
import model.Cliente;

public class App
{
    public static void main( String[] args )
    {
    	 Cliente cliente = new Cliente();
         cliente.setCpf("0");
         cliente.setId(1);
         cliente.setNome("Jeferson Roberto de Lima");
         cliente.setRg("1");
         ClienteJpaDAO.getInstance().merge(cliente);
         //ClienteJpaDAO.getInstance().remove(cliente);
         System.out.println("Objetos salvo com sucesso!!!");
    }
}