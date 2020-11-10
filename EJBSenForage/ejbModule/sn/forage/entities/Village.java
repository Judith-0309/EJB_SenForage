package sn.forage.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Village implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idV;
	@Column(length=50)
	private String nomVillage;
	@OneToMany(mappedBy = "village", fetch = FetchType.LAZY)
	private List<Client> clients;
	
	public Village() {
		super();
	}

	public Village(int idV, String nomVillage) {
		super();
		this.idV = idV;
		this.nomVillage = nomVillage;
	}

	public int getIdV() {
		return idV;
	}

	public void setIdV(int idV) {
		this.idV = idV;
	}

	public String getNomVillage() {
		return nomVillage;
	}

	public void setNomVillage(String nomVillage) {
		this.nomVillage = nomVillage;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	

}
