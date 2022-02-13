
package scriptnombres;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Capddo <rafael.nontol@unmsm.edu.pe>
 */
public class ScriptNombres {

        public static void main(String[] args) throws Exception {
                // TODO code application logic here
                AbridorDeTxt obj = new AbridorDeTxt();
                
                 List<Paciente> mi_lista = new ArrayList<>();
                 
                 obj.leer_datos();
                 mi_lista = obj.listaGeneral;
                
                for (Paciente e : mi_lista) {
                                obj.insertar_paciente(e);
                 }
                
        }
        
}
