package telas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import arquivos.EscreverLerArquivo;
import classes.Cadastro;
import classes.Cliente;
import paineis.PainelCredito;
import paineis.PainelEmagrecimento;
import paineis.PainelForca;
import paineis.PainelHipertrofia;
import paineis.PainelPesquisar;

public class TelaCorpus extends JFrame {
	private JLabel jlTitulo;
	private JMenuBar jmbBarra;
	private JMenu jmArquivo,jmExibir;
	private JMenuItem jmiSair,jmiInicio,jmiCreditos,jmiHipertrofia, jmiPesquisar,jmiForca,jmiEmagrecimento;
	private JButton jbCreditos;
	private Container contentPane;
	private ImageIcon logocorpus;
	private JLabel jlimagem;
	private List<Cadastro> cadastros;
	private EscreverLerArquivo arquivo  = new EscreverLerArquivo();
	
	public TelaCorpus(String Corpus, List<Cadastro> cadastros) throws HeadlessException {
		super(Corpus);
		this.cadastros = cadastros;
		setSize(400,500); // setSize dimensiona a janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.darkGray);
		setLocationRelativeTo(null);
		iniciarComponentes();
		criarEventos();
		abrirArquivo();
		setResizable(false);
	}

	private void abrirArquivo() {
		if (arquivo.lerArquivoCadastro() !=null) {
			cadastros = arquivo.lerArquivoCadastro();
		}
		
	}

	private void iniciarComponentes() {
		logocorpus = new ImageIcon(getClass().getResource("/imagens/logocorpus.png"));
		jlimagem = new JLabel(logocorpus);
		
		Font font = new Font("arial", Font.BOLD, 23);
		
		jlTitulo = new JLabel("CORPUS ACADEMIA");
		jlTitulo.setFont(font);
		jlTitulo.setForeground(Color.white);
		
		jmbBarra = new JMenuBar();
		jmbBarra.setBackground(Color.DARK_GRAY);
		setJMenuBar(jmbBarra);//adiciona a barra de menu na tela
		
		jmArquivo = new JMenu("Arquivo");
		jmArquivo.setForeground(Color.white);
		
		jmExibir = new JMenu("Exibir");
		jmExibir.setForeground(Color.white);
	
		jmiInicio = new JMenuItem("Início");
		jmiSair = new JMenuItem("Sair");
		jmiHipertrofia = new JMenuItem("Hipertrofia");
		jmiForca = new JMenuItem("Força");
		jmiEmagrecimento = new JMenuItem("Emagrecimento");
		jmiPesquisar = new JMenuItem("Pesquisar");
		
		
		
		jbCreditos = new JButton("Créditos");
		jbCreditos.setForeground(Color.white);
		jbCreditos.setBackground(Color.black);
		
		contentPane = getContentPane();//devolve um container(tela)
			
					//add(jlTitulo);
					
					jlTitulo.setBounds(80, 50, 250, 20);
					
					jbCreditos.setBounds(280, 380, 90, 20);
					jlimagem.setBounds(200,100, 200, 200);
					
		//adicionar o menu a barra de menu
				add(jlTitulo);	
				jmbBarra.add(jmArquivo);
				jmbBarra.add(jmExibir);
				
				
		//adicionar o menu item ao menu
				
				jmArquivo.add(jmiInicio);
				jmArquivo.add(jmiSair);
				jmExibir.add(jmiHipertrofia);
				jmExibir.add(jmiForca);
				jmExibir.add(jmiEmagrecimento);
				jmExibir.add(jmiPesquisar);
				add(jbCreditos);
				
				add(jlimagem);
	
	}

	

	private void criarEventos() {
		
		jmiInicio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaCorpus telaCorpus = new TelaCorpus("Corpus", cadastros);
				telaCorpus.setVisible(true);
				setVisible(false);
				
			}
		});
		
		jmiSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair e salvar as alterações?",
						"Corpus", JOptionPane.YES_NO_OPTION);
				if (resposta == 0) {
					arquivo.escreverArquivoCadastro(cadastros);//atravï¿½s do mï¿½todo passamos o objeto da lista de veï¿½culos
				}
				System.exit(0);
				
				
			}
			
		});
		
		
		//criar evento do menu item ficha
		
				jmiHipertrofia.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					PainelHipertrofia painelHipertrofia = new PainelHipertrofia(cadastros);
					contentPane.removeAll();//remove todo os componentes da tela
					contentPane.add(painelHipertrofia);//adicionando um painel 
					contentPane.validate();//validar os componentes
					
						
					}
				});
				
				jmiForca.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						PainelForca painelForca = new PainelForca(cadastros);
						contentPane.removeAll();//remove todo os componentes da tela
						contentPane.add(painelForca);//adicionando um painel 
						contentPane.validate();//validar os componentes
						
					}
				});
				
				jmiEmagrecimento.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						PainelEmagrecimento painelEmagrecimento = new PainelEmagrecimento(cadastros);
						contentPane.removeAll();//remove todo os componentes da tela
						contentPane.add(painelEmagrecimento);//adicionando um painel 
						contentPane.validate();//validar os componentes
						
					}
				});
				
				
				
				
				jmiPesquisar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					PainelPesquisar painelPesquisar = new PainelPesquisar(cadastros);
					
					contentPane.removeAll();//remove todo os componentes da tela
					contentPane.add(painelPesquisar);//adicionando um painel 
					contentPane.validate();//validar os componentes
					
						
					}
				});
	
				jbCreditos.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						PainelCredito painelCredito = new PainelCredito();
						contentPane.removeAll();//remove todo os componentes da tela
						contentPane.add(painelCredito);//adicionando um painel 
						contentPane.validate();//validar os componentes
						
					}
				});
				
	}
			
}
