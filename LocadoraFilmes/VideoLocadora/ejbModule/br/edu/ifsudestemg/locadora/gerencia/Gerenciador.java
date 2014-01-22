package br.edu.ifsudestemg.locadora.gerencia;

import java.util.List;

import br.edu.ifsudestemg.locadora.entity.Cliente;
import br.edu.ifsudestemg.locadora.entity.Diretor;
import br.edu.ifsudestemg.locadora.entity.Emprestimo;
import br.edu.ifsudestemg.locadora.entity.Exemplar;
import br.edu.ifsudestemg.locadora.entity.Filme;
import br.edu.ifsudestemg.locadora.entity.ItemEmprestimo;

public interface Gerenciador {
	Filme addFilme(Filme filme);
	Exemplar addExemplar(Exemplar exemplar,int idFilme);
	Cliente addCliente(Cliente cliente);
	Diretor addDiretor(Diretor diretor);
	boolean associa(int idDiretor, int idFilme);
	Filme buscaFilme(int id);
	Filme buscaFilme(String nome);
	List<Filme> buscaFilmes(Diretor diretor);
	int totalExemplares(Filme filme);
	List<Diretor> buscaDiretores(Filme filme);
	List<Filme> buscaFilmes(String genero, int ano);
	Cliente buscaCliente(int id);
	Diretor buscaDiretor(int id);
	Cliente buscaCliente(String nome);
	Exemplar buscaExemplar(int id);
	Emprestimo buscaEmprestimo(int id);
	ItemEmprestimo buscaItem(int id);
	void delDiretor(Diretor diretor);
	ItemEmprestimo addItem(int idFilme,float valorEmprestimo);
	Emprestimo Locacao(Emprestimo emprestimo);
	void devolucaoFilmes(Emprestimo emprestimo,String dataAtual);
	void finalizaProcessoLocacao(Cliente cliente, Emprestimo emprestimo, List<ItemEmprestimo> itens);
}
