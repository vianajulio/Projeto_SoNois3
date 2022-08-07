package classes;

public class Forca extends Cliente {
	private String treinoForca;
	
	public Forca(String nome, String cpf, int idade, float peso, float altura, String treinoForca) {
		super(nome, cpf, idade, peso, altura);
		this.treinoForca = treinoForca;
	}
	
	

			public Forca() {
		super();
	}


			//treino de peito e triceps
			public String treinoA() {
				return treinoForca = "\n Supino reto com barra: 5x de 10 "
									+"\n Supino inclinado com halter: 4x de 8"
									+"\n Desenvolvimento militar: 4x de 15"
									+"\n Elevação lateral: 5x de 12"
									+"\n Supino fechado pesado: 4x de 3"
									+"\n Triceps testa:	4x de 8"
									+"\n Triceps corda:	5x de 12";
			}
			
			public String treinoB() {
				//perna
				return treinoForca=	  "\n Agachamento livre: 3x de 5 "
									+ "\n Leg Press 45: 4x de 20 "
									+ "\n Stiff: 4x de 10"
									+ "\n Mesa flexora:	4x de 6"
									+ "\n Panturrilha em pé: 4x de 12"
									+ "\n Panturrilha sentado: 4x de 12"
									+ "\n Abdominal pulley: 3x de 12"
									+ "\n Elevação de pernas: 3x de 12"
									+ "\n Hipextensão Costas: 3x de 10";
		
			}
			
			public String treinoC() {
				//costas e biceps
				return treinoForca=	  "\n Levantamento Terra: 1x de 5 "
									+ "\n Remada curvada: 4x de 6 "
									+ "\n Puxada alta frontal: 4x de 6"
									+ "\n Serrote: 4x de 12"
									+ "\n Elevação posterior de ombro: 3x de 12"
									+ "\n Rosca direta barra: 4x de 6"
									+ "\n Rosca scott barra W: 4x de 12"
									+ "\n Rosca direta barra reta: 4x de 12"
									+ "\n Rosca punho: 4x de 12";
			}
			
			public String treinoD() {
				return treinoForca=	  "\n Levantamento Terra: 4x de 8 "
									+ "\n Puxada alta frontal: 4x de 8 "
									+ "\n Remada cavalinho: 4x de 6"
									+ "\n Rosca martelo: 4x de 12"
									+ "\n Serrote banco: 4x de 6"
									+ "\n Elevação posterior de ombro: 4x de 12"
									+ "\n Desenvolvimento frontal: 4x de 12"
									+ "\n Fly invertido: 4x de 12"
									+ "\n Abdominal: 4x de 15";
									
									
			}
	
}
