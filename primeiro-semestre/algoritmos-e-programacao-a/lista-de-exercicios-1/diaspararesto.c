#include <stdio.h>

int main() {
    int dias, anos, meses, diasrestantes;


    printf("Digite o número de dias: ");
    scanf("%d", &dias);

    anos = dias / 365;
    diasrestantes = dias % 365;
    meses = diasrestantes / 30;
    diasrestantes = diasrestantes % 30;

    printf("Anos: %d\n", anos);
    printf("Meses: %d\n", meses);
    printf("Dias: %d\n", diasrestantes);

    return 0;
}
