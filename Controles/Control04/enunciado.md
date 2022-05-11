Crea una aplicación con las siguientes características.
Una clase persona con los siguientes atributos.
Persona: nif, nombre, apellidos.
Estos atributos deben ser accesibles para las clases hijas y no accesibles para el resto de clases. El acceso se hará mediante setters y getters adecuados.
Una clase cliente que hereda de persona con los siguientes atributos.
Cliente: id, nif, nombre, apellidos, email.
Dichos atributos no deben ser accesibles desde fuera de la clase. Dicho acceso se realizará mediante los getters y setters adecuados.
Sobreescribe el método toString() para mostrar los atributos de forma tabular, esto significa que aparezcan de forma que
valor del dato+"\t"+valor del dato
Crea una clase PersistenciaCliente con un método write() que recibe un ArrayList<Cliente> de tal forma que escribe en un fichero "clientes.dat" todos los clientes del ArrayList<Cliente> cada cliente se escribe en una línea, con los atributos separados por comas. Escribe también un método read(String file) que recibe como parámetro el nombre del fichero a cargar que recibe el nombre del fichero a cargar que almacena en un ArrayList los clientes del fichero.

Crea un programa que saque del código fuente de una página html los enlaces y el nombre de las imágenes que
contiene.