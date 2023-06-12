import { useState } from "react";
import "./App.css";
import Texto from "./components/Texto";

function App() {
  const [itens, setItens] = useState([]);

  const buttonAddItens = () => {
    setItens(
      [...itens, `O item ${itens.length + 1} foi adicionado a lista!`],

     
    );
  };

  return (
    <>
      <h1>Itens</h1>

      {itens.map((conteudo) => {
        return <Texto key={conteudo} conteudo={conteudo} />;
      })}

      <button onClick={buttonAddItens}>Adicionar item</button>
    </>
  );
}

export default App;
