package seguranca
class Log {
	Date data;
	//Nivel nivel;
	Integer prioridade;
	String mensagem;
	//TipoLog tipoLog;
	
	/*enum TipoLog{
		EVENTO(0L),
		ACESSO(1L);
		
		public Long id;
		TipoLog(Long id){
			this.id = id;
		}
		
		Long getIdentificador(){
			id
		}
		
		TipoLog getByIdentificador(Long identificador){
			identificador<=TipoLog.values().length? TipoLog.values()[identificador.intValue()]:null;
		}
	}
	
	enum Nivel{
		WARN(0L),
		TRACE(1L),
		OFF(2L),
		INFO(3L),
		FATAL(4L),
		ERROR(5L),
		DEBUG(6L),
		ALL(7L);
		
		Long id;
		Nivel(Long identificador){
			this.id = identificador;
		}
		
		Nivel buscarPorIdentificador(Long identificador){
			identificador<Nivel.values().length? Nivel.values()[identificador.intValue()]:null;
		}
	}*/
}