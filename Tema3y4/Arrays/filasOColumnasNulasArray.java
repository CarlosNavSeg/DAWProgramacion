package Arrays;

class filasOColumnasNulasArray {
    public static void main(String[] args) {
        int max = 1;
        int min = 0;

        int matches = 0;
        int matchesColumna = 0;

        int[][] matrizBinaria = new int[10][10];

        int filasNulas = 0;
        int columnasNulas = 0;

        for (int i = 0; i < matrizBinaria.length; i++) {
            for (int j = 0; j < matrizBinaria[0].length; j++) {
                matrizBinaria[i][j] = (int) (Math.random() * (max - min + 1) + min);
                if (i == 2 || i == 4 || j == 2) {
                    matrizBinaria[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrizBinaria.length; i++) {
            matches = 0;
            for (int j = 0; j < matrizBinaria[i].length; j++) {
                if (matrizBinaria[i][j] == 0) {
                    matches++;
                    if (matches == 10) {
                        filasNulas++;
                    }
                }

            }
        }

        for (int j = 0; j < matrizBinaria.length; j++) {
            matchesColumna = 0;
            for (int i = 0; i < matrizBinaria[j].length; i++) {
                if (matrizBinaria[i][j] == 0) {
                    matchesColumna++;
                    if (matchesColumna == 10) {
                        columnasNulas++;
                    }
                }

            }
        }
        for (int i2 = 0; i2 < matrizBinaria.length; i2++) {
            for (int j2 = 0; j2 < matrizBinaria[i2].length; j2++) {
                System.out.print(matrizBinaria[i2][j2]);
            }
            System.out.println("");
        }

        System.out.println("Filas nulas: " + filasNulas + " columnas nulas: " + columnasNulas);
    }
}
