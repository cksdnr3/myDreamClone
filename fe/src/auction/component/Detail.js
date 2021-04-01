import React, { useEffect, useState } from 'react'
import axios from 'axios'

const Detail = (props) => {
    const [productDetail, setproductDetail] = useState("");

    const getProductDetail = () => {
        axios.get(`http://localhost:8080/auctions/${props.match.params.id}`)
        .then(res => {
            setproductDetail(res.data);
            console.log("users: " + JSON.stringify(productDetail.users))
        })
        .catch(err => {
          console.log(err)
        })
    }

    const update = () => {
        axios.put(`http://localhost:8080/auctions/${props.match.params.id}`, {})
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

    const addUser = () => {
        axios.put(`http://localhost:8080/auctions/${props.match.params.id}`, {users: [
            {
                userNo: 1,
                username: "cksdnr001",
                realName: "노찬욱",
                email: "cksdnr1111@gmail.com",
                gender: "man",
                phoneNumber: "phoneNumber"
            },
            {
                userNo: 2,
                username: "cksdnr002",
                realName: "박찬욱",
                email: "cksdnr2222@gmail.com",
                gender: "man",
                phoneNumber: "phoneNumber"
            },
            {
                userNo: 3,
                username: "cksdnr003",
                realName: "김찬욱",
                email: "cksdnr3333@gmail.com",
                gender: "man",
                phoneNumber: "phoneNumber"
            }
        ]

        })
        .then(res => {
            
        })
    }

    useEffect(() => getProductDetail(), [productDetail.reservedPrice])

    return (
        <>
        <div>{productDetail.product} 경매</div>
        <div>productNo: {productDetail.productNo}</div>
        <div>제시 가격: {productDetail.reservedPrice}</div>
        <div>경매 단위: {productDetail.placedPrice}</div>
        <button onClick={update}>Place Bid!</button>
        <button onClick={deleteAuction}>delete</button>
        </>
    )
}

export default Detail