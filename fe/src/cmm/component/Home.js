import { React } from 'react';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import Create from '../../auction/component/Create'
import List from '../../auction/component/List'
import Detail from '../../auction/component/Detail'
import Signup from '../../uss/component/Signup'

const Home = () => {

    return (<>
    <ul>
        <li><Link to="/">Home</Link></li>
        <li><Link to="/create">Create</Link></li>
        <li><Link to="/list">List</Link></li>
        <li><Link to="/signup">Signup</Link></li>
    </ul>
    <Route path='/create' component={Create} />
    <Route path='/list' component={List} />
    <Route path='/detail/:id' component={Detail} />
    <Route path='/signup' component={Signup} />
    </>);
}

export default Home;