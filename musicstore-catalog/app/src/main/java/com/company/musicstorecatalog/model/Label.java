package com.company.musicstorecatalog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="label")
public class Label {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "label_id")
    private Integer id;

    @NotNull
    private String name;
    private String website;

    public Label(){

    }

    public Label(Integer id, String name, String website) {
        this.id = id;
        this.name = name;
        this.website = website;
    }

    public Label(String name, String website) {
        this.name = name;
        this.website = website;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Label label = (Label) o;
        return Objects.equals(id, label.id) && Objects.equals(name, label.name) && Objects.equals(website, label.website);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, website);
    }

    @Override
    public String toString() {
        return "Label{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
