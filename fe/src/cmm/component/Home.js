import { React } from 'react';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";


const Home = () => {

    return (<>
    <h1>Home</h1>
    <ul>
        <li><Link to="/">Home</Link></li>
        <li><Link to="/create">Create</Link></li>
        <li><Link to="/list">List</Link></li>
        <li><Link to="/signup">Signup</Link></li>
        <li><Link to="/login">login</Link></li>
    </ul>

    </>);
}

export default Home;