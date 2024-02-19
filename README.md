# Calculadora de Média com Interface Gráfica (GUI)

## Visão Geral
Este código em Java implementa uma aplicação GUI simples para calcular a média de um número especificado de valores de entrada. O programa permite aos usuários inserir até 50 números e calcula sua média dinamicamente conforme o usuário insere cada número.

## Recursos
- Interface Gráfica do Usuário (GUI) implementada usando componentes Java Swing.
- Atualiza dinamicamente a média conforme os números são inseridos.
- Valida a entrada para garantir que consista apenas em números inteiros.
- Fornece feedback sobre o número de entradas restantes do limite máximo.
- Exibe a média final assim que o número máximo de entradas é atingido.

## Uso
1. **Interface de Entrada**:
   - Insira números inteiros no campo de texto fornecido.
   - Clique no botão "Add. próx número" para adicionar o número inserido para cálculo.
   - O programa atualiza dinamicamente o número restante de entradas do limite máximo.

2. **Saída**:
   - Quando o número máximo de entradas é alcançado, o programa calcula e exibe a média de todos os números de entrada.
   - A média é exibida em um rótulo abaixo da interface de entrada.

## Instalação
1. Certifique-se de ter o Kit de Desenvolvimento Java (JDK) instalado no seu sistema.
2. Copie o código Java fornecido para um arquivo chamado `Main.java`.
3. Compile o código usando o comando:
4. Execute o programa Java compilado usando o comando:


## Dependências
- Biblioteca Java Swing para componentes GUI.

## Observações
- Este programa limita o número de entradas a 50 para simplicidade. Você pode ajustar a variável `MAX_AMOUNT` para alterar esse limite.
- O layout da GUI é implementado usando posicionamento absoluto (`setLayout(null)`), o que pode não ser ideal para aplicativos mais complexos. Considere o uso de gerenciadores de layout para melhor responsividade e adaptabilidade.
- A validação de entrada garante que apenas valores inteiros sejam aceitos. Ajuste a lógica de validação conforme necessário para seus requisitos.

## Autor
Este código foi escrito por Gabriel Wisniewski e foi criado como atividade da Faculdade Descomplica.
