//package com.spc;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//import java.util.Date;
//import java.util.Map;
//
//public class TokenUtils {
//
//    public String generateToken(Map<String,Object> claims){
//        Date date = new Date(System.currentTimeMillis() + 60000000L);
//        return Jwts.builder().setClaims(claims)
//                .setExpiration(date)
//                .signWith(SignatureAlgorithm.HS512, "spc")
//                .compact();
//    }
//}
