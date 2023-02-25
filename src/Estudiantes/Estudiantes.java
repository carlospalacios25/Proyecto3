package Estudiantes;

import java.util.Objects;

public class Estudiantes {
    private String curso;
    private String nombres;
    private String apellidos;
    private int documento;
    

    
    public Estudiantes(String nombres, String apellidos, int documento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
    }

    public Estudiantes(String curso,String nombres) {
        this.curso = curso;
        this.curso = nombres;
    }
    
    
    public Estudiantes(String nombres) {
        this.nombres = nombres;
    }
   

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    


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
        final Estudiantes other = (Estudiantes) obj;
        return Objects.equals(this.nombres, other.nombres);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombres: ").append(nombres+"\n");
        sb.append("Apellidos: ").append(apellidos+"\n");
        sb.append("Documento: ").append(documento+"\n");
        sb.append("Curso: ").append(curso+"\n");
        return sb.toString();
    }
  
}
