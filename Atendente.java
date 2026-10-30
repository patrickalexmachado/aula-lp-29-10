package aula_29_10_26;

public class Atendente extends Funcionario {

	private double ajudanteCusto;

	public Atendente(String nome, String cpf, double salario, String cargo, String departamento, double ajudanteCusto) {
		super(nome, cpf, salario, cargo, departamento);
		this.ajudanteCusto = ajudanteCusto;
	}

	public double getAjudanteCusto() {
		return ajudanteCusto;
	}

	public void setAjudanteCusto(double ajudanteCusto) {
		this.ajudanteCusto = ajudanteCusto;
	}
	
	
}
