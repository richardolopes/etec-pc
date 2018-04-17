package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

import funcoesBasicas.Operacoes; 

@SuppressWarnings({ "unused", "serial" })
public class Calculadora extends JFrame {
	JTextField txtVisor = new JTextField("0");
	
	JMenuBar menuBar = new JMenuBar();
	JMenu Exibir = new JMenu("Exibir");
	JMenu Editar = new JMenu("Editar");
	JMenu Ajuda = new JMenu("Ajuda");
	
	JRadioButtonMenuItem radipadrao = new JRadioButtonMenuItem("Padão");
	JRadioButtonMenuItem radicienti = new JRadioButtonMenuItem("Cientifica");
	JRadioButtonMenuItem radiprograma = new JRadioButtonMenuItem("Programador");
	JRadioButtonMenuItem radiestatist = new JRadioButtonMenuItem("Estatistica");
	JCheckBoxMenuItem cbHistorico = new JCheckBoxMenuItem ("Histórico    Crtl + H");
	JCheckBoxMenuItem cbHistorico2 = new JCheckBoxMenuItem ("Histórico    Crtl + H");
	JCheckBoxMenuItem cbCalculos = new JCheckBoxMenuItem ("Básico");
	JCheckBoxMenuItem cbAgrupamento = new JCheckBoxMenuItem ("Agrupamento de Digitos");
	JCheckBoxMenuItem cbConversao = new JCheckBoxMenuItem ("Conversão de unidades Crtl + U");
	JCheckBoxMenuItem cbData = new JCheckBoxMenuItem ("Cálculo de data  Crtl + E");
	
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
	
	
	JButton btnApagar = new JButton("←");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisMenos = new JButton("±");
	JButton btnRaiz = new JButton("√");
	JButton btnDividir = new JButton("/");
	JButton btnPorcento = new JButton("%");
	JButton btnMult = new JButton("*");
	JButton btn1X = new JButton("1/x");
	JButton btnSubtrair = new JButton("-");
	JButton btnIgual = new JButton("=");
	JButton btnPonto = new JButton(",");
	JButton btnSoma = new JButton("+");
	
	
	JButton btn0 = new JButton("0");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");

	
	Operacoes matbasic = new Operacoes();
	
	String tipoM = null;
	String sinal = null;
	double valor1 = 0;
	double valor2 = 0;
	boolean btnPress = false;
	double memoria = 0;
	
	public Calculadora() {
		super("Calculadora");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		Color
		btnM = new Color(212, 224, 236),
		btnFunc = new Color(214, 224, 234),
		btnNum = new Color(234, 241, 247),
		bgColor	= new Color(216, 228, 240),
		menuColor = new Color(213, 219, 233);

		menuBar.add(Exibir);
		Exibir.add(radipadrao);
		Exibir.add(radicienti);
		Exibir.add(radiprograma);
		Exibir.add(radiestatist);
		Exibir.addSeparator();
		Exibir.add(cbHistorico);
		Exibir.add(cbAgrupamento);
		Exibir.addSeparator();
		Exibir.add(cbCalculos);
		Exibir.add(cbConversao);
		Exibir.add(cbData);
		
		
		menuBar.add(Editar);
		Editar.add("Copiar              Crtl + C");
		Editar.add("Colar                Crtl + V");
		Editar.addSeparator();
		Editar.add(cbHistorico2);
		
		menuBar.add(Ajuda);
		Ajuda.add("Exibir ajuda            F1");
		Ajuda.addSeparator();
		Ajuda.add("Sobre a calculadora");
		
		txtVisor.setHorizontalAlignment(JTextField.RIGHT);
		
		// ----------------------------
		// SETBOUNDS, FONTE E SETMARGIN
		// ----------------------------
		Editar.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Editar.setBounds(46, 5, 45, 20);
		// ---
		menuBar.setBounds(0, 0, 228, 25);
		// ---
		Exibir.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Exibir.setBounds(1, 5, 45, 20);
		// ---
		Ajuda.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Ajuda.setBounds(91, 5, 45, 20);
		// ---
		txtVisor.setBounds(12, 30, 192, 50);
		txtVisor.setFont(new Font("Consolas", Font.PLAIN, 20));
		txtVisor.setMargin(new Insets(5,5,5,5));
		// ---
		// ---		
		btnMC.setBounds(12, 85, 35, 27);
		btnMC.setFont(new Font("Arial", Font.PLAIN, 12));
		btnMC.setMargin(new Insets(5,1,1,1));
		// ---
		btnMR.setBounds(51, 85, 35, 27);
		btnMR.setFont(new Font("Arial", Font.PLAIN, 12));
		btnMR.setMargin(new Insets(5,1,1,1));
		// ---
		btnMS.setBounds(90, 85, 35, 27);
		btnMS.setFont(new Font("Arial", Font.PLAIN, 12));
		btnMS.setMargin(new Insets(5,1,1,1));
		// ---
		btnMais.setBounds(129, 85, 35, 27);
		btnMais.setFont(new Font("Arial", Font.PLAIN, 12));
		btnMais.setMargin(new Insets(5,1,1,1));
		// ---
		btnMenos.setBounds(168, 85, 35, 27);
		btnMenos.setFont(new Font("Arial", Font.PLAIN, 12));
		btnMenos.setMargin(new Insets(5,1,1,1));
		// ---
		// ---
		btnApagar.setBounds(12, 117, 35, 27);
		btnApagar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnApagar.setMargin(new Insets(5,1,1,1));
		// ---
		btnCE.setBounds(51, 117, 35, 27);
		btnCE.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCE.setMargin(new Insets(5,1,1,1));
		// ---
		btnC.setBounds(90, 117, 35, 27);
		btnC.setFont(new Font("Arial", Font.PLAIN, 12));
		btnC.setMargin(new Insets(5,1,1,1));
		// ---
		btnMaisMenos.setBounds(129, 117, 35, 27);
		btnMaisMenos.setFont(new Font("Arial", Font.PLAIN, 15));
		btnMaisMenos.setMargin(new Insets(5,1,1,1));
		// ---
		btnRaiz.setBounds(168, 117, 35, 27);
		btnRaiz.setFont(new Font("Arial", Font.PLAIN, 15));
		btnRaiz.setMargin(new Insets(5,1,1,1));
		// ---
		// ---
		btn7.setBounds(12, 149, 35, 27);
		btn7.setFont(new Font("Arial", Font.PLAIN, 15));
		btn7.setMargin(new Insets(5,1,1,1));
		// ---
		btn8.setBounds(51, 149, 35, 27);
		btn8.setFont(new Font("Arial", Font.PLAIN, 15));
		btn8.setMargin(new Insets(5,1,1,1));
		// ---
		btn9.setBounds(90, 149, 35, 27);
		btn9.setFont(new Font("Arial", Font.PLAIN, 15));
		btn9.setMargin(new Insets(5,1,1,1));
		// ---
		btnDividir.setBounds(129, 149, 35, 27);
		btnDividir.setFont(new Font("Arial", Font.PLAIN, 15));
		btnDividir.setMargin(new Insets(5,1,1,1));
		// ---
		btnPorcento.setBounds(168, 149, 35, 27);
		btnPorcento.setFont(new Font("Arial", Font.PLAIN, 15));
		btnPorcento.setMargin(new Insets(5,1,1,1));
		// ---
		// ---
		btn4.setBounds(12, 181, 35, 27);
		btn4.setFont(new Font("Arial", Font.PLAIN, 15));
		btn4.setMargin(new Insets(5,1,1,1));
		// ---
		btn5.setBounds(51, 181, 35, 27);
		btn5.setFont(new Font("Arial", Font.PLAIN, 15));
		btn5.setMargin(new Insets(5,1,1,1));
		// ---
		btn6.setBounds(90, 181, 35, 27);
		btn6.setFont(new Font("Arial", Font.PLAIN, 15));
		btn6.setMargin(new Insets(5,1,1,1));
		// ---
		btnMult.setBounds(129, 181, 35, 27);
		btnMult.setFont(new Font("Arial", Font.PLAIN, 15));
		btnMult.setMargin(new Insets(5,1,1,1));
		// ---
		btn1X.setBounds(168, 181, 35, 27);
		btn1X.setFont(new Font("Arial", Font.PLAIN, 15));
		btn1X.setMargin(new Insets(5,1,1,1));
		// ---
		// ---
		btn1.setBounds(12, 213, 35, 27);
		btn1.setFont(new Font("Arial", Font.PLAIN, 15));
		btn1.setMargin(new Insets(5,1,1,1));
		// ---
		btn2.setBounds(51, 213, 35, 27);
		btn2.setFont(new Font("Arial", Font.PLAIN, 15));
		btn2.setMargin(new Insets(5,1,1,1));
		// ---
		btn3.setBounds(90, 213, 35, 27);
		btn3.setFont(new Font("Arial", Font.PLAIN, 15));
		btn3.setMargin(new Insets(5,1,1,1));
		// ---
		btnSubtrair.setBounds(129, 213, 35, 27);
		btnSubtrair.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSubtrair.setMargin(new Insets(5,1,1,1));
		// ---
		btnIgual.setBounds(168, 213, 35, 59);
		btnIgual.setFont(new Font("Arial", Font.PLAIN, 18));
		btnIgual.setMargin(new Insets(5,1,1,1));
		// ---
		// ---
		btn0.setBounds(12, 245, 74, 27);
		btn0.setFont(new Font("Arial", Font.PLAIN, 15));
		btn0.setMargin(new Insets(5,1,1,1));
		// ---
		btnPonto.setBounds(90, 245, 35, 27);
		btnPonto.setFont(new Font("Arial", Font.PLAIN, 13));
		btnPonto.setMargin(new Insets(5,1,1,1));
		// ---
		btnSoma.setBounds(129, 245, 35, 27);
		btnSoma.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSoma.setMargin(new Insets(5,1,1,1));
		// -------------------------
		// FIM SETMARGIN E SETBOUNDS
		// -------------------------

		paine.add(menuBar);
		paine.add(txtVisor);
		paine.add(btnMC);
		paine.add(btnMR);
		paine.add(btnMS);
		paine.add(btnMais);
		paine.add(btnMenos);
		paine.add(btnApagar);
		paine.add(btnCE);
		paine.add(btnC);
		paine.add(btnMaisMenos);
		paine.add(btnRaiz);
		paine.add(btn7);
		paine.add(btn8);
		paine.add(btn9);
		paine.add(btnDividir);
		paine.add(btnPorcento);
		paine.add(btn4);
		paine.add(btn5);
		paine.add(btn6);
		paine.add(btnMult);
		paine.add(btn1X);
		paine.add(btn1);
		paine.add(btn2);
		paine.add(btn3);
		paine.add(btnSubtrair);
		paine.add(btnIgual);
		paine.add(btn0);
		paine.add(btnPonto);
		paine.add(btnSoma);

		// -------
		// EVENTOS
		// -------
		
		
		btnMC.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				tipoM = "MC";
				memoria = 0;
			}
		});
		// ---
		btnMR.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(memoria + "");
			}
		});
		// ---
		btnMS.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				memoria = valor1;
			}
		});
		// ---
		btnMais.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				memoria = memoria + valor1;
				btnPress = true;
			}
		});		
		// ---
		btnMenos.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				memoria = memoria - valor1;
				btnPress = true;
			}
		});
		// ---
		// ---
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().length() != 1) {
					txtVisor.setText(txtVisor.getText().substring(0, txtVisor.getText().length()-1));
				} else txtVisor.setText("0");
				
			}	
		});
		// ---
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		// ---
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
				valor1 = 0;
				valor2 = 0;
				sinal = null;
			}
		});
		// ---
		btnMaisMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Double.parseDouble(txtVisor.getText()) != 0) {
					txtVisor.setText(Double.parseDouble(txtVisor.getText()) * -1 + "");
				} else txtVisor.setText("0");
			}
		});
		// ---
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(Math.sqrt(Double.parseDouble(txtVisor.getText())) + "");
				}
		});
		// ---
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0") || btnPress == true) {
					txtVisor.setText("7");
					btnPress = false;
				} else {
					txtVisor.setText(txtVisor.getText() + "7");
				}
			}
		});
		// ---
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0") || btnPress == true) {
					txtVisor.setText("8");
					btnPress = false;
				} else {
					txtVisor.setText(txtVisor.getText() + "8");
				}
			}
		});
		// ---
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0") || btnPress == true) {
					txtVisor.setText("9");
					btnPress = false;
				} else {
					txtVisor.setText(txtVisor.getText() + "9");
				}
			}
		});
		// ---
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "dividir";
				txtVisor.setText("0");
			}
		});
		// ---
		btnPorcento.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText((valor1 * valor2) / 100 + "");
			}
		});
		// ---
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0") || btnPress == true) {
					txtVisor.setText("4");
					btnPress = false;
				} else {
					txtVisor.setText(txtVisor.getText() + "4");
				}
			}
		});
		// ---
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0") || btnPress == true) {
					txtVisor.setText("5");
					btnPress = false;
				} else {
					txtVisor.setText(txtVisor.getText() + "5");
				}
			}
		});
		// ---
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0") || btnPress == true) {
					txtVisor.setText("6");
					btnPress = false;
				} else {
					txtVisor.setText(txtVisor.getText() + "6");
				}
			}
		});
		// ---
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "multiplicar";
				txtVisor.setText("0");
			}
		});
		// ---
		btn1X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Double.parseDouble(txtVisor.getText()) == 0) {
					txtVisor.setText("Math ERROR.");
				} else {
					txtVisor.setText( 1 / Double.parseDouble(txtVisor.getText()) + "");
				}
			}
		});
		// ---
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0") || btnPress == true) {
					txtVisor.setText("1");
					btnPress = false;
				} else {
					txtVisor.setText(txtVisor.getText() + "1");
				}
			}
			
		});
		// ---
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0") || btnPress == true) {
					txtVisor.setText("2");
					btnPress = false;
				} else {
					txtVisor.setText(txtVisor.getText() + "2");
				}
			}
		});
		// ---
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0") || btnPress == true) {
					txtVisor.setText("3");
					btnPress = false;
				} else {
					txtVisor.setText(txtVisor.getText() + "3");
				}
			}
		});
		// ---
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "subtrair";
				txtVisor.setText("0");
			}
		});
		// ---
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().equals("0") && btnPress == false) {
					txtVisor.setText(txtVisor.getText() + "0");
				} else {
					txtVisor.setText("0");
				}
			}
		});
		// ---
		btnPonto.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().contains(".")) {
					txtVisor.setText(txtVisor.getText() + ".");
				} else {
					txtVisor.setText(txtVisor.getText());
				}
			}
		});
		// ---
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "soma";
				txtVisor.setText("0");
			}
		});
		// ---
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtVisor.getText());
				if(sinal.equals("soma")) {
					txtVisor.setText((matbasic.soma(valor1, valor2) + ""));
				}
				if(sinal.equals("subtrair")) {
					txtVisor.setText((matbasic.subtrair(valor1, valor2) + ""));
				}
				if(sinal.equals("multiplicar")) {
					txtVisor.setText((matbasic.multiplicar(valor1, valor2) + ""));
				}
				if(sinal.equals("dividir")) {
					txtVisor.setText((matbasic.dividir(valor1, valor2) + ""));
				}
				if(sinal.equals(null)) {
					txtVisor.setText("0");
				}
			}
		});
		// -----------
		// FIM EVENTOS
		// -----------
		
		btnMC.setBackground(btnM);
		btnMR.setBackground(btnM);
		btnMS.setBackground(btnM);
		btnMais.setBackground(btnM);
		btnMenos.setBackground(btnM);
		
		btnApagar.setBackground(btnFunc);
		btnCE.setBackground(btnFunc);
		btnC.setBackground(btnFunc);
		btnMaisMenos.setBackground(btnFunc);
		btnRaiz.setBackground(btnFunc);
		btnDividir.setBackground(btnFunc);
		btnPorcento.setBackground(btnFunc);
		btnMult.setBackground(btnFunc);
		btn1X.setBackground(btnFunc);
		btnSubtrair.setBackground(btnFunc);
		btnIgual.setBackground(btnFunc);
		btnPonto.setBackground(btnFunc);
		btnSoma.setBackground(btnFunc);
		
		btn0.setBackground(btnNum);
		btn1.setBackground(btnNum);
		btn2.setBackground(btnNum);
		btn3.setBackground(btnNum);
		btn4.setBackground(btnNum);
		btn5.setBackground(btnNum);
		btn6.setBackground(btnNum);
		btn7.setBackground(btnNum);
		btn8.setBackground(btnNum);
		btn9.setBackground(btnNum);
		btnPonto.setBackground(btnNum);

		menuBar.setBackground(menuColor);
		paine.setBackground(bgColor);
		
		this.setSize(221, 315);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
	}
}