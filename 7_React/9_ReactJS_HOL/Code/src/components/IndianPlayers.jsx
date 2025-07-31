import React from 'react';
export function OddPlayers({ players }) {
  const [first, , third, , fifth] = players; 
  return (
    <div>
      <h2>Odd Players</h2>
      <li>First: {first}</li>
      <li>Third: {third}</li>
      <li>Fifth: {fifth}</li>
    </div>
  );
}

export function EvenPlayers({ players }) {
  const [, second, , fourth, , sixth] = players;
  return (
    <div>
      <h2>Even Players</h2>
      <li>Second: {second}</li>
      <li>Fourth: {fourth}</li>
      <li>Sixth: {sixth}</li>
    </div>
  );
}

// b. Declare and merge T20 & Ranji Trophy players
const T20Players = ['First Player', 'Second Player', 'Third Player'];
const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
export const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

const IndianPlayersComponent = () => {
  // Team array for Odd/Even players
  const team = ['Sachin 1', 'Dhoni 2', 'Virat 3', 'Rohit 4', 'Yuvaraj 5', 'Raina 6'];

  return (
    <div>
      <OddPlayers players={team} />
      <EvenPlayers players={team} />

      <h2>List of Indian Players Merged:</h2>
      {IndianPlayers.map((player, index) => (
        <div key={index}>
          <li>Mr. {player}</li>
        </div>
      ))}
    </div>
  );
};

export default IndianPlayersComponent;
