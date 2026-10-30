package aula_29_10_26;

public class Principal {

	public static void main(String[] args) {

	// Criando uma Pessoa
	Pessoa pessoa = new Pessoa ("João da Silva", "(11) 9999-9999");
	System.out.println("Pessoa");
	System.out.println("Nome " + pessoa.getNome());
	System.out.println("Telefone: " + pessoa.getTelefone());
	
	// Criando uma Pessoa fisica
	PessoaFisica pessoaFisica = new PessoaFisica ("João da SIlva", "(11) 9999-9999","123.456.789-00","300.456.989-x");
	System.out.println("\nPessoa fisica:");
	System.out.println("Nome: " + pessoaFisica.getNome());
	System.out.println("Telefone: " + pessoaFisica.getTelefone());
	System.out.println("CPF: " + pessoaFisica.getCpf());
	System.out.println("RG: " + pessoaFisica.getRg());
	
	//Criando uma Pessoa Juridica
	PessoaJuridica pessoaJuridica = new PessoaJuridica ("Empresa XYZ","(11) 9999-9999","1.435.68-23");
	System.out.println("\nPessoa juridica:");
	System.out.println("Nome: " + pessoaJuridica.getNome());
	System.out.println("Telefone: " + pessoaJuridica.getTelefone());
	System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
	
	}

}
