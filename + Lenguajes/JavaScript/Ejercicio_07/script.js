const limite = parseInt(prompt("Ingrese un numero para establecer el limite"));

var total = 0;

while (total <= limite) {
  var num = parseInt(prompt(`Ingrese un numero para sumarlo al total \nActulmente el total es ${total}`))
  total = total + num;
}

alert(`Supero el limite de ${limite} con un total de ${total}`)