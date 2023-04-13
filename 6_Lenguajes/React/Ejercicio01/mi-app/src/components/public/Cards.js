import React, { useEffect, useState } from "react";
import { Card } from "./Card";
import RickAndMortyService from "../../services/RickAndMorty.service";

export const Cards = () => {
  const [personajes, setPersonajes] = useState([]);

  useEffect(() => {
    RickAndMortyService.getAllCharacters()
      .then((data) => setPersonajes(data.results))
      .catch((error) => console.log(error));
  }, [personajes]);

  const cardList = personajes.map((m) => <Card personaje={m} key={m.id} />);

  return (
    <div className="album py-5 bg-light">
      <div className="container">
        <div className="row">{cardList}</div>
      </div>
    </div>
  );
};
