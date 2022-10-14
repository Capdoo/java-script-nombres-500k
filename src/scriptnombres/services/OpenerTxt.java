package scriptnombres.services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import scriptnombres.models.Paciente;

public class OpenerTxt {

    private String routeResults;

    public OpenerTxt() {
    }

    public OpenerTxt(String routeResults) {
        this.routeResults = routeResults;
    }

    public void writeAllData(List<Paciente> completeList) throws Exception {

        for(Paciente p: completeList){
            this.insertarPaciente(p);
        }

    }




    public void insertarPaciente(Paciente x) throws Exception {

        FileWriter fw = null;
        PrintWriter pw;
        String datos;

        try {

            //Create object fw and open file to write
            fw = new FileWriter(this.routeResults, true);

            //Create object pw to write
            pw = new PrintWriter(fw);

            //Prepare data
            datos = "(" + "'" + x.getDni() + "'" + ",'" + x.getNombre() + "'" + ",'" + x.getApellido() + "'" + ",'" + x.getEstado_vacunacion() + "'" + "," + "'" + x.getEdad() + "'" + "," + "'" + x.getFechaEmision() + "'" + ")," + "\n";

            //Write data
            pw.write(datos);
            pw.close();

        } catch (IOException e) {
            throw e;
        } finally {
            fw.close();
        }
    }







//    public void leer_datos() throws Exception {
//        try {
//            /*PARA NOMBRE*/
//            //creo objeto fr y abro para lectura
//            fr = new FileReader(nombres);
//            //creo objeto br para leer un buffer
//            br = new BufferedReader(fr);
//            //leer primer registro
//            datos = br.readLine();
//
//
//            paciente = null;
//            String nombre;
//
//            while (datos != null) {
//                paciente = new Paciente();
//                StringTokenizer token = new StringTokenizer(datos, ",");
//
//                nombre = token.nextToken();
//
//                enviarPacienteNombre(nombre);
//
//                datos = br.readLine();
//            }
//            br.close();
//
//        } catch (IOException e) {
//            throw e;
//        } finally {
//            fr.close();
//        }
//    }




//    public void enviarPacienteNombre(String nombre) throws FileNotFoundException, IOException {
//
//        Utils utils = new Utils();
//
//        Random miAletatorio = new Random();
//        //int N = miAletatorio.nextInt(49225);
//
//        FileReader fr99 = null;
//        BufferedReader br99;
//        int contador, aleatorio;
//        int contadorLocal, edad;
//        String name = nombre;
//        Paciente pacientex;
//        pacientex = null;
//        contadorLocal = 0;
//
//        try {
//
//            for (int i = 0; i < 20; i++) {
//                contadorLocal = 0;
//
//                /*CONTEXTO*/
//                fr99 = new FileReader(apellidos);
//                //creo objeto br para leer datos
//                br99 = new BufferedReader(fr99);
//                //leer primer registro
//                datos = br99.readLine();
//
//                aleatorio = miAletatorio.nextInt(49224);
//
//                while (contadorLocal != aleatorio) {
//                    datos = br99.readLine();
//                    contadorLocal++;
//                }
//
//                pacientex = new Paciente();
//                edad = utils.asignarEdad();
//
//                StringTokenizer token = new StringTokenizer(datos, ",");
//                pacientex.setNombre(name);
//                pacientex.setApellido(token.nextToken());
//                pacientex.setDni(utils.asignarDni(edad));
//                pacientex.setEstado_vacunacion(0);
//                pacientex.setEdad(edad);
//                pacientex.setFechaEmision(utils.asignarFechaEmision());
//                pacientex.setIdHospital(utils.asignarHospital());
//                pacientex.setIdCategoria(utils.asignarSubCate());
//
//                listaGeneral.add(pacientex);
//                //System.out.println(indicadorDeArchivo+". "+pacientex.getNombre()+" "+pacientex.getDni()+" "+pacientex.getApellido()+pacientex.getDni()+" "+pacientex.isEstado_vacunacion()+" "+pacientex.getEdad()+" "+pacientex.getFechaEmision()+" ");
//                String res = "(" + "'" + pacientex.getDni() + "'" + ",'" + pacientex.getNombre() + "'" + ",'" +
//                        pacientex.getApellido() + "'" + "," + pacientex.getEstado_vacunacion() + "" + "," + "'" + pacientex.getEdad() + "'" + "," + "'" +
//                        pacientex.getFechaEmision() + "'" + ",'" + pacientex.getIdHospital() + "'" + ",'" + pacientex.getIdCategoria() + "'" + "),";
//
//                System.out.println(res);
//
//                indicadorDeArchivo++;
//                datos = br99.readLine();
//                br99.close();
//            }
//
//        } catch (IOException e) {
//            throw e;
//        } finally {
//            fr99.close();
//        }
//    }
//
//    public List<Paciente> getListaGeneral() {
//        return listaGeneral;
//    }
//
//    public void setListaGeneral(List<Paciente> listaGeneral) {
//        this.listaGeneral = listaGeneral;
//    }

}
