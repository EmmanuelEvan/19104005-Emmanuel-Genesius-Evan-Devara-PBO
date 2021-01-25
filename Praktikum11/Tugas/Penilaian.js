const prompt = require('prompt-sync')()

//variabel
var menu = true
var idMahasiswa = []
var mahasiswa = {}
var choice
let index = 0

function Mahasiswa(paramName, paramBirth, paramNim, paramProdi, paramNilai) {//parameter
  var name = paramName
  var birth = paramBirth
  var nim = paramNim
  var prodi = paramProdi
  var nilai = paramNilai

  //constructor
  this.getName = function() {
    return name
  }

  this.getNim = function() {
    return nim
  }

  this.getBirth = function() {
    return birth
  }

  this.getAge = function() {
    let year = birth.slice(birth.length - 4)
    return 2021 - year
  }

  this.getProdi = function() {
    return prodi
  }

  this.getNilai = function() {
    return nilai
  }

  this.setNilai = function(newNilai) {
    nilai = newNilai
  }
}

//menu
while (menu == true) {
  console.log('<===== Menu Penilaian =====>')
  console.log('1. Tambah Mahasiswa')
  console.log('2. Penilaian')
  console.log('3. Lihat seluruh Mahasiswa')
  console.log('4. Keluar')
  console.log('')
  choice = prompt('Masukan pilihan\t: ')

  switch(choice) {
    case '1'://tambah mahasiswa
      console.log('\n<==== Tambah Mahasiswa ====>')

      let name = prompt('Input Nama\t\t\t: ')
      let birth = prompt('Input Tanggal Lahir\t: ')
      let nim = prompt('Input NIM\t\t\t: ')
      console.log('')
      console.log('<= Pilih Prodi')
      console.log('1. S1 SE')
      console.log('2. S1 IF')
      console.log('3. S1 SI')
      let prod = prompt('Input angka Prodi\t: ')
      let prodi
      if (prod == '1') {
        prodi = 'S1 SE'
      } else if (prod == '2') {
        prodi = 'S1 IF'
      } else {
        prodi = 'S1 SI'
      }

      mahasiswa = new Mahasiswa(name, birth, nim, prodi)
      idMahasiswa.push(mahasiswa)

      console.log('')

      break

    case '2': //penilaian
      console.log('\n<==== Penilaian ====>')

      let niim = prompt('Masukan NIM\t\t: ')
      let nilai = prompt('Masukan Nilai\t: ')

      let nilaii
      if (nilai >= 80 && nilai <= 100) {
        nilaii = 'A'

      } else if (nilai >= 60 && nilai <= 79) {
        nilaii = 'B'

      } else if (nilai >= 40 && nilai <= 69) {
        nilaii = 'C'

      } else if (nilai >= 0 && nilai <= 39) {
        nilaii = 'D'

      } else {
        nilaii = 'null'
      }

      for (let a in idMahasiswa) {
        if (idMahasiswa[a].getNim() == niim) {
          idMahasiswa[a].setNilai(nilaii)
        }
      }

      console.log('')

      break

    case '3'://lihat seluruh mahasiswa
      for (let x in idMahasiswa) {
        console.log('\n<==== Data Mahasiswa ====>')

        console.log(`\nMahasiswa\t\t: ${index}`)
        index++
        console.log(`Nama\t\t\t: ${idMahasiswa[x].getName()}`)
        console.log(`Tanggal Lahir\t: ${idMahasiswa[x].getBirth()}`)
        console.log(`Umur\t\t\t: ${idMahasiswa[x].getAge()}`)
        console.log(`NIM\t\t\t\t: ${idMahasiswa[x].getNim()}`)
        console.log(`Prodi\t\t\t: ${idMahasiswa[x].getProdi()}`)
        console.log(`Grade\t\t\t: ${idMahasiswa[x].getNilai()}`)

      }

      console.log('')

      break

    case '4'://keluar
      menu = false
      console.log('Bye !!!')
      break

    default :
      console.log('Input yang Anda Masukan Salah !!')
      break
  }
}