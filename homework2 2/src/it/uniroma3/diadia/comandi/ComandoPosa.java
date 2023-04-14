package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando {
    public String nomeAttrezzo; 

	private IO io;
	public static final String nome="Posa";
	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		Attrezzo a=partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);

		if(partita.getLabirinto().getStanzaCorrente().getNumeroAttrezziPossibili()>0) {
			partita.getLabirinto().getStanzaCorrente().addAttrezzo(a);
			partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
		}
		else {
			io.mostraMessaggio("Non c'e' spazio nella stanza per poter inserire questo attrezzo!");
		}
	}
	

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		this.nomeAttrezzo=parametro;
	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		
		
		return this.nomeAttrezzo;
	}

	@Override
	public void setIo(IO io) {
		// TODO Auto-generated method stub
		this.io=io;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
