import React from 'react'
import { Link } from 'react-router-dom'

const Navigation = (props) => {

    return (
        <>
        <ul>
            <li><Link to="/">Home</Link></li>
            <li><Link to="/create">Create</Link></li>
            <li><Link to="/list">List</Link></li>
            <li><Link to="/signup">Signup</Link></li>
            <li>{ localStorage.getItem("0") ? 
            <button onClick={() => {
                localStorage.clear()
                props.history.push("/")
                console.log(localStorage.getItem("0"))
            } }>logout</button> : 
            <Link to="/login">login</Link> }</li>
            { localStorage.getItem("0") && <li><Link to={`/mypage/${localStorage.getItem("0")}`}>My Page</Link></li> }
        </ul>
        </>
    )
}

export default Navigation