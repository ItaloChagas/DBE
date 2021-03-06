package br.com.fiap.estoque;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import br.com.fiap.estoque.EstoqueBasicoStub.Soma;
import br.com.fiap.estoque.EstoqueBasicoStub.SomaResponse;

public class ConsultaBasica {

	public static void main(String[] args) {

		try {
			
			EstoqueBasicoStub ebs = new EstoqueBasicoStub();
			
			Soma soma = new Soma();
			soma.setNr1(2);
			soma.setNr2(10);
			
			
			SomaResponse smr = ebs.soma(soma);
			
			System.out.println("O resultado da operacao �: " + smr.get_return());
			
		} catch (AxisFault e) {

			e.printStackTrace();
		} catch (RemoteException e) {
		
			e.printStackTrace();
		}
	}

}
