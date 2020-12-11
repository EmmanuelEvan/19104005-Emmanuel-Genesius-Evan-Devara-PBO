//atribut
var num = [50,60,70,80,90]
var sum = 0
for(var i in num){
    sum += num[i]
}

var numbagi = num.length

var average = sum/numbagi

//function2
function myFunction2(arg1,arg2){
    this.Name  = arg1
    this.nilai = arg2
}

//membuat objek dari fungsi myfunction
var x = new myFunction2('Indah Pertiwi',average )
console.log("Nama : " + x.Name )
console.log("Rata - rata nilai kamu : " + average)