package it.eng.corso.contattoservice.repository;

import it.eng.corso.contattoservice.model.Contatto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContattoRepository extends JpaRepository<Contatto, Long>{ // specificare per quale entità dobbiamo creare la nostra repository indicare anche il tipo della chiave (id)
}
