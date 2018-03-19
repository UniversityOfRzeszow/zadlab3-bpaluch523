/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Asia
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int potrek(int z, int p){
        if(p==0) return 1;
        else if(z%2!=0) return z*(potrek(z,(p-1)/2))*(potrek(z,(p-1)/2));
        return (potrek(z,p/2))*(potrek(z,p/2));
    }
    
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        
        //ZAD 1.4
        System.out.println("ZAD 1.4");
        int x = 168;
        int y;
        y=(x>>2);
        System.out.println("168 >> 2 = "+y);
        y=(x<<2);
        System.out.println("168 << 2 = "+y);
        y=(x>>>2);
        System.out.println("168 >>> 2 = "+y);
        
        //ZAD 1.7
        System.out.println("\nZAD 1.7");
        int a = 26;
        int b = 15;
        int c = 0;
        System.out.println("a = "+a+"\nb = "+b);
        c=~a;
        System.out.println("NOT ~a = "+c);
        c= a ^ b;
        System.out.println("XOR a ^ b = "+c);
        
        //ZAD 2.2
        
        System.out.println("\nZAD 2.2");
        
        String str = new String("Ale urwal");
        String str2 = new String("DAJ KAMENIA");
        String str3 = new String("  siema eniu  ");
        String str4 = new String("od dwoch dni");
        
        System.out.println(str.toCharArray());            //Metoda toCharArray zwraca tablicę wszystkich znaków składającą się na ciąg znaków.
        System.out.println(str.getBytes());               //Metoda getBytes zamienia stringa na tablicę bajtów.
        System.out.println(str.equals(str2));             //Metoda equals wykorzystywana jest do porównywania ze sobą stringów po wartości.
        System.out.println(str.equalsIgnoreCase(str2));   //to samo co wyżej tylko ignorowana jest wielkosc znakow
        System.out.println(str.compareTo(str2));          //porownanie stringow wedlog porzadku leksykograficznego
        System.out.println(str.compareToIgnoreCase(str2));//to samo co wyzej tylko ignorowana jest wielkosc znakow
        System.out.println(str.indexOf('u'));             //Metoda indexOf wyszukuje podanego ciągu znaków i zwraca indeks pierwszego znalezionego wystąpienia. 
        System.out.println(str.lastIndexOf('l'));         //Metoda lastIndexOf wyszukuje podanego ciągu znaków i zwraca indeks ostatniego znalezionego wystąpienia.
        System.out.println(str.substring(3));             //zwraca wybrany znak o podanym indeksie
        System.out.println(str.substring(1,7));           //zwraca wybrany ciag znakow o podanym zakresie indeksow
        System.out.println(str.replace('l','u'));         //zamiana z jednego fragmentu tekstu na drugi
        System.out.println(str3.trim());                  //pozbycie sie bialych znakow
        System.out.println(str2.toLowerCase());           //zamiana na male litery
        System.out.println(str3.toUpperCase());           //zamiana na duze litery
        String[] rozdz = str4.split("dwoch");             //rozbicie ciagu znakow na fragmenty przed i po podanym argumencie
        String part1 = rozdz[0];
        String part2 = rozdz[1];
        System.out.println(part1);
        System.out.println(part2);
        
        //ZAD 3.3
        
        System.out.println("\nZAD 3.3");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("podaj liczbe: ");
        int z = input.nextInt();
        System.out.println("podaj potege: ");
        int p = input.nextInt();
        
        int wynik = 1;
        int v=z;
        for(int j=p;j>0;j/=2){
            if(j%2==1) wynik=wynik*v;
            v=v*v;
        }
        System.out.println(z+" do potegi "+p+" wynosi: "+wynik);
        
        //rekurencyjnie
        
        int wynikrek=potrek(z,p);
        System.out.println("rekurencyjnie "+z+" do "+p+" wynosi "+wynikrek);
        
        //ZAD 3.4
        
        System.out.println("\nZAD 3.4");
        
        int r=1,t=1, temp;
        System.out.println("ktora liczbe fibo podac: ");
        int f = input.nextInt();
        
        for(int i=0;i<f;i++){
            temp=r;
            r=t;
            t+=temp;
        }
        System.out.println(f+" liczba fibo to: "+r);
        
        
    }
    
}
