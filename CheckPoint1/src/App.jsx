import "./App.css";
import Card from "./Component/Card";
import Input from "./Component/Input";
import { useState } from "react";

function App() {
  const [heroi, setHeroi] = useState("");
  const [heroiImg, setHeroiImg] = useState("");
  const [card, setCard] = useState({});
  const [validar, setValidar] = useState({})
 
  const changeHeroi = (event) => {
    setHeroi(event.target.value);
  };

  const changeHeroiImg = (event) => {
    setHeroiImg(event.target.value);
  };

  const changeCard = (event) => {
    event.preventDefault();

    setCard({
      heroi: heroi,
      heroiImg: heroiImg,
    });
  };

  const validador = () => {

    if(heroi.length >= 3 && heroiImg.length >=6) {
       setValidar(true)
       
   
      } else {
      setValidar(false)
      alert("Por favor, verifique os dados inseridos no formulário")
      
    }
  }

  return (
    <>
      <h1>Super-Heróis</h1>

      <form>
        <Input
          titulo="Nome do Herói"
          tipo="text"
          valor={heroi}
          fnOnChange={changeHeroi}
          fnOnClick={validar}
        />

        <Input
          titulo="Imagem"
          tipo="url"
          valor={heroiImg}
          fnOnChange={changeHeroiImg}
          fnOnClick={validar}
        />

        <button onClick={changeCard}>Enviar</button>

        <Card tema={card.heroi} imagem={card.heroiImg} />
      </form>
    </>
  );
}

export default App;
