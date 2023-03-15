var valores = [true, 5, false, "hola", "adios", 2];

let comprarTexto = (valores) => {
  let largo = 0;
  let comparador = 0;
  valores.forEach((valor) => {
    if (typeof valor == "string") {
      if (valor.length > largo) {
        largo = valor.length;
        comparador++;
      }
    }
  });
  return comparador;
};

let suma = valores[1] + valores[5];
let resta = valores[1] - valores[5];
let multiplicacion = valores[1] * valores[5];
let division = valores[1] / valores[5];

if (comprarTexto(valores) == 1) {
  alert(`  ${valores[3]} es mayor a ${valores[4]}
  Suma de los elementos numericos: ${suma}
  Resta de los elementos numericos: ${resta}
  Multiplicacion de los elementos numericos: ${multiplicacion}
  Division de los elementos numericos: ${division}`);
} else {
  alert(`  "${valores[4]}" es mayor a "${valores[3]}"
  Suma de los elementos numericos: ${suma}
  Resta de los elementos numericos: ${resta}
  Multiplicacion de los elementos numericos: ${multiplicacion}
  Division de los elementos numericos: ${division}`);
}
