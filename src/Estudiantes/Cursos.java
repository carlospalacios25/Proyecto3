package Estudiantes;

import java.util.Objects;

public class Cursos {
    
    private String id;
    private String nombre;
    private String duracion;
    private int capacidad;
    private int faltaInscribir;

    public Cursos(String id, String nombre, String duracion, int capacidad,int faltaInscribir) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.capacidad = capacidad;
        this.faltaInscribir = faltaInscribir;
    }

    public Cursos(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getFaltaInscribir() {
        return faltaInscribir;
    }

    public void setFaltaInscribir(int faltaInscribir) {
        this.faltaInscribir = faltaInscribir;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cursos other = (Cursos) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("\nid: ").append(id +"\n");
        sb.append("nombre: ").append(nombre +"\n");
        sb.append("duracion: ").append(duracion+"\n");
        sb.append("capacidad: ").append(capacidad+"\n");
        sb.append("cupos: ").append(faltaInscribir+"\n");
        return sb.toString();
    }

    
}
