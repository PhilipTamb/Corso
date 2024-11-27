package it.eng.corso.contattoservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity // annotazione che definisce Contatto come un Entity
@Table(name = "contatti") // con "@Table name" associamo l'entity alla tabella "Contatti" del DB alla classe "Contatto"
@Getter
@Setter
public class Contatto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY ) // definisce che è il DB ad occuparsi dell'autoincrement dell'id
    private Long id;  //attributo da mappare con l'id della tabella Contatti nel DB
    @Column( name = "nome")
    private String name; // per mappare name
    @Column( name = "numero_telefono", length = 100)
    private String numTelefono; /* in questo caso il comportamento standard di sping è quello di trasformare il camelCase in pascal case*/
    /* In alternativa potremmo fare un associazioen esplicita tra la tabella e l'attributo con:
    @Column( name = "num_telefono, length = 100) // associa la colonna "num_telefono" a  "numtel".  con l'annotation column possiamo andare a dettagliare le caratteristiche della nosta colonna come "lenght" che ne indica la lunghezza massima di questo attributo nella tabella del DB
    private String numtel;
     */
}