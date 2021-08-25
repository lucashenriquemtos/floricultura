package br.com.microservice.fornecedor.service;

import br.com.microservice.fornecedor.model.InfoFornecedor;
import br.com.microservice.fornecedor.repository.InfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private static final Logger log = LoggerFactory.getLogger(InfoService.class);

    private InfoRepository infoRepository;
    public InfoFornecedor getInfoPorEstado(String estado) {
        log.info("informações buscadas");
        return infoRepository.findByEstado(estado);
    }
}
