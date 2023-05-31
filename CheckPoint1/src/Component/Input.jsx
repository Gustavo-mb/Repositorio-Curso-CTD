import style from "./input.module.css";

function Input({ titulo, tipo, valor, fnOnChange,}) {
  return (
    <>
      <label>{titulo ?? "Indefinido"}</label>
      <br />
      
      <input type={tipo ?? "text"} value={valor} onChange={fnOnChange} className={style.input}/>
      <br/>
      <br/>
    </>
  );
}

export default Input;
