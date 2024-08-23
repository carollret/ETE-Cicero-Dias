//Elabore um algoritmo que solicite ao usuário o valor do lado de um quadrado e retorne em tela o valor de sua área. 

var entrada = require("readline-sync");
lado = parseFloat(entrada.question("Digite o valor do quadrado: "));
console.log(`A aréa do quadro é ${lado*lado}`)