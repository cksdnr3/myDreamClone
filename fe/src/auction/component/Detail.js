import React, { useEffect, useState } from 'react'
import axios from 'axios'

const Detail = (props) => {
    const [productDetail, setproductDetail] = useState("");

    const detail = () => {
        axios.get(`http://localhost:8080/auctions/${props.match.params.id}`)
        .then(res => {
            setproductDetail(res.data);
        })
        .catch(err => {
          console.log(err)
        })
    }

    const placeBid = () => {
        axios.put(`http://localhost:8080/auctions/${props.match.params.id}`)
        .then(res => {
            setproductDetail(res.data);
        })
        .catch(err => {
            console.log(err)
        })
    }

    const deleteAuction = () => {
        axios.delete(`http://localhost:8080/auctions/${props.match.params.id}`)
        .then(res => {
            console.log(res.data)
            alert("삭제되었습니다.")
            props.history.push('/list')
        })
        .catch(err => {
            console.log(err);
        })
    }

    useEffect(() => detail(), [productDetail.reservedPrice])

    return (
        <>
        <div>{productDetail.product} 경매</div>
        <div>productNo: {productDetail.productNo}</div>
        <div>제시 가격: {productDetail.reservedPrice}</div>
        <div>경매 단위: {productDetail.placedPrice}</div>
        <button onClick={placeBid}>Place Bid!</button>
        <button onClick={deleteAuction}>delete</button>
        </>
    )
}

export default Detail