package com.xgr.easypay.callback;

/*
******************************* Copyright (c)*********************************\
**
**                 (c) Copyright 2017, King, china
**                          All Rights Reserved
**                                
**                      By(北京新动互联信息技术有限公司)
**                         
**------------------------------------------------------------------------------
*/
public interface IPayCallback {
    void success();
    void failed();
    void cancel();
}