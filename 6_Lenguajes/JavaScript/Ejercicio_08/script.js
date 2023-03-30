var arr = [];

do {
  var num = parseInt(prompt("Ingrese un numero. Use 0 para salir"));
  if (num == 0) {
    break;
  }
  arr.push(num);
} while (num != 0);
const min = Math.min(...arr);
const max = Math.max(...arr);
const promedio = sumArray(arr) / arr.length;

alert(`El numero mas chico ingresado es: ${min}
\nEl numero mas grande ingresado es: ${max}
\nEl promedio total es: ${promedio}`);

function sumArray(numeros) {
  var total = 0;
  numeros.forEach((numero) => {
    total = total + numero;
  });
  return total;
}
