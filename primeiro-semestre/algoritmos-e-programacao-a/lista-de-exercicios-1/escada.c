#include <stdio.h>
#include <math.h>

int main()
{
//Variaveis
float arvore, distancia, escada, x;

//Dados
printf("Informe a altura em que o gato esta posicionado:");
scanf("%f", &arvore);

printf("Informe a distancia do posicionamento da escada ate a arvore:");
scanf("%f", &distancia);

//Calculos
escada = (arvore * arvore) + (distancia * distancia);
x = sqrt(escada);

//Resumo
printf("O comprimento da escada e de %f", x);

return 0;
}
