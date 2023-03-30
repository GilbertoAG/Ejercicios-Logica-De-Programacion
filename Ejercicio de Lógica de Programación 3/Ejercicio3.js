//Funcion para calcular el factorial de un numero
function factorial(n) {
    if (n === 0 || n === 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
  
  //Función para solicitar un número y validar que sea un número entero positivo
  function obtainPositiveInteger() {
    let number = parseInt(prompt("Ingresa un numero positivo:"));
  
    while (isNaN(number) || number < 0) {
      alert("Ingresa un numero positivo.");
      number = parseInt(prompt("Ingresa un numero positivo:"));
    }
  
    return number;
  }
  
  //Se Solicita un número y se valida que sea un número entero positivo
  const number = obtainPositiveInteger();
  
  //Se Calcula el factorial del numero
  const factorialResult = factorial(number);
  
  //Se muestra el resultado del factorial en la consola
  console.log("El factorial de", number, "es:", factorialResult);