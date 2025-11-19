#include <stdio.h>
#include <stdlib.h>
#include <time.h>
//Guilherme Scher :)

int main() {
    int n;

    while (1) {
        printf("Digite o tamanho N das matrizes (N <= 10): ");
        scanf("%d", &n);

        if (n >= 1 && n <= 10)
            break;
        else
            printf("Tamanho inválido. Digite novamente.\n");
    }

    int a[n][n], b[n][n], c[n][n], d[n][n];
    int v[n], e[n];

    srand(time(NULL));

    printf("\nMatriz A:\n");
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            a[i][j] = rand() % 10 + 1;
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }

    printf("\nMatriz B:\n");
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            b[i][j] = rand() % 10 + 1;
            printf("%d ", b[i][j]);
        }
        printf("\n");
    }

    char opcao;
    printf("\nMenu de Opções:\n");
    printf("a) Somar as matrizes A e B\n");
    printf("b) Encontrar o maior elemento da matriz A\n");
    printf("c) Encontrar o menor elemento da matriz A\n");
    printf("d) Multiplicar a matriz A por um número k\n");
    printf("e) Multiplicar a matriz A por um vetor V\n");
    printf("Escolha uma opção (a-e): ");
    scanf(" %c", &opcao);

    switch (opcao) {
        case 'a':
            printf("\nResultado da soma A + B:\n");
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    c[i][j] = a[i][j] + b[i][j];
                    printf("%d ", c[i][j]);
                }
                printf("\n");
            }
            break;
        case 'b':
            int maior = a[0][0];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (a[i][j] > maior) {
                        maior = a[i][j];
                    }
                }
            }
            printf("\nMaior elemento da matriz A: %d\n", maior);
            break;
        case 'c':
            int menor = a[0][0];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (a[i][j] < menor) {
                        menor = a[i][j];
                    }
                }
            }
            printf("\nMenor elemento da matriz A: %d\n", menor);
            break;
        case 'd':
            int k;
            printf("Digite o valor de k: ");
            scanf("%d", &k);
            printf("\nResultado da multiplicação k * A:\n");
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    d[i][j] = k * a[i][j];
                    printf("%d ", d[i][j]);
                }
                printf("\n");
            }
            break;
        case 'e':
            printf("Digite os elementos do vetor V (tamanho %d):\n", n);
            for (int i = 0; i < n; ++i) {
                scanf("%d", &v[i]);
            }
            printf("\nResultado da multiplicação V * A:\n");
            for (int i = 0; i < n; ++i) {
                e[i] = 0;
                for (int j = 0; j < n; ++j) {
                    e[i] += v[j] * a[j][i];
                }
                printf("%d ", e[i]);
            }
            printf("\n");
            break;
        default:
            printf("Opção inválida.\n");
    }

    return 0;
}
