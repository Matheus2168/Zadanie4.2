import java.util.Scanner;

public class MathQuiz {

    Scanner sc = new Scanner(System.in);
    boolean answer1;
    boolean answer2;
    boolean answer3;
    int points = 0;


    boolean question1(){
        boolean result;
        System.out.println("Podaj wynik działania: \n 3 * 5");
        System.out.print("Odpowiedz: ");
        int answer = sc.nextInt();
        if (answer == 3*5){
            answer1 = true;
            result = true;
            points++;
        }
        else {result = false; answer1 = false;}
        return result;

    }

    boolean question2(){
        boolean result;
        System.out.println("Jakie jest pole kwadratu o boku 12 ?");
        System.out.print("Odpowiedz: ");
        int answer = sc.nextInt();
        if (answer == Math.pow(12,2)){
            answer2 = true;
            result = true;
            points++;
        }
        else {result = false; answer2 = false;}
        return result;

    }

    boolean question3(){
        boolean result;
        System.out.println("Ile wynosi pierwiastek kwadratowy z liczby 15129");
        System.out.print("Odpowiedz: ");
        int answer = sc.nextInt();
        if (answer == Math.sqrt(15129)){
            answer3 = true;
            result = true;
            points++;
        }
        else {result = false; answer3 = false;}
        return result;

    }

    String showResults(){
        System.out.println("Pytanie 1 - ODPOWIEDŹ:");
        if (answer1 == true)
            System.out.println("+++ POPRAWNA +++");
        else System.out.println("---- BLEDNA -----");

        System.out.println("Pyranie 2 - ODPOWIEDŹ:");
        if (answer2 == true)
            System.out.println("+++ POPRAWNA +++");
        else System.out.println("---- BLEDNA ----");

        System.out.println("Pyranie 3 - ODPOWIEDŹ:");
        if (answer3 == true)
            System.out.println("+++ POPRAWNA +++");
        else System.out.println("---- BLEDNA ----");

        return "Zdobyles: "+points+" / "+"3 punktow";



    }

}
