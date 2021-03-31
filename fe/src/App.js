import { React } from 'react';
import { Route, Router, Switch } from 'react-router-dom'
import Home from './cmm/component/Home'


const App = () => {

    return (<>
    <Route path="/" component={Home} />

    </>);
}

export default App;