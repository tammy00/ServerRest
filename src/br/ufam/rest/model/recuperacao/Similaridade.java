package br.ufam.rest.model.recuperacao;


import br.ufam.rest.model.Descricao;
import jcolibri.cbrcore.Attribute;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.similarity.LocalSimilarityFunction;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;

import jcolibri.method.retrieve.NNretrieval.similarity.local.MaxString;

public class Similaridade {
	
	NNConfig config; //Defini��o da medida de similaridade NN (vizinho mais pr�ximo)
	LocalSimilarityFunction function; //similaridade local
	Attribute atributo; 
	int k;
	
	public Similaridade() {
		this.config = new NNConfig();
		configure();
	}
	
		
	private void configure() {
		//configura��o dos atributos e os pesos de cada atributo
		setAttributeConfig("naturezaProblema", new Double(3)); 
		//setAttributeConfig("cursoId", new Double(1));
		//setAttributeConfig("disciplinaId", new Double(1));
		setAttributeConfig("poloId", new Double(2));
		setAttributeConfig("relatorId", new Double(2));	
		setAttributeConfig("descricaoProblema", new Double(1));
		setAttributeConfig("problema", new Double(3));
		setAttributeConfig("palavrasChavesProblema", new Double(2));
		
		
		config.setDescriptionSimFunction(new Average());
		
		this.k = 1; //defini��o dos K- Vizinhos
	}
	
		
	private void setAttributeConfig(String name,Double weight) {
		atributo = new Attribute(name,Descricao.class);
		function = new MaxString();
		config.addMapping(atributo, function);
		config.setWeight(atributo, weight);
	}
	
	public int getK() {
		return this.k;
	}
	
	public void setK(int _k) {
		this.k = _k;
	}
	
	public NNConfig getSimilarityConfig() {
		return this.config;
	}
}