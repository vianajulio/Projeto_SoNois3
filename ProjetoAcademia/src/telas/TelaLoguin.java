package telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import arquivos.EscreverLerArquivo;
import classes.Cadastro;

public class TelaLoguin extends JFrame{
	private JTextField jtfLogin;    //declara��o de componenetes visuais 
	private JLabel jlSenha;        //utilizados na aplica��o 
	private JLabel jlLogin;        //e cada exemplo podera ser utilizado 
	private JButton jbLogar;       //um componente diferente 
	private JButton jbCancelar,jbCadastrar;     
	private JPasswordField jpfSenha; 
	private static TelaLoguin frame;     
	private List<Cadastro> cadastros = new ArrayList<>();
	private ImageIcon logocorpus;
	private JLabel jlimagem;
	private EscreverLerArquivo arquivo  = new EscreverLerArquivo();
	
	public TelaLoguin() throws HeadlessException {
		super();
		setTitle("Corpus");    
		setSize(480, 260);     
		setLayout (null); 
		getContentPane().setBackground(Color.darkGray);
		setLocationRelativeTo(getContentPane());
		inicializarComponentes();
		definirEventos(); 
		setResizable(false);
		abrirArquivo();
		
		
	}

	private void abrirArquivo() {
		if (arquivo.lerArquivoCadastro() !=null) {
			cadastros = arquivo.lerArquivoCadastro();
		}
		
		
	}

	private void inicializarComponentes() {
		
		logocorpus = new ImageIcon(getClass().getResource("/imagens/logocorpus.png"));
		jlimagem = new JLabel(logocorpus);
	
		Font font = new Font("arial", Font.BOLD, 17);

		jlSenha = new JLabel("SENHA: ");  //cria objetos de labels e botoes c/ seus titulos 
		jlSenha.setFont(font);
		jlSenha.setForeground(Color.white);
		jpfSenha = new JPasswordField(5);//determina o numero de caracter que dever� ter a senha  
		
		jlLogin = new JLabel("LOGIN: "); 
		jlLogin.setForeground(Color.white);
		jlLogin.setFont(font);
		jtfLogin = new JTextField(5);      // cria��o de objetos e o num define o comprim das caixas de texto 
		
		jbLogar = new JButton("Logar");
		jbLogar.setForeground(Color.white);
		jbLogar.setBackground(Color.black);
		
		jbCancelar = new JButton("Cancelar"); 
		jbCancelar.setForeground(Color.white);
		jbCancelar.setBackground(Color.black);
		
		jbCadastrar = new JButton("Cadastrar");
		jbCadastrar.setForeground(Color.white);
		jbCadastrar.setBackground(Color.black);


		/*********Define tamanho e posicionamento dos elementos *****************************/ 



		jtfLogin.setBounds(100, 30, 120, 25);     

		jlLogin.setBounds(30, 30, 80, 25); 

		jlSenha.setBounds(30, 75, 80, 25); 

		jpfSenha.setBounds(100, 75, 120, 25); 

		jbLogar.setBounds(20, 120, 100, 25); 

		jbCancelar.setBounds(125, 120, 100, 25); 
		jbCadastrar.setBounds(75, 160, 100, 25);
		jlimagem.setBounds(200,10, 300, 200);
			


		/*******************Adiciona elementos � frame   *************************************/	 

		add(jtfLogin);     //os componentes graficos s�o adicionados ao frame como um quebra cabe�as  

		add(jlSenha);     //estes s�o adicionados ao que foi definido anteriormente  

		add(jlLogin); 

		add(jbLogar); 

		add(jbCancelar); 
		
		add(jpfSenha); 
		add(jbCadastrar);
		add(jlimagem);
		
	}

	private void definirEventos() {
		
		jbLogar.addActionListener(new ActionListener() { 

			@Override 
			public void actionPerformed(ActionEvent arg0) { 
			boolean achou = false;	
			String loguin = jtfLogin.getText();
			String senha = String.valueOf(jpfSenha.getPassword());//m�todo valueOf transforma qualquer coisa em String
			for (Cadastro cadastro : cadastros) {
				if (loguin.equals(cadastro.getLogin()) && senha.equals(cadastro.getSenha())) {
					achou = true;
					TelaCorpus tela = new TelaCorpus("Corpus",cadastros);
					tela.setVisible(true);
					setVisible(false);
					break;
				}
				
			}
			if (loguin.equals("3221adm") && senha.equals("3221")) {
				achou = true;
				TelaCorpus tela = new TelaCorpus("Corpus",cadastros);
				tela.setVisible(true);
				setVisible(false);
				
				
			}
			
			if (!achou) {
				
				JOptionPane.showMessageDialog(null, "Login ou senha incorreta", "Corpus", JOptionPane.ERROR_MESSAGE);
			}
			} 

		}); 
	
		jbCancelar.addActionListener(new ActionListener() { 

			public void actionPerformed(ActionEvent arg0) { 
				System.exit(0);                             // sai do programa  

			} 

		}); 
		//evento do bot�o cadastrar
				jbCadastrar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					TelaCadastro cadastro = new TelaCadastro(cadastros);
					cadastro.setVisible(true);
					
					}
				});
		
		
	}
	
	//metodo principal  

		public static void main(String[] args) { 
		SwingUtilities.invokeLater(new Runnable() { 

				public void run() { 

					frame = new TelaLoguin(); 

					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra aplica��o qd a janela � fechada  

				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize(); // metodos que manipulam dimens�o da tela do ambiente gr�fico 

					frame.setLocation((tela.width - (frame).getSize().width)/2,           

							(tela.height - frame.getSize().height)/2);		   // centraliza janela coluna e a janela linha  

					frame.setVisible(true); 

				} 

			}); 

		} 	
	
	
	
	
	
	
}
