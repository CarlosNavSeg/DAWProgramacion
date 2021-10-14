import java.util.Scanner;

public class ejemplo24 {
    public static void main(String[] args) {
        boolean wasTen = false;
        double sum = 0;
        int i = 0;
        double grade = 0;

        Scanner profesor = new Scanner(System.in);

        while (grade != -1) {
            System.out.println("Introduzca una nota ");
            grade = profesor.nextDouble();
            sum = sum + grade;
            i++;
            if (grade == 10) {
                wasTen = true;
            }

        }

        profesor.close();

        System.out.println("Average" + sum/i);

        if(wasTen == true) {
            System.out.println("There was a 10");
        }
        else {
            System.out.println("There was no 10");
        }

    }
}
