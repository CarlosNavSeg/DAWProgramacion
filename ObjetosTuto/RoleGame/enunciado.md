
Práctica: RPG
Vamos a modelar, de manera muy básica, la estructura de un videojuego RPG.
Los objetivos de la práctica son los siguientes:
• Definir personajes: nombre, raza y profesion.
• La raza y la profesión han de influir en las características de los personajes.
• Permitir que los personajes puedan recibir daño y curarse.
• Que los jugadores puedan recoger objetos.
• Uso de items consumibles: comida, pociones. . .
• Permitir equiparse con objetos.
• Habilitar la posibilidad de subir de nivel.
Vamos a hacer un uso extensivo de herencia e interfaces para que el código sea
extensible, es decir, que se puedan añadir elementos nuevos fácilmente.
Como el proyecto va a tener un número considerable de clases, interfaces y
enums, será necesario organizar el proyecto de forma correcta.
(1) Vamos a crear en primer lugar un package llamado Character que alber-
gará todo lo relacionado con el personaje.
1
Figure 1: Character package structure
1. Características
Una característica representará cada uno de los atributos (físicos o mentales) del
personaje. Estas características tendrán un valor que define lo desarrollado que
un personaje tiene cada atributo. En nuestro caso usaremos 4:
• Strength (Fuerza): define el poder físico del personaje. Influirá principal-
mente en el valor de ataque físico, pero también define el peso que un
personaje puede llevar.
• Dexterity (Destreza): representa la coordinación ojo-mano, la agilidad,
reflejos o equilibrio. También influirá en la capacidad de esquivar un
ataque.
• Constitution (Constitución): define la vida y aguante de un jugador.
• Intelligence (Inteligencia): representa la fácilidad del personaje para apren-
der y razonar. Determina el poder mágico.
Figure 2: Stat structure
(2) En primer lugar, crea un nuevo package llamado Stat dentro del package
Character.
(3) Crea una clase abstracta llamada Stat que representará una característica
genérica. Stat tendrá un único atributo llamado value, cuyo valor recibirá
por parámetro en el constructor. La clase stat tendrá los siguientes métodos:
//Devuelve el valor actual de la característica
public int getValue(){
2
