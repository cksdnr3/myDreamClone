import { React } from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'
import Home from './cmm/component/Home'
import Create from './auction/component/Create'
import List from './auction/component/List'
import Detail from './auction/component/Detail'
import Signup from './uss/component/Signup'
import Login from './uss/component/Login'
import Navigation from './cmm/component/Navigation';
import MyPage from './uss/component/MyPage'

const App = () => {

    return (<>
        <Route path="/" component={Home} />
        <Route path="/" component={Navigation} />
        <Route path='/create' component={Create} />
        <Route path='/list' component={List} />
        <Route path='/detail/:id' component={Detail} />
        <Route path='/signup' component={Signup} />
        <Route path='/login' component={Login} />
        <Route path='/mypage/:username' component={MyPage} />
    </>);
}

export default App;