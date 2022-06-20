package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela TIPOSERVICO
* @generated
*/
@Entity
@Table(name = "\"TIPOSERVICO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TipoServico")
public class TipoServico implements Serializable {

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
    @Column(name = "Descrição", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;

    /**
    * @generated
    */
    @Column(name = "InicioAtendimento", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double inicioAtendimento;

    /**
    * @generated
    */
    @Column(name = "TerminoAtendimento", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double terminoAtendimento;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_criticidade", nullable = true, referencedColumnName = "Id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Criticidade criticidade;

    /**
    * Construtor
    * @generated
    */
    public TipoServico(){
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
    public TipoServico setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém descricao
    * return descricao
    * @generated
    */
    
    public java.lang.String getDescricao(){
        return this.descricao;
    }

    /**
    * Define descricao
    * @param descricao descricao
    * @generated
    */
    public TipoServico setDescricao(java.lang.String descricao){
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém inicioAtendimento
    * return inicioAtendimento
    * @generated
    */
    
    public java.lang.Double getInicioAtendimento(){
        return this.inicioAtendimento;
    }

    /**
    * Define inicioAtendimento
    * @param inicioAtendimento inicioAtendimento
    * @generated
    */
    public TipoServico setInicioAtendimento(java.lang.Double inicioAtendimento){
        this.inicioAtendimento = inicioAtendimento;
        return this;
    }
    /**
    * Obtém terminoAtendimento
    * return terminoAtendimento
    * @generated
    */
    
    public java.lang.Double getTerminoAtendimento(){
        return this.terminoAtendimento;
    }

    /**
    * Define terminoAtendimento
    * @param terminoAtendimento terminoAtendimento
    * @generated
    */
    public TipoServico setTerminoAtendimento(java.lang.Double terminoAtendimento){
        this.terminoAtendimento = terminoAtendimento;
        return this;
    }
    /**
    * Obtém criticidade
    * return criticidade
    * @generated
    */
    
    public Criticidade getCriticidade(){
        return this.criticidade;
    }

    /**
    * Define criticidade
    * @param criticidade criticidade
    * @generated
    */
    public TipoServico setCriticidade(Criticidade criticidade){
        this.criticidade = criticidade;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TipoServico object = (TipoServico)obj;
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