#include <stdio.h>
//Guilherme Scher =)
int main() {
    int amostragem[10];
    float percentual[10];
    int total = 0;
    float media;
    int maiorquant = 0;
    
    printf("Digite as amostragens:\n");
    for (int i = 0; i < 10; i++) {
        scanf("%d", &amostragem[i]);
        total += amostragem[i];
    }
    
    printf("\nAmostragem\tPercentual\n");
    for (int i = 0; i < 10; i++) {
        percentual[i] = (float) amostragem[i] / total * 100;
        printf("%d\t\t%.2f%%\n", amostragem[i], percentual[i]);
        if (amostragem[i] > amostragem[maiorquant]) {
            maiorquant = i;
        }
    }
    
    media = (float) total / 10; //Declarei float pra dar certinho
    printf("\nMédia de valores das amostras: %.1f\n", media);
    
    printf("Maior quantidade de amostra: %d (%.1f%%)\n", amostragem[maiorquant], percentual[maiorquant]);
    
    printf("Amostras com quantidade acima da média:\n");
    for (int i = 0; i < 10; i++) {
        if (amostragem[i] > media) {
            printf("%d\n", amostragem[i]);
        }
    }
    
    return 0;
}
