/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scriptnombres;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Paciente {
        
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaEmision;
    
    private int idHospital;
    private int idCategoria;

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
    private int edad;

        public int getEdad() {
                return edad;
        }

        public void setEdad(int edad) {
                this.edad = edad;
        }
        
    private int estado_vacunacion;

    public Paciente() {
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
