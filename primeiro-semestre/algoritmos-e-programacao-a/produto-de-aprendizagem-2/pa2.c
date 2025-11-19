#include <stdio.h>
//Guilherme Scher =)
int main() {
    int grenal;
    int gremiovitoria = 0;
    int intervitoria = 0;
    int empates = 0;
    int golgremio, golinter;
    int maisgols = 0;
    int partidamaisgols[50] = {0}; //Declarei o array todo como 0 pra não dar erro

    for (grenal = 0; grenal < 50; grenal++) {
        printf("Digite o número de gols marcados pelo Grêmio: ");
        scanf("%d", &golgremio);
        printf("Digite o número de gols marcados pelo Internacional: ");
        scanf("%d", &golinter);

        if (golgremio > golinter) {
            printf("Grêmio venceu!\n");
            gremiovitoria++;
        } else if (golinter > golgremio) {
            printf("Internacional venceu!\n");
            intervitoria++;
        } else {
            printf("Empate!\n");
            empates++;
        }

        if (golgremio + golinter > maisgols) {
            maisgols = golgremio + golinter;
            partidamaisgols[0] = grenal + 1;
            for (int i = 1; i < 50; i++) {
                partidamaisgols[i] = 0;
            }
        } else if (golgremio + golinter == maisgols) {
            partidamaisgols[grenal] = grenal + 1;
        }

        int novo_grenal;
        printf("Novo Grenal (1. Sim 2. Não)? ");
        scanf("%d", &novo_grenal);

        if (novo_grenal == 2) {
            break;
        }
    }

    printf("Total de Grenais: %d\n", grenal);
    printf("Vitórias do Grêmio: %d\n", gremiovitoria);
    printf("Vitórias do Internacional: %d\n", intervitoria);
    printf("Empates: %d\n", empates);

    if (gremiovitoria > intervitoria) {
        printf("Grêmio venceu mais Grenais.\n");
    } else if (intervitoria > gremiovitoria) {
        printf("Internacional venceu mais Grenais.\n");
    } else {
        printf("Não houve vencedor.\n");
    }

    printf("Partida(s) com maior quantidade de gols:\n");
    for (int i = 0; i < 50; i++) {
        if (partidamaisgols[i] != 0) {
            printf("Partida %d\n", partidamaisgols[i]);
        }
    }

    return 0;
}
