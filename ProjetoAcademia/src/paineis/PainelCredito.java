package paineis;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class PainelCredito extends JPanel {
	private JLabel jlTitulo;
	private JLabel jlTexto,jlTexto2,jlTexto3, jlTexto4,jlTexto5,jlTexto6;
	private ImageIcon logosquad;
	private JLabel jlimagem;
	
	public PainelCredito() {
		super();
		setSize(400, 400);//largura,altura
		setLayout(null);		
		setBackground(Color.darkGray);
		iniciarComponentes();
		
	}

	private void iniciarComponentes() {
		
		logosquad = new ImageIcon(getClass().getResource("/imagens/logosquad.png"));
		jlimagem = new JLabel(logosquad);
		
		Font font = new Font("arial", Font.BOLD, 18);
		Font font2 = new Font("arial", Font.BOLD, 13);
		Font font3 = new Font("arial", Font.BOLD, 12);
		
		jlTexto = new JLabel("Este projeto foi realizado por: ");
		jlTexto.setFont(font);
		jlTexto2 = new JLabel("João Pedro Honório");
		jlTexto2.setFont(font2);
		jlTexto3 = new JLabel("Luan Alves Missaia");
		jlTexto3.setFont(font2);
		jlTexto4 = new JLabel("Julio Gabriel Viana");
		jlTexto4.setFont(font2);
		jlTexto5 = new JLabel("Squad File3");
		jlTexto5.setFont(font);
		jlTexto6 = new JLabel("Senai Zerbini 1DS-N, 2022");
		jlTexto6.setFont(font3);
	
		jlTexto.setForeground(Color.white);
		jlTexto2.setForeground(Color.white);
		jlTexto3.setForeground(Color.white);
		jlTexto4.setForeground(Color.white);
		jlTexto5.setForeground(Color.white);
		jlTexto6.setForeground(Color.white);
		
		
		add(jlTexto);
		add(jlTexto2);
		add(jlTexto3);
		add(jlTexto4);
		add(jlTexto5);
		add(jlTexto6);
		add(jlimagem);
		
		jlTexto.setBounds(10, 20, 500, 40);
		jlTexto2.setBounds(10, 50, 500, 40);
		jlTexto3.setBounds(10, 70, 500, 40);
		jlTexto4.setBounds(10, 90, 500, 40);
		jlTexto5.setBounds(20,70, 200, 200);
		jlTexto6.setBounds(230, 390, 200, 20);
		jlimagem.setBounds(120,160, 200, 200);
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
