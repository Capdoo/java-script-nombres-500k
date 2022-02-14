
package scriptnombres;

import java.util.ArrayList;
import java.util.List;

import scriptnombres.models.Paciente;
import scriptnombres.service.OpenerTxt;

/**
 *
 * @author Capddo <rafael.nontol@unmsm.edu.pe>
 */
public class ScriptNombres {

        public static void main(String[] args) throws Exception {
                // TODO code application logic here
                OpenerTxt obj = new OpenerTxt();
                
                 List<Paciente> mi_lista = new ArrayList<>();
                 
                 obj.leer_datos();
                 mi_lista = obj.getListaGeneral();
                
                for (Paciente e : mi_lista) {
                                obj.insertar_paciente(e);
                 }
                
        }
        
}
