package gioco;

/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;

public class Main
{
   public static void main(String[] args) {
       //1 chiedi all'utente
       String sceltaUmano = chiediUmano();
       //2 estrai a random
       String sceltaPC = chiediPC();
       //3 valuta scelta
       String result = valuta(sceltaUmano, sceltaPC);
       //4 stampa risultato
       System.out.println("UMANO ha scelto: " + sceltaUmano);
       System.out.println("PC ha scelto: " + sceltaPC);
       System.out.println("Ha vinto: " + result);
   }
   
   private static String valuta(String umano, String PC){
       String risultato = "UMANO";
       
       if (umano.equals(PC)){
           risultato = "PAREGGIO";
       } else {
           switch(umano){
               case "carta":
                   if (!PC.equals("sasso")) risultato = "PC";
                   break;
               case "sasso":
                   if (!PC.equals("forbici")) risultato = "PC";
                   break;
               case "forbici":
                   if (!PC.equals("carta")) risultato = "PC";
                   break;
               default:
            	   System.out.println("Scelta non giudicabile!");
            	   break;
               
           }
           /*
           if (umano.equals("carta") && !PC.equals("sasso"))
               risultato = "PC";
           if (umano.equals("sasso") && !PC.equals("forbici"))
               risultato = "PC";
           if (umano.equals("forbici") && !PC.equals("carta"))
               risultato = "PC";
           */
       }
       
       return risultato;
   }
   
   
   private static String chiediUmano(){
       System.out.println("Inserisci sasso, forbici oppure carta");
       Scanner scanner = new Scanner(System.in);
       return scanner.next();
   }
   
   private static String chiediPC(){
       double casuale = Math.random();
       if (casuale < 0.33){ return "forbici";}
       else if (casuale < 0.66){ return "sasso";}
       return "carta";
   }
   
   
   
   
}
