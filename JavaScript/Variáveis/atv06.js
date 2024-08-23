//Elabore um algoritmo que solicite ao usuário o valor do lado de um quadrado e retorne em tela o valor de sua área. 

var entrada = require("readline-sync");
var num = parseInt(entrada.question("Digite um numero: "));
if(num % 2 !== 0) {
    console.log("Número ímpar") 
}
else{
    console.log("Número par")
}