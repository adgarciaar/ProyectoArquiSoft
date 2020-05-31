/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Administrador
 */

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@XmlRootElement
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id 
    @Basic(optional = false)     
    @NotNull     //@GeneratedValue(strategy = GenerationType.AUTO)     private Long id;
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String tipoTarjeta;
    
    @Basic(optional = false)
    @NotNull
    private Long numeroTarjeta;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String nombreComprador;
    
    @Basic(optional = false)
    @NotNull
    private Long mesVencimiento;
    
    @Basic(optional = false)
    @NotNull
    private Long anioVencimiento;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String email;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String idFotos;    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Compra[ id=" + id + " ]";
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public Long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public Long getMesVencimiento() {
        return mesVencimiento;
    }

    public void setMesVencimiento(Long mesVencimiento) {
        this.mesVencimiento = mesVencimiento;
    }

    public Long getAnioVencimiento() {
        return anioVencimiento;
    }

    public void setAnioVencimiento(Long anioVencimiento) {
        this.anioVencimiento = anioVencimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdFotos() {
        return idFotos;
    }

    public void setIdFotos(String idFotos) {
        this.idFotos = idFotos;
    }
    
}