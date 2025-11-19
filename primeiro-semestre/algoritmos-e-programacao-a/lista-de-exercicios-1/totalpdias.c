#include <stdio.h>

int main() {
    int anos, meses, dias, idadeEmDias;

    printf("Digite a idade em anos, meses e dias:\n");
    scanf("%d %d %d", &anos, &meses, &dias);

    // Cálculos
    idadeEmDias = (anos * 365) + (meses * 30) + dias;

    printf("A idade da pessoa em dias eh: %d\n", idadeEmDias);

    return 0;
}
