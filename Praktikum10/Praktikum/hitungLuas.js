//save as hitung luas.js
function PersegiPanjang(panjang, lebar) {
  this.panjang = panjang
  this.lebar = lebar
}

PersegiPanjang.prototype.getLuas=function(){
  var luas = this.panjang*this.lebar
  console.log('Luas : ',this.panjang, ' X ', this.lebar, ' : ', luas)
}

PersegiPanjang.prototype.print=function(){
  var luas = this.panjang*this.lebar
  console.log('Panjang Sisi : ', this.panjang)
  console.log('Lebar Sisi : ', this.lebar)
}

//turunan fungsi
function Persegi (sisi){
  this.panjang = sisi
  this.lebar = sisi
}

//menginherit fungsi persegi panjang
Persegi.prototype = new PersegiPanjang()
Persegi.prototype.constructor = PersegiPanjang

//redefinisi funsi print()
Persegi.prototype.print = function(){
  console.log('Panjang sisi: ',this.panjang)
}

//const prompt=require('prompt-sync')()

console.log('Input Persegi Panjang')
var obPersegiPanjang = new PersegiPanjang(
  prompt('Masukkan Panjang : '),
  prompt('Masukkan Lebar : ')
)

console.log('\nInput Persegi')
var obPersegi = new Persegi(
  prompt('Masukkan Panjang Sisi : ')
)

console.log('\nMenghitung Luas Persegi Panjang')
obPersegiPanjang.print()
obPersegiPanjang.getLuas()

console.log('\nMenghitung Luas Persegi ')
obPersegi.print()
obPersegi.getLuas()