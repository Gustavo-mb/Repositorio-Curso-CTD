import produtos from "./produtos"
import Lista from "./components/lista";
import "./styles.css"

function App() {
  return (
    
    <>  
    <h1 className="titulo">Produtos</h1>
    
    {  
    produtos.map((item,index) => { 
      return (
      
        <Lista
        key={index}
        nome={item.nome}
        image={item.image}
        preco={item.preco}
        />
       )
     }
   )
 }
    </>
  )
}

export default App;
