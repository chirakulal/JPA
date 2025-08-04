package com.xworkz.bucket.runner;

import com.xworkz.bucket.entity.BucketEntity;
import com.xworkz.bucket.service.BucketService;
import com.xworkz.bucket.service.BucketServiceImpl;

public class Runner {

    public static void main(String[] args) {

        System.out.println("running............");
        BucketEntity bucket = new BucketEntity(1,500,"plastic","pavan");
        System.out.println(bucket);
        BucketService bucketService = new BucketServiceImpl();
        bucketService.Save(bucket);
    }

    }
