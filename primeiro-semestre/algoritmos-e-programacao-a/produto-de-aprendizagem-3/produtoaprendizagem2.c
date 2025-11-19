#include <stdio.h>
#include <string.h>

#define TAMANHO_MAXIMO 100
//Guilherme Scher :)

int main() {
    char mensagem[TAMANHO_MAXIMO + 1];
    int troca;

    printf("Digite uma mensagem para cifrar (max %d caracteres): ", TAMANHO_MAXIMO);
    gets(mensagem);

    printf("Digite o número de troca (deslocamento à direita): ");
    scanf("%d", &troca);

    for (int i = 0; mensagem[i] != '\0'; ++i) {
        if (mensagem[i] >= 'A' && mensagem[i] <= 'Z') {
            mensagem[i] = ((mensagem[i] - 'A' + troca) % 26) + 'A';
        }
        else if (mensagem[i] >= 'a' && mensagem[i] <= 'z') {
            mensagem[i] = ((mensagem[i] - 'a' + troca) % 26) + 'a';
        }
    }

    puts("Mensagem cifrada:");
    puts(mensagem);

    return 0;
}
