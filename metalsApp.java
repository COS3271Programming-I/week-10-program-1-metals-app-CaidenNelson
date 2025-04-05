import java.util.Scanner;

public class metalTemp {
    static Scanner userinput = new Scanner(System.in);

    static double fBoil(double temp) {
        double answer;

        answer = temp*9/5 +32;

        return answer;
    }

    static double fMelt(double temp){
        double answer;

        answer = temp*9/5+32;

        return answer;
    }

    public static void main(String[] args) {

        String metalName;
        double density;
        double melt;
        double boil;
        double hardness;
        int metalsNumber;
        double farenheightMelt;
        double farenheightBoil;

        System.out.println("how many metals would you like to know temperatures about");
        metalsNumber = userinput.nextInt();

        for (int i =0; i < metalsNumber; i++){

            System.out.println("What is the name of the metal");
            userinput.nextLine();
            metalName = userinput.nextLine();

            System.out.println("What is the density of " +metalName+ " in g/cm^3");
            density = userinput.nextDouble();

            System.out.println("What is the melting point of " +metalName+ " in celcius");
            melt = userinput.nextDouble();

            System.out.println("What is the boiling point of " +metalName+ " in celcius");
            boil = userinput.nextDouble();

            System.out.println("What is the hardness of " +metalName+ " on a scale of 0-10");
            hardness = userinput.nextDouble();

            farenheightMelt = fMelt(melt);
            farenheightBoil = fBoil(boil);

            System.out.println(metalName);
            System.out.println("Hardness : " + hardness);
            System.out.println("Density : " + density);
            System.out.println("Melting point : " + farenheightMelt);
            System.out.println("Boiling point : " + farenheightBoil);

        }
    }

}
