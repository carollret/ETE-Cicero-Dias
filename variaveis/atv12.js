// Elabore um algoritmo que retorne o valor correspondente a 75% do número digitado pelo usuário.

var entrada = require("readline-sync");
var num = parseFloat(entrada.question("Digite um numero: "));
var valor = num * 0.75;
console.log(`O restante é ${valor}`)