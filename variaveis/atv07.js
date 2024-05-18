//Elabore um algoritmo que solicite ao usuário as idades de três irmãos, A, B e C. Em seguida diga se é verdadeiro ou falso que a idade de A é menor que as idades de B e C juntas. 

var entrada = require("readline-sync");
var A = parseInt(entrada.question("Digite a idade de A: "));
var B = parseInt(entrada.question("Digite a idade de B: "));
var C = parseInt(entrada.question("Digite a idade de C: "));
if (A < (B+C)) {
    console.log(`A idade de irmão A é ${A} anos. É menor que os irmão B e C.`)
}
else {
    console.log(`A idade de irmão A é ${A} anos. É maior que os irmão B e C.`)
}