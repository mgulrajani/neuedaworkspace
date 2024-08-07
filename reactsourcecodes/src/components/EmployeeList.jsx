import React from 'react'
import Employee from './Employee';
const EmployeeList=({employees})=>{

    return (
       <ul>
            {employees.map((employee)=>(

<Employee  key={employee.id} employee={employee}/>
            ))}

        </ul>
    )

}

export default EmployeeList;