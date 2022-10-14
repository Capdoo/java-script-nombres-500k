package scriptnombres.services;

import scriptnombres.models.Paciente;
import scriptnombres.utils.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class GeneralList {

    private  String routeNames;
    private  String routeLastNames;


    public GeneralList() {
    }

    public GeneralList(String routeNames, String routeLastNames) {
        this.routeNames = routeNames;
        this.routeLastNames = routeLastNames;
    }


    public List<Paciente> readData(int numberGroups) throws IOException {

        List<Paciente> generalList = new ArrayList<>();

        FileReader fr = null;
        FileWriter fw;
        BufferedReader br;

        try {

            /*PARA NOMBRE*/
            fr = new FileReader(this.routeNames);
            br = new BufferedReader(fr);

            String line = br.readLine();

            List<Paciente> parcialList = null;
            while (line != null) {
                StringTokenizer token = new StringTokenizer(line, ",");
                String name = token.nextToken();
                System.out.println(name);

                //SendNameToPacient
                parcialList = fillGeneralList(name, numberGroups);
                generalList.addAll(parcialList);

                line = br.readLine();
            }
            br.close();

            return generalList;
        }catch (IOException e){
            throw e;
        }finally {
            fr.close();
        }
    }



    public List<Paciente> fillGeneralList(String namePerson, int numberOfGroups) throws IOException {

        List<Paciente> newGroup = new ArrayList<Paciente>();
        Utils utils = new Utils();

        Random miAletatorio = new Random();

        FileReader fr99 = null;
        BufferedReader br99;
        int aleatorio;
        int contadorLocal;
        String name = namePerson;
        String datos = "";

        try {
            //fr99 = new FileReader(this.routeLastNames);
            //br99 = new BufferedReader(fr99);

            for (int i = 0; i < numberOfGroups; i++) {

                fr99 = new FileReader(this.routeLastNames);
                br99 = new BufferedReader(fr99);

                contadorLocal = 0;
                datos = br99.readLine();

                aleatorio = miAletatorio.nextInt(49224);
                while (contadorLocal != aleatorio) {
                    datos = br99.readLine();
                    contadorLocal++;
                }
                StringTokenizer token = new StringTokenizer(datos, ",");

                int edad = utils.asignarEdad();
                Paciente paciente = new Paciente();
                    paciente.setNombre(name);
                    paciente.setApellido(token.nextToken());
                    paciente.setDni(utils.asignarDni(edad));
                    paciente.setEstado_vacunacion(0);
                    paciente.setEdad(edad);
                    paciente.setFechaEmision(utils.asignarFechaEmision());
                    paciente.setIdHospital(utils.asignarHospital());
                    paciente.setIdCategoria(utils.asignarSubCate());

                String res = "(" + "'" + paciente.getDni() + "'" + ",'" + paciente.getNombre() + "'" + ",'" +
                        paciente.getApellido() + "'" + "," + paciente.getEstado_vacunacion() + "" + "," + "'" + paciente.getEdad() + "'" + "," + "'" +
                        paciente.getFechaEmision() + "'" + ",'" + paciente.getIdHospital() + "'" + ",'" + paciente.getIdCategoria() + "'" + "),";

                //System.out.println(res);

                newGroup.add(paciente);

                datos = br99.readLine();
                br99.close();
            }

        }catch (IOException e) {
            throw e;
        } finally {
            fr99.close();
        }
        return newGroup;
    }
}
