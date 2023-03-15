const frase = prompt("Ingrese una frase");
var frase2 = "";

for (let i = 0; i < frase.length; i++){
  frase2 = frase2 + frase.substring(i,i+1) + " ";
}

alert(frase2)