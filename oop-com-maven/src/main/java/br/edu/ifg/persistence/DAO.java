package br.edu.ifg.persistence;
/**
 * 
 * @author kenyo
 *
 * @param <T> representa a classe/tipo com a qual um dao irá trabalhar
 * @param <K> representa o tipo do atributo identificados da classe/tipo a ser persistido
 */

import java.util.List;

public interface DAO <T, K> {
	K inserir(T t);
	T atualizar(T t);
	T get(K id);
	List<T> list();
}
