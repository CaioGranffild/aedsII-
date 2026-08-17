
import java.util.Scanner;
public class questao1{
    public static String CifradeCesar(String frase){
        String cifra = "";
        for(int i = 0; i < frase.length(); i++){
            char caractere = frase.charAt(i);
            caractere+=3;
            cifra += caractere;
        }
        return cifra;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        while(!(frase.length()==3 && frase.charAt(0)=='F' && frase.charAt(1)=='I' && frase.charAt(2)=='M')){
            String cifra = CifradeCesar(frase);
            System.out.println(cifra);
            frase=sc.nextLine();
        }
        sc.close();
    }
}
