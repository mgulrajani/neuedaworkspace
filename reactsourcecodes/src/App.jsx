import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Greeting from './components/Greeting'
import EmployeeList from './components/EmployeeList'
import TermsOfUse from './components/TermsOfUse'
import EmailInputValidation from './components/EmailInputValidation'
import Parent from './components/statelifting/Parent'

function App() {
  
   
  const eList = [{"id":1,"name":"Shalini","salary":340000},
  {"id":2,"name":"Mohan","salary":450000},
  {"id":3,"name":"Ria","salary":560000}]
  return (
    <>
    <Parent />
    
    <EmailInputValidation />
     <TermsOfUse />



      <h1>Hello World!</h1>
      <Greeting  name="Jacky" age="21"/>
      <Greeting  name="Mitali"  age="22"/>

      <Greeting  name="Anita"/>

      

    </>
  )
}

export default App
