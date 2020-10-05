package br.com.lojauati.teste;

import br.com.lojauati.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Televisao TV = new Televisao ();
				
				TV.mudarCanal(50);
				TV.ligar();
				TV.aumentarVolume();
				TV.aumentarVolume();
				TV.aumentarVolume();
				TV.aumentarVolume();
				System.out.println(TV.ExibirTudo());
				TV.desligar();
				TV.diminuirVolume();
				System.out.println(TV.ExibirTudo());
				
	}

}
