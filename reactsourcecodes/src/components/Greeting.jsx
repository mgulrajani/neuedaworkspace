import React from 'react'

const Greeting=({name,age})=>{

let isMorning =  new Date().getHours() <12;
let greeting =  isMorning ? `Good Morning  ${name}`: `Good Evening ${name}`;


return (

<>
<p>{greeting}</p>
<h4>You are {age}, yay </h4>
</>

)


}

export default Greeting;
