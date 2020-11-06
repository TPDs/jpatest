package model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String beskrivelse;

    @ManyToMany
    Set<Pack>  pack;
}
