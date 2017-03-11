package br.ufam.rest.model;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

/**
 * Classe que descreve o problema do caso (os atributos)
 */


public class Descricao implements CaseComponent{


	int caseId;
	String naturezaProblema; 

	String relatorId; 


	//String turmaId; 
	//String cursoId;
	String poloId;
	//String qtdeAlunos;
	String descricaoProblema;
	String problema;
	String palavrasChavesProblema;
	//String tipoCaso;
	
		
	public String getRelatorId() {
		return relatorId;
	}


	public void setRelatorId(String relatorId) {
		this.relatorId = relatorId;
	}
	
	public Attribute getIdAttribute() {
		return new Attribute("caseId",this.getClass());
	}


	public int getCaseId() {
		return caseId;
	}

	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}



	public String getPoloId() {
		return poloId;
	}


	public void setPoloId(String poloId) {
		this.poloId = poloId;
	}


	public String getNaturezaProblema() {
		return naturezaProblema;
	}

	public void setNaturezaProblema(String naturezaProblema) {
		this.naturezaProblema = naturezaProblema;
	}
	
	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}


	public String getPalavrasChavesProblema() {
		return palavrasChavesProblema;
	}

	public void setPalavrasChavesProblema(String palavrasChavesProblema) {
		this.palavrasChavesProblema = palavrasChavesProblema;
	}

}
