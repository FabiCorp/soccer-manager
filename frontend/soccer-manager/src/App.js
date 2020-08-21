import React from 'react';
import logo from './logo.svg';
import requestService from './requests/RequestService';
import NavTable from './NavTable/NavTable';
import './App.css';

const callbackResponse = playerArray => {
  console.log(playerArray[0].position);
}

const onButtonClick = _ => {
  requestService.getAllPlayers(callbackResponse);
}

function App() {
  return (
    <div className="main">
      <div className="navigation">
        <NavTable/>
      </div>
    </div>
  );
}

export default App;
