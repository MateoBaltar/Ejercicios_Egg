function comparador(a,b){
  if (a > b) return 1;
  if (a == b) return 0;
  if (a < b) return -1;
}



let arregloA = [];
let arregloB = [];

for (let i = 0; i < 50; i++) {
  arregloA.push(Math.round(Math.random() * 20));
}
alert(`Arreglo A sin ordenar = ${arregloA}`)

arregloA.sort(comparador)

alert(`Arreglo A tras ordenar de menor a mayor = ${arregloA}`)
for (let i = 0; i < 20; i++) {
  if (i < 10) {
    arregloB.push(arregloA[i])
  } else{
    arregloB.push(0.5)
  }
}

alert(`Arreglo B tras obtener primeros 10 numeros del arreglo A y luego rellenar con 0.5
${arregloB}`)