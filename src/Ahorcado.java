import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //Clase Scanner permite ingresar datos por consola
            Scanner scan = new Scanner(System.in);

            // Declaracion de variables 
            String secret_word = "oso";
            int max_intentos = 10;
            int intentos = 0;
            boolean acierto = false;

            // Arreglos
            char [] letras_acertadas = new char [secret_word.length()];

            for (int i = 0; i < letras_acertadas.length; i++) {
                letras_acertadas[i] = '_';
            }
            
            while(!acierto && intentos < max_intentos){
            System.out.println("Palabra a adivinar: " + String.valueOf(letras_acertadas));
            System.out.println("Introduce una letra , por favor:");
            // charAt()devuelve solo la primer letra
            char letra = Character.toLowerCase(scan.next().charAt(0));

            boolean letra_correcta = false;
            for (int i = 0; i < secret_word.length(); i++) {
                if(secret_word.charAt(i)== letra){
                    letras_acertadas[i]=letra;
                    letra_correcta = true;
                }
            }
            if(!letra_correcta){
                intentos++;
                System.out.println("Letra incorrecta, te quedan: " + (max_intentos-intentos) + " intentos");
                
            }

            if(String.valueOf(letras_acertadas).equals (secret_word)){
                acierto=true;
                System.out.println("Adivinaste, la palabra era: " + secret_word);
                scan.close();
            }

            if (max_intentos == intentos){
                System.out.println("Perdiste, la palabra era: " + secret_word);
                scan.close();
            }
            }


    }
}
