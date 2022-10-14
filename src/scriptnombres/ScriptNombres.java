package scriptnombres;

import java.util.ArrayList;
import java.util.List;

import scriptnombres.models.Paciente;
import scriptnombres.services.GeneralList;
import scriptnombres.services.OpenerTxt;


/**
 * @author Capddo <rafael.nontol@unmsm.edu.pe>
 */
public class ScriptNombres {

    public static final String routeNames = "Nombres.txt";
    public static final String routeLastNames = "Apellidos.txt";
    public static final String routeResults = "Resultados.txt";

    public static void main(String[] args) throws Exception {

        // Create General List
        GeneralList generalList = new GeneralList(routeNames, routeLastNames);

        // Get Complete General List
        // All the names with 3 random last names
        List<Paciente> completeList = generalList.readData(3);

        // Create Opener Service
        OpenerTxt obj = new OpenerTxt(routeResults);

        // Write All The Data
        obj.writeAllData(completeList);
    }

}
