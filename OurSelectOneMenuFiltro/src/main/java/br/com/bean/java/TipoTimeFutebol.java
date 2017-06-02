package br.com.bean.java;

public enum TipoTimeFutebol {
	
	
	FLAMENGO("Flamengo"),
	FLUMINENSE("Fluminense"),
	VASCO("Vasco"),
	BOTAFOGO("Botafogo");
	
	private String time;

	private TipoTimeFutebol(String time) {
		this.time = time;
	}

	public String getTime() {
		return time;
	}

}
