package com.immunopass.service;

import com.immunopass.controller.OtpController;
import com.immunopass.controller.request.SendOtpRequest;
import com.immunopass.controller.request.VerifyOtpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class OtpService implements OtpController {


    @Override
    public void sendOtp(@RequestBody SendOtpRequest sendOtpRequest) {
        System.out.println("Sending otp to " + sendOtpRequest.getIdentifier());
    }

    @Override
    public boolean verifyOtp(VerifyOtpRequest verifyOtpRequest) {
        return true;
    }
}
