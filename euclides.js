function euclides(){
    let x = parseInt(document.getElementById("valor1").value);
    let y = parseInt(document.getElementById("valor2").value);
    if(x>y){
        let aux=x;
        x=y;
        y=aux;
    }
    let divisor=x, dividendo=y, auxdivisor=y;
    while(divisor>0){
        auxdivisor=divisor;
        divisor=dividendo%divisor;
        dividendo=auxdivisor;
    }

    document.getElementById("demo").innerHTML = "O MDC entre estes é: " + (auxdivisor);
}

function 