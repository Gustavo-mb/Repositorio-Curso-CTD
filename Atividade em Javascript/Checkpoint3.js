/*Crie uma função construtora que tenha como atributos: nome (s,tring), quantidade de faltas (number) e notas (array de números). */
function estudante(nome, quantidadeFaltas, notas) {
  this.nome = nome;
  this.faltas = quantidadeFaltas;
  this.notas = notas;
  this.calcularMedia = function () {
    let soma = 0;
    for (let i = 0; i < this.notas.length; i++){
    let nota = this.notas[i];
    soma += nota;
    }
    return soma / this.notas.length;
  };

  this.calcularFaltas = function () {
    let saber = 1;
    saber += this.faltas;
    return saber;
  };
}
/* Na função construtora crie o método calcularMedia que retorna a média de suas notas. Também terá um método chamado faltas, que simplesmente aumenta o número de faltas em 1. Crie alguns alunos para testar a sua função construtora. */

let aluno1 = new estudante("gustavo", 2, [10, 8, 8, 7]);
let aluno2 = new estudante("agatha", 5, [6, 4, 7, 2]);
let aluno3 = new estudante("matheus", 8, [8, 9, 6, 10]);
let aluno4 = new estudante("clara", 0, [4, 10, 9, 9]);

//console.log(aluno1.calcularMedia());

//console.log(aluno1.calcularFaltas());


/*crie o objeto literal curso que tem como atributos: nome do curso (string), nota de aprovação (number), faltas máximas (number) e uma lista de estudantes (um array composto pelos alunos criados no passo 2).*/

/*Crie o método que permite adicionar alunos à lista do curso, ou seja, quando chamamos nosso método em nosso objeto curso, deverá adicionar um aluno a mais na propriedade lista de estudantes do objeto curso.*/

let curso = {
  nomeDoCurso: "proEnglish",
  notaAprovacao: 7,
  faltasMaximas: 4,
  listaEstudante: [aluno1, aluno2, aluno3, aluno4],
  novoAluno: function (nome, quantidadeFaltas, notas){
    let aluno = new estudante(nome, quantidadeFaltas, notas)
    curso.listaEstudante.push(aluno)
  },
  resultado: function (nome){
    let final = nome.calcularMedia();
    if (final >= curso.notaAprovacao && nome.calcularFaltas() < curso.faltasMaximas || nome.calcularFaltas()=== curso.faltasMaximas && final >=  curso.notaAprovacao + curso.notaAprovacao * 0.1 ){
      console.log('Aluno Aprovado')}
    else{
      console.log('Aluno Reprovado')
    }
  },
  todos: function (){
    let alunos = curso.listaEstudante
    let array = []
    for (let i = 0; i < this.listaEstudante.length;i++){
    let tudo = this.listaEstudante[i];
    array += tudo
    }
    
  
  }
}

curso.novoAluno("eliane", 3, [9, 8, 10, 7]);
curso.novoAluno("rodolfo", 2, [3, 6, 5, 7]);

//console.log(curso.listaEstudante);

/*crie um método para o objeto curso que receba um aluno (como parâmetro) e retorne true se ele aprovou no curso ou false em caso de reprovação.*/

//curso.resultado(aluno1)


/*Crie um método para o objeto curso que percorra a lista de estudantes e retorne um array de booleanos com os resultados se os alunos aprovaram ou não.*/ 









