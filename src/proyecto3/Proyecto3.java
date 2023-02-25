
package proyecto3;

import Estudiantes.Cursos;
import Estudiantes.Estudiantes;
import Estudiantes.FuncionesEstudiante;
import javax.swing.JOptionPane;


public class Proyecto3 {
    /* 
        3. Crear un programa que permita la matrícula de N estudiantes, se debe guardar 
        los datos del estudiante: nombres, apellidos, documento también se debe guardar 
        los datos del curso que va inscribir, del curso: id de curso, nombre del curso, 
        duración, capacidad. Un estudiante solo puede matricular un curso y un curso puede 
        matricular la cantidad de estudiante que dice su capacidad. Mostrar un menú con 
        las sgtes opciones: *Agregar estudiante * Matricular estudiante, * Eliminar 
        estudiante, *Actualizar Estudiante, *Listar estudiantes, *Listar estudiantes con 
        matrícula, *Agregar curso, *Eliminar Curso *Listar Cursos
    */
    static FuncionesEstudiante metodoEstudiante;
    private Cursos cursos;
    private Estudiantes estudiantes;
    
    
    public static void main(String[] args) {
        try {
            menu();     
        } catch (Exception e) {
            return;
        }
       
    }
    
    public static void menu(){
        metodoEstudiante =new FuncionesEstudiante();
        
        short opciones;
        do {
            opciones = Short.parseShort(JOptionPane.showInputDialog("MENU DE OPCIONES \n\n"
                    + "1. Agregar estudiante\n2. Matricular estudiante\n"
                    + "3. Eliminar estudiante\n4. Actualizar Estudiante\n"
                    + "5. Listar estudiantes\n6. Listar estudiantes con matrícula\n"
                    + "7. Agregar curso\n8. Eliminar Curso\n9. Listar Cursos\n"
                    + "0. Salir"));
            
            switch (opciones) {
                case 1:
                    ingresarEstudiante();
                    break;
                case 2:
                    matricularEstudiante();
                    break;
                case 3:
                    elimiarEstudiante();
                    break;
                case 4:
                    actualizarEstudiante();
                    break;
                case 5:
                    metodoEstudiante.imprimirEstudiantes();
                    break;
                case 6:
                    estudianteMatriculado();
                    break;
                case 7:
                    crearCurso();
                    break;
                case 8:
                    elimiarCurso();
                    break;
                case 9:
                    metodoEstudiante.imprimirCursos();
                    break;
                default:
                    break;
                
            }
            
        } while (opciones != 0);
    }
    
    public static void ingresarEstudiante(){
        String nombre =JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
        String apellido = JOptionPane.showInputDialog("Ingresa el apellido del estudiante");
        int documento= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el documento del estudiante"));
        
        metodoEstudiante.nuevoEstudiante(nombre, apellido, documento);
    }
    
    public static void elimiarEstudiante(){
        String nombre =JOptionPane.showInputDialog("Ingresa el nombre del estudiante a eliminar");
        
        metodoEstudiante.eliminarEstudiante(nombre);
    }
    
    public static void actualizarEstudiante(){
        String nombre =JOptionPane.showInputDialog("Ingresa el nombre del estudiante a actualizar");
        String apellido = JOptionPane.showInputDialog("Actualizar apellido");
        int documento= Integer.parseInt(JOptionPane.showInputDialog("Actualizar documento"));
        
        metodoEstudiante.actualizarEstudiante(nombre, apellido, documento);
    }
    
    public static void crearCurso(){
        String id=JOptionPane.showInputDialog("Ingresa id del curso ");
        String nombre =JOptionPane.showInputDialog("Ingresa nombre del curso");
        String duracion =JOptionPane.showInputDialog("Ingresa la duracion del curso");
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa capacidad del curso"));
        
        metodoEstudiante.nuevoCurso(id, nombre, duracion, capacidad);
    }   
    
    public static void elimiarCurso(){
        String nombre =JOptionPane.showInputDialog("Ingresa el nombre del estudiante a eliminar");
        
        metodoEstudiante.eliminarCurso(nombre);
    }
    
    public static void matricularEstudiante(){
        
        String nombre=JOptionPane.showInputDialog("Ingresa el nombre del estudiante a matricular");
        String curso =JOptionPane.showInputDialog("Ingresa el nombre del curso que tomara");
        
        metodoEstudiante.matricularCurso(nombre, curso);
    }
    
    public static void estudianteMatriculado(){   

        metodoEstudiante.imprimirMatriculados();    
        
    }
    
}
