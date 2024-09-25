function ingresarDatos(){
    let n=parseInt(prompt("Numero de elementos "));
    let a =new Array(n);
    for(let c=0 ; c<n ;c++){
       a[c]=parseInt(prompt("Ingrese Elemento "+(c+1)))
   
    }
    console.log("*-* LISTA ORIGINAL *-*");
    imprimir(a);
    ordIntercambio(a);
   }
   
   function imprimir (a){
       for(c in a){ // for para recorrer arreglos 
           console.log (a[c]);
       }
   }
   
   function ordIntercambio(a){
       let n=a.length // se puede declara antes del colocar en el for
   for(let i=0; i<n; i++){
       for(let j = i+1 ; j<n ; j++ ){
           if(a[i] > a[j]){
               let aux=a[i];
               a[i]= a[j];
               a[j]=aux;
           
           }
       }
   
   }
   console.log("****LISTA ORDENADA****");
   imprimir(a);
   }
    