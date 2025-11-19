#include <stdio.h>
int main()
{
//Variaveis
float agua, luz, telefone, condominio, mensalidade, saude, alimentacao, vestuario, transporte, seguranca, salariop, salariom, rt, dt, sf;

//Comandos
printf("Informe o valor da conta de agua:");
scanf("%f", &agua);

printf("Informe o valor da conta de luz:");
scanf("%f", &luz);

printf("Informe o valor da conta de telefone:");
scanf("%f", &telefone);

printf("Informe o valor do condominio:");
scanf("%f", &condominio);

printf("Informe o valor da mensalidade:");
scanf("%f", &mensalidade);

printf("Informe o valor dos gastos com saude:");
scanf("%f", &saude);

printf("Informe o valor dos gastos com alimentacao:");
scanf("%f", &alimentacao);

printf("Informe o valor dos gastos com vestuario:");
scanf("%f", &vestuario);

printf("Informe o valor dos gastos com transporte:");
scanf("%f", &transporte);

printf("Informe o valor dos gastos com seguranca:");
scanf("%f", &seguranca);

printf("Informe o salario do pai:");
scanf("%f", &salariop);

printf("Informe o salario da mae:");
scanf("%f", &salariom);

//Calculos
dt = agua + luz + telefone + condominio + mensalidade + saude + alimentacao + vestuario + transporte + seguranca;
rt = salariop + salariom;
sf = rt - dt;

//Resumo
printf("A despesa total e de %f, a renda total e de %f e o saldo final e de %f", dt, rt, sf);

return 0;
}
