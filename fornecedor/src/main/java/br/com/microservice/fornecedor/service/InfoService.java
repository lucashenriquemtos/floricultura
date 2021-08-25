package br.com.microservice.fornecedor.service;

import br.com.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private InfoRepository infoRepository;
    public InfoFornecedor getInfoPorEstado(String estado) {
       return infoRepository.findByEstado(estado);
    }
}
