import React from 'react'

const Search = ({searchHandler}) => {
  return (
    <div>
        <input type='search' onChange={searchHandler}/>
    </div>
  )
}

export default Search