//guilherme scher
#include <stdio.h>
#include <locale.h>
#include <string.h>

typedef struct {
    int codigo, diaNasc, mesNasc, anoNasc;
    char nome[50], nomeMae[50], nomePai[50];
    int diaUltima, mesUltima, anoUltima;
    float peso, altura, valorPago;
    char prescricao[100];
} DadosPaciente;

DadosPaciente paciente[100];
int i = 0;

void cadastrarPaciente() {
    while (1) {//while true pra ficar rodando ate o usuario querer parar
        printf("Digite o código do paciente: ");

        scanf("%d", &paciente[i].codigo);

        printf("Digite a data de nascimento do paciente conforme o exemplo (29 12 2005): ");

        scanf("%d %d %d", &paciente[i].diaNasc, &paciente[i].mesNasc, &paciente[i].anoNasc);
        getchar(); //botei pra limpar o buffer

        printf("Digite o nome do paciente: ");

        fgets(paciente[i].nome, 50, stdin);

        printf("Digite o nome da mãe do paciente: ");

        fgets(paciente[i].nomeMae, 50, stdin);

        printf("Digite o nome do pai do paciente: ");
        
        fgets(paciente[i].nomePai, 50, stdin);
        
        i++;
        char continuar;
        printf("Deseja cadastrar outro paciente? (s/n): ");
        scanf(" %c", &continuar);
        if (continuar != 's' && continuar != 'S') {
            break;
        }
    }
}

int buscarPaciente(int codigo, char nome[]) {
    for (int j = 0; j < i; j++) {
        if (paciente[j].codigo == codigo || strcmp(paciente[j].nome, nome) == 0) {
            return j;//acha o indice do paciente
        }
    }
    return -1;//botei valor negativo que dai nao tem chance de existir o indice pro if
}

void registrarConsulta() {
    int codigoR;
    char nome[50];
    
    printf("Digite o código ou o nome do paciente que deseja registrar consulta: ");
    if (scanf("%d", &codigoR) == 1) {
        int indice = buscarPaciente(codigoR, "");
        if (indice == -1) {
            printf("Paciente não encontrado.\n");
            return;
        }
        printf("Digite a data da última consulta do paciente conforme o exemplo (29 12 2005): ");

        scanf("%d %d %d", &paciente[indice].diaUltima, &paciente[indice].mesUltima, &paciente[indice].anoUltima);

        printf("Digite o peso do paciente na última consulta (em kg): ");

        scanf("%f", &paciente[indice].peso);

        printf("Digite a altura do paciente na última consulta (em cm): ");

        scanf("%f", &paciente[indice].altura);

        getchar();//limpar de novo

        printf("Digite a prescrição: ");
        
        fgets(paciente[indice].prescricao, 100, stdin);

        printf("Digite o valor pago pelo paciente na última consulta: ");

        scanf("%f", &paciente[indice].valorPago);

    } else {
        scanf("%s", nome);
        int indice = buscarPaciente(-1, nome);
        if (indice == -1) {
            printf("Paciente não encontrado.\n");
            return;
        }
        
        printf("Digite a data da última consulta do paciente conforme o exemplo (29 12 2005): ");

        scanf("%d %d %d", &paciente[indice].diaUltima, &paciente[indice].mesUltima, &paciente[indice].anoUltima);

        printf("Digite o peso do paciente na última consulta (em kg): ");

        scanf("%f", &paciente[indice].peso);

        printf("Digite a altura do paciente na última consulta (em cm): ");

        scanf("%f", &paciente[indice].altura);
        getchar(); //limpar de novo

        printf("Digite a prescrição: ");

        fgets(paciente[indice].prescricao, 100, stdin);

        printf("Digite o valor pago pelo paciente na última consulta: ");

        scanf("%f", &paciente[indice].valorPago);
    }
}

void visualizarPrescricao() {
    int codigoR;
    char nome[50];

    printf("Digite o código ou o nome do paciente para visualizar a prescrição: ");
    if (scanf("%d", &codigoR) == 1) {
        int indice = buscarPaciente(codigoR, "");
        if (indice == -1) {
            printf("Paciente não encontrado.\n");
            return;
        }
        
        printf("Código: %d\nNome: %s\n", paciente[indice].codigo, paciente[indice].nome);
        printf("Data da última consulta: %02d/%02d/%d\n", paciente[indice].diaUltima, paciente[indice].mesUltima, paciente[indice].anoUltima);
        // calcular a idade do paciente
        int idadeAnos = 2024 - paciente[indice].anoNasc;
        printf("Idade: %d anos\n", idadeAnos);
        printf("Peso: %.2f Kg\nAltura: %.2f cm\n", paciente[indice].peso, paciente[indice].altura);
        printf("Prescrição: %s\n", paciente[indice].prescricao);
        printf("Valor Pago: R$ %.2f\n", paciente[indice].valorPago);
    } else {
        scanf("%s", nome);
        int indice = buscarPaciente(-1, nome);
        if (indice == -1) {
            printf("Paciente não encontrado.\n");
            return;
        }
        
        printf("Código: %d\nNome: %s\n", paciente[indice].codigo, paciente[indice].nome);
        printf("Data da última consulta: %02d/%02d/%d\n", paciente[indice].diaUltima, paciente[indice].mesUltima, paciente[indice].anoUltima);
        // calcular a idade do paciente
        int idadeAnos = 2024 - paciente[indice].anoNasc;
        printf("Idade: %d anos\n", idadeAnos);
        printf("Peso: %.2f Kg\nAltura: %.2f cm\n", paciente[indice].peso, paciente[indice].altura);
        printf("Prescrição: %s\n", paciente[indice].prescricao);
        printf("Valor Pago: R$ %.2f\n", paciente[indice].valorPago);
    }
}

void listarPacientes() {
    printf("Listagem de Pacientes:\n");
    for (int j = 0; j < i; j++) {
        printf("Código: %d\nNome: %s\nData de Nascimento: %02d/%02d/%d\n", paciente[j].codigo, paciente[j].nome, paciente[j].diaNasc, paciente[j].mesNasc, paciente[j].anoNasc);
        printf("Data da Última Consulta: %02d/%02d/%d\n", paciente[j].diaUltima, paciente[j].mesUltima, paciente[j].anoUltima);
        printf("Peso: %.2f Kg\nAltura: %.2f cm\n\n", paciente[j].peso, paciente[j].altura);
    }
}

void valorTotalRecebido() {
    int mes, ano;
    float total = 0;

    printf("Informe o mês e o ano para calcular o total recebido: ");
    scanf("%d %d", &mes, &ano);
    
    for (int j = 0; j < i; j++) {
        if (paciente[j].mesUltima == mes && paciente[j].anoUltima == ano) {
            total += paciente[j].valorPago;
        }
    }

    printf("Valor total recebido em %02d/%d: R$ %.2f\n", mes, ano, total);
}

int main() {
    setlocale(LC_ALL, "portuguese");
    char opcao;

    while (1) {
        printf("Consultório pediátrico - Controle de Pacientes\n");
        printf("\nMenu de opções:\nA) Cadastrar Paciente\nB) Registrar Consulta\nC) Visualizar Prescrição\nD) Listar Pacientes\nE) Valor total recebido no mês\nF) Finalizar\n");
        printf("Escolha uma opção: ");
        scanf(" %c", &opcao);

        switch (opcao) {
            case 'a':
            case 'A':
                cadastrarPaciente();
                break;
            case 'b':
            case 'B':
                registrarConsulta();
                break;
            case 'c':
            case 'C':
                visualizarPrescricao();
                break;
            case 'd':
            case 'D':
                listarPacientes();
                break;
            case 'e':
            case 'E':
                valorTotalRecebido();
                break;
            case 'f':
            case 'F':
                printf("Programa finalizado.\n");
                return 0;
            default:
                printf("Opção inválida. Tente novamente.\n");
        }
    }
    return 0;
}