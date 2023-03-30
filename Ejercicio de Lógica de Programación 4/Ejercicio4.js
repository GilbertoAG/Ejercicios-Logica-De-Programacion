//Funcion para generar la serie de fibonacci hasta n terminos.
function fibonacciSeries(n) {
    const series = [];
    for (let i = 0; i < n; i++) {
      if (i === 0 || i === 1) {
        series.push(i);
      } else {
        series.push(series[i - 1] + series[i - 2]);
      }
    }
    return series;
  }
  
  //Funcion para solicitar un numero y validar que sea un número entero positivo
  function obtainPositiveInteger() {
    let number = parseInt(prompt("Ingresa un numero positivo:"));
  
    while (isNaN(number) || number < 0) {
      alert("Ingresa un numero positivo.");
      number = parseInt(prompt("Ingresa un numero positivo:"));
    }
  
    return number;
  }
  
  //Solicita un número y se valida que sea un numero positivo
  const number = obtainPositiveInteger();
  
  //Genera la serie de fibonacci hasta el numero ingresado
  const fibonacciResult = fibonacciSeries(number);
  
  //Muestra la serie de fibonacci en la consola
  console.log("La serie de fibonacci de", number, "terminos es:", fibonacciResult.join(", "));
  