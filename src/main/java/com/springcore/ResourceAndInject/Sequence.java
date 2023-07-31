package com.springcore.ResourceAndInject;

import jakarta.annotation.Resource;
import jakarta.inject.Inject;

public class Sequence {
    @Resource
    private PrefixGenerator prefixGenerator;

    @Inject
    @DatePrefixAnnotation
    private PrefixGenerator prefixGenerator2;

}
