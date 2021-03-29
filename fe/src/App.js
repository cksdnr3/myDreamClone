import { React } from 'react';
import './App.css';
import { Link, Route } from 'react-router-dom'
import Create from './Create'
import List from './List'
import Detail from './Detail'

const App = () => {

    return (<>
    <ul>
        <li><Link to="/">Home</Link></li>
        <li><Link to="/create">Create</Link></li>
        <li><Link to="/list">List</Link></li>
    </ul>
    <Route path="/create" component={Create} />
    <Route path="/list" component={List} />
    <Route path='/detail/:id' component={Detail} />
    </>);
}

export default App;