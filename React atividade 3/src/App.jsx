import "./App.css";
import Nome from "./components/NomeComponent";
import Ola from "./components/HelloComponent";

function App() {
  return (
    <>
      <Nome nome="Gustavo!">
        <Ola materia="Front End 3" />
      </Nome>
    </>
  );
}

export default App;
