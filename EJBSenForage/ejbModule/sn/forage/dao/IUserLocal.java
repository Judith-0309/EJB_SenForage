package sn.forage.dao;

import javax.ejb.Local;

import sn.forage.entities.User;

@Local
public interface IUserLocal {
	
	public int add(User user);
	public User getUserByEmailAndPassword(String email, String password);
}
