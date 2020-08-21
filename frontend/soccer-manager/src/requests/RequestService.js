
const getAllPlayers = callback => {
    fetch('http://localhost:8080/players')
    .then(response => response.json())
    .then(data => callback(data));
}

module.exports = {
    getAllPlayers
}