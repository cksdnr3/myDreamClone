import { React } from 'react';
import { Route, Router, Switch } from 'react-router-dom'
import Home from './cmm/component/Home'
import Create from './auction/component/Create'
import List from './auction/component/List'
import Detail from './auction/component/Detail'
import Signup from './uss/component/Signup'
import Login from './uss/component/Login'

const App = () => {

    return (<>
    <Route path="/" component={Home} />
    <Route path='/create' component={Create} />
    <Route path='/list' component={List} />
    <Route path='/detail/:id' component={Detail} />
    <Route path='/signup' component={Signup} />
    <Route path='/login' component={Login} />
    </>);
}

export default App;