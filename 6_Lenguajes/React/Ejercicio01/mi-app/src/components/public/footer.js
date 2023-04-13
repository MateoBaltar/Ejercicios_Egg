import React, { useState } from "react";
import { Link } from "react-router-dom";

export const Footer = () => {
  const [clicks, setClicks] = useState(0);

  const year = new Date().getFullYear();
  const companyName = "Mateo Inc.";

  const handleClick = () => {
    setClicks(clicks + 1);
  };
  const restarClicks = () => {
    setClicks(clicks - 1);
  };

  return (
    <div className="container">
      <footer className="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p className="col-md-4 mb-0 text-muted">
          &copy; {year} {companyName} Clicks={clicks}
        </p>

        <button
          className="btn btn-sm btn-outline-success"
          onClick={handleClick}
        >
          Sumar clicks
        </button>
        <button
          className="btn btn-sm btn-outline-danger"
          onClick={restarClicks}
        >
          Restar clicks
        </button>

        <ul className="nav col-md-4 justify-content-end">
          <li className="nav-item">
            <Link to={"/"} className="nav-link px-2 text-muted">
              Home
            </Link>
          </li>
        </ul>
      </footer>
    </div>
  );
};
