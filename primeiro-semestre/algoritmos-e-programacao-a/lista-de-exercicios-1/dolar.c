#include <stdio.h>

int main()
{
    float reais, dolar;

    printf("Digite o valor em reais:");
    scanf("%f", &reais);

    dolar = reais / 4.98;

    printf("O valor em dolar e %f", dolar);

    return 0;
}
