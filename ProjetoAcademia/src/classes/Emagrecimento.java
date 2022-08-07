package classes;

public class Emagrecimento extends Cadastro {
	private String treinoEmagrecimento;


	public Emagrecimento(String nome, String tipoplano, String login, String senha, String cpf,
			String treinoEmagrecimento) {
		super(nome, tipoplano, login, senha, cpf);
		this.treinoEmagrecimento = treinoEmagrecimento;
	}

	public Emagrecimento() {
		super();
	
	}

			//treino de peito e triceps
			public String treinoA() {
				return treinoEmagrecimento = "\n Supino reto: 3x de 10"
									+"\n Supino reto c/barra: 3x de 10"
									+"\n Supino inclinado: 3x de 10 "
									+"\n Paralelas: 3x 10 "
									+"\n Desenvolvimento militar: 3x de 10";
			}
			
			public String treinoB() {
				return treinoEmagrecimento=	"\n Barra fixa: 4x de 12 "
									+ "\n Remada curvada: 4x de 12 "
									+ "\n Serrote: 4x de 12"
									+ "\n Remada alta: 4x de 12"
									+ "\n Rosca direta: 4x de 12";
			}
			
			public String treinoC() {
				//costas e biceps
				return treinoEmagrecimento=	 "\n Agachamento livre: 4x de 15 "
									+ "\n Levantamento terra: 4x de 15 "
									+ "\n Stiff: 4x de 15"
									+ "\n Serrote: 4x de 15"
									+ "\n Extensora: 4x de 15"
									+ "\n Gêmeos: 4x de 15"
									+ "\n Abdominal: 4x de 15";		
			}
			
			public String treinoD() {
				//ombro e abdominal
				return treinoEmagrecimento=	 "\n Desenvlvimento maquina: 5x de 15 "
									+ "\n Desenvolvimento lateral: 5x 15 "
									+ "\n Desenvolvimento frontal: 5x de 15"
									+ "\n Fly invertido: 4x de 10"
									+ "\n Abdominal: 4x de 15";
									
			}

}

