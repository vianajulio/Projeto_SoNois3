 package classes;

	public class Hipertrofia extends Cliente {
	private String treinoHipertrofia;
	
	public Hipertrofia(String nome, String cpf, int idade, float peso, float altura, String treinoHipertrofia) {
		super(nome, cpf, idade, peso, altura);
		this.treinoHipertrofia = treinoHipertrofia;
	}
	
	//treino de peito e triceps
	
	public Hipertrofia() {
		super();
	}


		public String treinoA() {
			//Quadríceps e bíceps
		return treinoHipertrofia=	"\n Agachamento livre: 4x de 12"
							+ "\n Leg press: 4x de 12"
							+ "\n Cadeira Extensora: 4x de 12"
							+ "\n Mesa flexora: 4x de 12"
							+ "\n Rosca direta: 4x de 8"
							+ "\n Rosca Scott: 4x de 10";
	}

		public String treinoB() {
			
			return treinoHipertrofia=	"\n Supino inclinado com Halteres: 5x de 8"
								+ "\n Crucifixo na máquina: 5x de 15"
								+ "\n Flexão: 5x de 15"
								+ "\n Elevação lateral: 5x de 12"
								+ "\n Elevação lateral no cabo: 3x de 10"
								+ "\n Tríceps testa: 4x de 15"
								+ "\n Tríceps Pulley: 4x de 6";
		}
		
		public String treinoC() {
			
			return treinoHipertrofia=	 "\n Puxada alta: 3x de 12 "
								+ "\n Remada baixa: 3s 12 "
								+ "\n Remada alta: 4x de 12"
								+ "\n Serrote: 4x de 12"
								+ "\n Rosca alternada c/ banco inclinado: 4 12"
								+ "\n Pull down: 3x de 12"
								+ "\n Pulley Frente: 4x de 10"
								+ "\n Flexora deitado: 3x de 10";
		}
		
		public String treinoD() {
			
			return treinoHipertrofia=	 "\n Desenvlvimento maquina: 4x de 12 "
								+ "\n Desenvolvimento lateral: 3s 12 "
								+ "\n Desenvolvimento frontal: 4x de 12"
								+ "\n Desenvolvimento com Barra: 4x de 8"
								+ "\n Fly invertido: 4x de 12"
								+ "\n Face Pull: 4x de 15"
								+ "\n Elevação lateral no cabo: 4ï¿½ de 15"
								+ "\n Tríceps Pulley: 4ï¿½ de 8"
								+ "\n Tríceps testa: 3x de 15"
								+ "\n Abdominal: 3x de 15";
								
								
		}
	
		
}
