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
    let incremento = arr.length / 2;
    
    while (incremento > 0) {
        for (let i = 0; i < arr.length; i++) {
            let j = i;
            let arr2 = arr[i];

            while (j >= incremento && arr[j - incremento] > arr2) {
                arr[j] = arr[j - incremento];
                j -= incremento;
            }

            arr[j] = arr2;
        }

        if (incremento == 2) {
            incremento = 1;
        } else {
            incremento = parseInt(incremento * 5 / 11);
        }
    }

    return arr;
}

function ordenarDeMayorAMenor(arr) {
    let incremento = arr.length / 2;
    
        while (incremento > 0) {
            for (let i = 0; i < arr.length; i++) {
                let j = i;
                let arr2 = arr[i];
    
                while (j >= incremento && arr[j - incremento] < arr2) {
                    arr[j] = arr[j - incremento];
                    j -= incremento;
                }
    
                arr[j] = arr2;
            }
    
            if (incremento == 2) {
                incremento = 1;
            } else {
                incremento = parseInt(incremento * 5 / 11);
            }
        }
    
        return arr;
    
}
