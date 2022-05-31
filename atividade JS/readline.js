var readlineSync = require('readline-sync');
 
// Wait for user's response.
var userName = readlineSync.question('escolha qual prato deseja fazer 1-pipoca 2-macarrao 3-carne 4-feijao 5-brigadeiro');
console.log(`ok Lucas`);

var idade = readlineSync.question('por quanto tempo deseja ');z
 
// Handle the secret text (e.g. password).
var favFood = readlineSync.question('1 ', {
  hideEchoBack:false // The typed text on screen is hidden by `*` (default).
});
console.log('Oh, ' + userName + ' loves ' + favFood + '!');