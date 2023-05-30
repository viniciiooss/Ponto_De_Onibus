package program;

import entities.Passageiro;

public class Main {

	public static void main(String[] args) {

		   
		        PontoDeOnibus pontoDeOnibus = new PontoDeOnibus();

		        pontoDeOnibus.adicionarPassageiro(new Passageiro("maria"));
		        pontoDeOnibus.adicionarPassageiro(new Passageiro("joana"));
		        pontoDeOnibus.adicionarPassageiro(new Passageiro("vinicios"));
		        pontoDeOnibus.adicionarPassageiro(new Passageiro("Dimmy"));

		        Onibus onibus = new Onibus(6, pontoDeOnibus);
		        onibus.embarcarPassageiros();
		    
	}
		} 

	


