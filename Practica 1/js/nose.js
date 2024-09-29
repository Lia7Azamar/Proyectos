function calcularEdad(AnioNacimiento){
   alert("Tu edad es"+(2023-AnioNacimiento)+"años");
}
function saludar(nombre){
alert("Hola mundo desde"+nombre+" javascript")}
function variables(){
   /*Hay tres formas de declarar una variable
     1)var: Declarar variables pero permite una redeclaracion 
		Ejm:var edad=19;
                var edad=20;
       NOTA:En la actualidad su uso es poco frecuente 
   */
   var edad=19;
   var edad=20;
   console.log("Edad="+edad); 
   /*
      2)let: No permite la declaracion en un mismo scope
   */
  let salario=10000
  if(true){
  let salario=15000
     console.log("Tu salario es:$" + salario)
  }
    console.log("Tu salario es:$" + salario)
   /*3)const:Declara una constante y su valor no cambia, se definen con mayusculas
   */
    const IVA = 16;
    const PI = 3.1416;

    console.log("const IVA=" + (IVA + 1));
    console.log("const PI=" + (PI - 0.5));

}
function hotel() {
    var dias = prompt("Cuantos dias se quedo en el hotel");
    var precio = prompt("Cuanto pago de la habitacion");
    if (dias <= 5) {
        var preciod = 0
        var precio2 = precio - preciod;
        console.log("Ustede se quedo " + dias + " dias");
        console.log("Usted tiene un descuento de " + preciod + " pesos");
        console.log("Pagara un Subtotal de " + dias * precio + " pesos");
        console.log("Pagara un total de " + dias * precio2 + " pesos mas descuento");
    }

    if (dias > 5 && dias <=10) {
        var preciod = precio * 0.10;
        var precio2 = precio - preciod;
        console.log("Ustede se quedo " + dias + " dias");
        console.log("Usted tiene un descuento de " + preciod + " pesos");
        console.log("Pagara un Subtotal de " + dias * precio + " pesos");
        console.log("Pagara un total de " + dias * precio2 + " pesos mas descuento");

    }
    if (dias > 10 && dias <=15) {
        let preciod = precio * 0.15;
        let precio2 = precio - preciod;
        console.log("Ustede se quedo " + dias + " dias");
        console.log("Usted tiene un descuento de " + preciod + " pesos");
        console.log("Pagara un Subtotal de " + dias * precio + " pesos");
        console.log("Pagara un total de " + dias * precio2 + " pesos mas descuento");

    }
    if (dias > 15) {
        var preciod = precio * 0.20;
        var precio2 = precio - preciod;
        console.log("Ustede se quedo " + dias + " dias");
        console.log("Usted tiene un descuento de " + preciod + " pesos");
        console.log("Pagara un Subtotal de " + dias * precio + " pesos");
        console.log("Pagara un total de " + dias * precio2 + " pesos mas descuento");

    }
   
}

    function entradaSalidaDatos() {
        let horasTrabajadas = prompt("Ingrese horas trabajadas");
        let salarioPorHora = prompt("Ingrese salario por hora");
        alert("Salario $" + (salarioPorHora * horasTrabajadas));
    }
    

