package model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Pack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer size;
    private Integer amount;
    private Integer prebtime;
    private String source;

    @OneToOne
    private Notes notes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pack")
    private Set<Parts> parts;

    @ManyToMany(mappedBy = "pack")
    private  Set<Type> type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPrebtime() {
        return prebtime;
    }

    public void setPrebtime(Integer prebtime) {
        this.prebtime = prebtime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Set<Parts> getParts() {
        return parts;
    }

    public void setParts(Set<Parts> parts) {
        this.parts = parts;
    }

    public Set<Type> getType() {
        return type;
    }

    public void setType(Set<Type> type) {
        this.type = type;
    }
}
