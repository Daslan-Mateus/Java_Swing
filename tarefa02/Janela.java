
import java.awt.*;

import javax.swing.*;

public class Janela extends JFrame  {
	 private JLabel tarefa;
     private JLabel prioridade;
     private JComboBox listBox;
     private JTextArea tarefaTextArea;
	 private JCheckBox finalizado;
	 private JButton botao[] = new JButton[2];
     private String[] idades = {"Alta", "Media", "Baixa"};
	
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
        botao[0].setBounds(150, 300, 90, 20);
        botao[1].setBounds(260, 300, 90, 20);
        


        tarefa = new JLabel("Tarefa");
        tarefaTextArea = new JTextArea(6,8);
        tarefaTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tarefaTextArea.setLineWrap(true);
        tarefa.setBounds(50, 10, 80, 50);
        tarefaTextArea.setBounds(50, 50, 300, 80);
        panel.add(tarefaTextArea);
        panel.add(tarefa);


        prioridade = new JLabel("Prioridade");
        listBox = new JComboBox(idades);
        finalizado = new JCheckBox("Finalizado");
        prioridade.setBounds(50, 130, 80, 50);
        listBox.setBounds(50, 170, 300, 30);
        finalizado.setBounds(50, 200, 100, 30);
        panel.add(prioridade);
        panel.add(finalizado);
        panel.add(listBox);
    




        add(panel);

    }

	
	

}
