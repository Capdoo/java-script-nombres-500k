
package scriptnombres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class AbridorDeTxt {
        int indicadorDeArchivo = 0;
        List<Paciente> listaGeneral = new ArrayList<>();
        String nombres = "Nombres.txt";
        String apellidos = "Apellidos.txt";
        String residual = "Residual.txt";
        
                File f;
                FileReader fr;
                FileReader fr2;
                FileReader fr99;
                
                FileWriter fw;
                BufferedReader br;
                BufferedReader br2;
                
                BufferedWriter bw;
                PrintWriter pw;
                String datos;
                String datos2;
                Paciente paciente;
        
        public void leer_datos() throws Exception{

                try{
                        /*PARA NOMBRE*/
                        //creo objeto fr y abro para lectura
                        fr = new FileReader(nombres);
                        //creo objeto br para leer datos
                        br = new BufferedReader(fr);
                        //leer primer registro
                        datos = br.readLine();

                        
                        paciente = null;
                        String nombre11;
                        
                        while(datos != null){
                            paciente = new Paciente();
                            StringTokenizer token = new StringTokenizer(datos,",");

                             nombre11 = token.nextToken();

                            mandarPacienteNombre(nombre11);
                            
                            datos = br.readLine();
                        }
                        br.close();
                        
                } catch(IOException e){
                        throw e;
                } finally {
                        fr.close();
                }
                }
        
        
            public void insertar_paciente(Paciente x) throws Exception {
                try{
                //creo objeto fw y abro el archivo para la escritura
                fw = new FileWriter(residual,true);
                //creo objeto pw para escribir
                pw = new PrintWriter(fw);


                //preparar dato a escribir
                datos = "("+"'"+x.getDni()+"'"+",'"+x.getNombre() +"'"+ ",'" + x.getApellido() +"'"+",'"+x.isEstado_vacunacion()+"'"+","+"'"+x.getEdad()+"'"+","+"'"+x.getFechaEmision()+"'"+ "),"+"\n";
                //escribo los datos
                pw.write(datos);
                pw.close();

                
            } catch(IOException e){
                throw e;
            }finally{
                fw.close();
             }
    }
            
            
            public void mandarPacienteNombre(String nombre) throws FileNotFoundException, IOException{

                    Random miAletatorio = new Random();
                    //int N = miAletatorio.nextInt(49225);
                    
                FileReader fr99 = null;
                BufferedReader br99;
                int contador,aleatorio;
                int contadorLocal,edad;
                String name = nombre;
                Paciente pacientex;
                pacientex = null;
                contadorLocal = 0;
                
                      try{
                              
                              for(int i=0;i<20;i++){
                                      contadorLocal = 0;

                                       /*CONTEXTO*/
                                        fr99 = new FileReader(apellidos);
                                        //creo objeto br para leer datos
                                        br99 = new BufferedReader(fr99);
                                        //leer primer registro
                                        datos = br99.readLine();
                               
                                        aleatorio =  miAletatorio.nextInt(49224);
                                        
                                        while(contadorLocal != aleatorio){
                                                datos=br99.readLine();
                                                contadorLocal++;
                                        }
                                      
                                      pacientex = new Paciente();
                                        edad = asignarEdad();
                                        
                                        StringTokenizer token = new StringTokenizer(datos,",");
                                        pacientex.setNombre(name);
                                        pacientex.setApellido(token.nextToken());
                                        pacientex.setDni(darleDniAlPapu(edad));
                                        pacientex.setEstado_vacunacion(0);
                                        pacientex.setEdad(edad);
                                        pacientex.setFechaEmision(asignarFechaEmision());
                                        pacientex.setIdHospital(asignarHospital());
                                        pacientex.setIdCategoria(asignarSubCate());
                                        
                                        listaGeneral.add(pacientex);
                                        //System.out.println(indicadorDeArchivo+". "+pacientex.getNombre()+" "+pacientex.getDni()+" "+pacientex.getApellido()+pacientex.getDni()+" "+pacientex.isEstado_vacunacion()+" "+pacientex.getEdad()+" "+pacientex.getFechaEmision()+" ");
                                        System.out.println("("+"'"+pacientex.getDni()+"'"+",'"+pacientex.getNombre() +"'"+ ",'" +
                                                pacientex.getApellido() +"'"+","+pacientex.getEstado_vacunacion()+""+","+"'"+pacientex.getEdad()+"'"+","+"'"+
                                                pacientex.getFechaEmision()+"'"+",'"+pacientex.getIdHospital()+"'"+",'"+pacientex.getIdCategoria()+"'"+ "),");
                                        indicadorDeArchivo++;
                                        datos=br99.readLine();   
                                      br99.close();
                              }
                                
                                 
                                 } catch(IOException e){
                                        throw e;
                                } finally {
                              
                                        fr99.close();
                        }
                 
            }
            
            public String darleDniAlPapu(int edad){
                    String dniResult = "";
                    int dniDevolver;
                    
                    int max = 74921641;
                    int min =  74285590;
                    
                    int A=50;
                    
                    if(edad>0 && edad<21){
                            A = (int)(Math.random() * (max-min))+min;
                    }
                    if(edad>=20 && edad<41){
                            A = (int)(Math.random() * (69999999-60000000))+60000000;
                    }
                    if(edad>=40 && edad<61){
                            A = (int)(Math.random() * (19999999-10000000))+10000000;
                    }
                     if(edad>=60 && edad<81){
                            A = (int)(Math.random() * (8999999-8000000))+8000000;
                    }                     
                    if(edad>=80 && edad<103){
                            A = (int)(Math.random() * (6999999-6000000))+6000000;
                    }
                    
                    if(A <= 9999999){
                            dniResult = "0"+A;
                    }else{
                            dniResult = A+"";
                    }
                    
                    return dniResult;
            }

            public int asignarEdad(){
                    Random miAletatorio = new Random();
                    int N = (int)(Math.random() * (102-18))+18;
                    return N;
            }
            
            public String asignarFechaEmision(){
                    String fecha="";
                    String dia = "";
                    String mes = "";
                    
                    int A = (int)(Math.random() * (2020-2013))+2013;
                    
                    //Fecha
                    fecha += A+"-";
                    int M = (int)(Math.random() * (12-1))+1;

                    if(M<=9){
                            mes = "0"+M;
                    }else{
                            mes=""+M;
                    }
                   
                    fecha += mes+"-";
                    
                    //Mes
                    int D = (int)(Math.random() * (31-1))+1;
                    if(D<=9){
                            dia = "0"+D;
                    }else{
                            dia=""+D;
                    }
                    
                    fecha += dia;
                    return fecha;
            }
            
            public int asignarHospital(){
                    int A = (int)(Math.random() * (81-1))+1;
                    
                    return A;
            }
            
            public int asignarSubCate(){
                    int A = (int)(Math.random() * (77-1))+1;
                    
                    return A;
            }
            
}
