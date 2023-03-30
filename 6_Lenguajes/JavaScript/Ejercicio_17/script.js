let vector1 = [];
for (let i = 0; i < 5; i++) {
  vector1.push(Math.round(Math.random() * 10));
}

alert(`Vector 1 antes de borrar los ultimos dos elementos ${vector1}`);

let trash = vector1.pop();
trash = vector1.pop();

alert(`Vector 1 despues de borrar los ultimos dos elementos ${vector1}`);
