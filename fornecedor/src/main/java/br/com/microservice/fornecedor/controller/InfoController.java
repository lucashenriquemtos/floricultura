package br.com.microservice.fornecedor.controller;

import br.com.microservice.fornecedor.model.InfoFonecedor;
import br.com.microservice.fornecedor.services.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/{estado}")
    public InfoFonecedor getInfoPorEstao(@PathVariable String estado){
       return infoService.getInfoPorEstado(estado);
    }
}
