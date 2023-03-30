//Funcion para convertir los grados de celsius a Fahrenheit
function celsiusToFahrenheit(celsius) {
    return (celsius * 9) / 5 + 32;
  }
  
  //Funcion para convertir los grados celsius a kelvin
  function celsiusToKelvin(celsius) {
    return celsius + 273.15;
  }
  
  //Funcion para solicitar la temperatura en grados celsius y validar que sea un número
  function obtainCelsiusTemperature() {
    let celsiusTemperature = parseFloat(prompt("Ingresa la temperatura en grados celcius:"));
  
    while (isNaN(celsiusTemperature)) {
      alert("Ingresa un numero valido.");
      celsiusTemperature = parseFloat(prompt("Ingresa la temperatura en grados celcius:"));
    }
  
    return celsiusTemperature;
  }
  
  //Solicita la temperatura en grados celsius y valida que sea un número
  const celsiusTemperature = obtainCelsiusTemperature();
  
  //Calcula la temperatura en grados fahrenheit y kelvin
  const fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature);
  const kelvinTemperature = celsiusToKelvin(celsiusTemperature);
  
  //Muestra las temperaturas convertidas en la consola
  console.log("La temperatura en grados fahrenheit es:", fahrenheitTemperature);
  console.log("La temperatura en grados kelvin es::", kelvinTemperature);
  