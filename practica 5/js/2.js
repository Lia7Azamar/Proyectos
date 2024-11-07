//recibir el id del formulario para poderlo manipular por eventos
//Para realizarlo utilizaremos las funciones del DOM de Javascript
const FRMHotel=document.querySelector("#frmHotel");
//crear un evento clic con un listener
FRMHotel.addEventListener("submit",calcularHospedaje);

function calcularHospedaje(evt){
    evt.preventDefault(); //No se actualice la pagina(No envia datos)
    //Recibir los datos del formulario
    let tipoPago=document.querySelector("#cmbTipoPago").value;
    let diasHosp= document.querySelector("#textDias").value;
    let precioPorDia= document.querySelector("#textPrecio").value;
    let imprimir=document.getElementById("Resultado");
    imprimir.textContent=hotelTDA (diasHosp,precioPorDia,tipoPago);
}
//Crear TDA para calcular el total a pagar del hotel

/*function hotelTDA(){

}*/
//Esto es lo mismo de arriba pero represnetado de otra forma
//Datos los represento como parametros de entrada
const hotelTDA = (diasHosp,precioPorDia,tipoPago) =>{
    //Operaciones
    let descuento=0;
    let total;
    let subtotal=diasHosp*precioPorDia;
    if(diasHosp>5 && diasHosp<=10){
        descuento=subtotal*0.10;
    
    }else if(diasHosp>10 && diasHosp<=15){
        descuento=subtotal*0.15;
    }else if(diasHosp >15){
        descuento=subtotal*0.20;
    }
    total=subtotal-descuento;
    if(tipoPago=="tarjeta"){
        total=total*1.03;
    }
    return `Subtotal a pagar $${subtotal} Descuento $${descuento} Total $${total} Tipo de pago ${tipoPago}`;

}