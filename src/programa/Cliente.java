package programa;

public class Cliente {
	private int idCliente;
	private String nomeCliente;
	private String emailCliente;
	private int idadeCliente;
	
	public Cliente(int idCliente, String nomeCliente, String emailCliente, int idadeCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.idadeCliente = idadeCliente;
	}
	public Cliente() {
		
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public int getIdadeCliente() {
		return idadeCliente;
	}
	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", emailCliente=" + emailCliente
				+ ", idadeCliente=" + idadeCliente + "]";
	}
	
	
	
}
