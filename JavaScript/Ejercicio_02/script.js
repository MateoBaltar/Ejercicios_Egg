var radio = prompt("Ingrese el radio de una circunferencia");

let area = Math.PI * (radio * radio);
let perimetro = 2 * Math.PI * radio;

alert("Radio = " + radio +
    "\nArea = " + area +
    "\nPerimetro = " + perimetro)