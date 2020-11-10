package sn.forage.dao;

import java.util.List;

import javax.ejb.Local;

import sn.forage.entities.Village;

@Local
public interface IVillageLocal {
	
public List<Village>liste();
public int add(Village village);

}
