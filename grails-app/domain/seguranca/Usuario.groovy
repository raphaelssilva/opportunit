package seguranca 

import util.PessoaFisica

class Usuario extends PessoaFisica {
	String login
	String senha
	String token
	String perguntaSecreta
	String respostaSecreta
	Boolean isAtivo
	
	static hasMany = [sessoes:Sessao]
}

