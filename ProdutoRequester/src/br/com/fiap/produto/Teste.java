package br.com.fiap.produto;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import br.com.fiap.produto.ProdutoStub.GetNosso;
import br.com.fiap.produto.ProdutoStub.GetNossoResponse;

public class Teste {

	public static void main(String[] args) {


		try {
			ProdutoStub sb = new ProdutoStub();
			
			GetNosso gn = new GetNosso();
			gn.setTipo(1);
			
			GetNossoResponse gtr = sb.getNosso(gn);
			System.out.println(gtr.get_return());
				
			
			
		} catch (AxisFault e) {
			
			e.printStackTrace();
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		
	}

}
