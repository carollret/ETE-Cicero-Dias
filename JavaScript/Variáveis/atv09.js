//Elabore um algoritmo que solicite ao usuário os valores de largura e comprimento de um terreno retangular, e a largura e comprimento de uma casa construída neste terreno. Em seguida retorne à tela a área não construída. (Terreno 15mx20, casa 9mx12m) além desses valores use outros de sua preferência. 

var entrada = require("readline-sync");
var larguraCasa = parseFloat(entrada.question("Digite a largura da casa : "));
var comprimentroCasa = parseFloat(entrada.question("Digite o comprimento da casa: "));
var larguraTerreno = parseFloat(entrada.question("Digite a largura do terreno: "));
var comprimentroTerreno = parseFloat(entrada.question("Digite o comprimento do terreno: "));
var areaCasa = larguraCasa*comprimentroCasa
var areaTerreno = larguraTerreno*comprimentroTerreno

// calculo da area restante
console.log(`A área restante em metros é ${areaCasa-areaTerreno}`)