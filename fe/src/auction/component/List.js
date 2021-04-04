import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const List = () => {
    const [auctions, setAuctions] = useState([]);

    const getAuctions = () => {
        axios.get(`http://localhost:8080/auctions`)
        .then(res => {
          setAuctions(res.data)
          
        })
        .catch(err => {
          console.log(err)
        })
    }

    useEffect(() => getAuctions(), [])

    return (
        <>
        <h3>경매</h3>
        <table border="1">
            <thead>
                <tr>
                    <th align="center" width="80">auctionNo</th>
                    <th align="center" width="100">productNo</th>
                    <th align="center" width="150">product</th>
                    <th align="center" width="100">reservedPrice</th>
                    <th align="center" width="100">placedPrice</th>
                    <th align="center" width="100">seller</th>
                    <th align="center" width="100">join</th>
                </tr>
            </thead>
            <tbody>
                {(auctions || auctions.length === 0) ?
                auctions.map((auction, id) => {
                    return (
                        <tr key={id}>
                            <td align="center"><Link to={`/detail/${auction.auctionNo}`}>{auction.auctionNo}</Link></td>
                            <td align="center">{auction.productNo}</td>
                            <td align="center">{auction.product}</td>
                            <td align="center">{auction.reservedPrice}</td>
                            <td align="center">{auction.placedPrice}</td>
                            <td align="center">{auction.username}</td>
                            <td align="center">{auction.join}</td>
                        </tr>                   
                    )
                }) : 
                <tr><td colSpan="6">List is empty</td></tr>}
            </tbody>
        </table>
        </>
    )
}

export default List