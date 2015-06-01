package id.ac.its.pbkk.pendidikan.data;


import java.util.List;

import id.ac.its.pbkk.pendidikan.domain.Thn_ajaran;
import id.ac.its.pbkk.pendidikan.data.*;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Repository("thn_ajaranDAO")
public class Thn_ajaranDAOImpl implements Thn_ajaranDAO{
	public Thn_ajaranDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	

	public Thn_ajaran findById(int ID_THN_AJARAN) {
		return (Thn_ajaran) sessionFactory.getCurrentSession().get(Thn_ajaran.class, ID_THN_AJARAN);
	}
	
	public List<Thn_ajaran> list() {
		List<Thn_ajaran> listThn_ajaran = (List<Thn_ajaran>) sessionFactory.getCurrentSession().createQuery("from Thn_ajaran").list();
		return listThn_ajaran;
	}
	
	public void update(Thn_ajaran thn_ajaran) {
		sessionFactory.getCurrentSession().update(thn_ajaran);
	}

	public void delete(Thn_ajaran thn_ajaran) {
		sessionFactory.getCurrentSession().delete(thn_ajaran);
	}
	public void save(Thn_ajaran thn_ajaran){
		sessionFactory.getCurrentSession().save(thn_ajaran);
	}

	public Thn_ajaran findById(String ID_THN_AJARAN) {
		// TODO Auto-generated method stub
		return null;
	}

}	
