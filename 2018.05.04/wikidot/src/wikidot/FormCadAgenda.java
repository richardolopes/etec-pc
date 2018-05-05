package wikidot;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormCadAgenda extends JDialog{




private InterfaceAgenda pai;

public FormCadAgenda(InterfaceAgenda newPai){
this.pai = newPai;
}
//Método construtor


void inicia(){ //este método é responsável por mostrar o formulário na agenda

this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //oculta a janela ao fechar

Container pane = this.getContentPane();// cria Pane (container)

//neste exemplo o layout é nulo então a disposição
//dos componentes é definida atraves da propriedade setBounds
pane.setLayout(null);



this.setBounds(40, 60, 250, 210); //seta o posicionamento
this.setContentPane(pane);
this.setVisible(true);
}

//fecha a janela do formulário.
private void buttonFecharActionPerformed(ActionEvent e){
this.dispose();
}


}