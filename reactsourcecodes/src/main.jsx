import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import './index.css'


/* const p1 = React.createElement("p",null,"This is a paragraph");
const b1 = React.createElement("button",null,"Click");
const myDiv= React.createElement("div",null,[p1,b1]);
const root=ReactDOM.createRoot(document.getElementById('root'));
root.render(myDiv);
 

const p1 = <p>this is a paragraph</p>
const b1 = <button>Click</button>
const myDiv =  <div>{p1}{b1}</div>
const root=ReactDOM.createRoot(document.getElementById('root'));
root.render(myDiv);*/



 ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
)
 