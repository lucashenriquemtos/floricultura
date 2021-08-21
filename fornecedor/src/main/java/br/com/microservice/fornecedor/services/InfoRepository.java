package br.com.microservice.fornecedor.services;

import br.com.microservice.fornecedor.model.InfoFonecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends CrudRepository<InfoFonecedor, Long> {
    InfoFonecedor findByEstado(String estado);
}
