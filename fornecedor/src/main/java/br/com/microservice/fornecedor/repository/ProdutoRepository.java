package br.com.microservice.fornecedor.repository;

import java.util.List;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

    List<Produto> findByEstado(String estado);

    List<Produto> findByIdIn(List<Long> ids);
}

