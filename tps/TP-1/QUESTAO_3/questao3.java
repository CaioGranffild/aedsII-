import java.util.Scanner;

public class questao3 {

    public static boolean vogal(String frase){
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) != 'a' && frase.charAt(i) != 'e' && frase.charAt(i) != 'i' && frase.charAt(i) != 'o' && frase.charAt(i) != 'u' && frase.charAt(i) != 'A' && frase.charAt(i) != 'E' && frase.charAt(i) != 'I' && frase.charAt(i) != 'O' && frase.charAt(i) != 'U'){
                return false;
            } 
        }
        return true;
    }
    public static boolean consoante(String frase){
        for(int i = 0; i < frase.length(); i++){
            if((frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') || (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z')){
                if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u' || frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U'){
                    return false;
                }
            } 
            else return false; 
        }
        return true;
    }
    public static boolean inteiro(String frase){
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) < '0' || frase.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
    public static boolean real(String frase){
        int count = 0;
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == '.' || frase.charAt(i) == ','){
                count++;
            } else if(frase.charAt(i) < '0' || frase.charAt(i) > '9'){
                return false;
            }
        }
        if(count > 1){
            return false;
        } 
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        do{
            frase = sc.nextLine();
            if(!frase.equals("FIM")){
                if(vogal(frase)){
                    System.out.print("SIM ");
                } else {
                    System.out.print("NAO ");
                }
                if(consoante(frase)){
                    System.out.print("SIM ");
                } else {
                    System.out.print("NAO ");
                }
                if(inteiro(frase)){
                    System.out.print("SIM ");
                } else {
                    System.out.print("NAO ");
                }
                if(real(frase)){
                    System.out.println("SIM");
                } else {
                    System.out.println("NAO");
                }
            }
        } while(!frase.equals("FIM"));
        sc.close();
    }
}
