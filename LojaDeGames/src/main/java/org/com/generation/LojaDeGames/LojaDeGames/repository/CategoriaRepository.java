package org.com.generation.LojaDeGames.LojaDeGames.repository;

import java.util.List;

import org.com.generation.LojaDeGames.LojaDeGames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}
