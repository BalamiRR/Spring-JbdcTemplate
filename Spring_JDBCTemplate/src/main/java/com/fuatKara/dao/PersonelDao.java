package com.fuatKara.dao;

import com.fuatKara.model.Personel;
public interface PersonelDao {

	// DAO'lar genellikle interface'dir. Class degildir.
	public void add(Personel personel);
	public Personel idSearch(int id); // idSearch Asagidaki readPersonel'le ayni islemi yapiyor.
	public Personel nameSearch(String name);
	public Personel surnameSearch(String surname);
	public Personel experienceSearch(int experience);
	// public Personel personelSearch(int id, String name, String surname, int
	// tecrube);
	
	//Bu asagi kismi jdbc icin yapildi. Hepsinde jdbc template var.
	public void createPersonel(Personel personel); // Personel tipinde biseyi al sisteme ekle. Birseyi olusturuyorsak nesne yi almamiz laizm Personel personel.
	public Personel readPersonel(int id);//id degerine gore adami okuyoruz,geriye nesneler halinde gonderiyoruz.
	public Personel readPersonelExperience(int experience);
	public void updatePersonel(Personel personel, int id);// Personel(Kisiden) id'sini alarak update edicen.
	public void deletePersonel(int id); // bi sey silindigindede geriye bisey dondurmeye gerek yoktur o yuzden void
										// ekliyoruz hepsine
 
	// Yani tabloda bir degisiklik yapiliyorsa. Mesela, create yeni tablo yaratir
	// update tabloyu gunceller ve degisiklik yapar.
	// delete tabloyu siler,degisiklik yapar.
	// AMA !!!! read tabloda degisiklik yapmaz olani gosterir.
	
	
	
	//NOTE : readPersonel,searchidhostfk
}