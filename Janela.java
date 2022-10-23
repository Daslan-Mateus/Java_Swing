package trabalho_2;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class Janela extends JFrame  {
	 private JLabel rodapeLabel;
	 private JPanel painelRodape;
	 JButton botao[] = new JButton[2];
	
	public Janela(){
        setTitle("Cadastro de tarefas");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
    }
	
	private void configurarJanela() {
        JPanel panel = new JPanel();
        panel.add(botao[1] = new JButton("Salvar"));
        panel.add(botao[0] = new JButton("Cancelar"));
        panel.setLayout(null);
        botao[0].setBounds(150, 200, 90, 20);
        botao[1].setBounds(260, 200, 90, 20);
        
        add(panel);
    }

	
	

}
