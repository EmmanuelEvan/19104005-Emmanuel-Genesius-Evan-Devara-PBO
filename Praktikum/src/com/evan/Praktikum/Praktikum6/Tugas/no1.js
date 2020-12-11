//Deklarasi
var index ,num, cons

num = 0
index = i = 0
bil = ''

//Method
for(i = 1; i <= 50; i++){
    cons = 0

    for(num = i; num >= 1; num = num - 1){
        if(i % num == 0){
            cons = cons + 1
        }
    }
    if(cons == 2){
        bil = bil + i + ', '
    }

}

//Output
console.log('Bilangan Prima\t = ' + bil)