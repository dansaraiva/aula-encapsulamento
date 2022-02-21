package encap.app;

import encap.entities.Pessoa;

public class Encapsulamento {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p.setNome("Klaudia");
		p.setIdade(45);
		p.setPeso(207.62);
		
		p2.setNome("Akkyson");
		p2.setIdade(15);
		p2.setPeso(76);
		
		/*
		System.out.println("Nome: "+p.getNome());
		System.out.println("Idade: "+p.getIdade());
		System.out.println("Peso: "+p.getPeso());
		
		System.out.println("Nome: "+p2.getNome());
		System.out.println("Idade: "+p2.getIdade());
		System.out.println("Peso: "+p2.getPeso());
		*/
		
		System.out.println(p);
		System.out.println(p2);
		
	}

}
