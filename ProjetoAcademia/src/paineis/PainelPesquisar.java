package paineis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classes.Cadastro;
import classes.Cliente;




public class PainelPesquisar extends JPanel {
	private JLabel jlPesquisa, jlcpf;
	private JTextField jtfCpf;
	private JButton jbPesquisa;
	private JTextArea jtaPesquisa;
	private JScrollPane jspPesquisar;
	private List<Cadastro> cadastros;
	

	
	public PainelPesquisar(List<Cadastro> cadastros) {
	super();
	this.cadastros = cadastros;
	setSize(400, 400);//largura,altura
	setLayout(null);		
	setBackground(Color.darkGray);
	iniciarComponentes();
	criarEventos();
	
	}

	private void iniciarComponentes() {
		
		Font font = new Font("arial", Font.BOLD, 17);
		
		//objeto
		jlPesquisa = new JLabel("Pesquisar Aluno");
		jlPesquisa.setForeground(Color.white);
		jlPesquisa.setFont(font);
		
		jlcpf = new JLabel("CPF: ");
		jlcpf.setForeground(Color.white);
		jlcpf.setFont(font);
		jtfCpf = new JTextField();
		
		jbPesquisa = new JButton("Pesquisar");
		jbPesquisa.setBackground(Color.black);
		jbPesquisa.setForeground(Color.white);
		
		jtaPesquisa = new JTextArea();
		jtaPesquisa.setEditable(false);
		jspPesquisar = new JScrollPane(jtaPesquisa);
		
		//add tela
		add(jlPesquisa);
		add(jlcpf);
		add(jtfCpf);
		add(jbPesquisa);
		add(jspPesquisar);
		
		//dimensionamento
				jlPesquisa.setBounds(130, 10, 200, 20);
				jlcpf.setBounds(90, 60, 80, 20);
				jtfCpf.setBounds(150, 60, 80, 20);
				jbPesquisa.setBounds(140, 100, 100, 20);
				jspPesquisar.setBounds(20, 140, 350, 270);
		
		
	}



	private void criarEventos() {
		
		
		
		
	jbPesquisa.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			jtaPesquisa.setText("\t               CORPUS\n");
			boolean achou = false;
			String cpf = jtfCpf.getText();
			for (Cadastro cadastro : cadastros) {
				if (cpf.equals(cadastro.getCpf())) {
				jtaPesquisa.append((cadastros.indexOf(cadastro)+1)+ cadastro.mostrarDados());
				achou =  true;
				break;		
				
				
				}
			}
			if (!achou) {
				JOptionPane.showMessageDialog(null, "CPF Não Cadastrado!", "Corpus", JOptionPane.ERROR_MESSAGE);
			}
			
			}
	});
	}
	
	
	
	
	
	
	
	
	
}
