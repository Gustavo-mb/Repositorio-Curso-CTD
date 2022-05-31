 readlineSync = require('readline-sync');

console.log(`ola lucas, qual prato vamos fazer hoje:

1-pipoca     (preparo em 10)
2-macarrao   (preparo em 8)
3-carne      (preparo em 15)
4-feijao     (preparo em 12)
5-brigadeiro (preparo em 8)        `) 
  
let pedido = readlineSync.question(`escolha uma opcao acima `)

let tempopd 

if(pedido === '1'){
     tempopd =10
    console.log(`voce selecionou pipoca`)
}else if (pedido === '2'){
     tempopd =8
    console.log(`voce selecionou macarrao`)
}else if (pedido === '3'){
     tempopd =15
    console.log(`voce selecionou carne`)
}else if (pedido === '4'){
     tempopd =12
    console.log(`voce selecionou feijao`)
}else if (pedido ==='5'){
     tempopd =8
    console.log(`voce selecionou brigadeiro`)
}else {
    console.log(`prato inexistente`)
} 

let preparo= readlineSync.question(`por quanto tempo deseja prepara-lo? `) 

function micro (tempopd,preparo){

if(preparo < tempopd ) {                    
    console.log(`tempo insuficiente`)
}else if (preparo <= tempopd*2){
    console.log(`Prato pronto, bom apetite!!!`)
}else if (preparo <= tempopd*3){
    console.log(`a comida queimou`)
}else console.log (`kabumm`)
}    

micro (tempopd,preparo)

