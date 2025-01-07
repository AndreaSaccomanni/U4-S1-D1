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
        main();

        //ESERCIZIO 3

        //perimetroRettangolo();


        int numPariODispari = pariDispari(6);
        System.out.println("Il risultato del metodo pariDispari è: " + numPariODispari);

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

        public static void  main(){
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Inserisci tre nomi a tua scelta!");
                String nome1= scanner.nextLine();
                String nome2= scanner.nextLine();
                String nome3= scanner.nextLine();
                System.out.println("In ordine di inserimento: " + nome1 + nome2 + nome3);
                System.out.println("In ordine inverso: " + nome3 + nome2 + nome1);

        }
//        public static void perimetroRettangolo(){
//        Scanner scanner = new Scanner(System.in);
//            System.out.println("Inserisci la base del rettangolo!");
//        double base = scanner.nextDouble();
//
//            System.out.println("Inserisci l'altezza del rettangolo!");
//        double altezza = scanner.nextDouble();
//
//        double perimetro = 2*(base + altezza);
//            System.out.println("Il risultato del metodo perimetroRettanngolo è: " + perimetro);
//
//        }
         public static int pariDispari(int num){
        Scanner scanner = new Scanner(System.in);
             return num % 2 == 0 ? 0 : 1;
         }
    }
