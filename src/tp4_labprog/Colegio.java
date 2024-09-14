
package tp4_labprog;

import java.util.HashSet;
import tp4_labprog.vistas.Menu;

public class Colegio {

    public static void main(String[] args) {
        
        HashSet<Materias> materias = new HashSet<>();
        HashSet<Alumno> alumnos = new HashSet<>();
        
        //Se crean y agregan materias
        Materias inglesI = new Materias(1, "Inglés I", 1);
        Materias matematicas = new Materias(2, "Matemáticas", 1);
        Materias laboratorio1 = new Materias(3, "Laboratorio 1", 1);
        
        
        //SE AGREGAN MATERIAS A LA COLECCION
        materias.add(inglesI);
        materias.add(matematicas);
        materias.add(laboratorio1);

        Alumno leyriaGisela = new Alumno(1300, "Leyria", "Gisela");
        Alumno fernandezYesica = new Alumno(1350, "Fernandez", "Yesica");

        leyriaGisela.agregarMateria(inglesI);
        leyriaGisela.agregarMateria(matematicas);
        leyriaGisela.agregarMateria(laboratorio1);

        fernandezYesica.agregarMateria(inglesI);
        fernandezYesica.agregarMateria(matematicas);
        fernandezYesica.agregarMateria(laboratorio1);
        
        //SE AGREGAN ALUMNOS A LA COLECCION
        alumnos.add(leyriaGisela);
        alumnos.add(fernandezYesica);

        System.out.println(leyriaGisela + " está inscripto en " + leyriaGisela.cantidadMaterias() + " materias.");
        System.out.println(fernandezYesica + " está inscripto en " + fernandezYesica.cantidadMaterias() + " materias.");
        
        
        //MENU GUI
        Menu menu = new Menu(alumnos, materias);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
    
}
