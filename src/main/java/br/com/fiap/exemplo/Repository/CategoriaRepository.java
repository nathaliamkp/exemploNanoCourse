package br.com.fiap.exemplo.Repository;

import br.com.fiap.exemplo.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}