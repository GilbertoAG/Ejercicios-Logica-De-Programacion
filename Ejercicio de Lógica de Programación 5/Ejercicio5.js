//Funcion para obtener un numero entero de forma aleatoria entre un numero minimo (min) y un numero maximo (max)
function getRandomInt(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
  }
  
  //Funcion que solicita un numero al usuario y se valida que este sea entero entre un numero minimo (min) y un numero maximo (max)
  function obtainNumberBetween(min, max) {
    let number = parseInt(prompt("Ingrese un numero entre " + min + " y " + max + ":"));
  //Valida si el numero ingresado es un entero entre un numero minimo (min) y un numero maximo (max)
    while (isNaN(number) || number < min || number > max) {
      alert("ingresa un numero valido entre " + min + " y " + max + ".");
      number = parseInt(prompt("Ingrese un numero entre " + min + " y " + max + ":"));
    }
  
    return number;
  }
  //Genera el numero secreto de forma aleatoria
  const secretNumber = getRandomInt(1, 100);
  let userNumber;
  let attempts = [];
  
  //Bucle para solicitar los numeros y que se detiene hasta que el usuario adivina el numero secreto
  do {
    userNumber = obtainNumberBetween(1, 100);
    attempts.push(userNumber);
  //Comprueba si el numero ingresado por el usuario es igual al numero secreto.
    if (userNumber !== secretNumber) {
      alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
    } else {
      console.log("Felicidades, adivinaste el número secreto.");
      console.log("Numeros introducidos antes de adivinar el numero secreto:", attempts.join(", "));
    }
  } while (userNumber !== secretNumber);
  