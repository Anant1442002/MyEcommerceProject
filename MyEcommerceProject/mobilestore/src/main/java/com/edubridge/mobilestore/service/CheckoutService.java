package com.edubridge.mobilestore.service;

import com.edubridge.mobilestore.dto.Purchase;
import com.edubridge.mobilestore.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}