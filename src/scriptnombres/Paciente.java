package scriptnombres;

/**
 *
 * @author Capddo <rafael.nontol@unmsm.edu.pe>
 */


public class Paciente {

    private int edad;
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaEmision;

    private int idHospital;
    private int idCategoria;
    private int estado_vacunacion;
    
    public Paciente() {
    
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEstado_vacunacion() {
        return estado_vacunacion;
    }

    public void setEstado_vacunacion(int estado_vacunacion) {
        this.estado_vacunacion = estado_vacunacion;
    }

}
