package Strings;

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

    public static void main(String[] args) {
        hayDigitoX("el 20 y el 400 son números multiplos 1 de otro 4");
    }

}
