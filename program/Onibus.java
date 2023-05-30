package program;

import entities.Passageiro;

public class Onibus {
	 private int capacidade;
	    private PontoDeOnibus pontoDeOnibus;

	    public Onibus(int capacidade, PontoDeOnibus pontoDeOnibus) {
	        this.capacidade = capacidade;
	        this.pontoDeOnibus = pontoDeOnibus;
	    }

	    public void embarcarPassageiros() {
	        while (!pontoDeOnibus.isEmpty() && capacidade > 0) {
	            Passageiro passageiro = pontoDeOnibus.removerPassageiro();
	            System.out.println("Passageiro " + passageiro.getNome() + " entrou no ônibus.");
	            capacidade--;
	        }
	        System.out.println("O ônibus partiu com " + (capacidade == 0 ? "capacidade máxima." : +capacidade+ " assentos vazios."));
	    }
	    }
