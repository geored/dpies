package com.geored.dipies;



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


