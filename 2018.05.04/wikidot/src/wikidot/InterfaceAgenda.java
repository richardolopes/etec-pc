package wikidot;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class InterfaceAgenda extends JInternalFrame{
//primeiramente criamos os componentes
private JTable tabela;

private JButton buttonNovo = new JButton("Novo");
private JButton buttonEditar = new JButton("Editar");
private JButton buttonRemover = new JButton("Remover");
private JButton buttonFechar = new JButton("Fechar");

private FormCadAgenda formCadAgenda; //objeto do tipo formulário criado
private static InterfaceAgenda INSTANCE = null;
//definindo o modelo da tabela
private DefaultTableModel modelo = new DefaultTableModel();
//Método que constrói a janela da agenda
public InterfaceAgenda(){
super("Agenda", true, true , false, true);
Container pane = this.getContentPane();
pane.setLayout(null);

//define posicionamento do botão na janela
buttonNovo.setBounds(5, 10, 90, 70);
buttonNovo.setHorizontalTextPosition(SwingConstants.CENTER);
buttonNovo.setVerticalAlignment(SwingConstants.TOP);
buttonNovo.setVerticalTextPosition(SwingConstants.BOTTOM);
buttonNovo.setIcon(new
ImageIcon(getClass().getResource("imagens/add.png"))); //NOVO PNG

//define posicionamento do botão na janela
buttonEditar.setBounds(95, 10, 90, 70);
buttonEditar.setHorizontalTextPosition(SwingConstants.CENTER);
buttonEditar.setVerticalAlignment(SwingConstants.TOP);
buttonEditar.setVerticalTextPosition(SwingConstants.BOTTOM);
buttonEditar.setIcon(new
ImageIcon(getClass().getResource("imagens/editar.png")));  //ALTERAR

//define posicionamento do botão na janela
buttonRemover.setBounds(185, 10, 90, 70);
buttonRemover.setHorizontalTextPosition(SwingConstants.CENTER);
buttonRemover.setVerticalAlignment(SwingConstants.TOP);
buttonRemover.setVerticalTextPosition(SwingConstants.BOTTOM);
buttonRemover.setIcon(new
ImageIcon(getClass().getResource("imagens/remove.png"))); // REMOVER PNG

//define posicionamento do botão na janela
buttonFechar.setBounds(280, 10, 90, 70);
buttonFechar.setHorizontalTextPosition(SwingConstants.CENTER);
buttonFechar.setVerticalAlignment(SwingConstants.TOP);
buttonFechar.setVerticalTextPosition(SwingConstants.BOTTOM);
buttonFechar.setIcon(new
ImageIcon(getClass().getResource("imagens/fechar.png"))); // FECHAR PNG


this.addInternalFrameListener(new InternalFrameAdapter(){
public void internalFrameClosing(InternalFrameEvent e){
interfaceAgendaInternalFrameClosing(e);
}
});
//montagem da tabela
tabela = new JTable(modelo);

JScrollPane scrollpane = new JScrollPane(tabela);
scrollpane.setBounds(5, 95, 680, 390);

pane.add(buttonNovo);
pane.add(buttonEditar);
pane.add(buttonRemover);
pane.add(buttonFechar);
pane.add(scrollpane);


this.setResizable(false);
this.setSize(700, 550);
}
//evento do botão NOVO
private void buttonNovoActionPerformed(ActionEvent e){
formCadAgenda = new FormCadAgenda(this);
formCadAgenda.setModal(true);
formCadAgenda.inicia();
}


//evento do botão fechar
private void buttonFecharActionPerformed(ActionEvent e){
//mostra mensagem de confirmação de Fechar
int ret = JOptionPane.showConfirmDialog(this,
"Deseja Fechar?",
"Fechar",
JOptionPane.OK_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE);
//fecha a janela da agenda caso clique em OK
if (ret == JOptionPane.OK_OPTION){
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.destroyInstance();
}

}
//evendo ao clicar no “X” de fechar a janela ao em vez do botão
private void interfaceAgendaInternalFrameClosing(InternalFrameEvent e){
int ret = JOptionPane.showConfirmDialog(this,
"Deseja Fechar?",
"Fechar",
JOptionPane.OK_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE);
//fecha a janela da agenda caso clique em OK
if (ret == JOptionPane.OK_OPTION){
this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
this.destroyInstance();
}else
this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}
//método verificar se já existe uma instancia classe InterfaceAgenda
public static InterfaceAgenda getInstance(){
if (InterfaceAgenda.INSTANCE == null){
return INSTANCE = new InterfaceAgenda();
}

return INSTANCE;
}


//método que preenche a JTABLE com os valores passados





public InterfaceAgenda destroyInstance(){
this.dispose();
return INSTANCE = null;
}

public static boolean isInstance(){
if (INSTANCE == null) return false;

return true;
}
public void addRow(Object[] o){
modelo.addRow(o);
}
}