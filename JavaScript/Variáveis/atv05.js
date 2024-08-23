//Elabore um algoritmo que solicite ao usuário dois números. Em seguida imprima na tela se é verdadeiro ou falso que os números são diferentes. 

var entrada = require("readline-sync");
var num1 = parseInt(entrada.question("Digite o primeiro numero: "));
var num2 = parseInt(entrada.question("Digite o segundo  numero: "));
if( num1 != num2) {
    console.log("Os números são diferentes")
}
else{
    console.log("Os números são iguais")
}