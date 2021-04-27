package br.com.unipe.aula.doa;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Repository;
import br.com.unipe.aula.model.Moedas;

@Repository
public class MoedaDAO {
	
	private static List<Moedas> moedasList;
	
	public MoedaDAO() {
		moedasList = new LinkedList<Moedas>();
	}
	
	public void salvar(Moedas moeda) {
		moedasList.add(moeda);
		System.out.println(moedasList);
	}
	
	public List<Moedas> getAll(){
			return moedasList;
			
	}
}
