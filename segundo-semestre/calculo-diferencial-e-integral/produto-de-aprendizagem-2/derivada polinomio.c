//guilherme scher
#include <stdio.h>
//hoje em dia nao precisa mais porque tem a biblioteca alglib que pode derivar para você, mas como a prof pediu vou fazer com os metodos tradicionais
void derivar(int grau, int coef[], int derivada[], int *graumenos) {
    *graumenos = grau - 1;//tira 1 do expoente da potencia, pra ficar certo
    for (int i = 0; i < grau; i++) {
        derivada[i] = coef[i] * (grau - i);
    }
}

int main() {
    int grau;
    printf("digite o grau do polinomio: ");
    scanf("%d", &grau);
    int coef[grau + 1];
    int derivada[grau];
    int graumenos;
    printf("digite os coeficientes do polinomio começando pelo termo sem x:\n");
    for (int i = 0; i <= grau; i++) {
        if(i != 0){//pra nao exibir o x^0
            printf("x^%d: ", i);
        }
        scanf("%d", &coef[i]);
    }

    printf("o polinomio é: ");
    for (int i = grau; i >= 0; i--) {
        if (i == 0) {//esse daqui e pra caso seja o termo independente, pra nao imprimir o x elevado a 0
            printf("%d", coef[grau - i]);
        } else {
            printf("%dx^%d + ", coef[grau - i], i);
        }
    }
    printf("\n");
    derivar(grau, coef, derivada, &graumenos);
    printf("a derivada do polinomio é: ");
    for (int i = graumenos; i >= 0; i--) {
        if (i == 0) {//mesma coisa, pra nao imprimir o x elevado a 0
            printf("%d", derivada[graumenos - i]);
        } else {
            printf("%dx^%d + ", derivada[graumenos - i], i);
        }
    }
    printf("\n");

    return 0;
}
