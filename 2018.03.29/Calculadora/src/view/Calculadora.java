package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Insets;

import java.awt.Font; 

public class Calculadora extends JFrame{
	
	JTextField txtVisor = new JTextField();
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
	JButton btnApagar = new JButton("<-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisMenos = new JButton("±");
	JButton btnRaiz = new JButton("√");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnDividir = new JButton("/");
	JButton btnPorcento = new JButton("%");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnMult = new JButton("*");
	JButton btn1X = new JButton("1/x");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnSubtrair = new JButton("-");
	
	JButton btnIgual = new JButton("=");
	
	JButton btn0 = new JButton("0");
	JButton btnPonto = new JButton(",");
	JButton btnSoma = new JButton("+");

	
	public Calculadora() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		txtVisor.setBounds(12, 30, 192, 50);
		paine.add(txtVisor);
		txtVisor.setFont(new Font("Arial", Font.PLAIN, 20));
		
		btnMC.setBounds(12, 85, 35, 27);
		paine.add(btnMC);
		btnMC.setFont(new Font("Arial", Font.PLAIN, 11));
		btnMC.setMargin(new Insets(1,1,1,1));
		//
		btnMR.setBounds(51, 85, 35, 27);
		paine.add(btnMR);
		btnMR.setFont(new Font("Arial", Font.PLAIN, 11));
		btnMR.setMargin(new Insets(1,1,1,1));
		//
		btnMS.setBounds(90, 85, 35, 27);
		paine.add(btnMS);
		btnMS.setFont(new Font("Arial", Font.PLAIN, 11));
		btnMS.setMargin(new Insets(1,1,1,1));
		//
		btnMais.setBounds(129, 85, 35, 27);
		paine.add(btnMais);
		btnMais.setFont(new Font("Arial", Font.PLAIN, 11));
		btnMais.setMargin(new Insets(1,1,1,1));
		//
		btnMenos.setBounds(168, 85, 35, 27);
		paine.add(btnMenos);
		btnMenos.setFont(new Font("Arial", Font.PLAIN, 11));
		btnMenos.setMargin(new Insets(1,1,1,1));
		
		btnApagar.setBounds(12, 117, 35, 27);
		paine.add(btnApagar);
		btnApagar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnApagar.setMargin(new Insets(1,1,1,1));
		//
		btnCE.setBounds(51, 117, 35, 27);
		paine.add(btnCE);
		btnCE.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCE.setMargin(new Insets(1,1,1,1));
		//
		btnC.setBounds(90, 117, 35, 27);
		paine.add(btnC);
		btnMaisMenos.setBounds(129, 117, 35, 27);
		paine.add(btnMaisMenos);
		btnRaiz.setBounds(168, 117, 35, 27);
		paine.add(btnRaiz);
		
		btn7.setBounds(12, 149, 35, 27);
		paine.add(btn7);
		btn7.setFont(new Font("Arial", Font.PLAIN, 11));
		btn8.setBounds(51, 149, 35, 27);
		paine.add(btn8);
		btn9.setBounds(90, 149, 35, 27);
		paine.add(btn9);
		btnDividir.setBounds(129, 149, 35, 27);
		paine.add(btnDividir);
		btnPorcento.setBounds(168, 149, 35, 27);
		paine.add(btnPorcento);
		
		
		this.setSize(221, 315);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
	}
}