import style from "./texto.module.css";

function Texto({ conteudo }) {
  return (
    <div className={style.borda}>
      <h3 className={style.h3}>{conteudo}</h3>
    </div>
  );
}

export default Texto;
