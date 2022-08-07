package telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import arquivos.EscreverLerArquivo;
import classes.Cadastro;

public class TelaCadastro extends JFrame {
	private JTextField jtfLogin;  
	private JLabel jlSenha;      
	private JLabel jlLogin;
	private JLabel jlTitulo,jlnome, jlcpf;
	private JTextField jtfnome, jtfcpf;
	private JRadioButton jrbhipertrofia, jrbforca, jrbemagrecimento;
	private ButtonGroup bgcadastrar;
	private JButton jbCadastrar;     
	private JPasswordField jpfSenha; 
	private List<Cadastro> cadastros;
	private ImageIcon halteres;
	private JLabel jlimagem;
	
	
	public TelaCadastro(List<Cadastro> cadastros)  {
		super();
		this.cadastros = cadastros;
		setTitle("Cadastro");    
		setSize(480, 260);     
		setLayout (null); 
		getContentPane().setBackground(Color.darkGray);
		setLocationRelativeTo(getContentPane());
		inicializarComponentes();
		definirEventos(); 
		setResizable(false);
		
	}

	private void inicializarComponentes() {
		
			halteres = new ImageIcon(getClass().getResource("/imagens/haltere.png"));
			jlimagem = new JLabel(halteres);
		
			Font font = new Font("arial", Font.BOLD, 17);
		
			jlnome = new JLabel("Nome: ");
			jlnome.setFont(font);
			jlnome.setForeground(Color.white);
			jtfnome = new JTextField();
			
			jlcpf = new JLabel("CPF: ");
			jlcpf.setFont(font);
			jlcpf.setForeground(Color.white);
			jtfcpf = new JTextField();
			
			
			jlLogin = new JLabel("Login: "); 
			jlLogin.setFont(font);
			jlLogin.setForeground(Color.white);
			jtfLogin = new JTextField(); 
		
			
			jlSenha = new JLabel("Senha: ");  //cria objetos de labels e botoes c/ seus titulos 
			jlSenha.setFont(font);
			jlSenha.setForeground(Color.white);
			jpfSenha = new JPasswordField();//determina o numero de caracter que deverï¿½ ter a senha  
			
			
			jrbhipertrofia = new JRadioButton("Hipertrofia",true);
			jrbhipertrofia.setForeground(Color.white);
			jrbhipertrofia.setOpaque(false);
			
			jrbforca = new JRadioButton("Força");
			jrbforca.setForeground(Color.white);
			jrbforca.setOpaque(false);
			
			jrbemagrecimento = new JRadioButton("Emagrecimento");
			jrbemagrecimento.setForeground(Color.white);
			jrbemagrecimento.setOpaque(false);
			
			bgcadastrar = new ButtonGroup();
			
			jbCadastrar = new JButton("Cadastrar");
			jbCadastrar.setForeground(Color.white);
			jbCadastrar.setBackground(Color.black);
			
			/*********Define tamanho e posicionamento dos elementos *****************************/ 

			
			
			jlnome.setBounds(10, 10, 80, 25); 
			jtfnome.setBounds(70, 10, 100, 25);    
			
			jlcpf.setBounds(10, 50, 100, 25);
			jtfcpf.setBounds(70, 50, 100, 25);
			
			jlLogin.setBounds(10, 90, 100, 25);
			jtfLogin.setBounds(70, 90, 100, 25);
			
			jlSenha.setBounds(10, 130, 100, 25);
			jpfSenha.setBounds(70, 130, 100, 25);
		
			jrbhipertrofia.setBounds(200, 10, 100, 25);
			
			jrbforca.setBounds(200, 50, 100, 25);
			
			jrbemagrecimento.setBounds(200, 90, 120, 25);
	
			jbCadastrar.setBounds(120, 170, 100, 25);
			
			jlimagem.setBounds(240,10, 300, 200);
			
			/*******************Adiciona elementos ï¿½ frame/tela   *************************************/	 

			add(jtfLogin);     //os componentes graficos sï¿½o adicionados ao frame como um quebra cabeï¿½as  

			add(jlSenha);     //estes sï¿½o adicionados ao que foi definido anteriormente  

			add(jlLogin);  
			add(jlnome);
			add(jtfnome);
			add(jlcpf);
			add(jtfcpf);
		
			
			add(jpfSenha); 
			add(jbCadastrar);
			
			add(jrbforca);
			add(jrbhipertrofia);
			add(jrbemagrecimento);
			bgcadastrar.add(jrbhipertrofia);
			bgcadastrar.add(jrbforca);
			bgcadastrar.add(jrbemagrecimento);
			add(jlimagem);
			
		} 

	
		/*******************Mï¿½todo que define os eventos ex.: acionar botï¿½es ******************/	 

		private void definirEventos() {
		//evento do botão cadastrar
		jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (!jtfnome.getText().isEmpty()
					&& !jtfcpf.getText().isEmpty()
					&& !jtfLogin.getText().isEmpty()
					) {
					
					String loguin = jtfLogin.getText();
					String cpf = jtfcpf.getText();
					String senha = String.valueOf(jpfSenha.getPassword());
					String nome = jtfnome.getText();
					String tipoplano=null;
				
				if (jrbhipertrofia.isSelected())tipoplano = "Hipertrofia";
				if (jrbforca.isSelected())tipoplano = "Força";
				if (jrbemagrecimento.isSelected())tipoplano = "Emagrecimento";
				
				cadastros.add(new Cadastro(nome, tipoplano, loguin, senha, cpf));
				EscreverLerArquivo arquivo = new EscreverLerArquivo();
				arquivo.escreverArquivoCadastro(cadastros);
				
				
			} else {
				JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Corpus", JOptionPane.ERROR_MESSAGE);
			}
				
			
			jtfLogin.setText("");
			jtfnome.setText("");
			jpfSenha.setText("");
			jtfcpf.setText("");
			
			
			}
	});
		 jtfnome.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	                 
	                 JOptionPane.showMessageDialog(null, "Digite apenas letras", "Corpus", JOptionPane.ERROR_MESSAGE);
	            	 
				}
				
				
	         }
	      });
		
		
		
	}

		
	
}
