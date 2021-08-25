package br.com.microservice.fornecedor.service;

import br.com.microservice.fornecedor.model.Produto;
import br.com.microservice.fornecedor.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public List<Produto> getProdutosPorEstado(String estado) {
        return produtoRepository.findByEstado(estado);
    }


}
