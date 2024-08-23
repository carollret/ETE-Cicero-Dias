// Elabore um algoritmo que retorne a idade de um usuário a partir do ano em que ele nasceu. Neste momento desconsidera o dia e mês de nascimento. 

var entrada = require("readline-sync");
anoAtual = parseInt(entrada.question("Digite o seu ano atual: "));
anoNasc = parseInt(entrada.question("Digite seu ano de nascimento: "));
console.log(`Você tem ${anoAtual-anoNasc} anos`)