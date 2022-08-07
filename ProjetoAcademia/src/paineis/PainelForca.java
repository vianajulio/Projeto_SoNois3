package paineis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import classes.Cadastro;
import classes.Cliente;
import classes.Forca;

public class PainelForca extends JPanel {
	private JLabel jlTitulo;
	private JRadioButton jrbA,jrbB,jrbC,jrbD;
	private JButton jbExibir;
	private ButtonGroup bgTreinos;
	private JTextArea jtaExibir;
	private JScrollPane jspExibir;
	private List<Cadastro> cadastros;
	private Forca forca = new Forca();
	private ImageIcon peso;
	private JLabel jlimagem;
	
	public PainelForca(List<Cadastro> cadastros) {
		super();
		this.cadastros = cadastros;
		setSize(400, 400);//largura,altura
		setLayout(null);		
		setBackground(Color.darkGray);
		iniciarComponentes();
		criarEventos();
	}


	private void iniciarComponentes() {
		peso = new ImageIcon(getClass().getResource("/imagens/peso.png"));
		jlimagem = new JLabel(peso);
		
		Font font = new Font("arial", Font.BOLD, 17);
		
		jlTitulo = new JLabel("Escolha sua ficha");
		jlTitulo.setForeground(Color.white);
		jlTitulo.setFont(font);
	
		
		jrbA = new JRadioButton("A");
		jrbA.setForeground(Color.white);
		jrbA.setSelected(true);
		jrbA.setOpaque(false);
		jrbA.setFont(font);
		
		jrbB = new JRadioButton("B");
		jrbB.setForeground(Color.white);
		jrbB.setOpaque(false);
		jrbB.setFont(font);
		
		jrbC = new JRadioButton("C");
		jrbC.setForeground(Color.white);
		jrbC.setOpaque(false);
		jrbC.setFont(font);
		
		jrbD = new JRadioButton("D");
		jrbD.setForeground(Color.white);
		jrbD.setOpaque(false);
		jrbD.setFont(font);
		
		jbExibir = new JButton("Exibir");
		jbExibir.setBackground(Color.black);
		jbExibir.setForeground(Color.white);
		bgTreinos = new ButtonGroup();
		jtaExibir = new JTextArea();
		jtaExibir.setEditable(false);
		jspExibir = new JScrollPane(jtaExibir);
		
		add(jlTitulo);
		
		add(jrbA);
		add(jrbB);
		add(jrbC);
		add(jrbD);
		add(jbExibir);
		add(jspExibir);
		bgTreinos.add(jrbA);
		bgTreinos.add(jrbB);
		bgTreinos.add(jrbC);
		bgTreinos.add(jrbD);
		add(jlimagem);
		
		jlTitulo.setBounds(120, 10, 150, 20);
		jrbA.setBounds(130, 60, 100, 20);
		jrbB.setBounds(130, 90, 100, 20);
		jrbC.setBounds(130, 120, 100, 20);
		jrbD.setBounds(130, 150, 100, 20);
		jbExibir.setBounds(130, 180, 100, 20);
		jspExibir.setBounds(10, 220, 360, 200);
		jlimagem.setBounds(170,10, 300, 200);
		
	}


	private void criarEventos() {
		jbExibir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaExibir.setText("\t                   CORPUS\n");
				
				for (Cadastro cadastro : cadastros) {
					if (cadastro.getTipoplano().equals("Força")) {
						if (jrbA.isSelected()) jtaExibir.append(forca.treinoA()); 
						if (jrbB.isSelected()) jtaExibir.append(forca.treinoB());
						if (jrbC.isSelected()) jtaExibir.append(forca.treinoC()); 
						if (jrbD.isSelected()) jtaExibir.append(forca.treinoD()); 
					}
					
				}		
				
						
						
				
			
			}
		});
		
	}

	
	
}
