import React ,{useState} from 'react'

const TermsOfUse = () => {

     const [showTerms  , setShowTerms]  = useState(false);

     


    const showTermsSummaryHandler=()=>{

           setShowTerms(!showTerms);
    }
   /*  let paratext = ''
    if (showTerms)
     paratext =  'By continuing on this click ......... your details will not be shared ...'
 */  return (
    <div>

    <button onClick={showTermsSummaryHandler}> Show Terms of Use</button>
    {showTerms ? <p>Your data is safe .....</p> : null }

    </div>
  )
}

export default TermsOfUse