import React from "react";
import { Route, Routes } from "react-router-dom";
import "./App.css";
import { Footer } from "./components/public/footer";
import { Navbar } from "./components/public/Navbar";
import { Detail } from "./components/public/Detail";
import { UserForm } from "./components/public/UserForm";
import Main from "./components/public/Main";

function App() {
  return (
    <div className="App">
      <Navbar />

      <Routes>
        <Route exact path={"/"} element={<Main />} />
        <Route path={"/details/:id"} element={<Detail />} />
        <Route path={"/user-form"} element={<UserForm />} />
      </Routes>

      <Footer />
    </div>
  );
}
export default App;
