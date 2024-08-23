// Elabore um algoritmo que receba dois números, e retorne ao usuário a soma desses dois números. 

var entrada = require("readline-sync");
var nota1 = parseInt(entrada.question("Digite o primeiro numero: "));
var nota2 = parseInt(entrada.question("Digite o segundo  numero: "));
console.log(`A soma dos números é ${nota1+nota2} `);