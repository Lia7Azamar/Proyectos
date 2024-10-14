const fact=document.querySelector("#fact");
fact.addEventListener("submit",function(e){
e.preventDefault(); 
const numeroInput = document.getElementById("numero");
const numero = parseInt(numeroInput.value);
const resultado = variables1(numero);
const imprimir = document.getElementById("Resultado");
imprimir.textContent = `El factorial de ${numero} es ${resultado}`;
})

function variables1(x){
    if (x == 0 || x == 1) {
        return 1;
      } else {
        
        return x * variables1(x - 1);
      
    }
}




   



