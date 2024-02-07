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
#### -> Definindo se a bebida terá gelo ou não: 
  + if - verifica se o caractere armazenado na variável gelo, convertido para maiúsculo, é igual a 'S'. Isso significa que o usuário indicou que deseja gelo em sua bebida.
  + else if - verifica se o caractere armazenado em gelo, convertido para maiúsculo, é igual a 'N'. Isso significa que o usuário indicou que não deseja gelo em sua bebida.
  + else - assume que o usuário deseja gelo, então bebida.setGelo(true); define que a bebida terá gelo.
#### -> Por último, é definida a quantidade de gelo, através do bebida.setQuantidadeGelo(0);

## Tamanho da bebida:
### Solicitação do tamanho da bebida e exibição das opções:
![image](https://github.com/GeovannaNicollyDev/abs-desafio-delivery/assets/129456783/1b7054fc-1f5b-4482-9821-d428b0b16c92)

#### -> O programa solicita ao usuário que escolha o tamanho da bebida. 
#### -> Dependendo da opção de bebida selecionada (opcaoBebida), são exibidas as opções de tamanho disponíveis. Se a opção de bebida for para Coca-Cola ou Guaraná, são exibidos os tamanhos "P", "M" e "G", caso contrário, são exibidos apenas os tamanhos "P" e "M".
#### -> Além disso, o programa configura o tipo de copo e, se necessário, a quantidade de gelo com base na opção de bebida e se o usuário deseja gelo.

### Leitura e validação do tamanho da bebida:
![image](https://github.com/GeovannaNicollyDev/abs-desafio-delivery/assets/129456783/4da7fc10-cb41-41ff-aa22-8ee12379f9fc)

#### -> O programa lê a entrada do usuário para o tamanho da bebida e armazena o primeiro caractere digitado na variável tamanhoBebida.
#### -> O loop while é utilizado para validar se a entrada do usuário é uma opção válida de tamanho ("P", "M" ou "G"). Enquanto a entrada não for válida, o programa solicita que o usuário digite novamente.
#### -> O método Character.toUpperCase() é usado para garantir que tanto letras maiúsculas quanto minúsculas sejam tratadas como válidas.

### Atribuição do tamanho selecionado à bebida: 
![image](https://github.com/GeovannaNicollyDev/abs-desafio-delivery/assets/129456783/67d9a6a9-703e-44f3-8486-902998bf3d08)

#### -> É utilizado um switch para determinar qual tamanho foi selecionado pelo usuário com base na entrada armazenada em tamanhoBebida.
#### -> Em seguida, o programa atribui esse tamanho à bebida utilizando o método setTamanho() do objeto bebida.

### Pedido TakeOut ou EatIn:
![image](https://github.com/GeovannaNicollyDev/abs-desafio-delivery/assets/129456783/fb0658f7-72aa-4e95-872d-5e73f13a1ed1)

#### -> Esse trecho de código permite que o usuário escolha se deseja embalar o pedido para viagem ou não e, com base nessa escolha, define a propriedade tampa da bebida. 
#### -> Em seguida, ele imprime as informações atualizadas sobre o pedido.
  #### Exibição da pergunta ao usuário:
  + O programa exibe uma mensagem perguntando ao usuário se deseja que o pedido seja embalado para viagem, oferecendo as opções "S" para SIM e "N" para NÃO.
  #### Leitura da resposta do usuário:
   + O programa lê a entrada do usuário utilizando o método next() da classe Scanner e armazena o primeiro caractere digitado na variável isViagem.
  #### Switch para tratar a resposta:
  + Um switch é utilizado para determinar a ação a ser tomada com base na resposta do usuário, convertendo o caractere para maiúsculo com Character.toUpperCase(isViagem).
  + Se o usuário selecionar "S", indicando que deseja embalagem para viagem, a bebida é marcada com a opção TakeOutEatIn.TAKE_OUT (para viagem).
  + Se o usuário selecionar "N", indicando que não deseja embalagem para viagem, a bebida é marcada com a opção TakeOutEatIn.EAT_IN (para consumo no local).
  #### Impressão das informações do pedido:
  + Após a escolha do usuário, o programa imprime as informações sobre a bebida, que provavelmente incluem o tipo de bebida, presença de gelo, tamanho e se o pedido será para viagem ou não.

































