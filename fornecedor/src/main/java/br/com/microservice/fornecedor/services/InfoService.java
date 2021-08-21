package br.com.microservice.fornecedor.services;

import br.com.microservice.fornecedor.model.InfoFonecedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    public InfoFonecedor getInfoPorEstado(String estado) {
        return infoRepository.findByEstado(estado);
    }
}
