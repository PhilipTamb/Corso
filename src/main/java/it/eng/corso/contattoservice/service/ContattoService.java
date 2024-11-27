package it.eng.corso.contattoservice.service;


import it.eng.corso.contattoservice.model.Contatto;

import java.util.List;

public interface ContattoService {
    List<Contatto> findAll();  // nell'implementazione lancierà una query che restituisce la lista contente tutti i contatti del DB

}