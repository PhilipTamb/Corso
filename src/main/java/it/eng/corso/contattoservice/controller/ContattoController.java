package it.eng.corso.contattoservice.controller;

import it.eng.corso.contattoservice.model.Contatto;
import it.eng.corso.contattoservice.service.ContattoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Rest controller che gestirà le richieste ricevute dai client
public class ContattoController {
    @Autowired
    private ContattoService contattoService;

    @GetMapping("/api/v1/contatti") // gestione di una richiesta GET da parte di un client
    public List<Contatto> restituisciElenco(){ // ristituiamo un lista di contatto recuperati dal DB tramite il Service
        return contattoService.findAll();
    }

}
