//rface
import React, { useState } from 'react'
import Overview from './Overview';
import Search from './Search';

const Parent = () => {
  
  const [ searchItem,setSearchItem]  = useState('javascript');

  const updateSearch=(event)=>{

        setSearchItem((prevData)=>event.target.value);
  }
  
    return (



    <div>

      <Search searchHandler={updateSearch}/>
      <Overview searchItem={ searchItem}/>
      
    </div>
  )
}

export default Parent