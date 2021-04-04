import React, { useCallback, useState } from 'react'
import axios from 'axios'
import DatePicker from 'react-datepicker'
import 'react-datepicker/dist/react-datepicker.css';

const Signup = (props) => {
    const [birthday, setBirthday] = useState(new Date());
    const [inputs, setInputs] = useState({
        username: "",
        password: "",
        realName: "",
        email: "",
        gender: "man",
        phoneNumber: "",
        birthday
    })

    const {username, password, realName, 
        email, gender, phoneNumber} = inputs

    const onChange = useCallback(e => {
        setInputs({...inputs, [e.target.name]: e.target.value})
    }, [inputs])

    const signup = () => {
        axios.post(`http://localhost:8080/users/signup`, inputs)
        .then(res => {
            alert(res.data)
            if (res.data.indexOf("success")) {
                props.history.push("/")
            }
            props.history.push("/signup")
        })
        .catch(err => {
            console.log(err)
        })
    }

    return (
        <>
        <h2>Signup</h2>
        <form onSubmit={ e => e.preventDefault() }>
            <label>ID:
                <input type="text" name="username" value={username} onChange={onChange} />
            </label><br/>
            <label>Password:
                <input type="password" name="password" value={password} onChange={onChange} />
            </label><br/>
            <label>Name:
                <input type="text" name="realName" value={realName} onChange={onChange} />
            </label><br/>
            <label>E-mail:
                <input type="text" name="email" value={email} onChange={onChange} />
            </label><br/>
            <label>Phone Number:
                <input type="text" name="phoneNumber" value={phoneNumber} onChange={onChange} />
            </label><br/>
            <label>Birthday:
            <DatePicker selected={birthday} onChange={date => setBirthday(date)} 
                        className="input-datepicker" dateFormat="yyyy-MM-dd" />
            </label><br/>
            <label>Gender:
                <select name="gender" value={gender} onChange={onChange}>
                    <option value="man">Man</option>
                    <option value="woman">Woman</option>
                </select>
            </label><br/>

            <button type="submit" onClick={signup} >signup</button>
        </form>
        </>
    )
}

export default Signup