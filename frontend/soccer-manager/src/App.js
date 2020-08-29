import React from 'react';
import logo from './logo.svg';
import requestService from './requests/RequestService';
import NavTable from './drawer/NavTable';
import './App.css';
import TopBar from './TopBar/TopBar';

const callbackResponse = playerArray => {
  console.log(playerArray[0].position);
}

const onButtonClick = _ => {
  requestService.getAllPlayers(callbackResponse);
}

function App() {
  return (
    <div className="main">
      <NavTable/>
      <TopBar/>
    </div>
  );
}

export default App;
