// Você é programador de um escritório de contabilidade e tem a missão de desenvolver uma aplicação que elabora o contracheque de cada funcionário. Elabore um algoritmo que recebe o salário bruto de um usuário e em seguida retorne na tela as seguintes informações: 
// a. O salário bruto é: ___ 
// b. O recolhimento do FGTS será: ___ 
// c. O recolhimento de INSS será: ___ 
// d. O salário líquido este mês será: ___ 
// OBS. O valor do recolhimento de FGTS é de 8% do salário bruto, o recolhimento de INSS é de 12% do salário bruto e o salário líquido é igual ao salário bruto - o INSS. 


var entrada = require("readline-sync");
var salarioB = parseFloat(entrada.question("Informe seu salario bruto: "));
console.log(`O salário bruto é ${salarioB}`)
console.log(`O recolhimento do FGTS é  ${(salarioB * 0.08).toFixed(2)}`)
console.log(`O reconhomento do INSS é ${salarioB * 0.12}`)
console.log(`O salário líquido é ${salarioB * 0.88}`)