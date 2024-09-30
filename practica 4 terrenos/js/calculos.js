const FRMTerreno=document.querySelector("#frmTerreno");
FRMTerreno.addEventListener("submit", calcularTerreno);
const largox=document.getElementById("textLargo");
const anchox=document.getElementById("textAncho");
const metrox=document.getElementById("textMetro");
const parrafo=document.getElementById("warnings");



function calcularTerreno(evt){
    evt.preventDefault();
    let largo=document.querySelector("#textLargo").value;
    let ancho=document.querySelector("#textAncho").value;
    let Pre ciometro=document.querySelector("#textMetro").value;

    let descuento=0;
    let total;
    let m2=largo*ancho;
    let m2P;
    
    if(m2>400 && m2<=800){
        m2P=Preciometro*m2;
        descuento=m2P*0.05;
    }else if(m2>800 && m2<=1000){
        m2P=Preciometro*m2;
        descuento=m2P*0.08;
    }else if(m2>1000 && m2<=2000){
        m2P=Preciometro*m2;
        descuento=m2P*0.10;
    }else if(m2>2000){
        m2P=Preciometro*m2;
        descuento=m2P*0.25;
    }   
    
    total=m2P-descuento;
    let imprimir=document.getElementById("Resultado");
    imprimir.textContent=`Descuento $${descuento} Total $${total}`;

}