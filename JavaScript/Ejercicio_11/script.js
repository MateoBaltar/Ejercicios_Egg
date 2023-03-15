const frase = prompt("Ingrese una frase de varias palabras");

var palabras = frase.split(" ");
var palabraMasLarga = palabraLarga(palabras);

alert(`Frase ingresada: ${frase}
\nPalabra mas larga: ${palabraMasLarga}`);

function palabraLarga(palabras) {
  var largo = 0;
  var palabraLarga = "";
  palabras.forEach((palabra) => {
    if (palabra.length > largo) {
      largo = palabra.length;
      palabraLarga = palabra;
    }
  });
  return palabraLarga;
}
