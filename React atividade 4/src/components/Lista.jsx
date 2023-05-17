import styles from "./lista.module.css"

function Lista ({nome,image,preco}) {
    return ( 
       <div className={styles.eletro}> 
          <h3 className={styles.nome}>{nome}</h3>
          <img src={image} />
          <h3 className={styles.valor}>preco: {preco}</h3>
       </div>
       

   )
}

export default Lista;