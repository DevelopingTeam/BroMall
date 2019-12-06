package com.znuel.mall.Services.Imp;

import com.znuel.mall.Dao.CartMapper;
import com.znuel.mall.Entities.Cart;
import com.znuel.mall.Services.CartService;
import com.znuel.mall.Vo.CartContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CartServiceImp implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public boolean addProductToCart(Cart cart) {
        //由于商品ID不知什么原因无法传送,故通过商品属性拼接进行传送,通过'-'进行分割
        String[] str = cart.getProduct_attr().split("-");
        //设置商品ID
        cart.setPID(new Integer(str[0]));
        //设置商品属性
        if(str.length==2)
            cart.setProduct_attr(str[1]);
        else
            cart.setProduct_attr("");
        //1表示该商品存在于购物车,但未下单
        cart.setStatus(1);
        //设置创建时间
        Date date = new Date();
        cart.setCreate_time(date);
        if(cartMapper.insert(cart) > 0)
            return true;
        else
            return false;
    }

    @Override
    public List<CartContent> queryCart(Integer userId) {
        List<CartContent> cartList =  cartMapper.selectByUserId(userId);
        Map<Integer,Integer> map= new HashMap<>();
        int PID = -1;
        int quantity = -1;
        List<CartContent> list = new ArrayList<>();
        //将相同商品的数量相加.
        for(int i = 0 ; i < cartList.size();i++){
            PID = cartList.get(i).getpId();
            quantity = cartList.get(i).getQuantity();
            if(map.containsKey(PID)){
                //如果商品存在更改其数量
                map.put(PID,map.get(PID)+quantity);
            }else{
                map.put(PID,quantity);
                //将不同的商品添加到购物车.
                list.add(cartList.get(i));
            }
        }
        //更新不同商品的数量.
        for (int i = 0 ; i < list.size();i++){
            list.get(i).setQuantity(map.get(list.get(i).getpId()));
        }
        return list;
    }

    @Override
    public boolean removeProduct(Integer id) {
        Cart cart = new Cart();
        cart.setID(id);
        //将商品的状态设为0,表示从购物车中移除.
        cart.setStatus(0);
        if(cartMapper.updateByPrimaryKeySelective(cart) > 0)
            return true;
        else
            return false;
    }

    @Override
    public double computeAmount(List<CartContent> contents) {
        double amount = 0.0;
        for (int i = 0 ; i < contents.size();i++){
            amount += contents.get(i).getTotalAmount();
        }
        return amount;
    }

    @Override
    public int getCount(Integer userId) {
        return cartMapper.getCount(userId);
    }
}
