import React, { Component } from "react";
import { Cards } from "./Cards";

export default class Main extends Component {
  render() {
    return (
      <main role="main">
        <section className="jumbotron text-center">
          <div className="container">
            <h1 className="jumbotron-heading">Ejercicio API Rick and Morty</h1>
            <p className="lead text-muted">
              Tarjetas con los personajes, estas tambien contienen informacion
              de los mismos
            </p>
          </div>
        </section>
        <Cards />
      </main>
    );
  }
}
