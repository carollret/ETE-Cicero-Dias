// Escreva um algoritmo que solicite ao usuário as notas de 3 disciplinas. Em seguida, exiba a média das notas. 

var entrada = require("readline-sync");
var n1 = parseFloat(entrada.question("Digite a primeira nota: "))
var n2 = parseFloat(entrada.question("Digite a segunda  nota: "))
var n3 = parseFloat(entrada.question("Digite a terceira nota: "))
var media = ((n1+n2+n3)/3).toFixed(1);
console.log(`Sua média é: ${media}`)