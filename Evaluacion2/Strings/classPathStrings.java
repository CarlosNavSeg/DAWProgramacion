package Strings;

import java.util.Scanner;

class classPathStrings {

    public static int comparadoraSinMayusculas() {
        String comparadora = "AlBaRo";
        String otraComparadora = "albaro";

        int largoDiferencia = comparadora.compareToIgnoreCase(otraComparadora);

        return largoDiferencia;
    }

    public static int comparadoraConMayusuclas() {
        String comparadora = "AlBaRo";
        String otraComparadora = "albaro";

        int largoDiferencia = comparadora.compareTo(otraComparadora);

        return largoDiferencia;
    }

    public static String concatenador(String str1, String str2) {

        str1.concat(str2);

        return str1;
    }

    public static boolean contieneONo(String str1, String str2) {

        boolean comprobador = str1.contains(str2);

        return comprobador;
    }

    public static boolean contieneONoFinal(String str1, String str2) {

        boolean comprobador = str1.endsWith(str2);

        return comprobador;
    }

    public static String sustituidor(String str1, char ch1, char ch2) {
        String resultado = str1;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ch1) {
                resultado.replace(resultado.charAt(i), ch2);
            }
        }
        return resultado;
    }

    public static int indiceDe(String str1, String strUsuario) {
        int indiceDeResultado = str1.indexOf(strUsuario);

        return indiceDeResultado;
    }

    public static int indiceDeUltimo(String str1, String strUsuario) {
        int indiceDeResultado = str1.lastIndexOf(strUsuario);

        return indiceDeResultado;
    }

    public static int subCadena(String str1, int k) {

        String palabraAPalabra = "";
        int contadoDePalabras = 0;

        palabraAPalabra = str1.substring(0, str1.indexOf(" "));
        String resto = str1.substring(str1.indexOf(" "), str1.length());
        resto = resto.substring(1, resto.length());

        while (!palabraAPalabra.isEmpty()) {

            if (palabraAPalabra.length() == k) {
                System.out.println(
                        "La palabra: " + "'" + palabraAPalabra + "'"
                                + " tiene la longitud en carácteres que propone el usuario.");
                contadoDePalabras++;

            }

            if (palabraAPalabra == resto) {
                break;
            }

            if (resto.indexOf(" ") == -1) {
                palabraAPalabra = resto;
            } else if (resto.indexOf(" ") != -1) {
                palabraAPalabra = resto.substring(0, resto.indexOf(" "));
                resto = resto.substring(palabraAPalabra.length() + 1, resto.length());
            }

        }

        System.out.print("\n La longitud que propone el usuario tiene estas palabras: ");
        return contadoDePalabras;

    }

    public static void subCadenaFlag(String str1, int k) {

        String palabraAPalabra = "";

        palabraAPalabra = str1.substring(0, str1.indexOf(" "));
        String resto = str1.substring(str1.indexOf(" "), str1.length());
        resto = resto.substring(1, resto.length());

        while (!palabraAPalabra.isEmpty()) {

            if (palabraAPalabra.length() == k) {
                System.out.print(
                        "La palabra: " + "'" + palabraAPalabra + "'"
                                + " tiene la longitud en carácteres que propone el usuario.");
                break;
            }

            if (resto.indexOf(" ") == -1) {
                palabraAPalabra = "";
            } else if (resto.indexOf(" ") != -1) {
                palabraAPalabra = resto.substring(0, resto.indexOf(" "));
                resto = resto.substring(palabraAPalabra.length() + 1, resto.length());
            }

        }

    }

    public static void subCadenaCortaOLarga(String str1, int k) {

        String palabraAPalabra = "";

        palabraAPalabra = str1.substring(0, str1.indexOf(" "));
        String resto = str1.substring(str1.indexOf(" "), str1.length());
        resto = resto.substring(1, resto.length());

        int matchesMayor = 0;

        while (!palabraAPalabra.isEmpty()) {

            if (palabraAPalabra.length() > k) {
                matchesMayor++;

            }

            if (resto.indexOf(" ") == -1) {
                palabraAPalabra = "";
            } else if (resto.indexOf(" ") != -1) {
                palabraAPalabra = resto.substring(0, resto.indexOf(" "));
                resto = resto.substring(palabraAPalabra.length() + 1, resto.length());
            }

        }
        if (matchesMayor != 0) {
            System.out.println("Hay alguna palabra larga");
        } else {
            System.out.println("Todas las cadenas son cortas");
        }

    }

    public static void hayDigitos(String cadenaDetexto) {

        String palabraAPalabra = "";

        palabraAPalabra = cadenaDetexto.substring(0, cadenaDetexto.indexOf(" "));
        String resto = cadenaDetexto.substring(cadenaDetexto.indexOf(" "), cadenaDetexto.length());
        resto = resto.substring(1, resto.length());

        while (!palabraAPalabra.isEmpty()) {

            if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '1') {
                System.out.println("Aquí hay un número" + palabraAPalabra);
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '2') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                break;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '3') {
                System.out.println("Aquí hay un número" + palabraAPalabra);
                break;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '4') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                break;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '5') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                break;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '6') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                break;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '7') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                break;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '8') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                break;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '9') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                break;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '0') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                break;
            } else {
                if (palabraAPalabra == resto) {
                    break;
                }
                if (resto.indexOf(" ") == -1) {
                    palabraAPalabra = resto;
                } else if (resto.indexOf(" ") != -1) {
                    palabraAPalabra = resto.substring(0, resto.indexOf(" "));
                    resto = resto.substring(palabraAPalabra.length() + 1, resto.length());
                }
            }
        }

    }

    public static void hayDigito(String cadenaDetexto) {

        String palabraAPalabra = "";

        palabraAPalabra = cadenaDetexto.substring(0, cadenaDetexto.indexOf(" "));
        String resto = cadenaDetexto.substring(cadenaDetexto.indexOf(" "), cadenaDetexto.length());
        resto = resto.substring(1, resto.length());

        int digitos = 0;

        while (!palabraAPalabra.isEmpty()) {

            if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '1') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos++;
                if (palabraAPalabra.length() > 1) {
                    if (palabraAPalabra.charAt(palabraAPalabra.length() - 2) < 0
                            || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                        digitos++;
                        if (palabraAPalabra.length() > 2) {
                            if (palabraAPalabra.charAt(palabraAPalabra.length() - 3) < 0
                                    || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                                digitos++;
                            }
                        }
                    }
                }
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '2') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos++;
                if (palabraAPalabra.length() > 1) {
                    if (palabraAPalabra.charAt(palabraAPalabra.length() - 2) < 0
                            || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                        digitos++;
                        if (palabraAPalabra.length() > 2) {
                            if (palabraAPalabra.charAt(palabraAPalabra.length() - 3) < 0
                                    || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                                digitos++;
                            }
                        }
                    }
                }
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '3') {
                System.out.println("Aquí hay un número" + palabraAPalabra);
                digitos++;
                if (palabraAPalabra.length() > 1) {
                    if (palabraAPalabra.charAt(palabraAPalabra.length() - 2) < 0
                            || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                        digitos++;
                        if (palabraAPalabra.length() > 2) {
                            if (palabraAPalabra.charAt(palabraAPalabra.length() - 3) < 0
                                    || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                                digitos++;
                            }
                        }
                    }
                }
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '4') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos++;
                if (palabraAPalabra.length() > 1) {
                    if (palabraAPalabra.charAt(palabraAPalabra.length() - 2) < 0
                            || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                        digitos++;
                        if (palabraAPalabra.charAt(palabraAPalabra.length() - 3) < 0
                                || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                            digitos++;
                        }
                    }
                }
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '5') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos++;
                if (palabraAPalabra.length() > 1) {
                    if (palabraAPalabra.charAt(palabraAPalabra.length() - 2) < 0
                            || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                        digitos++;
                        if (palabraAPalabra.length() > 2) {
                            if (palabraAPalabra.charAt(palabraAPalabra.length() - 3) < 0
                                    || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                                digitos++;
                            }
                        }
                    }
                }
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '6') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos++;
                if (palabraAPalabra.length() > 1) {
                    if (palabraAPalabra.charAt(palabraAPalabra.length() - 2) < 0
                            || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                        digitos++;
                        if (palabraAPalabra.length() > 2) {
                            if (palabraAPalabra.charAt(palabraAPalabra.length() - 3) < 0
                                    || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                                digitos++;
                            }
                        }
                    }
                }
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '7') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos++;
                if (palabraAPalabra.length() > 1) {
                    if (palabraAPalabra.charAt(palabraAPalabra.length() - 2) < 0
                            || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                        digitos++;
                        if (palabraAPalabra.length() > 2) {
                            if (palabraAPalabra.charAt(palabraAPalabra.length() - 3) < 0
                                    || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                                digitos++;
                            }
                        }
                    }
                }
            }

            else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '8') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos++;
                if (palabraAPalabra.length() > 1) {
                    if (palabraAPalabra.charAt(palabraAPalabra.length() - 2) < 0
                            || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                        digitos++;
                        if (palabraAPalabra.length() > 2) {
                            if (palabraAPalabra.charAt(palabraAPalabra.length() - 3) < 0
                                    || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                                digitos++;
                            }
                        }
                    }
                }
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '9') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos++;
                if (palabraAPalabra.length() > 1) {
                    if (palabraAPalabra.charAt(palabraAPalabra.length() - 2) < 0
                            || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                        digitos++;
                        if (palabraAPalabra.length() > 2) {
                            if (palabraAPalabra.charAt(palabraAPalabra.length() - 3) < 0
                                    || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                                digitos++;
                            }
                        }
                    }
                }
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '0') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos++;
                if (palabraAPalabra.length() > 1) {
                    if (palabraAPalabra.charAt(palabraAPalabra.length() - 2) < 0
                            || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                        digitos++;
                        if (palabraAPalabra.length() > 2) {
                            if (palabraAPalabra.charAt(palabraAPalabra.length() - 3) < 0
                                    || palabraAPalabra.charAt(palabraAPalabra.length() - 2) > 9) {
                                digitos++;
                            }
                        }
                    }
                }
            }

            if (palabraAPalabra == resto) {
                break;
            }

            if (resto.indexOf(" ") == -1) {
                palabraAPalabra = resto;
            } else if (resto.indexOf(" ") != -1) {
                palabraAPalabra = resto.substring(0, resto.indexOf(" "));
                resto = resto.substring(palabraAPalabra.length() + 1, resto.length());
            }

        }
        System.out.println("Hay " + digitos + " digitos en toda la cadena de texto.");
    }

    public static void hayDigitoX(String cadenaDetexto) {

        String palabraAPalabra = "";

        palabraAPalabra = cadenaDetexto.substring(0, cadenaDetexto.indexOf(" "));
        String resto = cadenaDetexto.substring(cadenaDetexto.indexOf(" "), cadenaDetexto.length());
        resto = resto.substring(1, resto.length());

        String[] digitos = new String[cadenaDetexto.length()];

        for (int i = 0; i < digitos.length; i++) {
            if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '1') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos[i] = palabraAPalabra;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '2') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos[i] = palabraAPalabra;

            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '3') {
                System.out.println("Aquí hay un número" + palabraAPalabra);
                digitos[i] = palabraAPalabra;

            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '4') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos[i] = palabraAPalabra;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '5') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos[i] = palabraAPalabra;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '6') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos[i] = palabraAPalabra;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '7') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos[i] = palabraAPalabra;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '8') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos[i] = palabraAPalabra;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '9') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos[i] = palabraAPalabra;
            } else if (palabraAPalabra.charAt(palabraAPalabra.length() - 1) == '0') {
                System.out.println("Aquí hay un número " + palabraAPalabra);
                digitos[i] = palabraAPalabra;
            }

            if (palabraAPalabra == resto) {
                break;
            }

            if (resto.indexOf(" ") == -1) {
                palabraAPalabra = resto;
            } else if (resto.indexOf(" ") != -1) {
                palabraAPalabra = resto.substring(0, resto.indexOf(" "));
                resto = resto.substring(palabraAPalabra.length() + 1, resto.length());
            }

        }
        int contadorDeDigitos = 0;
        System.out.print("Estos: ");
        for (int i = 0; i < digitos.length; i++) {
            if (digitos[i] == null) {

            } else {
                System.out.print(digitos[i] + " ");
                contadorDeDigitos++;
            }
        }

        System.out.println("son digitos, hay " + contadorDeDigitos + " digitos en la cadena");
    }

    public static void parentizado(String str1) {

        String desdePrimerParentesis = "";
        String fraseparentizada = "";
        boolean frasecomprobada = false;

        while (frasecomprobada == false) {

            if (str1.indexOf("(") != -1) {

                desdePrimerParentesis = str1.substring(str1.indexOf("("), str1.length());

                if (desdePrimerParentesis.indexOf(")") == -1) {
                    System.out.println("No hay ningun parentesis que cierre al abierto");
                    frasecomprobada = true;
                }

            } else {
                System.out.println("La cadena " + desdePrimerParentesis + " no tiene ningun parentesis.");
                frasecomprobada = true;
            }

            if (desdePrimerParentesis.isEmpty() != true) {

                System.out.println("Hay dos paréntesis en la cadena " + fraseparentizada
                        + " ahora comprobemos que estan bien parentizados");

                if (desdePrimerParentesis.indexOf("(") < desdePrimerParentesis.indexOf(")")) {
                    System.out.println(
                            "La frase no está bien parentizada ya que " + str1 + " tiene parentesis en medio.");
                    frasecomprobada = true;
                    desdePrimerParentesis = "";
                } else {
                    System.out.println("La frase " + str1 + " está bien parentizada.");
                    frasecomprobada = true;
                    desdePrimerParentesis = "";
                }
            }

        }

    }

    public static String invertir(String str1) {
        int contador = 0;
        String unidadpalabra = "";
        String fraseinvertida = "";
        String[] fraseenpalabras = new String[100];
        String resto = str1;

        while (!resto.isEmpty()) {
            if (resto.indexOf(" ") != -1) {
                unidadpalabra = resto.substring(0, resto.indexOf(" "));
            } else {
                fraseenpalabras[contador] = resto;
                break;
            }
            fraseenpalabras[contador] = unidadpalabra;
            contador++;
            resto = resto.substring(unidadpalabra.length() + 1, resto.length());

        }

        for (int i = contador; i >= 0; i--) {
            fraseinvertida += fraseenpalabras[i];
            fraseinvertida += " ";
        }

        return fraseinvertida;
    }

    public static String[] palabras(String frase) {
        String[] palabras = new String[frase.length()];

        String resto = frase;
        int contador = 0;

        String palabra = frase.substring(0, frase.indexOf(" "));

        while (!resto.isEmpty()) {
            palabras[contador] = palabra;
            contador++;
            resto = resto.substring(palabra.length() + 1, resto.length());
            if (resto.indexOf(" ") != -1) {
                palabra = resto.substring(0, resto.indexOf(" "));
            } else {
                palabra = resto;
                palabras[contador] = palabra;
                break;
            }

        }
        return palabras;
    }

    public static String siglas(String[] palabras) {
        String str1 = leerCadena();
        palabras = palabras(str1);
        String siglado = "";
        String palabramayus;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] != null) {
                palabramayus = palabras[i].toUpperCase();

                if (palabras[i].charAt(0) == palabramayus.charAt(0)) {
                    siglado += palabras[i].charAt(0);
                }
            } else {
                break;
            }
        }
        return siglado;
    }

    public static String leerCadena() {
        Scanner kdb = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String fraseusuario = kdb.nextLine();

        return fraseusuario;
    }

    public static boolean Alfabetica() {
        String str1 = leerCadena();

        for (int i = 1; i < str1.length() - 1; i++) {
            if (str1.charAt(i) < str1.charAt(i + 1)) {

            } else {
                return false;

            }
        }
        return true;

    }

    public static String pasatiempos() {
        String str1 = leerCadena();

        String str1Upper = str1.toUpperCase();

        String conElPunto = "";

        String registro = "";

        for (int i = 0; i < str1.length(); i++) {

            if (str1Upper.charAt(i) == 'A') {
                if (conElPunto.isEmpty()) {
                    conElPunto += str1.substring(0, i);
                    conElPunto += ".";
                    registro = conElPunto;
                } else {
                    conElPunto += str1.substring(conElPunto.length(), i);
                    conElPunto += ".";
                    registro = conElPunto;
                }
            } else if (str1Upper.charAt(i) == 'E') {
                if (conElPunto.isEmpty()) {
                    conElPunto += str1.substring(0, i);
                    conElPunto += ".";
                    registro = conElPunto;
                } else {
                    conElPunto += str1.substring(conElPunto.length(), i);
                    conElPunto += ".";
                    registro = conElPunto;
                }
            }

            else if (str1Upper.charAt(i) == 'O') {
                if (conElPunto.isEmpty()) {
                    conElPunto += str1.substring(0, i);
                    conElPunto += ".";
                    registro = conElPunto;
                } else {
                    conElPunto += str1.substring(conElPunto.length(), i);
                    conElPunto += ".";
                    registro = conElPunto;
                }
            }

            else if (str1Upper.charAt(i) == 'I') {
                if (conElPunto.isEmpty()) {
                    conElPunto += str1.substring(0, i);
                    conElPunto += ".";
                    registro = conElPunto;
                } else {
                    conElPunto += str1.substring(conElPunto.length(), i);
                    conElPunto += ".";
                    registro = conElPunto;
                }
            } else if (str1Upper.charAt(i) == 'U') {
                if (conElPunto.isEmpty()) {
                    conElPunto += str1.substring(0, i);
                    conElPunto += ".";
                    registro = conElPunto;
                } else {
                    conElPunto += str1.substring(conElPunto.length(), i);
                    conElPunto += ".";
                    registro = conElPunto;
                }

            }

        }
        return registro;
    }

    public static String encriptar() {

        String str1 = leerCadena();

        char [] letrasalmacenadas = new char[str1.length()];

        boolean esnumero = false;

        String k = "";

        while(esnumero == false) {

        System.out.println("Introduce un número y moveremos los carácteres tantos numeros a la derecha como introduzcas");
        k = leerCadena();
        
        for (int i = 1; i < k.length(); i++) {
            if(k.charAt(i) > 0 || k.charAt(i) < 9) {
                esnumero = true;
            }
            else {
                
            }
        }
    }
        
        Integer.parseInt(k);

        for (int i = 0; i < str1.length(); i++) {
            letrasalmacenadas[i] = str1.charAt(i);
        }
        String encriptada = "";
        for (int i = 0; i < letrasalmacenadas.length; i++) {
            encriptada += letrasalmacenadas[i+2];
            if(i+2 > letrasalmacenadas.length) {

            }
        }

    return "";
    }

    public static void main(String[] args) {

        System.out.println(encriptar());
    }

}
