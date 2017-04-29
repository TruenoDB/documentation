/* require if in node */
const Trueno = require('trueno-javascript-driver');

/* create driver instance */
let trueno = new Trueno({host: 'http://localhost', port: 8000});

/* connecting to trueno backend */
trueno.connect((s)=> {
  /* connected, s is a socket */
  console.log('connected', s.id);
}, ()=> {
  /* disconnected from trueno backend */
  console.log('disconnected');
});