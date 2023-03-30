var seleccion = parseInt(
  prompt("Que tipo de dato desea ingresar: \n1.Texto \n2.Numerico \n3.Booleano")
);
let argumento;

switch (seleccion) {
  case 1:
    argumento = prompt("Ingrese un texto");
    break;
  case 2:
    argumento = parseInt(prompt("Ingrese u nunmero"));
    break;
  case 3:
    let bool = prompt("Ingrese true o false");
    if (bool == "true" || bool == "True") {
      argumento = true;
    } else if (bool == "false" || bool == "False") {
      argumento = false;
    } else {
      alert("No ingreso el texto correctamente");
    }
  default:
    break;
}

let tipo = (argumento) => {
  return typeof argumento;
};

alert("Este dato es: " + tipo(argumento));
