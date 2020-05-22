import React from "react";
import {Link} from "react-router-dom";

const Navbar = () => {
    return <>
        <Link to="/">Strona główna </Link>
        <Link to="/activities-by-day">Lista aktywności</Link>

    </>
};

export default Navbar;