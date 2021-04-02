import { React, useCallback, useState } from 'react'
import axios from 'axios'

const Create = (props) => {

    const [reservedPrice, setReservedPrice] = useState('');
    const [placedPrice, setPlacedPrice] = useState('');
    const [product, setProduct] = useState('');

    const regist = () => {
        axios.post(`http://localhost:8080/auctions`, { reservedPrice, placedPrice, product })
        .then(res => {
          console.log(res)
          props.history.push('/list')
        })
        .catch(err => {
          console.log(err)
        })
    }

    return (
        <>
        <form onSubmit={(e) => e.preventDefault()}>
            <h3>create</h3>
            <table>
                <thead/>
                <tbody>
                    <tr>
                        <td>제시 가격</td>
                        <td><input type="text" name="reservedPrice" value={reservedPrice} placeholder="Insert ReservedPrice" 
                        onChange={ e => setReservedPrice(e.target.value) } /></td>
                    </tr>
                    <tr>
                        <td>경매 단위</td>
                        <td><input type="text" name="placedPrice" value={placedPrice} placeholder="Insert PlacedPrice" 
                        onChange={ e => setPlacedPrice(e.target.value)} /></td>
                    </tr>
                    <tr>
                        <td>상품</td>
                        <td><input type="text" name="product" value={product} placeholder="Insert Product" 
                        onChange={ e => setProduct(e.target.value) } /></td>
                    </tr>
                </tbody>
            </table>
            <button type="submit" onClick={regist} >create</button>
        </form>
        </>
    )
}

export default Create