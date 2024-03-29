# Java Generador De Nombres Completos

Script para generar data de prueba SQL.


## Descripción

Se obtiene la combinación de todos los nombres con N apellidos, 
complementados con campos adicionales como DNI o fecha de nacimiento.

## Dependencias


* Java desde versión 8.

## Flujo

### Referencias a archivos necesarios

* Indicar la ruta de los archivos a usar.

```
public static final String routeNames = "Nombres.txt";
public static final String routeLastNames = "Apellidos.txt";
public static final String routeResults = "Resultados.txt";
```

### Clase GeneralList

* Instanciar la clase que obtendrá la lista de las combinaciones.
```
GeneralList generalList = new GeneralList(routeNames, routeLastNames);
```

### Indicar número de grupos

* Leer nombres y apellidos e indicar el número de grupos
```
List<Paciente> completeList = generalList.readData(3);
```

### Clase Opener

* Instanciar la clase que escribirá los resultados en el archivo de texto
```
OpenerTxt obj = new OpenerTxt(routeResults);
```

## Ejecución

Iniciar el proyecto a través de cualquier IDE.

* Verificar las rutas para cada archivo de texto.
* Considerar el tiempo según la cantidad de grupos.


## Imágenes

* Nombres.

![plot](./src/resources/names.png)

* Apellidos.

![plot](./src/resources/lastnames.png)

* Resultado.

![plot](./src/resources/results.png)

## Authors

Contribuidores y enlaces

. [@Capdoo](https://github.com/Capdoo)


## License

This project is licensed under the terms of the MIT license.

## Acknowledgments

Lectura y escritura de archivos en Java.
* [BufferedReader - Oracle](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html)