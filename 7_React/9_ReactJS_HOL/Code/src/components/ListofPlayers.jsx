import React from 'react';

const ListofPlayers = ({ players }) => {
  return (
    <div>
      {players.map((item, index) => (
        <div key={index}>
          <li>
            Mr. {item.name} <span>{item.score}</span>
          </li>
        </div>
      ))}
    </div>
  );
};

export default ListofPlayers;
