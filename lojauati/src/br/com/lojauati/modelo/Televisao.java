package br.com.lojauati.modelo;

public class Televisao {
	
	private int canal;
	private int volume;
	private boolean status;
	
	public String ExibirTudo() {
		String resposta= "Desligada";
		if (status==true) {
			resposta="LIGADA";
		}
		return
				"Canal.....: " + canal + "\n" +
				"Volume....: " + volume;
	}
				
		
	public void preencherVolume (int pVolume) {
		if (pVolume>0) {
			volume=pVolume;
		}
	}
	
	public void preencherCanal (int pCanal) {
		if (pCanal>0 || pCanal<=67) {
			canal=pCanal;
					
		}
	}
	

	public void aumentarVolume() {
		if (status== true)
		volume++;
	}
	
	public void diminuirVolume () {
		if (volume>0 && status ==true) {
			volume--;
		}
		}
	
	public void mudarCanal (int novoCanal) {
		if (status ==true)
		canal=novoCanal;
	}
	
	
	public void ligar () {
		status=true;
	}
	public void desligar () {
		status=false;
	}
	}


