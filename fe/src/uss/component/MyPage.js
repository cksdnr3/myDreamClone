import React, { useCallback, useEffect, useState } from 'react'
import axios from 'axios'

const MyPage = (props) => {
    const [user, setUser] = useState({})
    const onChange = useCallback( e => {
        setUser({
            ...user,
            [e.target.name]: e.target.value
        })
    }, [user])

    const getDetail = () => {
        axios.get(`http://localhost:8080/users/${props.match.params.username}`)
        .then(res => {
            setUser(res.data)
        })
        .catch(err => {
            console.log(err)
        })
    }

    const doModify = () => {
        axios.put(`http://localhost:8080/users/${props.match.params.username}`, user)
        .then(res => {
            setUser(res.data)
            localStorage.clear()
            localStorage.setItem("0", res.data)
            getDetail();
        })
        .catch(err => {
            console.log(err)
        })
    }

    const doDelete = () => {  
        if(window.confirm("Delete to confirm")) {
            axios.delete(`http://localhost:8080/users/${props.match.params.username}`)
            .then(res => {
                alert(res.data)
                localStorage.clear()
                props.history.push('/')
            })
        }
    }

    useEffect(() => getDetail())

    return (
        <>
        <h1>MyPage</h1>
        <form onSubmit={e => e.preventDefault()}>
            <label>ID:
                <input type="text" name="username" value={user.username || ""} onChange={onChange} />
            </label><br/>
            <label>Password:
                <input type="text" name="password" value={user.password || ""} onChange={onChange} />
            </label><br/>
            <label>Birthday:
                <input type="text" name="birthday" value={user.birthday || ""} onChange={onChange} />
            </label><br/>
            <label>Name:
                <input type="text" name="realName" value={user.realName || ""} onChange={onChange} />
            </label><br/>
            <label>E-mail:
                <input type="text" name="email" value={user.email || ""} onChange={onChange} />
            </label><br/>
            <label>E-Gender:
                <input type="text" name="gender" value={user.gender || ""} onChange={onChange} />
            </label><br/>
            <label>PhoneNumber:
                <input type="text" name="phoneNumber" value={user.phoneNumber || ""} onChange={onChange} />
            </label><br/>
            <button type="submit" onClick={doModify}>modify</button>
            <button onClick={doDelete}>delete</button>
        </form>
        
        </>
    )
}

export default MyPage