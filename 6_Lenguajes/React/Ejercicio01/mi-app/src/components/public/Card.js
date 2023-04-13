import React from "react";
import { Link } from "react-router-dom";

export const Card = ({ personaje }) => {
  return (
    <div className="col-md-4">
      <div className="card mb-4 box-shadow">
        <img src={personaje.image} alt="" />
        <h3 className="mb-0 text-dark"> {personaje.name}</h3>
        <div className="card-body">
          <p className="card-text">{personaje.species}</p>
          <div className="d-flex justify-content-between align-items-center">
            <div className="btn-group">
              <button
                type="button"
                className="btn btn-sm btn-outline-secondary"
              >
                <Link to={`/details/${personaje.id}`} className="nav-link">
                  Detalle
                </Link>
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};
