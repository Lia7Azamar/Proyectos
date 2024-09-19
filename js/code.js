function datos() {
    let n = parseInt(document.getElementById("numElements").value);
    let arr = new Array(n);

    for (let c = 0; c < n; c++) {
        arr[c] = parseInt(prompt("Ingrese Elemento " + (c + 1)));
    }
    

    let valor = parseInt(prompt("Ingrese el número a buscar"));
    let resultado = binary(arr, valor);

    mostrarLista("original", "Lista Original", arr, resultado);

    if (resultado !== -1) {
        alert(`El número ${valor} se encuentra en la posición ${resultado+1}.`);
    } else {
        alert(`El número ${valor} no se encuentra en la lista.`);
    }

}

function mostrarLista(ulId, title, array, resaltado) {
    const ul = document.getElementById(ulId);
    ul.innerHTML = `<h3>${title}</h3>`;

    array.forEach((item, index) => {
        const li = document.createElement("li");
        li.textContent = item;
        if (index === resaltado) {
            li.style.color = "red"; // Resaltar el número encontrado
        }
        ul.appendChild(li);
    });
}

function binary(arr, valor) {
    let orden = parseInt(prompt("¿La lista está ordenada de menor a mayor (1) o de mayor a menor (2)?"));
    if(orden==1){
        let inicio = 0;
        let fin = arr.length - 1;
        let centro = Math.floor((inicio + fin) / 2);
    
        while (inicio <= fin) {
            if (arr[centro] === valor) {
                return centro;
            } else if (valor < arr[centro]) {
                fin = centro - 1;
            } else {
                inicio = centro + 1;
            }
            centro = Math.floor((inicio + fin) / 2);
        }
    
        return centro
    }else if(orden==2){
  
        let inicio = 0;
        let fin = arr.length - 1;
        let centro = Math.floor((inicio + fin) / 2);
    
        while (inicio <= fin) {
            if (arr[centro] === valor) {
                return centro;
            } else if (valor > arr[centro]) {
                fin = centro - 1;
            } else {
                inicio = centro + 1;
            }
            centro = Math.floor((inicio + fin) / 2);
        }
    
        return centro
    }
}
