package wikidot;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormCadAgenda extends JDialog{




private InterfaceAgenda pai;

public FormCadAgenda(InterfaceAgenda newPai){
this.pai = newPai;
}
//M�todo construtor


void inicia(){ //este m�todo � respons�vel por mostrar o formul�rio na agenda

this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //oculta a janela ao fechar

Container pane = this.getContentPane();// cria Pane (container)

//neste exemplo o layout � nulo ent�o a disposi��o
//dos componentes � definida atraves da propriedade setBounds
pane.setLayout(null);



this.setBounds(40, 60, 250, 210); //seta o posicionamento
this.setContentPane(pane);
this.setVisible(true);
}

//fecha a janela do formul�rio.
private void buttonFecharActionPerformed(ActionEvent e){
this.dispose();
}


}