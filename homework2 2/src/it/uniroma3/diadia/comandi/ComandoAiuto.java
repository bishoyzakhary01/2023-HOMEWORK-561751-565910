package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;



public class ComandoAiuto implements Comando {

	public IO io;
	public static final  String nome="Aiuto";
	static final public String[] ELENCO_COMANDI = {"vai", "aiuto", "fine","prendi", "posa", "guarda"};
	
	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		
		for(int i=0; i< ELENCO_COMANDI.length; i++) 
			io.mostraMessaggio(ELENCO_COMANDI[i]+" ");
		io.mostraMessaggio("");
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIo(IO io) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
