const prompt = require('prompt-sync')()

function Kendaraan(Plat, merk, pajak){
    this.Plat = Plat
    this.merk = merk
    this.pajak = pajak
}
Kendaraan.prototype.inputAtribut = function(){
    this.Plat = prompt('Masukkan Nomor Kendaraan : ')
    this.merk = prompt('Masukkan Merk : ')
    this.pajak = prompt('Masukkan Pajak Kendaraan : ')
}
 
 Kendaraan.prototype.print = function(){
     console.log('---Info Kendaraan---')
        console.log('Nomor Kendaraan : ', this.Plat)
        console.log('Merk : ', this.merk)
        this.printFasiTambahan()
        console.log('Masukkan Pajak Kendaraan\t: ', this.pajak)
        console.log('Total Pembayaran Pajak\t: ', this.hitungPajak)
 }

//Sedan
function Sedan(fasKeamanan, kapasitasCC, fasKenyamanan){
this.fasKeamanan = fasKeamanan
this.kapasitasCC = kapasitasCC
this.fasKenyamanan = fasKenyamanan
}

Sedan.prototype = new Kendaraan()
Sedan.prototype.constructor = Kendaraan

Sedan.prototype.FasiTambahan = function(){
    this.fasKeamanan = prompt('Masukkan Fasilitas Keamanan : ')
    this.kapasitasCC = prompt('Masukkan Kapasitas (dalam CC) : ')
    this.fasKenyamanan = prompt('Masukkan Fasilitas Kenyamanan : ')
}

Sedan.prototype.printFasiTambahan = function(){
    console.log('Fasilitas Keamanan : ', this.fasKeamanan)
    console.log('Kapasitas CC : ', this.kapasitasCC)
    console.log('Fasilitas Kenyamanan : ', this.fasKenyamanan)
}

Sedan.prototype.hitungPajak = function(){
    this.hitungPajak = (Number(this.pajak * 1 + (this.pajak * this.kapasitasCC * 0.00005)))
}

//Bus
function Bus(kapPenumpang, kapBagasi){
    this.kapPenumpang = kapPenumpang
    this.kapBagasi = kapBagasi
}

Bus.prototype = new Kendaraan()
Bus.prototype.constructor = Kendaraan

Bus.prototype.FasiTambahan = function(){
    this.kapPenumpang = prompt('Masukan Kapasitas Penumpang : ')
    this.kapBagasi = prompt('Masukkan Kapasitas Bagasi(kg) : ')
}

Bus.prototype.printFasiTambahan = function(){
    console.log('Kapasitas Penumpang : ', this.kapPenumpang)
    console.log('Kapasitas Bagasi : ', this.kapBagasi)
}

Bus.prototype.hitungPajak = function(){
    this.hitungPajak = (Number(this.pajak * 1 + (this.pajak * this.kapPenumpang * this.kapBagasi * 0.00005)))
}

//input data
console.log('Input Data Sedan')
var obSedan = new Sedan()
obSedan.inputAtribut()
obSedan.FasiTambahan()

console.log('\nInput Data Bus')
var obBus = new Bus()
obBus.inputAtribut()
obBus.FasiTambahan()

console.log('\n---Data Seluruh Kendaraan---')

console.log('1. Sedan')
obSedan.hitungPajak()
obSedan.print()


console.log('\n2. Bus')
obBus.hitungPajak()
obBus.print()