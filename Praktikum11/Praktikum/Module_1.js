var person = (function(){
    var age = 25

    return {
        name : 'Painom',

        getAge : function(){
            return age
        },
        
        growOlder : function(){
            age++
        }
    }
}())

console.log('Nama Person\t: ', person.name)
console.log('Umur Person\t: ', person.getAge())

person.age = 100
console.log('Umur person yang diganti\t: ', person.getAge())

person.growOlder()
console.log('Umur person yang ditambah\t: ', person.getAge())