
Programación Orientada a Objetos
heater-exercise
Crea un nuevo proyecto en BlueJ llamado heater-exercise.
1. Crea una clase, Heater, que represente un calefactor y que contenga un único
campo, temperature, cuyo tipo sea double. El campo temperature debe
configurarse en el constructor con el valor 15.0. Define los mutadores warmer y
cooler, cuyo efecto consiste en aumentar o disminuir la temperatura en 5.0º,
respectivamente. Define un método selector para devolver el valor de
temperature.
2. Modifica la clase Heater para definir tres nuevos campos de tipo double: min,
max e increment. Los valores de min y max deben configurarse mediante
parámetros pasados al constructor. El campo increment debe inicializarse con el
valor 5.0 en el constructor. Modifica las definiciones de warmer y cooler para que
empleen el valor de increment en lugar del valor explícito 5.0
Antes de continuar, verifica que todo funciona como antes.
3. Ahora, modifica el método warmer para que no permita configurar la temperatura
a un valor mayor que el indicado en max. De forma similar, modifica cooler para
que no la permita configurar a un valor menor que min. Comprueba que la clase
funciona correctamente.
4. Crea un método llamado setIncrement, que admita un único parámetro del tipo
apropiado y que lo utilice para configurar el valor de increment. Este valor debe
estar comprendido entre 1.0 y 5.0.
