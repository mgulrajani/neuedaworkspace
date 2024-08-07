import React from 'react'

const Employee=({employee})=>{

    return (
        <li>
            <h2>{employee.name}{employee.salary}</h2>

        </li>
    )

}

export default Employee;