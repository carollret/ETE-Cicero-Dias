//Elabore um algoritmo que estime a quantidade de caixas de cerâmicas necessárias para revestir um piso de 10x15m. Cada caixa cobre uma área de 2,20m². Imprima na tela a estimativa da quantidade de caixas necessárias. 

var entrada = require("readline-sync");
var raio = parseFloat(entrada.question("Digite o valor do raio: "));
var pi = 3.14;
console.log(`A área da circunferência é ${(raio*raio)*pi}`)
