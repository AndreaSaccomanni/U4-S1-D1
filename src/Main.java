import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ESERCIZIO 1

        moltiplica(10,20);

        String concatena1 = concatena("Ciao", 7);
        System.out.println(concatena1);

        String[] arr = {"A", "B", "C", "D", "E"} ;
        String newElement = "Nuovo Elemento in terza posizione";
        String[] newArray = inserisciInArray( arr, newElement);
        System.out.println("Il risultato del metodo inserisciInArray è: " + Arrays.toString(newArray));

        //ESERCIZIO 2
        main1();

        //ESERCIZIO 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un valore decimale per la base!");
        double base = scanner.nextDouble();
        System.out.println("Inserisci un valore decimale per l'altezza!");
        double altezza = scanner.nextDouble();
        double perimetro = perimetroRettangolo(base, altezza);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);


        System.out.println("Inserisci un numero, se è pari il risultato sarà 0, altrimenti 1");
        int num = scanner.nextInt();
        int numPariODispari = pariDispari(num);
        System.out.println("Il risultato del metodo pariDispari è: " + numPariODispari);


        System.out.println("Inserisci il lato 1:");
        double lato1 = scanner.nextDouble();
        System.out.println("Inserisci il lato 2:");
        double lato2 = scanner.nextDouble();
        System.out.println("Inserisci il lato 3:");
        double lato3 = scanner.nextDouble();
        double area = areaTriagolo(lato1, lato2, lato3);
        System.out.println("L'area del triangolo è: " + area);
    }


        public static void moltiplica(int x, int y) {

            int result = x * y;
            System.out.println("Il risultato del metodo moltiplca è: " + result);
        }

        public static String concatena(String testo , int numero) {

        String result =  testo + numero;
        return ("Il risultato del metodo concatena è: " + result);

        }
        public static String[] inserisciInArray(String [] arr, String newElement){
        if(arr.length < 5){
            System.out.println("L'array deve avere almeno 5 elementi!");
        }
        String[] newArr = new String[6];
        newArr[0] = arr[0];
        newArr[1] = arr[1];
        newArr[2] = newElement;
        newArr[3] = arr[2];
        newArr[4] = arr[3];
        newArr[5] = arr[4];

        return newArr;
        }

        public static void  main1(){
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Inserisci tre nomi a tua scelta!");
                String nome1= scanner.nextLine();
                String nome2= scanner.nextLine();
                String nome3= scanner.nextLine();
                System.out.println("In ordine di inserimento: " + nome1 + nome2 + nome3);
                System.out.println("In ordine inverso: " + nome3 + nome2 + nome1);

        }


        public static double perimetroRettangolo(double base, double altezza){
//
            double perimetro = 2*(base+altezza);
            return perimetro;

       }


         public static int pariDispari(int num){

             return num % 2 == 0 ? 0 : 1;
         }
         public static double areaTriagolo(double lato1, double lato2, double lato3){
        double semiPerimetro = ( lato1 + lato2 + lato3) / 2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
        return area;
         }
    }
