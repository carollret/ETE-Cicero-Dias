//Elabore um algoritmo que estime a quantidade de caixas de cerâmicas necessárias para revestir um piso de 10x15m. Cada caixa cobre uma área de 2,20m². Imprima na tela a estimativa da quantidade de caixas necessárias.

var entrada = require("readline-sync");
var areaPiso = 10*15;
var revestimento =  2.20;
console.log(`A quantidade necessária é ${((areaPiso/revestimento)+1).toFixed(0)}. `)