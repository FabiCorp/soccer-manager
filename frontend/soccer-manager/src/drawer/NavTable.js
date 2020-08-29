import React from 'react';
import navTableInput from './NavTableInput';
import "./NavTable.css"

const generateTableElements = _ => {
    var tableElements = [];
    navTableInput.forEach(element => {
        const navBarElement = <div className="nav-bar-element">{element.name}</div>;
        tableElements.push(navBarElement);
    })

    return tableElements;
}

const NavTable = _ => {
    
    return (
        <div className="nav-bar-container">
            <div className="nav-bar-header">Soccer-Manager</div>
            {generateTableElements()}
        </div>
    )
}

export default NavTable;