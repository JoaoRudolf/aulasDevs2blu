console.log('javascript iniciado');

var qdVerm = document.getElementById('quadrado1');
var qdCinza = document.getElementsByClassName('quadrado');

posicionaQuadrados(qdCinza);


qdVerm.style.width = '100px';
qdVerm.style.height = '100px'

function posicionaQuadrados(collection) {
    console.log(collection);

    for (let i = 0; i < collection.length; i++) {
        const element = collection [i];
        console.log(element)
        element.style.top = retornaPosicao();
        element.style.left = retornaPosicao();
        //element.style.disp
    }
    
}

function retornaPosicao(varXY) {
    var medida = 470;
    var medidaRetorno;

    medidaRetorno = Math.random() * (medida - 30) + 0;

    return `${medidaRetorno}px`;
}

