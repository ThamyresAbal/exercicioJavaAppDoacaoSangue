package negocio;

public class Endereco {

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String municipio;
	private String estado;
	private String pais;
	
	public String imprimir() {
		
		return String.format(
				"%s, %s - %s, %s, %s - %s - %s",
				this.getLogradouro(),
				this.getNumero(),
				this.getComplemento(),
				this.getBairro(),
				this.getMunicipio(),
				this.getEstado(),
				this.getPais()
			);
	}
	
	public Endereco(String logradouro, String numero, String complemento, String bairro, String municipio, String estado, String pais) {
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setComplemento(complemento);
		this.setBairro(bairro);
		this.setMunicipio(municipio);
		this.setEstado(estado);
		this.setPais(pais);
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
}
