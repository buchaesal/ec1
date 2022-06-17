package com.plateer.ec1.claim.service;

import com.plateer.ec1.claim.service.processor.abstracts.ClaimProcessor;

public abstract class Claim {
    protected ClaimProcessor claimProcessor;
    abstract void execute();
}
