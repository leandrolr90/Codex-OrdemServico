package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ORDEMSERVICO
* @generated
*/
@Entity
@Table(name = "\"ORDEMSERVICO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.OrdemServico")
public class OrdemServico implements Serializable {

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
    @Column(name = "titulo", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String titulo;

    /**
    * @generated
    */
    @Column(name = "descricao", nullable = false, unique = false, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String descricao;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_tipoServico", nullable = false, referencedColumnName = "Id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private TipoServico tipoServico;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "abertoEm", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date abertoEm;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="abertoPor", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private User abertoPor;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechadoEm", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date fechadoEm;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fechadoPor", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private User fechadoPor;

    /**
    * Construtor
    * @generated
    */
    public OrdemServico(){
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
    public OrdemServico setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém titulo
    * return titulo
    * @generated
    */
    
    public java.lang.String getTitulo(){
        return this.titulo;
    }

    /**
    * Define titulo
    * @param titulo titulo
    * @generated
    */
    public OrdemServico setTitulo(java.lang.String titulo){
        this.titulo = titulo;
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
    public OrdemServico setDescricao(java.lang.String descricao){
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém tipoServico
    * return tipoServico
    * @generated
    */
    
    public TipoServico getTipoServico(){
        return this.tipoServico;
    }

    /**
    * Define tipoServico
    * @param tipoServico tipoServico
    * @generated
    */
    public OrdemServico setTipoServico(TipoServico tipoServico){
        this.tipoServico = tipoServico;
        return this;
    }
    /**
    * Obtém abertoEm
    * return abertoEm
    * @generated
    */
    
    public java.util.Date getAbertoEm(){
        return this.abertoEm;
    }

    /**
    * Define abertoEm
    * @param abertoEm abertoEm
    * @generated
    */
    public OrdemServico setAbertoEm(java.util.Date abertoEm){
        this.abertoEm = abertoEm;
        return this;
    }
    /**
    * Obtém abertoPor
    * return abertoPor
    * @generated
    */
    
    public User getAbertoPor(){
        return this.abertoPor;
    }

    /**
    * Define abertoPor
    * @param abertoPor abertoPor
    * @generated
    */
    public OrdemServico setAbertoPor(User abertoPor){
        this.abertoPor = abertoPor;
        return this;
    }
    /**
    * Obtém fechadoEm
    * return fechadoEm
    * @generated
    */
    
    public java.util.Date getFechadoEm(){
        return this.fechadoEm;
    }

    /**
    * Define fechadoEm
    * @param fechadoEm fechadoEm
    * @generated
    */
    public OrdemServico setFechadoEm(java.util.Date fechadoEm){
        this.fechadoEm = fechadoEm;
        return this;
    }
    /**
    * Obtém fechadoPor
    * return fechadoPor
    * @generated
    */
    
    public User getFechadoPor(){
        return this.fechadoPor;
    }

    /**
    * Define fechadoPor
    * @param fechadoPor fechadoPor
    * @generated
    */
    public OrdemServico setFechadoPor(User fechadoPor){
        this.fechadoPor = fechadoPor;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
OrdemServico object = (OrdemServico)obj;
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