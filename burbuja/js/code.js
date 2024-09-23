function ingresarDatos() {
    let n = parseInt(document.getElementById("numElements").value);
    let a = new Array(n);

    for (let c = 0; c < n; c++) {
        a[c] = parseInt(prompt("Ingrese Elemento " + (c + 1)));
    }

    mostrarLista("original", "Lista Original", a);
    ordIntercambio(a);
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

function ordIntercambio(a) {
    let elegir = parseInt(prompt("Elija 1 para ordenar de Menor a Mayor o 2 para ordenar de Mayor a Menor"));

    switch (elegir) {
        case 1:
            ordenarDeMenorAMayor(a);
            mostrarLista("orde", "Lista Ordenada de Menor a Mayor", a);
            break;

        case 2:
            ordenarDeMayorAMenor(a);
            mostrarLista("orde", "Lista Ordenada de Mayor a Menor", a);
            break;

        default:
            alert("Opción no válida");
            break;
    }
}

function ordenarDeMenorAMayor(a) {
    let n = a.length;

    for (let i = 0; i < n; i++) {
        for (let j = i + 1; j < n; j++) {
            if (a[i] > a[j]) {
                let aux = a[i];
                a[i] = a[j];
                a[j] = aux;
            }
        }
    }
   
}

function ordenarDeMayorAMenor(a) {
    let n = a.length;

    for (let i = 0; i < n; i++) {
        for (let j = i + 1; j < n; j++) {
            if (a[i] < a[j]) {
                let aux = a[i];
                a[i] = a[j];
                a[j] = aux;
            }
        }
    }
  
}

