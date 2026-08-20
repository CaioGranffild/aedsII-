#include <stdio.h>
int somar(int a){
    if(a == 0) return 0;
    else return (a%10 + somar(a/10)); // chamada recursiva para somar os digitos do numero
}
int main(){
    int n;
    while(scanf("%d", &n) != EOF){ // ler o numero ate achar o vazio
        printf("%d\n", somar(n)); // chamar a funcao para somar os digitos
    }
}