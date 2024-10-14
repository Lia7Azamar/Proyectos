const fiboForm = document.querySelector("#fiboe");

fiboForm.addEventListener("submit", function(e) {
    e.preventDefault();

    const numeroi = parseInt(document.getElementById("numeroi").value);
    const numerof = parseInt(document.getElementById("numerof").value);

    const resultado = calcularFibonacci(numeroi, numerof);

    const imprimir = document.getElementById("Resultado");
    imprimir.textContent = resultado.join(', ');
});

function calcularFibonacci(inicio, final) {
    const fibonacci = [];

    function calcular(x) {
        if (x <= 1) {
            return x;
        } else {
            return calcular(x - 1) + calcular(x - 2);
        }
    }

    for (let i = inicio; i <= final; i++) {
        fibonacci.push(calcular(i));
    }

    return fibonacci;
}