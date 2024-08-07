import React, { useState } from 'react'

const EmailInputValidation = () => {

    const [ errorMessage, setErrorMessage ] = useState('')

    const validateEmail=(event)=>{
        const emailData =  event.target.value;
        console.log(emailData)
        if(emailData.trim()==='' || !emailData.includes('@')){
            setErrorMessage('Invalid Email')
        }
        else
        {
            setErrorMessage('no error , you can proceed further')
        }
        
    }

  return (
    <div>EmailInputValidation
   
   <input type="text" placeholder='Enter email' id='email' 
   onBlur={validateEmail}/>

 {errorMessage}



    </div>
  )
}

export default EmailInputValidation