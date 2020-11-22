//for loop
for(var i = 0; i < 5; i++){
    console.log(i + '. Berfikir')
}
console.log('\n')

//for/in
var nama = [{fName : 'Bagus', lName : 'Bayu', age : 20}, {fName : 'Ajeng', lName : 'Fitria', age : 19}]

for(var x in nama){
    console.log('Asprak\t : ')
    console.log(nama[x].fName)
    console.log(nama[x].lName)
    console.log(nama[x].age)
    console.log('\n')
}

//for/of
var buah = ['apel', 'anggur', 'jeruk']
for(var x of buah){
    console.log('ini buah ' + x)
}