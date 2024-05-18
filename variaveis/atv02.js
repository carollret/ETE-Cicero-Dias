//Elabore um algoritmo que receba o nome e o sobrenome de um usuário, e	 em seguida informe: “Seu nome completo é ___” 

var entrada = require("readline-sync");
var nome = entrada.question("Digite seu nome: ");
var sobre = entrada.question("Digite seu sobrenome: ");
console.log(`Seu nome é ${nome} ${sobre}`);