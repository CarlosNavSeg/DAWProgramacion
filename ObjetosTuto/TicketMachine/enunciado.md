
Programación Orientada a Objetos
naive-ticket-machine
En este proyecto, realiza las siguientes modificaciones:
1. Escribe un método selector llamado getTotal. Este método debe devolver el valor
del campo total.
2. Crea un método llamado setPrice(int cost) que le asigne el valor cost al campo
price.
3. Añade un método denominado prompt. Este método debe tener un tipo de
retorno void y ningún parámetro. El cuerpo del método debe imprimir la siguiente
línea
Please insert the correct amount of money.
para informar al cliente de que introduzca la cantidad correcta de dinero.
4. Añade un método showPrice. Debe tener un tipo de retorno void y ningún
parámetro. El cuerpo del método debe imprimir:
The price of the ticket is xyz cents.
para informar al cliente de cuál es el precio del billete. xyz debe sustituirse por el
valor del campo price en el momento de invocar al método.
5. Define un nuevo constructor para la clase. Este no debe admitir ningún
parámetro, por lo que se deberá fijar el precio posteriormente llamando a
setPrice. Comprueba la implementación creando máquinas con ambos
constructores.
6. Crea un nuevo método, empty, que simule el efecto de extraer todo el dinero
acumulado en la máquina. Este método debe tener un tipo de retorno void y su
cuerpo ha de asignar simplemente el valor 0 al campo total. ¿Necesita este
método algún tipo de parámetro? Comprueba este método creando una máquina,
introduciendo algo de dinero, imprimiendo billetes, comprobando el total y luego
vaciando la máquina. ¿Es el método empty un mutador o un selector?.
-------------------------------------------------------------o----------------------------------

Programación Orientada a Objetos
better-ticket-machine
En este proyecto, realiza las siguientes modificaciones:
1. Escribe un método llamado emptyMachine, diseñado para simular el vaciado del
dinero acumulado en la máquina. Este método debe reinicializar el campo total a
cero, pero también devolver el valor que tuviera almacenado en total antes de la
reinicialización.
2. Escribe de nuevo el método printTicket para que declare una variable local,
amountToPay, que debe indicar el dinero que falta para completar el precio del
billete. Dicha variable deberá inicializarse para que contenga la diferencia entre
price y balance. Reescribe la comprobación en la instrucción condicional para que
se compruebe el valor de amountToPay. Si su valor es menor o igual que cero,
deberá imprimirse el billete; en caso contrario, hay que imprimir un mensaje de
error que especifique la cantidad de dinero que falta por introducir. Comprueba
este nuevo método creando varias máquinas e intentando imprimir el billete
cuando no se ha introducido la cantidad correcta y cuando sí que se ha
introducido.
3. Supongamos que queremos permitir que la máquina imprima billetes con
descuento (20%) que se aplica cuando los usuarios pulsan un botón en la máquina
física. Implementa un método llamado setDiscount, que realice esta operación.
Antes de empezar a hacerlo piensa bien qué campos nuevos necesitas y qué
métodos deberías cambiar.
