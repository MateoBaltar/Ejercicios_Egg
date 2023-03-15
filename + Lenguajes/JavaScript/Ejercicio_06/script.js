const num = parseInt(prompt("Ingrese un numero para saber si es par o impar"));

if (num == 0) {
  alert(`El numero ${num} es 0`);
} else if (num % 2 == 0) {
  alert(`El numero ${num} es par`);
} else {
  alert(`El numero ${num} es impar`);
}
