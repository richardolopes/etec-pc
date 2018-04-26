package view;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

@SuppressWarnings({"serial", "unused"})
public class Tela extends JFrame {
	

	JToolBar toolbar = new JToolBar();
	
	JList ltsEstados;
	JScrollPane scrollpane;
	JScrollPane scrEstado;
	
	public Tela() {
		super("AINDA NAO SEI");	
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		toolbar.add(new JButton("Abrir"));
		toolbar.add(new JButton("Novo"));
		toolbar.add(new JButton("Salvar"));
		toolbar.add(new JButton("Fechar"));
		
		toolbar.setBounds(0, 0, 500, 40);
		pane.add(toolbar);
		
		
		String estados[] = {"SP","RJ","AM","PA","MG"};
		
		ltsEstados = new JList(estados);
		scrollpane = new JScrollPane(ltsEstados);
		
		scrollpane.setBounds(20, 20, 100, 80);
		pane.add(scrollpane);
		
		String[] coluna = {"Nome", "Cidade", "Estado"};
		
		String[][] dados = {{"Eduardo Jorge", "Salvador", "Bahia"},
				{"Gustavo Neves", "Caetité", "Bahia"},
				{"Tarcísio Araújo", "Mutuípe", "Bahia"},
				{"Rafael", "Campinas", "São Paulo"}
				};
		
		JTable listEstados = new JTable(dados, coluna);
		
		scrEstado = new JScrollPane(listEstados);
		
		scrEstado.setBounds(20, 150, 400, 200);
		pane.add(scrEstado);
		
		this.setSize(600, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String args[]) {
		Tela exJanela = new Tela();
	}
}