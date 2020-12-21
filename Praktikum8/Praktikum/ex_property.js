var person0 = {}

var person1 = {name : 'Evan' }

var person2 = new Object()
person2.name = 'Renata'

person1.age = 19
person2.age = 19

console.log('Object dari person1 : ')
console.log(`Name\t:  ${person1.name}`)
console.log('Age\t\t: ' + person1.age)

console.log()

//cara keduan akses
console.log('Object dari person2 : ')
console.log(`Name\t:  ${person2['name'] }`)
console.log('Age\t\t: ' + person2.age)