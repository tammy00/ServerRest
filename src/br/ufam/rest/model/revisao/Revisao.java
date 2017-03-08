package br.ufam.rest.model.revisao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.ufam.rest.model.Descricao;
import br.ufam.rest.model.Solucao;

import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.method.retrieve.RetrievalResult;

/*
 * Classe que implementa a etapa de Revisão ou Adapatcacao 
 * 
 * */
public class Revisao {
	
	private Collection<CBRCase> casosSelecionados;
	private List<CBRCase> casos;
	CBRQuery query;
	
	
	public Revisao(Collection<CBRCase> _casosSelecionados, CBRQuery _query) {
		casosSelecionados = _casosSelecionados;
		casos = new ArrayList<CBRCase>(casosSelecionados);
		query = _query;
	}
	
	
	public void executarRevisao() {
		
				
		//String opcao = JOptionPane.showInputDialog(null, "                      <<< ETAPA DE REVISÃO >>> \n\n A solução ajudou a resolver o problema do aluno? SIM/NÃO");
		
		
		//if(opcao.toLowerCase().equals("sim")){
/*
			for(int i=0;i<casosSelecionados.size();i++) {
				CBRCase _case = casos.get(i);
				//System.out.println(casos.get(i));
				Descricao desc = (Descricao) query.getDescription();
				Solucao sol = (Solucao) _case.getSolution();
				Descricao desc2 = (Descricao) _case.getDescription();				
				salvarCaso(0,desc2.getCaseId(),
						desc.getNaturezaProblema(),
						desc.getDateCreated(),
						desc.getRelator(),
						//desc.getTurmaId(),
						//desc.getCursoId(),
						//desc.getDisciplinaId(),
						//desc.getQtdeAlunos(),
						desc.getDescricaoProblema(),
						desc.getProblema(),
						desc.getPalavrasChavesProblema(),
						sol.getDiagnostico(),
						sol.getSolucao(),
						sol.getPalavrasChavesSolucao(),
						sol.getAcaoImplementada(),
						sol.getEfetividade(),
						//sol.getSolucaoImplementada(),
						sol.getCustos(),
						//sol.getImpactoPedagogico(),
						sol.getAtoresEnvolvidos()					
						);
				printCasosRevisado();

			}
*/
		//}else{
		    	    
		    //String diagnostico = "diagnostico";
		    String solucao = "diagnostico";
		    String palavrasChavesSolucao = "diagnostico";
		    String acaoImplementada = "diagnostico";
		    //String solucaoImplementada = JOptionPane.showInputDialog(null, "Solução Implementada? SIM ou NAO?");
		    String efetividade = "diagnostico";
		    String custos = "diagnostico";
		    //String impactoPedagogico = JOptionPane.showInputDialog(null, "Qual impacto pedagógico?");
		    String atoresEnvolvidos = "diagnostico";
		    
/*		    String informacoes = "          <<<<< Nova Solução >>>> \n\n\n"+"Diagnostico: \n"+diagnostico+"\n Solução: \n"+solucao+"\nPalavras-chaves Solucao: \n"+palavrasChavesSolucao+
		    		"\n Ação implementada: \n"+acaoImplementada+"\n Efetividade: \n"+efetividade+"\n atoresEnvolvidos:\n"+atoresEnvolvidos;
		    JOptionPane.showMessageDialog(null, informacoes);
	*/	  
		    for(int i=0;i<casosSelecionados.size();i++) {
		    	CBRCase _case = casos.get(i);
			    //System.out.println(casos.get(i));
			    Descricao desc = (Descricao) query.getDescription();
			    
			    Descricao desc2 = (Descricao) _case.getDescription();
			
			    salvarCaso(0,desc2.getCaseId(),
			    		desc.getNaturezaProblema(),						
						//desc.getRelator(),
						//desc.getTurmaId(),
						//desc.getCursoId(),
						//desc.getDisciplinaId(),
						//desc.getQtdeAlunos(),
			    		desc.getPoloId(),
						desc.getDescricaoProblema(),
						desc.getProblema(),
						desc.getPalavrasChavesProblema(),
						//diagnostico,
						solucao,
						//palavrasChavesSolucao,
						acaoImplementada,
						efetividade,						
						custos,						
						atoresEnvolvidos
						);
				
				//printCasosRevisado();
			}
						
		//}
			
	}
	
	public void executarRevisao2(Solucao solucaoArg) {
		
		
		//String opcao = JOptionPane.showInputDialog(null, "                      <<< ETAPA DE REVISÃO >>> \n\n A solução ajudou a resolver o problema do aluno? SIM/NÃO");
		
		
		//if(opcao.toLowerCase().equals("sim")){
/*
			for(int i=0;i<casosSelecionados.size();i++) {
				CBRCase _case = casos.get(i);
				//System.out.println(casos.get(i));
				Descricao desc = (Descricao) query.getDescription();
				Solucao sol = (Solucao) _case.getSolution();
				Descricao desc2 = (Descricao) _case.getDescription();				
				salvarCaso(0,desc2.getCaseId(),
						desc.getNaturezaProblema(),
						desc.getDateCreated(),
						desc.getRelator(),
						//desc.getTurmaId(),
						//desc.getCursoId(),
						//desc.getDisciplinaId(),
						//desc.getQtdeAlunos(),
						desc.getDescricaoProblema(),
						desc.getProblema(),
						desc.getPalavrasChavesProblema(),
						sol.getDiagnostico(),
						sol.getSolucao(),
						sol.getPalavrasChavesSolucao(),
						sol.getAcaoImplementada(),
						sol.getEfetividade(),
						//sol.getSolucaoImplementada(),
						sol.getCustos(),
						//sol.getImpactoPedagogico(),
						sol.getAtoresEnvolvidos()					
						);
				printCasosRevisado();

			}
*/
		//}else{
		    	    
		    //String diagnostico = solucaoArg.getDiagnostico();
		    String solucao = solucaoArg.getSolucao();
		    //String palavrasChavesSolucao = solucaoArg.getPalavrasChavesSolucao();
		    String acaoImplementada = solucaoArg.getAcaoImplementada();
		    String efetividade = solucaoArg.getEfetividade();
		    String custos = solucaoArg.getCustos();
		    String atoresEnvolvidos = solucaoArg.getAtoresEnvolvidos();
		    
/*		    String informacoes = "          <<<<< Nova Solução >>>> \n\n\n"+"Diagnostico: \n"+diagnostico+"\n Solução: \n"+solucao+"\nPalavras-chaves Solucao: \n"+palavrasChavesSolucao+
		    		"\n Ação implementada: \n"+acaoImplementada+"\n Efetividade: \n"+efetividade+"\n atoresEnvolvidos:\n"+atoresEnvolvidos;
		    JOptionPane.showMessageDialog(null, informacoes);
	*/	  
		    for(int i=0;i<casosSelecionados.size();i++) {
		    	CBRCase _case = casos.get(i);
			    //System.out.println(casos.get(i));
			    Descricao desc = (Descricao) query.getDescription();
			    
			    Descricao desc2 = (Descricao) _case.getDescription();
			
			    salvarCaso(0,desc2.getCaseId(),
			    		desc.getNaturezaProblema(),
						//desc.getDateCreated(),
						//desc.getRelator(),
						//desc.getTurmaId(),
						//desc.getCursoId(),
						//desc.getDisciplinaId(),
						//desc.getQtdeAlunos(),
			    		desc.getPoloId(),
						desc.getDescricaoProblema(),
						desc.getProblema(),
						desc.getPalavrasChavesProblema(),
						//diagnostico,
						solucao,
						//palavrasChavesSolucao,
						acaoImplementada,
						efetividade,						
						custos,						
						atoresEnvolvidos
						);
				
				//printCasosRevisado();
			}
						
		//}
			
	}

	
	
	public void printCasosRevisado() {
		for(int i=0;i<this.casosSelecionados.size();i++) {
			Descricao desc = getCaseDescription(i);//descricao do caso passado por parametro
			//System.out.println("Descricao Caso: "+desc);
			Solucao sol = getSolucaoCaso(i);
			String informacoes = "                             <<< ETAPA DE REVISÃO >>> \n\n O caso foi Revisado, e sera Retido na base de casos: \n"+
					";\n Tema: "+desc.getNaturezaProblema()+
					//";\n Topico: "+desc.getDateCreated()+
					//";\n Estilo de Aprendizagem: "+desc.getRelator()+
					";\n Polo (ID): "+desc.getPoloId()+
					//";\n Descricao do proglema: "+desc.getTurmaId()+
					//";\n Natureza do problema: "+desc.getCursoId()+
					//";\n Natureza do problema: "+desc.getDisciplinaId()+
					//";\n Natureza do problema: "+desc.getQtdeAlunos()+
					";\n Natureza do problema: "+desc.getDescricaoProblema()+
					";\n Natureza do problema: "+desc.getProblema()+
					";\n Natureza do problema: "+desc.getPalavrasChavesProblema()+			
					" \n \n  ------ Solucao Empregada ------- \n"+
					//"\nDiagnostico: "+sol.getDiagnostico()+
					"\n"+"Solucao: "+sol.getSolucao()+
				//	"\n"+"Palavras chaves solucao : "+sol.getPalavrasChavesSolucao()+
					"\n"+"Acao Implementada: "+sol.getAcaoImplementada()+
					"\n"+"Efetividade: "+sol.getEfetividade()+
					//"\n"+"Objeto de Aprendizagem: "+sol.getSolucaoImplementada()+
					"\n"+"Objeto de Aprendizagem: "+sol.getCustos()+
					//"\n"+"Objeto de Aprendizagem: "+sol.getImpactoPedagogico()+		
					"\n"+"Objeto de Aprendizagem: "+sol.getAtoresEnvolvidos();
			JOptionPane.showMessageDialog(null, informacoes);
			
		}
	}
	
	
		
	public void salvarCaso(int _caseNumber,int _caseId, String _naturezaProblema,  String _polo,
			String _descricaoProblema, String _problema, String _solucao, 
			String _palavrasChavesSolucao, String _acaoImplementada, String _efetividade, 
			String _custos, String _atoresEnvolvidos) {
			
			CBRCase _caso = casos.get(_caseNumber);
			//System.out.println("CASO: "  +_caso);
			Descricao desc = (Descricao) _caso.getDescription();//descrição do caso recuperado
			//System.out.println("CASOS RECUPERADO: "  +desc);
			
			desc.setCaseId(_caseId);
			desc.setNaturezaProblema(_naturezaProblema);
			//desc.setDateCreated(_dateCreated);
			//desc.setRelator(_relator);
			desc.setPoloId(_polo);
			//desc.setTurmaId(_turma);
			//desc.setCursoId(_curso);
			//desc.setDisciplinaId(_disciplina);
			//desc.setQtdeAlunos(_qtdeAlunos);
			desc.setDescricaoProblema(_descricaoProblema);
			desc.setProblema(_problema);
			//desc.setPalavrasChavesProblema(_palavrasChavesProblema);
			
			Solucao sol = (Solucao) _caso.getSolution();
			//sol.setDiagnostico(_diagnostico);
			sol.setSolucao(_solucao);
			//sol.setPalavrasChavesSolucao(_palavrasChavesSolucao);
			sol.setAcaoImplementada(_acaoImplementada);
			sol.setEfetividade(_efetividade);
			//sol.setSolucaoImplementada(_solucaoImplementada);
			sol.setCustos(_custos);
			//sol.setImpactoPedagogico(_impactoPedagogico);
			sol.setAtoresEnvolvidos(_atoresEnvolvidos);
	}
	
	/*
	 * Parte da Solucao do Problema  
	 */
	/*
	public String getDiagnostico(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getDiagnostico();
	}  */
	
	public String getSolucao(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getSolucao();
	}
/*	
	public String getPalavrasChavesSolucao(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getPalavrasChavesSolucao();
	}
*/
	public String getAcaoImplementada(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getAcaoImplementada();
	}
	/*
	public String getSolucaoImplementada(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getSolucaoImplementada();
	}
	*/
	public String getCustos(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getCustos();
	}
	
	public String getEfetividade(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getEfetividade();
	}

	public String getAtoresEnvolvidos(int _caso) {
		Solucao sol = getSolucaoCaso(_caso);
		return sol.getAtoresEnvolvidos();
	}	

	/*
	 * Parte da Decrição do Problema  
	 */
	
	public String getNaturezaProblema(int _caso) {
		Descricao desc  = getCaseDescription(_caso);
		return desc.getNaturezaProblema();
	}
	/*
	public String getRelator(int _caso) {
		Descricao desc  = getCaseDescription(_caso);
		return desc.getRelator();
	}
	
	public String getTurmaId(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getTurmaId();
	}
	
	public String getCursoId(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getCursoId();
	}

	public String getDisciplinaId(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getDisciplinaId();
	}

	public String getQtdeAlunos(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getQtdeAlunos();
	}
*/
	
	public String getPoloId(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getPoloId();
	}
	
	public String getDecricaoProblema(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getDescricaoProblema();
	}	

	public String getProblema(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getProblema();
	}	

	public String getPalavrasChavesProblema(int _case) {
		Descricao desc  = getCaseDescription(_case);
		return desc.getPalavrasChavesProblema();
	}	
	
	public CBRCase getCase(int i) {
		CBRCase _caso = casos.get(i);
		return _caso;
	}
	
	public Descricao getCaseDescription(int _caseNumber) {
		CBRCase _caso = getCase(_caseNumber);
		return (Descricao) _caso.getDescription();
	}
	
	public Solucao getSolucaoCaso(int _caseNumber) {
		CBRCase _caso = getCase(_caseNumber);
		return (Solucao) _caso.getSolution();
	}
	
	

	
}
