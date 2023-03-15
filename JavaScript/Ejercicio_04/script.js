var caracter = prompt("Ingrese un caracter");

caracter.toLocaleUpperCase;

if (caracter.length > 1) {
    alert("Ingrese solo 1 caracter!")
} else if (caracter == "S" || caracter == "N") {
    alert("CORRECTO")
} else {
    alert('INCORRECTO')
}
