// Desenvolva um algoritmo que solicite ao usuário seu nome. Em seguida, imprima na tela uma mensagem de boas vindas ao usuário. 

var entrada = require("readline-sync");
var nome = entrada.question("Digite seu nome: ");
console.log(`Seja bem vinda ${nome}, a aula de JS!`);