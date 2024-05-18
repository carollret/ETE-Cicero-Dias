// Luna é uma jovem com forte espírito científico. Certa vez, observando sua mãe costurar, identificou que no chão havia caído uma fita de cetim. Esta fita tocava suas pontas e formava um círculo perfeito. O piso da casa de sua mãe era revestido com cerâmicas de tamanha 40x40. Sabendo que o círculo formado pela fita tocava os limites da pedra de cerâmica (imagem abaixo), Luna perguntou: Qual seria a área de um quadrado, em que seu lado correspondesse ao tamanho do perímetro do círculo formado pela fita. Considere π=3.

var entrada = require("readline-sync");
var raio = (40/2);
var pi = 3;
var perimetro = 2 * pi * raio
console.log(`A área de um quadrado é ${perimetro*perimetro} `)