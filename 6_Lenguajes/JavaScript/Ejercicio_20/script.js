let matriz = [[3], [6], [9], [12],[15]];

alert(`Matriz antes de aplanar: ${matriz}`)
matriz.flat();
matriz.push(18);
matriz.shift();
alert(`Matriz despues de aplanar y modificar: ${matriz}`)