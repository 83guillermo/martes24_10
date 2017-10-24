// una clase hecha por mi
package martes24_10;

public class Alumno {
    
    //atributos de la clase son variables locales
    int legajo;
    String nombre;
    int nota;
    //metodo de la clase son funciones en otros
    void mostrarAlumno(){
        System.out.println("numero de legajo : "+legajo+"\n nombre: "+nombre+"\n nota: "+nota);
    }
    void Estudia(String materia){
        System.out.println("el alumno estudia: "+ materia);
    }
    
}
