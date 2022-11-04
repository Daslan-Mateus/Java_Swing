
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class AppUI extends JFrame {

    private JPanel listaPanel;
    private JPanel cabecalho;
    private ObterTarefasServico servico;
    private JButton novaTarefa  = new JButton("Nova Tarefa");
    private JRadioButton caixa;
    private JLabel caixaEntrada = new JLabel("Caixa de Entrada");
   

    public AppUI(){
        setTitle("Tarefas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,500);
        setLocationRelativeTo(null);
        servico = new ObterTarefasServico();
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH, areaNorte());
        add(BorderLayout.CENTER, configurarJanela());
        add(BorderLayout.WEST, barraRolagem());
        
       
    }
    
    private JPanel areaNorte() {
    	cabecalho = new JPanel();
    	cabecalho.add(caixaEntrada);
    	cabecalho.add(novaTarefa);
    	cabecalho.setLayout(new GridLayout(1,2,0,0));
    	return cabecalho;
    	
    }
    
    private JScrollPane barraRolagem() {
    	JScrollPane scrollPane = new JScrollPane(listaPanel);
    	scrollPane.setPreferredSize(new Dimension(200, 0));
    	return scrollPane;
    }
        

	private JPanel configurarJanela() {
        listaPanel = new JPanel();
        listaPanel.setBackground(Color.blue);
        listaPanel.setLayout(new BoxLayout(listaPanel,BoxLayout.Y_AXIS));
        
        popularLista();
        
        return listaPanel;
    }

    private void popularLista(){
        for(String s : servico.obterTodos()){
            listaPanel.add(criarItemDaLista(s));
           
        }
    }

    private JPanel criarItemDaLista(String item){
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        ((JComponent)getContentPane()).setBorder(new EmptyBorder(40, 40, 40, 40));
        caixa = new JRadioButton(item);
        panel.add(caixa);
        return panel;
    }

}
