package scriptnombres.utils;

import java.util.Random;

public class Utils {



    public String asignarDni(int edad) {
        String dniResult = "";
        int dniDevolver;

        int max = 74921641;
        int min = 74285590;

        int A = 50;

        if (edad > 0 && edad < 21) {
            A = (int) (Math.random() * (max - min)) + min;
        }
        if (edad >= 20 && edad < 41) {
            A = (int) (Math.random() * (69999999 - 60000000)) + 60000000;
        }
        if (edad >= 40 && edad < 61) {
            A = (int) (Math.random() * (19999999 - 10000000)) + 10000000;
        }
        if (edad >= 60 && edad < 81) {
            A = (int) (Math.random() * (8999999 - 8000000)) + 8000000;
        }
        if (edad >= 80 && edad < 103) {
            A = (int) (Math.random() * (6999999 - 6000000)) + 6000000;
        }

        if (A <= 9999999) {
            dniResult = "0" + A;
        } else {
            dniResult = A + "";
        }

        return dniResult;
    }

    public int asignarEdad() {
        Random miAletatorio = new Random();
        int N = (int) (Math.random() * (102 - 18)) + 18;
        return N;
    }

    public String asignarFechaEmision() {
        String fecha = "";
        String dia = "";
        String mes = "";

        int A = (int) (Math.random() * (2020 - 2013)) + 2013;

        //Fecha
        fecha += A + "-";
        int M = (int) (Math.random() * (12 - 1)) + 1;

        if (M <= 9) {
            mes = "0" + M;
        } else {
            mes = "" + M;
        }

        fecha += mes + "-";

        //Mes
        int D = (int) (Math.random() * (31 - 1)) + 1;
        if (D <= 9) {
            dia = "0" + D;
        } else {
            dia = "" + D;
        }

        fecha += dia;
        return fecha;
    }

    public int asignarHospital() {
        int A = (int) (Math.random() * (81 - 1)) + 1;

        return A;
    }

    public int asignarSubCate() {
        int A = (int) (Math.random() * (77 - 1)) + 1;

        return A;
    }


}
