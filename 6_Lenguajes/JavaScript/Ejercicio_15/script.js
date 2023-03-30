var radio = prompt("Ingrese el radio de una circunferencia");

let calcularArea = (radio) =>{
  return (Math.PI * (radio * radio))
}
let calcularPerimetro = (radio) =>{
  return (2 * Math.PI * radio)
}


let area = calcularArea(radio);
let perimetro = calcularPerimetro(radio);

alert("Radio = " + radio +
    "\nArea = " + area +
    "\nPerimetro = " + perimetro)