const seguros=document.querySelector("#seguros");
seguros.addEventListener("submit",variables);

function variables(evt){
    evt.preventDefault();
    let tipoPlan=document.querySelector("#cmbpolisa").value;
    let bebida=document.querySelector("#Alcohol").value;
    let vistas=document.querySelector("#Lentes").value;
    let enfermedad=document.querySelector("#Enfermedad").value;
    let años=document.querySelector("#textAños").value;
    let imprimir=document.getElementById("Resultado");
    imprimir.textContent=calculosTDA (tipoPlan,bebida,vistas,enfermedad,años);
  
}
const calculosTDA = (tipoPlan,bebida,vistas,enfermedad,años) =>{
    let cuota,cuota2=0,cuota3=0,cuota4=0,cuota5=0,resultado
    if(tipoPlan=="tipo A"){
        cuota=1200
        if(bebida=="no selecciona"||enfermedad=="no selecciona"||vistas=="no selecciona"){
            alert("Asegurese de llenar todos los campos")
        }else{
            if(bebida=="Si"){
            cuota2=cuota*.10
        }
          if(enfermedad=="Si"){
            cuota3=cuota*.05
        }
        if(vistas=="Si"){
            cuota4=cuota*.05
        }
        if(años>40){
            cuota5=cuota*.20
        }else if(años<=40){
            cuota5=cuota*.10
        }
        resultado=cuota+cuota2+cuota3+cuota4+cuota5   
        return`Usted pagara ${resultado} `; 
        }
        if(tipoPlan=="no selecciona"){
        alert("Seleccione un tipo de plan")
    }
        
    }
    if(tipoPlan=="tipo B"){
        cuota=950
        if(bebida=="no selecciona"||enfermedad=="no selecciona"||vistas=="no selecciona"){
            alert("Asegurese de llenar todos los campos")
      
        }else{
            if(bebida=="Si"){
            cuota2=cuota*.10
         }
          if(enfermedad=="Si"){
            cuota3=cuota*.05
        }
        if(vistas=="Si"){
            cuota4=cuota*.05
        }
        if(años>40){
            cuota5=cuota*.20
        }else if(años<=40){
            cuota5=cuota*.10
        }
        resultado=cuota+cuota2+cuota3+cuota4+cuota5   
        return`Usted pagara ${resultado} `; 
        }
    }
    if(tipoPlan=="no selecciona"){
        alert("Seleccione un tipo de plan")
    }
}

