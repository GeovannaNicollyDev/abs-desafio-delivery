# Desafio ABS delivery: 🥤
#### O desafio consiste em desenvolver um sistema de bebidas automatizados, onde nesse sistema, um comando é enviado ao ABS que irá preparar a bebida de acordo com algumas regras, sendo elas:

  -> O ABS possui 4 sabores de bebida, sendo 2 refrigerantes (Coca e Guaraná) e 2 sucos (Uva e Laranjas);
  
  -> Os refrigerantes são servidos em copos de papel, enquanto os sucos são servidos em copos de plásticos;
  
  -> Os refrigerantes recebem 6 pedras de gelo, enquanto os sucos recebem 12 pedras. há também a opção de servir sem gelo;
  
  -> Os refrigerantes têm 3 tamanhos disponíveis (300ml, 500ml e 700ml), enquanto os sucos só 2 opções (300ml e 500ml);
  
  -> Ao final, pedidos do tipo "Take Out" (Delivery), recebm uma tampa sem furo, enquanto os pedidos do tipo "Eat In" (Comer no próprio restaurante) recebm uma tampa com furo para o canudo. 

# Tecnologias Utilizadas: 🛠️
#### IDE de desenvolvimento: Eclipse
#### Linguagem utilizada: JAVA

# Classe Main e principais atribuições: ⭐
## Escolher bebida:
![image](https://github.com/GeovannaNicollyDev/abs-desafio-delivery/assets/129456783/9b526924-ccc3-4840-b4f0-ab50708ab236)

#### -> Criação de um objeto bebida, que serve como uma estrutura de dados para armazenar e manipular todas as informações relacionadas ao pedido de bebida feito pelo usuário dentro do sistema.
#### -> O programa pergunta ao usuário qual bebida ele deseja escolher.
#### -> O usuário entra com o número correspondente à bebida desejada através do "int opcaoBebida"

## Loop de validação da opção da bebida:
![image](https://github.com/GeovannaNicollyDev/abs-desafio-delivery/assets/129456783/8ed93b79-8f64-40df-a38d-ef10ab227873)

#### -> Este trecho de código tem a finalidade de garantir que o usuário insira uma opção válida de bebida.
#### -> Garante que o programa só avance após receber uma entrada válida do usuário, garantindo que o pedido da bebida seja feito com sucesso e evitando erros relacionados a opções inválidas.

## Switch para atribuir a bebida selecionada:
![image](https://github.com/GeovannaNicollyDev/abs-desafio-delivery/assets/129456783/1a7279e5-d504-413b-978f-341e2fd7aad9)

#### -> Este trecho de código utiliza a estrutura de controle switch para determinar qual bebida foi escolhida pelo usuário e então atribuir essa bebida ao objeto bebida.
#### -> O switch determina a bebida escolhida pelo usuário com base no valor de opcaoBebida e então atribui essa bebida ao objeto bebida, utilizando o método setBebidas().

## Escolher gelo:
![image](https://github.com/GeovannaNicollyDev/abs-desafio-delivery/assets/129456783/ac101ee6-3b59-47f1-9339-6f710f0cef16)

#### -> O programa pergunta ao usuário se ele deseja gelo em sua bebida.
#### -> O usuário fornece uma entrada para indicar se quer gelo ou não (char gelo). O tipo de dado char foi usado para armazenar as respostas do usuário para as perguntas sobre gelo, tamanho da bebida e embalagem para viagem. 
#### -> O loop while garante que a entrada do usuário seja válida (ou seja, 'S' ou 'N'). Este while garante que o programa só avance após receber uma entrada válida do usuário para indicar se deseja ou não gelo em sua bebida, evitando erros relacionados a respostas inválidas.
#### -> Definindo se a bebida terá gelo ou não: if - verifica se o caractere armazenado na variável gelo, convertido para maiúsculo, é igual a 'S'. Isso significa que o usuário indicou que deseja gelo em sua bebida. / else if - verifica se o caractere armazenado em gelo, convertido para maiúsculo, é igual a 'N'. Isso significa que o usuário indicou que não deseja gelo em sua bebida. / else - assume que o usuário deseja gelo, então bebida.setGelo(true); define que a bebida terá gelo.
#### -> Por último, é definida a quantidade de gelo, através do setQuantidadeGelo(0);

## Tamanho da bebida:























