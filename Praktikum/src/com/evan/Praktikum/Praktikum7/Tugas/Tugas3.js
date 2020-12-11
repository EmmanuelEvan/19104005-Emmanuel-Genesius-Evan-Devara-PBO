var numbers = [5, 6, 2, 3, 7];
//menggunakan apply
var maximal = Math.max.apply(Math,numbers);
var minimal = Math.min.apply(Math,numbers);

//memanggil fungsi 
console.log("Nilai: " + numbers);
console.log("Nilai maksikum : "+ maximal );
console.log("Nilai Minimal: "+ minimal );