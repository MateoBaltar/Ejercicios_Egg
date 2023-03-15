const num1 = parseInt(prompt("Ingrese el primer numero"));
const num2 = parseInt(prompt("Ingrese el segundo numero"));

let seleccion = prompt(
  " Que desea hacer?\n S o s para sumar \n R o r para restar \n M o m para multiplicar \n D o d para dividir"
);

seleccion.toLocaleUpperCase;
switch (seleccion) {
  case "S":
    var total = num1 + num2;
    alert(total);
    break;
  case "R":
    var total = num1 - num2;
    alert(total);
    break;
  case "M":
    var total = num1 * num2;
    alert(total);
    break;
  case "D":
    var total = num1 / num2;
    alert(total);
    break;
  default:
    alert("Error!");
    break;
}
