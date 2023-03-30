let ISBN = parseInt(prompt("Ingrese el ISBN del libro:"))
let titulo = prompt("Ingrese el titulo del libro:")
let autor = prompt("Ingrese el autor del libro:")
let numeroPags = parseInt(prompt("Ingrese el numero de paginas del libro:"))

var newLibro = new Libro(ISBN, titulo, autor, numeroPags)

function Libro(ISBN, titulo, autor, numeroPags) {
  this.ISBN = ISBN;
  this.titulo = titulo;
  this.autor = autor;
  this.numeroPags = numeroPags
};

alert(`ISBN: ${newLibro.ISBN}
Titulo: ${newLibro.titulo}
Autor: ${newLibro.autor} 
Numero de paginas: ${newLibro.numeroPags} `);

console.log(newLibro);
