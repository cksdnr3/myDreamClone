import { React, useCallback, useState } from 'react'
import axios from 'axios'

const Create = (props) => {
    const [auctionNo, setAuctionNo] = useState('');
    const [reservedPrice, setReservedPrice] = useState('');
    const [placedPrice, setPlacedPrice] = useState('');
    const [productNo, setProductNo] = useState('');
    const [product, setProduct] = useState('');
    const [username, setUsername] = useState('');
    const [regdate, setRegdate] = useState('');
    const [winBid, setWinBid] = useState('');
    const [userNo, setuserNo] = useState('');

    const create = () => {
        axios.post(`http://localhost:8080/auctions`, { reservedPrice, placedPrice, product, productNo })
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
                        <td>ID</td>
                    </tr>
                    <tr>
                        <td>제시 가격</td>
                        <td><input type="text" name="reservedPrice" value={reservedPrice} placeholder="Insert ReservedPrice" 
                        onChange={ e => setReservedPrice(e.target.value) } /></td>
                    </tr>
                    <tr>
                        <td>경매 시작 가격</td>
                        <td><input type="text" name="placedPrice" value={placedPrice} placeholder="Insert PlacedPrice" 
                        onChange={ e => setPlacedPrice(e.target.value)} /></td>
                    </tr>
                    <tr>
                        <td>상품</td>
                        <td><input type="text" name="product" value={product} placeholder="Insert Product" 
                        onChange={ e => setProduct(e.target.value) } /></td>
                    </tr>
                    <tr>
                        <td>상품 번호</td>
                        <td><input type="text" name="productNo" value={productNo} placeholder="Insert ProductNo" 
                        onChange={ e => setProductNo(e.target.value) } /></td>
                    </tr>
                </tbody>
            </table>

            <button type="submit" onClick={create} >create</button>
        </form>
        </>
    )
}

export default Create