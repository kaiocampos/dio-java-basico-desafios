# Desafio Conta Banco Terminal

Instruções apresentadas sobre o Desafio DIO de Java Básico disponível no link [DIO - Trilha Java Básico](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe)

## O que fazer

Criar um programa Java que utilizando os recursos de interface do terminal, solicite a digitação de dados como: Nome do Cliente, Número da Agência, Número da Conta e Valor do Saldo para exibir uma mensagem no final da interação.

## Regras básicas

1. Criar e Clonar o repositório

> link do repositório
[dio-desafio-conta-banco](https://github.com/kaiocampos/dio-java-basico-desafios)

2. Seguir as regras de nome do 'projeto' e 'classe':

- `conta-banco`: nome do projeto, nome do diretório do projeto
- `ContaTerminal`: nome da classe principal

4. Seguir as regras de 'atributos', 'tipos' e exemplo sugeridos:

| Atributo      | Tipo    | Exemplo       |
|-------------- |-------- |-------------- |
| Numero        | Inteiro | 1021          |
| Agencia       | Texto   | 067-8         |
| Nome Cliente  | Texto   | MARIO ANDRADE |
| Saldo         | Decimal | 237.48        |

5. Como criei os atributos e declarei os tipos:

| Nome que usei | Tipo declarado  |
|-------------- |-----------------|
| numeroConta   | int             |
| agencia       | String          |
| nomeCliente   | String          |
| saldo         | float           |

## Resposta para o usuário

Conforme as instruções, temos que solicitar para o usuário que digite no terminal os dados com as seguintes interações, sugeridas:

> Programa: "Por favor, digite o número da Agência !"
> Usuário: 1021 (depois ENTER para o próximo campo)

Salvar todas as informações que forem inseridas e por fim exibir a seguinte mensagem:

> "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

## Código completo

~~~java
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Criar um objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir mensagem de interação e ler o dado digitado
        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

    }
}
~~~
