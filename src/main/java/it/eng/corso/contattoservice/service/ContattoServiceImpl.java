package it.eng.corso.contattoservice.service;

import it.eng.corso.contattoservice.model.Contatto;
import it.eng.corso.contattoservice.repository.ContattoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContattoServiceImpl implements ContattoService{

    @Autowired // annotatio per iniettare in maniera automatica la dipendenza di ContattoRepository
    private ContattoRepository contattoRepository;

    @Override
    public List<Contatto> findAll(){
        return contattoRepository.findAll();
    }
}
