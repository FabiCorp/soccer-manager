import React from 'react';
import logo from './logo.svg';
import requestService from './requests/RequestService';
import './App.css';

const callbackResponse = playerArray => {
  console.log(playerArray[0].position);
}

const onButtonClick = _ => {
  requestService.getAllPlayers(callbackResponse);
}

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <button className="players-button" onClick={onButtonClick}>GET PLAYERS YOU IDIOT</button>
      </header>
    </div>
  );
}

export default App;
