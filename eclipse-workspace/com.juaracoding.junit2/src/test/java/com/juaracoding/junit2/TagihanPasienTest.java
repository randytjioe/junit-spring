package com.juaracoding.junit2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit2.pasien.Pasien;
import com.juaracoding.junit2.tagihan.TagihanMenginap;

public class TagihanPasienTest {
	
	Pasien pasien;
	TagihanMenginap tagihanMenginap;

	@Before
	public void setUp() {
		pasien = new Pasien();
		tagihanMenginap = new TagihanMenginap();
	}

	@Test
	public void testTotalTagihanKlsVIP() {
		pasien.setKelas("Kelas VIP");
		pasien.setMenginap(3);
		double expect = 750000;
		double actual = tagihanMenginap.totalTagihan(pasien);
		assertEquals(expect, actual, 0.0);
	}
	
	@Test
	public void testTotalTagihanKls1() {
		pasien.setKelas("Kelas VIP");
		pasien.setMenginap(3);
		double expect = 750000;
		double actual = tagihanMenginap.totalTagihan(pasien);
		assertEquals(expect, actual, 0.0);
	}
		
			
	@Test
	public void testDiizinkan() {
		String expect="Diizinkan";
		String actual = tagihanMenginap.cekJalurGanjilGenap(12, 1234);
		assertEquals(expect,actual);
	}
	
	@Test
	public void testDilarang() {
		String expect="Dilarang";
		String actual = tagihanMenginap.cekJalurGanjilGenap(13, 1235);
		assertEquals(expect,actual);
	}
}

