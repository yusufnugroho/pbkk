package id.ac.its.pbkk.pendidikan.data;

import id.ac.its.pbkk.pendidikan.domain.Thn_ajaran;

import java.util.List;

public interface Thn_ajaranDAO {
	  
	Thn_ajaran findById(String ID_THN_AJARAN);
	void save(Thn_ajaran thn_ajaran);
	  
	void update(Thn_ajaran thn_ajaran);
	 
	void delete(Thn_ajaran thn_ajaran);
	
	public List<Thn_ajaran> list();

}
