function datos() {
    let n = parseInt(document.getElementById("numElements").value);
    let arr = new Array(n);

    for (let c = 0; c < n; c++) {
        arr[c] = parseInt(prompt("Ingrese Elemento " + (c + 1)));
    }

    mostrarLista("original", "Lista Original", arr); // No se pasa el tercer parámetro (resaltado)

    let valor = parseInt(prompt("Ingrese el número a buscar"));
    let resultado = buscar(arr, valor);

    mostrarLista("original", "Lista Original", arr, resultado);

    if (resultado !== -1) {
        alert(`El número ${valor} se encuentra en la posición ${resultado + 1}.`);
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

function buscar(arr, valor) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === valor) {
            return i;
        }
    }
    return -1;
}