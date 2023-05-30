package program;

import entities.Passageiro;
import java.util.Queue;
import java.util.LinkedList;

public class PontoDeOnibus{
	private Queue <Passageiro> fila;
	
	public PontoDeOnibus() {
	this.fila = new LinkedList<>();

}
	public void adicionarPassageiro (Passageiro passageiro) {
		fila.add(passageiro);
	}
	public Passageiro removerPassageiro() {
		return fila.poll();
	}
	public boolean isEmpty() {
		return fila.isEmpty();
	}
}