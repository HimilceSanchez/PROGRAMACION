package com.himilce.jardineria1.models.entidades;
//importar la clase Entity

import javax.validation.constraints.NotEmpty;

import jakarta.persistence.*;


//la funcion de esta clase + @Entity va a crear la tabla Gamas en el SGBD
@Entity
public class Gamas1 {
    @Id
    private String Gama;

    @Column(nullable = false)
    @NotEmpty
    private String DescripcionTexto;
    @Column(nullable = false)
    @NotEmpty
    private String DescripcionHTML;
    @Column(nullable = false)
    @NotEmpty
    private String Imagen;

    public Gamas1() {}
    public Gamas1(String gama, String descripcionTexto, String imagen) {
        
    }
    public Gamas1 (String gama, String descripcionTexto, String descripcionHTML, String imagen){

    }
    public void setGama(String gama) {
        this.Gama = gama;
    }
    public String getGama() {
        return Gama;
    }
    public void setDescripcionTexto(String descripcionTexto) {
        this.DescripcionTexto = descripcionTexto;
    }
    public String getDescripcionTexto() {
        return DescripcionTexto;
    }
    public void setDescripcionHTML(String descripcionHTML) {
        this.DescripcionHTML = descripcionHTML;
    }

    public String getDescripcionHTML() {
        return DescripcionHTML;
    }
    public void setImagen(String imagen) {
        this.Imagen = imagen;
    }
    public String getImagen() {
        return Imagen;
    }
}
