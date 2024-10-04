const empleados=document.querySelector("#empleados");
empleados.addEventListener("submit",calcularSueldo);

function calcularSueldo(evt){
    evt.preventDefault(); 
    let nombre=document.querySelector("#textNombre").value
    let horas= document.querySelector("#textHoras").value;
    let cuotas= document.querySelector("#textCuota").value;
    let tipo=document.querySelector("#cmbTipo").value;
    let paga=1;
    let hora1=horas-40;
    let pagaT;
    let x;
    if(horas<0 || cuotas<0){
        alert("No puedes ingresar numeros negativos");

    }else{
        if(tipo=="no selecciona"){
            alert("Selecciones un tipo de empleado");
        }else{  
            if(horas>40){
                if(tipo=="tipo 1"){
                    x=cuotas*hora1;
                    paga=cuotas*1.5*hora1;
                    pagaT=horas*cuotas+paga-x;
                }else if(tipo=="tipo 2"){
                    x=cuotas*hora1;
                    paga=cuotas*2*hora1;
                    pagaT=horas*cuotas+paga-x;
                }else if(tipo=="tipo 3"){
                    x=cuotas*hora1;
                    paga=cuotas*2.5*hora1;
                    pagaT=horas*cuotas+paga-x;
                }else if(tipo=="tipo 4"){
                    x=cuotas*hora1;
                    paga=cuotas*3*hora1;
                    pagaT=horas*cuotas+paga-x;
                }
            }else{
                pagaT=horas*cuotas;
            } 
            let imprimir=document.getElementById("Resultado");
            imprimir.textContent=`Su nombre es ${nombre} Usted trabaja ${horas} horas, Con una cuota de $${cuotas}, Su pago sera de $${pagaT}`;
         }
    }
    

    
 
    
    
}