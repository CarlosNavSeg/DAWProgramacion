
Programación Orientada a Objetos
mail-system
Abre el proyecto mail-system.
1. Añade una línea de asunto del correo electrónico a los elementos de correo del
proyecto mail-system. Asegúrate de que al imprimir los mensajes también se
imprima la línea de asunto. Modifica el cliente de correo según sea necesario.


Programación Orientada a Objetos
mail-system-avanzado
Abre el proyecto mail-system y guárdalo como mail-system-
avanzado
1. Modifica el método sendMailItem() para que se pueda enviar a
más de un destinatario. Para ello al parámetro to se pueden
pasar varios usuarios separados por “;”
2. Añade un muevo método forwardLastMailItem(String forwardTo)
que permita reenviar un mensaje de un usuario a otro
usuario.
Por ejemplo, victor le envía a un correo a jose y este se lo
reenvía a manuel (antes de reenviarlo, imprime el mensaje
de jose). Siempre se reenvía el último correo que tiene el
usuario.
