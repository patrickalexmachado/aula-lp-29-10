package aula_29_10_26;

public class PrincipalFuncionario {

	public static void main(String[] args) {

	//Criando Funcionario
	Funcionario funcionario = new Funcionario ("pedro","222.222.333-03",3000.00,"analista","producao");
	System.out.println("Funcionario");
	System.out.println("Nome: " + funcionario.getNome());
	System.out.println("Cpf: " + funcionario.getCpf());
	System.out.println("Salario: " + funcionario.getSalario());
	System.out.println("Cargo: " + funcionario.getCargo());
	System.out.println("departamento: " + funcionario.getCargo());
	
	// Criando Atendente
	Atendente atendente = new Atendente ("Cristiano","222.222.666-03",5000.00,"Gerente","mecanica");
	System.out.println("\n Funcionario");

	}

}
