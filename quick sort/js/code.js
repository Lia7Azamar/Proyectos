function ingresarDatos() {
    let input = parseInt(document.getElementById("numElements").value);
    let arr = new Array(input);

    for (let c = 0; c < input; c++) {   
        arr[c] = parseInt(prompt("Ingrese Elemento " + (c + 1)));
    }

    mostrarLista("original", "Lista Original", arr);
    ordIntercambio(arr);
}

function mostrarLista(ulId, title, array) {
    let ul = document.getElementById(ulId);
    ul.innerHTML = `<h3>${title}</h3>`;
    
    array.forEach(item => {
        let li = document.createElement("li");
        li.textContent = item;
        ul.appendChild(li);
    });
}

function ordIntercambio(arr) {
    let elegir = parseInt(prompt("Elija 1 para ordenar de Menor a Mayor o 2 para ordenar de Mayor a Menor"));

    switch (elegir) {
        case 1:
            arr = ordenarDeMenorAMayor(arr);
            mostrarLista("orde", "Lista Ordenada de Menor a Mayor", arr);
            break;

        case 2:
            arr = ordenarDeMayorAMenor(arr);
            mostrarLista("orde", "Lista Ordenada de Mayor a Menor", arr);
            break;

        default:
            alert("Opción no válida");
            break;
    }
}

function ordenarDeMenorAMayor(arr) {
    if (arr.length <= 1) {
        return arr;
    }

    let i = Math.floor(arr.length / 2);
    let pivo = arr[i];
    let leftarr = [];
    let rightarr = [];

    for (let index = 0; index < arr.length; index++) {
        if (index !== i) {
            if (arr[index] > pivo) {
                rightarr.push(arr[index]);
            } else {
                leftarr.push(arr[index]);
            }
        }
    }

    leftarr = ordenarDeMenorAMayor(leftarr);
    rightarr = ordenarDeMenorAMayor(rightarr);

    return leftarr.concat(pivo).concat(rightarr);
}

function ordenarDeMayorAMenor(arr) {
    if (arr.length <= 1) {
        return arr;
    }

    let i = Math.floor(arr.length / 2);
    let pivo = arr[i];
    let leftarr = [];
    let rightarr = [];

    for (let index = 0; index < arr.length; index++) {
        if (index !== i) {
            if (arr[index] < pivo) {
                rightarr.push(arr[index]);
            } else {
                leftarr.push(arr[index]);
            }
        }
    }

    leftarr = ordenarDeMayorAMenor(leftarr);
    rightarr = ordenarDeMayorAMenor(rightarr);

    return leftarr.concat(pivo).concat(rightarr);
}