//guilherme scher

#include <stdio.h>

//hj em dia nao precisa mais pq tem funcao alglib que faz derivada

//deriva
void derivada(int grau, int coef[], int resultado[], int *resultadog) {
    *resultadog = grau - 1;//tira 1 do grau
    
    for (int i = 1; i <= grau; i++) {//multiplica o coeficiente pelo grau
        resultado[i - 1] = coef[i] * i;
    }
    
    for (int i = grau; i <= 10; i++) {//bota o resto do vetor com 0
        resultado[i] = 0;
    }
}

void derivadaprod(int graup, int coefdop[], int grauq, int coefdoq[], int resultado[], int *resultadog) {
    int dp[11], dq[11];//vetor pras derivadas p q
    int graudp, graudq;
    derivada(graup, coefdop, dp, &graudp);
    derivada(grauq, coefdoq, dq, &graudq);
    *resultadog = graup + grauq;

    for (int i = 0; i <= 10; i++) {
        resultado[i] = 0;//inicia todo o vetor com 0
    }
    for (int i = 0; i <= graudp; i++) {
        for (int j = 0; j <= grauq; j++) {
            if (i + j <= 10) {
                resultado[i + j] += dp[i] * coefdoq[j];
            }
        }
    }
    for (int i = 0; i <= graup; i++) {
        for (int j = 0; j <= graudq; j++) {
            if (i + j <= 10) {
                resultado[i + j] += coefdop[i] * dq[j];
            }
        }
    }
}
void derivadadividir(int graup, int coefdop[], int grauq, int coefdoq[], int resultado[], int *resultadog) {
    int dp[11], dq[11];//vetor pras derivadas p q
    int graudp, graudq;
    derivada(graup, coefdop, dp, &graudp);
    derivada(grauq, coefdoq, dq, &graudq);
    *resultadog = graup + grauq - 1;

    for (int i = 0; i <= 10; i++) {
        resultado[i] = 0;//inicia todo o vetor com 0
    }

    for (int i = 0; i <= graudp; i++) {
        for (int j = 0; j <= grauq; j++) {
            if (i + j <= 10) {
                resultado[i + j] += dp[i] * coefdoq[j];
            }
        }
    }

    for (int i = 0; i <= graup; i++) {
        for (int j = 0; j <= graudq; j++) {
            if (i + j <= 10) {
                resultado[i + j] -= coefdop[i] * dq[j];
            }
        }
    }
}

int main() {
    int graup, grauq;
    int coefdop[11], coefdoq[11];
    int resultadoprod[11], resultadoquo[11];
    int resultadogprod, resultadogquo;
    printf("digite o grau do polinomio p: ");
    scanf("%d", &graup);
    printf("digite os coeficientes do polinomio p:\n");
    for (int i = 0; i <= graup; i++) {
        printf("coeficiente de x^%d: ", i);
        scanf("%d", &coefdop[i]);
    }

    printf("digite o grau do polinomio q: ");
    scanf("%d", &grauq);
    printf("digite os coeficientes do polinomio q (do termo independente até o de maior grau):\n");
    for (int i = 0; i <= grauq; i++) {
        printf("coeficiente de x^%d: ", i);
        scanf("%d", &coefdoq[i]);
    }

    derivadaprod(graup, coefdop, grauq, coefdoq, resultadoprod, &resultadogprod);
    printf("derivada do produto p * q: ");
    for (int i = resultadogprod; i >= 0; i--) {
        if (resultadoprod[i] != 0) {
            if (i < resultadogprod) printf(" + ");
            printf("%dx^%d", resultadoprod[i], i);
        }
    }
    printf("\n");

    derivadadividir(graup, coefdop, grauq, coefdoq, resultadoquo, &resultadogquo);
    printf("derivada do quociente p / q: ");
    for (int i = resultadogquo; i >= 0; i--) {
        if (resultadoquo[i] != 0) {
            if (i < resultadogquo) printf(" + ");//bota um + entre os termos
            printf("%dx^%d", resultadoquo[i], i);//mostra os termos
        }
    }
    printf("\n");

    return 0;
}
