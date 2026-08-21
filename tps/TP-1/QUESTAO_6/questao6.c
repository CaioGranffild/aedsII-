#include <stdio.h>
#include <stdbool.h>
char minusculo(char c){
    if(c >= 'A' && c <= 'Z'){ // se a letra for maiscula vai virar minuscula
        return c + 32; // num de dif na tabela ascii 
    }
    return c; // senao ela é minuscula msm
}
bool anagrama(char *string1, char *string2){
    int i = 0, j = 0;
    while(string1[i] != '\0'){ // contador 1 
        i++; 
    }
    while(string2[j] != '\0'){ // contador 2
        j++; 
    }
    if(i != j) return false; // se o tam for diferente retorna falso 
    int inicio = 0;
    for(int i = 0; string1[i] != '\0'; i++){ 
        int j = inicio;
        while(string2[j] != '\0' && minusculo(string2[j]) != minusculo(string1[i])){ // procura ate a letra for igual a letra da str1 
            j++;  // usamos a funcao minuscula pra fazer todas as letras virarem minuscula pra comparar, senao ia dar erro. (deu trabalho)
        }
        if(string2[j] == '\0'){ // se nao achar a letra retorna falso
            return false;
        }
        char temp = string2[j]; 
        string2[j] = string2[inicio];   // swap classico
        string2[inicio] = temp;
        inicio++; // add +1 no inicio pra nao ter que voltar no mesmo indice 
    }
    return true; // se passar por tudo = true 
}
int main(){
    char string1[100], string2[100];
    while(scanf("%s %s", string1, string2) != EOF && !(string1[0] == 'F' && string1[1] == 'I' && string1[2] =='M' && string1[3] == '\0')){ // enquanto o scan nao for FIM, continua rodando
        if(anagrama(string1, string2)){
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
    }
    return 0;
}