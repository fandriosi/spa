/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabio.andriosi.boundary;

import com.fabio.andriosi.ping.boundary.Ping;
import org.eclipse.microprofile.faulttolerance.Bulkhead;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.metrics.annotation.Counted;

/**
 *
 * @author fabio
 */
public class Network {
    @Fallback(fallbackMethod="overload")
    @Bulkhead(2)
    @Counted(monotonic=true)
    public Ping execute(){
        return new Ping("net", 42);
    }
    
    public Ping overload(){
        return new Ping("overload", 13);
    }
}
