package sn.forage.dao;

import java.util.List;

import javax.ejb.Local;

import sn.forage.entities.Client;

@Local
public interface IClientLocal {
	
	public List<Client>liste();
	public int add(Client client);

}
