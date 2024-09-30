//recibir el id del formulario para poderlo manipular por eventos
//Para realizarlo utilizaremos las funciones del DOM de Javascript
const FRMHotel=document.querySelector("#frmHotel");
//crear un evento clic con un listener
FRMHotel.addEventListener("submit",calcularHospedaje);

function calcularHospedaje(evt){
    evt.preventDefault(); //No se actualice la pagina(No envia datos)
    //Recibir los datos del formulario
    let diasHosp= document.querySelector("#textDias").value;
    let precioPorDia= document.querySelector("#textPrecio").value;
    //Calculando el total
    let descuento=0;
    let total;
    let subtotal=diasHosp*precioPorDia;
    //validamos descuento en funcion de los dias
    if(diasHosp>5 && diasHosp<=10){
        descuento=subtotal*0.10;
    
    }else if(diasHosp>10 && diasHosp<=15){
        descuento=subtotal*0.15;
    }else if(diasHosp >15){
        descuento=subtotal*0.20;
    }
    total=subtotal-descuento;
    //imprimiendo resultado
    let imprimir=document.getElementById("Resultado");
    imprimir.textContent=`Subtotal a pagar $${subtotal} Descuento $${descuento} Total $${total}`;
}
//Crear TDA para calcular el total a pagar del hotel

/*function hotelTDA(){

}*/
//Esto es lo mismo de arriba pero represnetado de otra forma
//Datos los represento como parametros de entrada
const hotelTDA = (diasHosp,precioPorDia,tipoPago) =>{
    //Operaciones
    

}