package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio4 {
	
	public static void main(String[] args) {
		
		float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite primeiro valor"));
		float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite segundo valor"));
		String sinal= JOptionPane.showInputDialog("Digite o sinal:\n1 - somar\n2 - subtrair\n3 - divisão\n4 - multiplicação");
		float resultado=0;
		
				
		if (sinal.equals("1")) {
			resultado =  valor1 + valor2;
		}
		
		else if (sinal.equals("2")) {
			resultado = valor1 - valor2;
		}
		
		else if (sinal.equals("3")) {
			resultado = valor1 / valor2;
		}
		
		else if (sinal.equals("4")) {
			resultado = valor1 * valor2;
		}
			
			
		System.out.println("Resultado...: "+ resultado);
	
		
	}
		}
		
		
		

	


