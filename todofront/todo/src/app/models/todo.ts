export interface Todo {
   id?: String, //? siginifica que a variavel é opcional quando instanciar um novo todo
   titulo: String,
   descricao?: String,
   dataParaFinalizar: Date,
   finalizado: Boolean
}
