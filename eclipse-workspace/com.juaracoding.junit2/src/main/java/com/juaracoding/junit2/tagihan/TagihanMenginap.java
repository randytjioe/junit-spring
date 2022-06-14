package com.juaracoding.junit2.tagihan;

import com.juaracoding.junit2.pasien.Pasien;

public class TagihanMenginap {
	
	public double totalTagihan(Pasien pasien) {
		double total = 0;
		
		if(pasien.getKelas().equals("Kelas VIP")) {
			total = 250000 * pasien.getMenginap();
		} else if (pasien.getKelas().equals("Kelas 1")) {
			total = 200000 * pasien.getMenginap();
		}
		
		return total;
	}
		public String cekJalurGanjilGenap(int tgl, int platNomor) {
		
			String statement ="";
			
			if (tgl %2 == 0) {
				if(platNomor%2==0) {
					statement ="Diizinkan";
				} else {
					statement ="Dilarang";
				}
			}		else if(tgl %2 == 1) {
				if(platNomor%2==0) {
					statement ="Diizinkan";
				} else {
					statement ="Dilarang";
				}
			}
			return statement;
}
}
