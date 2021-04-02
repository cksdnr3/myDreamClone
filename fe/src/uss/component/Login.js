import axios from 'axios'
import React, { useState } from 'react'

const Login = (props) => {
    const [username, setUsername] = useState("")
    const [password, setPassword] = useState("")

    const login = () => {
        axios.post(`http://localhost:8080/users/login`, { username, password })
            .then(res => {
                console.log(res)
                if (res.data) {
                    localStorage.clear()
                    localStorage.setItem("0", res.data)
                    console.log(localStorage.getItem("0"))
                    props.history.push('/')
                }
            })
            .catch(err => {
                console.log(err)
            })
    }
    
    return (
        <>
        <form onSubmit={e => e.preventDefault()}>
            <label>ID:
                <input type="text" value={username} onChange={ e => {
                    setUsername(e.target.value)
                }} />
            </label>
            <label>Password:
                <input type="password" value={password} onChange={ e => {
                    setPassword(e.target.value)
                }} />
            </label>
            <button type="submit" onClick={login} >Login</button>
        </form>
        </>
    )
}

export default Login