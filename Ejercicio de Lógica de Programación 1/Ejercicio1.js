//Se solicitan los 3 numeros por prompt al usuario
const num1 = Number(prompt("Enter the first number:"));
const num2 = Number(prompt("Enter the second number:"));
const num3 = Number(prompt("Enter the third number:"));

//Funcion que verifica si los numeros son iguales
const areEqual = (a, b, c) => a === b && b === c;

//Funcion que muestra el mayor numero utilizando "Math.max"
const getLargest = (a, b, c) => Math.max(a, b, c);

//Funcion que muestra el menor numero utilizando "Math.min"
const getSmallest = (a, b, c) => Math.min(a, b, c);

//Funcion que obtiene el numero de en medio
const getMiddle = (a, b, c, smallest, largest) => a !== smallest && a !== largest ? a : (b !== smallest && b !== largest ? b : c);

//Funcion que muestra los numeros ordenados de mayor a menor y de menor a mayor.
const displaySortedNumbers = (a, b, c) => {
  const largest = getLargest(a, b, c);
  const smallest = getSmallest(a, b, c);
  const middle = getMiddle(a, b, c, smallest, largest);

  console.log("Mayor a menor:", largest, middle, smallest);
  console.log("Menor a mayor:", smallest, middle, largest);
};

//verifica si los numeros son iguales  y los muestra en la consola
if (areEqual(num1, num2, num3)) {
  console.log("Los numeros son iguales.");
} else {
  //Muestra los numeros de forma ordenada
  displaySortedNumbers(num1, num2, num3);
}
