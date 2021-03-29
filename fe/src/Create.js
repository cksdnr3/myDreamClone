import { React, useState } from 'react'
import axios from 'axios'

const Create = () => {
    const [auctionNo, setAuctionNo] = useState('');
    const [reservedPrice, setReservedPrice] = useState('');
    const [placedPrice, setPlacedPrice] = useState('');
    const [productNo, setProductNo] = useState('');
    const [product, setProduct] = useState('');
    const [username, setUsername] = useState('');
    const [regdate, setRegdate] = useState('');
    const [winBid, setWinBid] = useState('');
    const [userNo, setuserNo] = useState('');

    const handleReservedPriceChange = (e) => {
        setReservedPrice(e.target.value)
    }

    const handlePlacedPriceChange = (e) => {
        setPlacedPrice(e.target.value)
    }

    const handleProductChange = (e) => {
        setProduct(e.target.value)
    }

    const handleProductNoChange = (e) => {
        setProductNo(e.target.value)
    }

    const create = () => {
        axios.post(`http://localhost:8080/auctions`, { reservedPrice, placedPrice, product, productNo })
        .then(res => {
          console.log(res)
        })
        .catch(err => {
          console.log(err)
        })
    }

    return (
        <>
        <form onSubmit={(e) => {
            e.preventDefault();
            console.log(e.target.reservedPrice.value, e.target.placedPrice.value);
        }}>
            <h3>create</h3>
            <table>
                <thead></thead>
                <tbody>
                    <tr>
                        <td>제시 가격</td>
                        <td><input type="text" name="reservedPrice" value={reservedPrice} placeholder="Insert ReservedPrice" 
                        onChange={handleReservedPriceChange} /></td>
                    </tr>
                    <tr>
                        <td>경매 시작 가격</td>
                        <td><input type="text" name="placedPrice" value={placedPrice} placeholder="Insert PlacedPrice" 
                        onChange={handlePlacedPriceChange} /></td>
                    </tr>
                    <tr>
                        <td>상품</td>
                        <td><input type="text" name="product" value={product} placeholder="Insert Product" 
                        onChange={handleProductChange} /></td>
                    </tr>
                    <tr>
                        <td>상품 번호</td>
                        <td><input type="text" name="productNo" value={productNo} placeholder="Insert ProductNo" 
                        onChange={handleProductNoChange} /></td>
                    </tr>
                </tbody>
            </table>

            <button type="submit" onClick={create} >create</button>
        </form>
        </>
    )
}

export default Create