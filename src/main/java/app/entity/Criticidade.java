package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela CRITICIDADE
* @generated
*/
@Entity
@Table(name = "\"CRITICIDADE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Criticidade")
public class Criticidade implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "Id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "Label", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String label;

    /**
    * @generated
    */
    @Column(name = "Description", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String description;

    /**
    * @generated
    */
    @Column(name = "\"Order\"", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer order;

    /**
    * @generated
    */
    @Column(name = "IsActive", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean isActive;

    /**
    * Construtor
    * @generated
    */
    public Criticidade(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Criticidade setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém label
    * return label
    * @generated
    */
    
    public java.lang.String getLabel(){
        return this.label;
    }

    /**
    * Define label
    * @param label label
    * @generated
    */
    public Criticidade setLabel(java.lang.String label){
        this.label = label;
        return this;
    }
    /**
    * Obtém description
    * return description
    * @generated
    */
    
    public java.lang.String getDescription(){
        return this.description;
    }

    /**
    * Define description
    * @param description description
    * @generated
    */
    public Criticidade setDescription(java.lang.String description){
        this.description = description;
        return this;
    }
    /**
    * Obtém order
    * return order
    * @generated
    */
    
    public java.lang.Integer getOrder(){
        return this.order;
    }

    /**
    * Define order
    * @param order order
    * @generated
    */
    public Criticidade setOrder(java.lang.Integer order){
        this.order = order;
        return this;
    }
    /**
    * Obtém isActive
    * return isActive
    * @generated
    */
    
    public java.lang.Boolean getIsActive(){
        return this.isActive;
    }

    /**
    * Define isActive
    * @param isActive isActive
    * @generated
    */
    public Criticidade setIsActive(java.lang.Boolean isActive){
        this.isActive = isActive;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Criticidade object = (Criticidade)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}