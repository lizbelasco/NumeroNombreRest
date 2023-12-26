/**
 * 
 */
package com.soa.dto;

/**
 * 
 */
public class Respuesta {
    private Integer nombre;
    private Integer apellidoPaterno;
    private Integer apellidoMaterno;
    /**
     * @return the nombre
     */
    public Integer getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the apellidoPaterno
     */
    public Integer getApellidoPaterno() {
        return apellidoPaterno;
    }
    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(Integer apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    /**
     * @return the apellidoMaterno
     */
    public Integer getApellidoMaterno() {
        return apellidoMaterno;
    }
    /**
     * @param apellidoMaterno the apellidoMaterno to set
     */
    public void setApellidoMaterno(Integer apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
}
