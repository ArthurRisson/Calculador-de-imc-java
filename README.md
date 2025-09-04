# Calculadora de IMC (Índice de Massa Corporal)

Este projeto em Java calcula o IMC (Índice de Massa Corporal) de uma pessoa com base em sua altura, peso e gênero.
O programa solicita os dados do usuário via teclado e retorna a classificação do IMC de acordo com tabelas distintas para homens e mulheres.

# Integrante
Arthur Risson
RA:1138099
#  Funcionalidades

Solicita ao usuário:

Nome

Altura (em metros)

Peso (em kg)

Gênero (M para masculino, F para feminino, N para não-binário)

Calcula o IMC usando a fórmula:

IMC = peso / (altura²)


Classifica o resultado em faixas, de acordo com o gênero informado:

Masculino (M/m)

< 20 → Abaixo do normal

20 – 24.9 → Normal

25 – 29.9 → Obesidade leve

30 – 39.9 → Obesidade

≥ 40 → Obesidade mórbida

Feminino/Não-binário (F/f/N/n)

< 19 → Abaixo do normal

19 – 23.9 → Normal

24 – 28.9 → Obesidade leve

29 – 38.9 → Obesidade

≥ 39 → Obesidade mórbida

Exibe o IMC calculado juntamente com a classificação

# Exemplo de Execução
Digite seu nome:
Maria
Qual a sua altura em metros: 1.65
Qual a seu peso em kilos: 68
Qual o seu genero:
F
Normal
Maria Seu IMC é: 24.977043158861342
