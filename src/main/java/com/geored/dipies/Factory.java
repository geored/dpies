package com.geored.dipies;


import sun.jvm.hotspot.oops.Metadata;



/**
 *
 *
 * EXAMPLE:
 *  class ClientFactory implements Factory<Client> {
 *      Client build(Metadata d) {
 *          // build actual object and return
 *      }
 *  }
 *
 *
 * @author Georgievski Georgy
 *
 */
public interface Factory<T> {
    
    T build(Metadata t);
}


