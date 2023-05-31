import style from  "./card.module.css"


function Card ({tema, imagem}) {
const imgDefault = "https://thumbs.web.sapo.io/?W=800&H=0&delay_optim=1&epic=ZjI455nvSE2/Nd1AQaWNzvbYsvhUq7kguwClKeI1Pah+G5gWfofHPDPKcH/NNEP41rlZ9ZbfxoisyufoH5BPhfXmGbf9gxef2KuuhRlPESrMgNo="
    return ( 
       <div className= {style.bloco}>
       <h2>{tema ?? "Indefinido"}</h2>
       <img src={imagem ?? imgDefault} alt="img" className={style.imagem} />
       </div>
     );
}

export default  Card;