const frase = prompt("Ingrese una frase");
var frase2 = "";

let reverse = (frase) =>{
  for (let i = frase.length; i >= 0; i--) {
    frase2 = frase2 + frase.charAt(i);
  }
  return frase2;
};



alert(reverse(frase));
