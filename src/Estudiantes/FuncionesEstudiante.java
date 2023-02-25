package Estudiantes;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


public class FuncionesEstudiante {
    
    private List<Estudiantes> estudiantes;
    private List<Cursos> cursos;

    public FuncionesEstudiante() {
        this.estudiantes =new LinkedList<>();
        this.cursos = new LinkedList<>();
    }
    
    public void nuevoEstudiante(String nombre,String apellido,int documento){
        Estudiantes estudiante =new Estudiantes(nombre, apellido, documento);
        String mensaje = estudiantes.add(estudiante)?"Estudiante creado":"No se ingreso el estudiante";
        JOptionPane.showMessageDialog(null, mensaje);   
    }
    
    public void imprimirMatriculados(){  
        JOptionPane.showMessageDialog(null, "ESTUDIANTES MATRICULADOS \n\n"+estudiantes.toString());
    }
    
    public void imprimirEstudiantes(){       
        JOptionPane.showMessageDialog(null, "ESTUDIANTES\n\n"+estudiantes.toString()+"\n");
    }
       
    public void actualizarEstudiante(String nombre,String apellido,int documento){
        try {
            int estudianteIndex = estudiantes.indexOf(new Estudiantes(nombre));
            Estudiantes buscado = estudiantes.get(estudianteIndex);
            buscado.setApellidos(apellido);
            buscado.setDocumento(documento);
            JOptionPane.showMessageDialog(null,"Estudiante\n\n"+buscado+"\nActualizado");  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"El estudiante no existe");
            return;
        }
    }
    
    public void eliminarEstudiante(String nombre){     
        try {
            int estudianteElim = estudiantes.indexOf(new Estudiantes(nombre));
            Estudiantes buscar = estudiantes.remove(estudianteElim);
            JOptionPane.showMessageDialog(null, "Estudiante\n\n"+buscar+"\nEliminado");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"El estudiante no existe");
            return;
        }
    }
    
    
 /////////////////////////METODOS CURSO///////////////////////////////////////////////////   
    
    public void nuevoCurso(String id,String nombre,String duracion,int capacidad){
        Cursos curso = new Cursos(id, nombre, duracion, capacidad,capacidad);
        String mensaje = cursos.add(curso)?"Curso creado":"No se ingreso el Curso";
        JOptionPane.showMessageDialog(null, mensaje);
    }
       
    public void imprimirCursos(){
        JOptionPane.showMessageDialog(null,"CURSOS\n\n"+ cursos.toString()+"\n");
    }
    public void eliminarCurso(String nombre){
        try {
        int cursoEliminado = cursos.indexOf(new Cursos(nombre));
        Cursos buscar = cursos.remove(cursoEliminado);
        JOptionPane.showMessageDialog(null, "Curso\n\n"+buscar+"\nEliminado");   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"El curso no existe");
            return;
        }
    }
    
    public void matricularCurso(String nombre, String curso){
        try {
            int estudianteIndex = estudiantes.indexOf(new Estudiantes(nombre));
            Estudiantes buscadoEstu = estudiantes.get(estudianteIndex);

            int cursoIndex = cursos.indexOf(new Cursos(curso));
            Cursos buscarCurso = cursos.get(cursoIndex);  
              
            if ((buscadoEstu.getCurso() != null || buscarCurso.getFaltaInscribir()== 0)){  
                JOptionPane.showMessageDialog(null, "El estudiante ya esta matriculado y/o el curso esta lleno");
            }else{
                buscadoEstu.setCurso(curso);
                JOptionPane.showMessageDialog(null, "Estudiante matriculado "); 
                int i= (buscarCurso.getFaltaInscribir()-1);
                buscarCurso.setFaltaInscribir(i);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la matricula informacion Incorrecta");
            return;
        }
         
    } 
  
}
