package id.ac.its.pbkk.pendidikan.test;


import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import id.ac.its.pbkk.pendidikan.data.*;
import id.ac.its.pbkk.pendidikan.domain.*;
import id.ac.its.pbkk.pendidikan.test.*;

public class TestThn_Ajaran {

	
	/*
	 * 
	 * Testing Area*/
	 public static void main( String[] args )
	    {
	    	System.out.println("load context");
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			int idtes = 2015;
			
			//test pekerjaan
			Thn_ajaranDao thn_ajaranDao = (Thn_ajaranDao) context.getBean("thn_ajaranDAO");
			
			//create
			Thn_ajaran lwcr = new Thn_ajaran();
			lwcr.setID_THN_AJARAN("testYusuf");
			lwcr.setTHN_THN_AJARAN(idtes);
			thn_ajaranDao.save(lwcr);
			
			//read list
			List<Thn_ajaran> thn_ajaran = Thn_ajaranDAO.list();
			for(int i =0 ;i<pekerjaan.size();i++){
				Pekerjaan pekerjaan1 = pekerjaan.get(i);
				System.out.println("Id : " + pekerjaan1.getId());	
				System.out.println("Nama : " + pekerjaan1.getNama());
			}
			
			/*
			//update
			Pekerjaan lwup = new Pekerjaan();
			lwup.setNama("Buruh Cuci");
			lwup.setId(idtes);
			pekerjaanDao.update(lwup);
			*/
			//read id
			Pekerjaan rd = new Pekerjaan();
			rd.setId(idtes);
			Pekerjaan rd1 = pekerjaanDao.findById(idtes);
			System.out.println("Id : " + rd1.getId());	
			System.out.println("Nama : " + rd1.getNama());
			
			
//			//delete
//			Pekerjaan lwdl = new Pekerjaan();
//			lwdl.setId(idtes);
//			pekerjaanDao.delete(lwdl);
			
			
			
			
			context.close();
	    }
}
