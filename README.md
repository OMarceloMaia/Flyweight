# Padrões de Projeto – Flyweight
 
## Motivação .:
 
*Flyweight é um padrão de projeto estrutural que tem a intenção de usar compartilhamento de dados afim de reduzir a quantidade de recursos consumidos.*
Também é um padrão de otimização, então é preciso atentar para não adicionar complexidade desnecessária no seu sistema, caso o mesmo não tenha o problema a ser resolvido.
 
---
Este padrão visa dividir um objeto em dois estados: o intrínseco e o extrínseco.
 
O estado **intrínseco** de um objeto é a parte que nunca muda ou muda poucas vezes dentro do sistema. No caso do modelo implementado, esse refere-se à “marca” e “categoria”.
Enquanto o estado **extrínseco**, refere-se aos dados que estão constantemente variando. No nosso caso: O “nome” do produto e a quantidade (“qtd”). Esses valores podem ser movidos para fora do objeto a fim de liberar a memória que podem consumir.
 
**Observação:** O exemplo implementado é uma aplicação fictícia e específica, apenas para facilitar o entendimento do padrão. Cada caso precisará ser analisado individualmente.
 
Resumindo a solução que o Flyweight entrega: 
- O estado do objeto é separado em **intrínseco** e **extrínseco**
- O estado **intrínseco** é mantido dentro do objeto de forma imutável (geralmente configurado uma vez pelo construtor), já que ele será compartilhado com outros objetos.
- Quando necessário, o restante dos dados (o estado **extrínseco**) é recebido no método que precisar desses dados.
- Para evitar a duplicação de objetos flyweight, é utilizada uma fábrica, que verifica se um flyweight precisa ser criado ou se foi criado anteriormente, por meio de um Id, que é gerado de acordo com os parâmetros do objeto. é Recomendado que se use somente a fábrica para criar novos flyweights ou obter flyweights já criados. 
 
Apesar de intuitivo, o padrão gera bastante complexidade no sistema, por isso é necessário analisar com cuidado essa situação. Ao separar o estado de um objeto, precisaremos de uma forma de unir esses dados novamente no momento do uso. Isso deve ser feito no contexto que o cliente estiver, ou seja, pode ser gerenciado pelo próprio código cliente da maneira que preferir.
 
 
---
 

## Implementação e Estrutura


 Todo o código foi separado em Quatro classes Java + Uma Interface +  Uma Classe Main Para Testes.

 Na classe ProductContext, utilizamos um contexto para unir os dois estados do objeto, o intrínseco e o extrínseco, por meio de uma função, que por sua vez se utiliza da fábrica.

 Na classe ProductData, nós definimos um “tipo” de dado, que contém os dados Intrínsecos e protocolos que precisamos reutilizar em outros locais, afim de obtê-los. 

Na classe ProductFactory, implementamos o gerenciador das flyweights a serem criadas/ checadas se existentes (são criadas caso recebam uma nova combinação de parâmetros definidos, ou retornam um objeto existente caso não.) essa classe também se utiliza da estrutura de HashMap, no nosso caso, para realizar tal checagem.

A Interface ProductFlyweight é responsável por padronizar todos os flyweights e definir quais são os parâmetros de estado extrínsecos a serem recebidos pelo método implementado dentro da interface. 

Na classe ProductIntrinsic, é onde o Flyweight é de fato criado, onde a interface é implementada e o seu método utilizado, com a passagem dos parâmetros. No construtor dessa classe, criamos o estado intrínseco, que deve ser compartilhado porém inalterável e que é do tipo criado na classe ProductData. 


*Todo o processo foi feito em call com todos os integrantes do grupo.*
