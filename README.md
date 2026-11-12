# 🏛️ Mini Banco ![Java](https://img.shields.io/badge/JAVA-24-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Projeto de estudo em Java desenvolvido para praticar orientação a objetos: abstração, encapsulamento e composição. O programa simula uma conta bancária simples, operada por um menu interativo no terminal.

## ✨ Funcionalidades:

* **Consultar saldo:** Visualização rápida do valor disponível em conta.
* **Depositar:** Adição de fundos ao saldo atual.
* **Sacar:** Retirada de valores da conta.
* **Validação das operações:** Valores menores ou iguais a zero são recusados. O saque não pode ser maior que o saldo disponível (o saldo nunca fica negativo).

## 🧠 Conceitos Praticados:

* **Abstração:** A conta expõe apenas o que importa (`deposit`, `withdraw`, `showCurrentBalance`).
* **Encapsulamento:** Todos os atributos são `private`, não existe setter para o saldo, e o saldo só muda pelas regras da própria classe. Nome e número da conta são `final`.
* **Composição:** Um `Client` tem uma `Account`.
* **Lógica e Interação:** Uso de `Scanner` e `while` para montar um menu interativo no console.

## 📁 Estrutura do Projeto:

* **`Account.java`**: Guarda o saldo e as regras de depósito e saque.
* **`Client.java`**: Guarda nome, CPF e a conta do cliente.
* **`Main.java`**: Menu no terminal (interação com o usuário).

## 🚀 Como Executar o Projeto

1. Baixe ou clone este repositório.
2. Abra o projeto na sua IDE de preferência (IntelliJ IDEA, VS Code, Eclipse, etc.).
3. Certifique-se de ter o **JDK 24** (ou superior) instalado e execute a classe `Main`.

## 💻 Exemplo de Uso


```text
Which transaction would you like to perform?
1 - Show balance
2 - Deposit
3 - Withdraw
4 - exit
2
What amount would you like to deposit?
100
Deposit with the value: 100.0 completed!
Your current balance is: 100.0

```

🎯 Próximos Passos:

[ ] Histórico de transações (com ArrayList)

[ ] Tratamento de entradas inválidas com exceções

[ ] Suporte a mais de um cliente no menu


👨‍💻 Autor
Feito por David Dos Santos como projeto de estudo.



