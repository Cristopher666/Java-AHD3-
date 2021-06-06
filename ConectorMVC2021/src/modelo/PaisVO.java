package modelo;

public class PaisVO {

    private int id_pais;
    private String nombre_pais;
    private String capital_pais;
    private long poblacion_pais;

    public PaisVO() {
    }

    /**
     * @return the id_pais
     */
    public int getId_pais() {
        return id_pais;
    }

    /**
     * @param id_pais the id_pais to set
     */
    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    /**
     * @return the nombre_pais
     */
    public String getNombre_pais() {
        return nombre_pais;
    }

    /**
     * @param nombre_pais the nombre_pais to set
     */
    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    /**
     * @return the capital_pais
     */
    public String getCapital_pais() {
        return capital_pais;
    }

    /**
     * @param capital_pais the capital_pais to set
     */
    public void setCapital_pais(String capital_pais) {
        this.capital_pais = capital_pais;
    }

    /**
     * @return the poblacion_pais
     */
    public long getPoblacion_pais() {
        return poblacion_pais;
    }

    /**
     * @param poblacion_pais the poblacion_pais to set
     */
    public void setPoblacion_pais(long poblacion_pais) {
        this.poblacion_pais = poblacion_pais;
    }
}
