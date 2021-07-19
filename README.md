# challengeJuegoDeCarros
Reto técnico para Sofka U
Para poder ejecutar este proyecto, es necesario tener instalado algun IDE de Java, así como algun gestor de bases de datos para MySQL.

Como primer paso se debe ejecutar en el sistema de gestión de base de datos el script "dbchallenge.sql" para tener lista nuestra base de datos, así como nuestras tablas.
Seguidamente debemos añadir a las librerías de nuestro proyecto, el archivo .jar que permiten la conectividad entre MySQL.
Cuando tengamos la base de datos creada, al igual que el archivo correctamente añadido procedemos a ejecutar el programa.

La inserción de los datos se hacen mediante consola, siguiendo los mensajes que van apareciendo, primeramente se piden la cantidad de participantes
que debe ser mayor o igual a 3, seguidamente agregamos los nombres de dichos jugadores y a continuación el número de kilometros que tendrá la pista.

Cuando se inicia el juego el programa avanza los carros de acuerdo a un número aletario entre 1 y 6, dicho número se multiplica por 100 y ese valor
es el total que avanzará en dicho turno, así correrá el programa sucesivamente hasta que 3 concursantes lleguen a la totalidad de kilometros ingresados.

Los 3 primeros jugadores en llegar a la meta, son asignados a una posición en un podio en orden de llegada, estos serán mostrados mediante la consola
y seguidamente enviados a la base de datos para su almacenado, cuando se termine la ronda, podemos continuar jugando con los mismos nombres que 
ingresamos anteriormente.

/*Entidades del proyecto*/

ChallengeJuegoDeCarros: Se encarga de llamar la clase Juego
Clase Juego: Se encarga de la configuración, instanciación de objetos de las demás clases así como la lógica del juego y el control del mismo, con diversos métodos
que permiten la comunicación entre entidades y sus diversas acciones.
Clase Jugador: Tiene la información del nombre del jugador así como los puntos que ha obtenido.
Clase Carro: Se encarga de tener la información del carro así como su conductor.
Clase Carril: Permite conocer la distancia que lleva recorrida cada carro en ella así como la acción de mover los carros en ella, permite saber si el jugador 
ya cruzó la meta y tiene la información de la totalidad de metros de la misma.
Clase Pista: Contiene los carriles por los cuales se realiza la carrera, y los jugadores que están participando en cada uno de ellos, se encarga de crear los carriles
para cada item del arreglo.
Clase Conductor: Tiene el nombre correspondiente que el jugador le haya asignado.
Clase Podio: Contiene la información de los tres primeros puestos para su almacenamiento en la base de datos.
Clase Conexion: Contiene todo lo necesario para las conexiones entre la base de datos y el programa y el guardado de dicha información.
