import java.util.Scanner;
public class questao1{
    public static String CifradeCesar(String frase){ // 
        String cifra = ""; // string vazia para escrever a resposta 
        for(int i = 0; i < frase.length(); i++){ // forzinho para ler a frase toda e ir aplicando a cifra + 3 
            char caractere = frase.charAt(i);
            caractere+=3;
            cifra += caractere; // escrevendo a cifra na string da reposta
        }
        return cifra;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String frase = sc.nextLine(); 
        while(!(frase.length()==3 && frase.charAt(0)=='F' && frase.charAt(1)=='I' && frase.charAt(2)=='M')){ // enquanto a frase não for fim vai continuando
            String cifra = CifradeCesar(frase); // chama a função e guarda a reposta na string cifra
            System.out.println(cifra);  // printa a resposta e corre pro abraço
            frase=sc.nextLine();
        }
        sc.close();
    }
}
