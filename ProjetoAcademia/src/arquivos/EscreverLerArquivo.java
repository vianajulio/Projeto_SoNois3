package arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Cadastro;

public class EscreverLerArquivo {
	//escrever o arquivo cadastro
	
	public void escreverArquivoCadastro(List<Cadastro> cadastros){
		try {
			FileOutputStream saida = new FileOutputStream("Corpus.bin");
			ObjectOutputStream objeto = new ObjectOutputStream(saida);
			objeto.writeObject(cadastros);
			objeto.close();
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo n„o encontrado", "Corpus", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Arquivo corrompido", "Corpus", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}	
		
	}	
	
	//ler arquivo cadastro
	public List<Cadastro> lerArquivoCadastro(){
		List<Cadastro> cadastros = null;//vari√°vel que vai receber o objeto do arquivo
		try {
			FileInputStream entrada = new FileInputStream("Corpus.bin");
			ObjectInputStream objeto = new ObjectInputStream(entrada);
			cadastros = (List<Cadastro>) objeto.readObject();
			objeto.close();
			
			
		} catch (FileNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "Arquivo n„o encontrado", "Corpus", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (IOException e) {
			
			JOptionPane.showMessageDialog(null, "Arquivo corrompido", "Corpus", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Classe n„o encontrada", "Corpus", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			e.printStackTrace();
		}
		return cadastros;
	}
	
}
