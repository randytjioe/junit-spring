Feature: Customer Login ke Web Automation Practice
	Scenario: Testing Login Customer
		Given Customer mengakses url
		And Customer login dengan username dan password
		When Customer berhasil login
		And Customer Memilih Produk Pakaian Wanita
		And Customer Memilih Produk Pakaian Gaun
		And Customer Memilih Produk Pakaian Kaos
		Then Customer Berhasil Melakukan Transaksi Pembayaran 
		